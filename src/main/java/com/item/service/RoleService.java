package com.item.service;

import com.item.entity.Role;
import com.item.tool.Result;

public interface RoleService {

	// 查询所有的角色
	Result<?> queryRoles();

	// 添加或者编辑角色
	Result<?> insertOrUpdateRole(Role role, String powerid);

	// 通过id删除角色
	Result<?> deleteRoleById(Role role);

	// 通过角色ID添加授权
	Result<?> insertPowerByRid(String roleid, String powerid);
}
