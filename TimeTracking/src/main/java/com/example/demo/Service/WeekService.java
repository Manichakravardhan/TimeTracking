package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Weeks;
import com.example.demo.Repository.WeekRepository;


@Service
public class WeekService {
	
	
	@Autowired
	WeekRepository weekRepo;
	
	
	
	public void createWeek(Weeks week) {
		weekRepo.save(week);
	}
	
	public Weeks getWeeksByWeekId(int week_id) {
		return weekRepo.getById(week_id);
		
	}
	
	public void deleteWeek(int week_id) {
		 weekRepo.deleteById(week_id);;
	}
	
	public Weeks updateWeek(Weeks week_id) {
		Weeks w = weekRepo.getById(week_id.getWeek_Id());
		w.setMonday(week_id.getMonday());
		w.setTuesday(week_id.getTuesday());
		w.setWednesday(week_id.getWednesday());

	    weekRepo.save(w);
	    
	    return w;
	}
	
	
	

}
