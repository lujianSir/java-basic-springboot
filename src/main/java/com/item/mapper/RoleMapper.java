package com.item.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.Role;
import com.item.entity.RolePower;

@Repository
public interface RoleMapper {

	// 查询所有的角色
	List<Role> queryRoles();

	// 添加角色
	int insertRole(Role role);

	// 编辑角色
	int updateRole(Role role);

	// 通过ID删除角色
	int deleteRoleById(Role role);

	// 查询该角色下是否有人
	int queryCountUserBeanByRoleId(Role role);

	// 通过角色ID删除所有的权限
	void deleteRolePowerByRid(int roleid);

	// 批量添加权限
	int insertRolePower(List<RolePower> list);
}
