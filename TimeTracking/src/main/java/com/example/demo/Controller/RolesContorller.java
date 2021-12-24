package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Role;
import com.example.demo.Service.RolesService;

@RestController
public class RolesContorller {
	
	
	/* This contoller adds the Roles into the table*/
	
	@Autowired
	RolesService rolesService;
	
	@PostMapping("/addRoles")
	public void addRole(@RequestBody Role role) {
		
		rolesService.addRoles(role);
		
	}
	
	@PutMapping("/updateRole")
	public void updateRole(@RequestBody Role role) {
		rolesService.updateRoles(role);
	}
	
	@GetMapping("/AllRoles")
	public List<Role> getAllRoles() {
		
		return rolesService.getAllRoles();
	}
	
	
	@PostMapping("/deleteRoles/{id}")
	public void deleteRoles(int id) {
		
		rolesService.deleteRoles(id);
	}
	
	@GetMapping("/getRole/{id}")
	public void getRoleByID(int id) {
		rolesService.getRoleByID(id);
	}
	
	
	

}
