package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserContorller {
	
	@Autowired
	private UserService userService;
	
	//input json should be mapped to this object
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
	
	
	@GetMapping("/AllUsers")
	public List<User> getUsers(){
		
		return userService.getAllUsers();
	}
	
	
	@GetMapping("/findUser/{id}")
	@ResponseBody
	public User findByID(@PathVariable int id) {
		
		return userService.getProductByID(id);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteuser(@PathVariable int id) {
		
		userService.deleteUser(id);
	}

}
