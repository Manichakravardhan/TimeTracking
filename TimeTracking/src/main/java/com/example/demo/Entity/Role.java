package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Roles")
public class Role {
	
	@Id
	@GeneratedValue
	int RoleId;
	String RoleName;
	String RoleDescription;
	
	
	@CreationTimestamp
	Date Created_datetime;
	
	
	Date Updated_datetime;
	
	
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
	public Date getCreated_datetime() {
		return Created_datetime;
	}
	public void setCreated_datetime(Date created_datetime) {
		Created_datetime = created_datetime;
	}
	public Date getUpdated_datetime() {
		return Updated_datetime;
	}
	public void setUpdated_datetime(Date updated_datetime) {
		Updated_datetime = updated_datetime;
	}
	
	
	

}
