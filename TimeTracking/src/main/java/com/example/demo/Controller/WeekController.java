package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Weeks;
import com.example.demo.Service.WeekService;

@RestController
public class WeekController {
	
	@Autowired
	WeekService weekService;
	
	@PostMapping("/createWeek")
	void createWeek(@RequestBody Weeks week) {
		weekService.createWeek(week);
		
	}
	
	@GetMapping("/getWeek/{week_id}")
	void getWeek(int week_id) {
		weekService.getWeeksByWeekId(week_id);
	}
	
	@DeleteMapping
	public void deleteWeek(int week_id) {
		weekService.deleteWeek(week_id);
	}

}
