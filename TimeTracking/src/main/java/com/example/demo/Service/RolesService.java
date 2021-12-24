package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Role;
import com.example.demo.Repository.RolesRepository;

@Service
public class RolesService {
	
	
	@Autowired
	private RolesRepository rolesRepo;
	
	public void addRoles(Role role) {
		rolesRepo.save(role);
		
	}
	
	public void deleteRoles(int id) {
		rolesRepo.deleteById(id);
	}
	
	public Role updateRoles(Role role) {
		
		Role r = rolesRepo.getById(role.getRoleId());
		r.setRoleId(role.getRoleId());
		r.setRoleName(role.getRoleName());
		r.setRoleDescription(role.getRoleDescription());
		return role;
		
	}
	
	public List<Role> getAllRoles() {
		return rolesRepo.findAll();
		
	}
	
	public Role getRoleByID(int id) {
		return rolesRepo.getById(id);
	}

}
