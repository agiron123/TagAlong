package com.example.tagalong;

import java.util.List;

import android.graphics.Bitmap;

public class User {
	/*
	 * User
-user_id
-List<user_id> friends
-Bio (200 characters)
-Picture
-City
-State/country
-List<SuggestedEvent> watchlist
-List<Event> hosted
	 */
	
	private int user_id;
	private List<Integer> friends; //user_id is going to be represented by an integer
	private String bio;
	private Bitmap picture;
	private String city;
	private String state;
	private List<SuggestedEvent> watchList;
	private Event hosted;
	

	public User(int user_id, String city, String state){
		this.user_id = user_id;
		this.friends = null;
		this.picture = null;
		this.city = city;
		this.state = state;
		this.watchList = null;
		this.hosted = null;
	}


	public User(int user_id, List<Integer> friends, String bio, Bitmap picture, String city, String state, List<SuggestedEvent> watchList, Event hosted)
	{
		this.user_id = user_id;
		this.friends = friends;
		this.picture = picture;
		this.city = city;
		this.state = state;
		this.watchList = watchList;
		this.hosted = hosted;
		this.bio = bio;
	}

	public String getBio() {
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<Integer> getFriends() {
		return friends;
	}
	
	public void setFriends(List<Integer> friends) {
		this.friends = friends;
	}
	
	public Event getHosted() {
		return hosted;
	}
	
	public void setHosted(Event hosted) {
		this.hosted = hosted;
	}
	
	public Bitmap getPicture() {
		return picture;
	}
	
	public void setPicture(Bitmap picture) {
		this.picture = picture;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public List<SuggestedEvent> getWatchList() {
		return watchList;
	}
	
	public void setWatchList(List<SuggestedEvent> watchList) {
		this.watchList = watchList;
	}
}
