package com.item.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.Role;
import com.item.entity.RolePower;
import com.item.mapper.RoleMapper;
import com.item.tool.Result;
import com.item.tool.Utils;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public Result<?> queryRoles() {
		// TODO Auto-generated method stub
		List<Role> roles = roleMapper.queryRoles();
		return Result.success(roles);
	}

	@Override
	public Result<?> insertOrUpdateRole(Role role, String powerid) {
		// TODO Auto-generated method stub
		int num = 0;
		List<RolePower> list = new ArrayList<RolePower>();
		if (role.getId() > 0) {// 编辑
			if (role.getId() == 1) {
				return Result.error(500, "不能修改超级管理员信息");
			} else {
				if (powerid != null && !powerid.equals("")) {
					roleMapper.deleteRolePowerByRid(role.getId());
					String[] powerids = powerid.split(",");
					for (int i = 0; i < powerids.length; i++) {
						String power = powerids[i];
						RolePower rolePower = new RolePower();
						rolePower.setRoleid(role.getId());
						rolePower.setPowerid(Integer.parseInt(power));
						list.add(rolePower);
					}
					roleMapper.insertRolePower(list);
				}
				num = roleMapper.updateRole(role);
			}
		} else {
			String creattime = Utils.getCurrentHMS();
			role.setCreattime(creattime);
			num = roleMapper.insertRole(role);
		}
		return Result.success(num);
	}

	@Override
	public Result<?> deleteRoleById(Role role) {
		// TODO Auto-generated method stub
		if (role.getId() == 1) {
			return Result.error(500, "不能删除超级管理员");
		} else if (role.getId() == 31) {
			return Result.error(501, "不能删除模型管理员");
		} else if (role.getId() == 3) {
			return Result.error(502, "不能删除用户角色");
		} else {
			int num = roleMapper.queryCountUserBeanByRoleId(role);
			if (num > 0) {
				return Result.error(503, "该角色有绑定人员");
			} else {
				num = roleMapper.deleteRoleById(role);
				return Result.success(num);
			}
		}

	}

	@Override
	public Result<?> insertPowerByRid(String roleid, String powerid) {
		// TODO Auto-generated method stub
		List<RolePower> list = new ArrayList<RolePower>();
		if (!roleid.equals("") && Integer.parseInt(roleid) == 1) {
			return Result.error(500, "超级管理员不能修改");
		} else {
			if (powerid != null && !powerid.equals("")) {
				roleMapper.deleteRolePowerByRid(Integer.parseInt(roleid));
				String[] powerids = powerid.split(",");
				for (int i = 0; i < powerids.length; i++) {
					String power = powerids[i];
					RolePower rolePower = new RolePower();
					rolePower.setRoleid(Integer.parseInt(roleid));
					rolePower.setPowerid(Integer.parseInt(power));
					list.add(rolePower);
				}
				int num = roleMapper.insertRolePower(list);
				return Result.success(num);
			} else {
				return Result.error(501, "字符串为空");
			}
		}

	}

}
