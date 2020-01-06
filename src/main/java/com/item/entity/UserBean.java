package com.item.entity;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 * 商城用户
 * @author Administrator
 *
 */
@Entity
public class UserBean extends User implements Serializable {

	private static final long serialVersionUID = -6813725469825556830L;
		
	//电话
	private String phone;
	
	//角色
	private int role;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	

}
