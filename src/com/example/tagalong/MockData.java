package com.example.tagalong;

import java.util.ArrayList;
import java.util.List;

public class MockData {

	Event[] events;
	Group[] groups;
	Event[] watchList;
	User[] users;
	
	ArrayList<Integer> groupOneMembers;
	ArrayList<Integer> groupTwoMembers;
	ArrayList<Integer> groupThreeMembers;
	ArrayList<Integer> groupFourMembers;
	ArrayList<Integer> groupFiveMembers;
	
	public MockData()
	{
		this.events = new Event[5];
		this.groups = new Group[5];
		this.watchList = new Event[5];
		this.users = new User[10];
		this.groupOneMembers = new ArrayList<Integer>();
		this.groupTwoMembers = new ArrayList<Integer>();
		this.groupThreeMembers = new ArrayList<Integer>();
		this.groupFourMembers = new ArrayList<Integer>();
		this.groupFiveMembers = new ArrayList<Integer>();
		
		this.populate();
	}
	
	public void populate()
	{
		
		//Create the mock data for events
		this.events[0] = new Event("Movie Screening", "03/28/2014 8:00 PM" , "03/28/2014 12:00 PM", 60, true,
				11.50, "Screening for the new Spider Man!", "CHILL" , groupOneMembers);
		this.events[1] = new Event("All you can eat Ribs!", "03/27/2014 6:00 PM" , "03/27/2014 9:00 PM", 50, true,
			20.50, "Come eat some ribs", "EAT" , groupTwoMembers);
		this.events[2] = new Event("Concert", "03/29/2014 8:00 PM" , "03/29/2014 12:00 PM", 100, true,
			200.05, "Rock concert!", "CHILL" , groupThreeMembers);
		this.events[3] = new Event("Drinking at the Bar", "03/29/2014 10:00 PM" , "03/30/2014 2:00 AM", 20, true,
			20.50, "Come and drink with us", "DRINK" , groupFourMembers);
		this.events[4] = new Event("Pick up Basketball", "03/30/2014 2:00 PM" , "03/30/2014 5:00 PM", 10, true,
			0.00, "Come and play some basketball", "PLAY" , groupFiveMembers);
		
		//Create mock data for the Users
		this.users[0] = new User(11111, "Atlanta", "Georgia");
		this.users[1] = new User(22222, "New York City", "New York");
		this.users[3] = new User(33333, "Seattle", "Washington");
		this.users[4] = new User(44444, "Miami", "Florida");
		this.users[5] = new User(55555, "Orlando", "Florida");
		this.users[6] = new User(66666, "San Francisco", "California");
		this.users[7] = new User(77777, "Atlanta", "Georgia");
		this.users[8] = new User(88888, "Atlanta", "Georgia");
		this.users[9] = new User(99999, "Atlanta", "Georgia");
		
		//add each respective user to a group
		groupOneMembers.add(1111);
		groupOneMembers.add(2222);
		groupOneMembers.add(3333);
		groupOneMembers.add(4444);
		groupOneMembers.add(5555);
		
		groupTwoMembers.add(6666);
		groupTwoMembers.add(7777);
		groupTwoMembers.add(8888);
		groupTwoMembers.add(9999);
		
		groupThreeMembers.add(2342342);
		groupThreeMembers.add(1234234);
		groupThreeMembers.add(23525);
		
		groupFourMembers.add(23525);
		groupFourMembers.add(423525);
		groupFourMembers.add(232342);
		
		groupFiveMembers.add(23453);
		groupFiveMembers.add(345353);
		groupFiveMembers.add(2342342);

	}
	
	
	public Event[] getEvents() {
		return events;
	}
	
	public Group[] getGroups() {
		return groups;
	}
	
	public Event[] getWatchList() {
		return watchList;
	}

}
