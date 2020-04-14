package com.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.entity.Role;
import com.item.service.RoleService;
import com.item.tool.Result;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;

	/**
	 * 查询所有的角色
	 * 
	 * @return
	 */
	@RequestMapping(value = "/queryRoles")
	public Result<?> queryRoles() {
		return roleService.queryRoles();
	}

	/**
	 * 添加或者编辑角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/insertOrUpdateRole")
	public Result<?> insertOrUpdateRole(Role role, String powerid) {
		return roleService.insertOrUpdateRole(role, powerid);
	}

	/**
	 * 删除角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = "/deleteRoleById")
	public Result<?> deleteRoleById(Role role) {
		return roleService.deleteRoleById(role);
	}

	/**
	 * 给角色授权
	 * 
	 * @param roleid
	 * @param powerid
	 * @return
	 */
	@RequestMapping(value = "/insertPowerByRid")
	public Result<?> insertPowerByRid(String roleid, String powerid) {
		return roleService.insertPowerByRid(roleid, powerid);
	}

}
