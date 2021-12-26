package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Week")
public class Weeks {

	@Id
	@GeneratedValue
	int week_Id;
	int User_id;
	int Monday;
	int Tuesday;
	int Wednesday;
	int Thursday;
	
	int Firday;
	int Saturday;
	int Sunday;
	
	
	//both dates needs to be different
	
	private Date startDate;
	private Date endDate;
	
	
	//takes 0 or 1 
	@Column(columnDefinition = "boolean default false")
	private boolean isApproved;
	
	
	
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	public int getMonday() {	
		return Monday;
	}
	public void setMonday(int monday) {
		Monday = monday;
	}
	public int getTuesday() {
		return Tuesday;
	}
	public void setTuesday(int tuesday) {
		Tuesday = tuesday;
	}
	public int getWednesday() {
		return Wednesday;
	}
	public void setWednesday(int wednesday) {
		Wednesday = wednesday;
	}
	public int getThursday() {
		return Thursday;
	}
	public void setThursday(int thursday) {
		Thursday = thursday;
	}
	public int getFirday() {
		return Firday;
	}
	public void setFirday(int firday) {
		Firday = firday;
	}
	public int getSaturday() {
		return Saturday;
	}
	public void setSaturday(int saturday) {
		Saturday = saturday;
	}
	public int getSunday() {
		return Sunday;
	}
	public void setSunday(int sunday) {
		Sunday = sunday;
	}
	
	
	
	
	public int getWeek_Id() {
		return week_Id;
	}
	public void setWeek_Id(int week_Id) {
		this.week_Id = week_Id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	

}
