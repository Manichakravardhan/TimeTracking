package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	int RoleId;
	String RoleName;
	String RoleDescription;
	public int getRoleId() {
		return RoleId;
	}
	public void setRoleId(int roleId) {
		RoleId = roleId;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public String getRoleDescription() {
		return RoleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}
	

}
