package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;



@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository; 
	
	
	public User saveUser(User user) {
		return userRepository.save(user);
		
	}
	
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}
	
	public User getProductByID(int id) {

		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> saveAllUsers(List<User> Users){
		return userRepository.saveAll(Users);
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	public User updateUser(User user) {
		
		//There is no update method we have to set 
		
		User u = userRepository.getById(user.getId());
		u.setId(user.getId());
		u.setUpdatedDateTime(user.getUpdatedDateTime());
		u.setEmail(user.getEmail());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setRoleId(user.getRoleId());
		u.setName(user.getName());
		
		
		//finally save the values
		userRepository.save(u);
		
		return user;
	}
		

}
