package com.example.tagalong;

import java.util.List;

import android.graphics.Bitmap;

public class Event {
	
	private enum Categories{EAT, DRINK, PLAY, SPORT, CHILL, NETWORKING};
	
	private String title;
	private String startDateTime; //TODO: change these to datetimes after the prototype is done
	private String endDateTime; //TODO: change these to datetimes after the prototype is done
	private int capacity;
	private boolean private_event; //boolean for whether event is public or private
	private double cost;
	private String description;
	private Categories category;
	private List<Integer> attendees; //for now, we will make the userID just an int
	private Bitmap picture;
	
	public Event(String title, String startDateTime, String endDateTime, int capacity, 
			boolean private_event, double cost, String description, Categories category, 
			List<Integer> attendees, Bitmap picture)
	{
		this.title = title;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.capacity = capacity;
		this.private_event = private_event;
		this.cost = cost;
		this.description = description;
		this.category = category;
		this.attendees = attendees;
		this.picture = picture;
	}
		
	public List<Integer> getAttendees() {
		return attendees;
	}
	
	public void setAttendees(List<Integer> attendees) {
		this.attendees = attendees;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Categories getCategory() {
		return category;
	}
	
	public void setCategory(Categories category) {
		this.category = category;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getEndDateTime() {
		return endDateTime;
	}
	
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	
	public String getStartDateTime() {
		return startDateTime;
	}
	
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isPrivate_event() {
		return private_event;
	}
	
	public void setPrivate_event(boolean private_event) {
		this.private_event = private_event;
	}
	
	public Bitmap getPicture() {
		return picture;
	}
	
	public void setPicture(Bitmap picture) {
		this.picture = picture;
	}

}
