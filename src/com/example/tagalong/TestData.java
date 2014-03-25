package com.example.tagalong;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;

public class TestData {
	private ArrayList<Event> watchListEvents;
	private ArrayList<Event> nearByEvents;
	private ArrayList<Group> groups;
	private List<Integer> groupOneMembers;
	private List<Integer> groupTwoMembers;
	private List<Integer> groupThreeMembers;
	private List<Integer> groupFourMembers;
	private List<Integer> groupFiveMembers;
	private List<Message> chatLog;
	
	private List<Event> suggestedEventsOne;
	private List<Event> suggestedEventsTwo;
	private List<Event> suggestedEventsThree;
	private List<Event> suggestedEventsFour;
	private List<Event> suggestedEventsFive;
	
	
	public TestData(){
		User user1 = new User(11111, "Atlanta", "Georgia");
		User user2 = new User(22222, "New York City", "New York");
		User user3 = new User(33333, "Seattle", "Washington");
		User user4 = new User(44444, "Miami", "Florida");
		User user5 = new User(55555, "Orlando", "Florida");
		User user6 = new User(66666, "San Francisco", "California");
		User user7 = new User(77777, "Atlanta", "Georgia");
		User user8 = new User(88888, "Atlanta", "Georgia");
		User user9 = new User(99999, "Atlanta", "Georgia");
		
		groupOneMembers.add(user1.getUser_id());
		groupOneMembers.add(user2.getUser_id());
		groupOneMembers.add(user3.getUser_id());
		groupOneMembers.add(user4.getUser_id());
		groupOneMembers.add(user5.getUser_id());
		
		groupTwoMembers.add(user6.getUser_id());
		groupTwoMembers.add(user7.getUser_id());
		groupTwoMembers.add(user8.getUser_id());
		groupTwoMembers.add(user9.getUser_id());
		
		groupThreeMembers.add(user1.getUser_id());
		groupThreeMembers.add(user3.getUser_id());
		groupThreeMembers.add(user4.getUser_id());
		groupThreeMembers.add(user7.getUser_id());
		
		groupFourMembers.add(user2.getUser_id());
		groupFourMembers.add(user4.getUser_id());
		groupFourMembers.add(user6.getUser_id());
		
		groupFiveMembers.add(user8.getUser_id());
		groupFiveMembers.add(user4.getUser_id());
		groupFiveMembers.add(user1.getUser_id());
		
		Event eventOne = new Event("Movie Screening", "03/28/2014 8:00 PM" , "03/28/2014 12:00 PM", 60, true,
					11.50, "Screening for the new Spider Man!", "CHILL" , groupOneMembers);
		Event eventTwo = new Event("All you can eat Ribs!", "03/27/2014 6:00 PM" , "03/27/2014 9:00 PM", 50, true,
				20.50, "Come eat some ribs", "EAT" , groupTwoMembers);
		Event eventThree = new Event("Concert", "03/29/2014 8:00 PM" , "03/29/2014 12:00 PM", 100, true,
				200.05, "Rock concert!", "CHILL" , groupThreeMembers);
		Event eventFour = new Event("Drinking at the Bar", "03/29/2014 10:00 PM" , "03/30/2014 2:00 AM", 20, true,
				20.50, "Come and drink with us", "DRINK" , groupFourMembers);
		Event eventFive = new Event("Pick up Basketball", "03/30/2014 2:00 PM" , "03/30/2014 5:00 PM", 10, true,
				0.00, "Come and play some basketball", "PLAY" , groupFiveMembers);
		
		watchListEvents.add(eventOne);
		watchListEvents.add(eventTwo);
		watchListEvents.add(eventThree);
		watchListEvents.add(eventFour);
		watchListEvents.add(eventFive);
		nearByEvents.add(eventOne);
		nearByEvents.add(eventTwo);
		nearByEvents.add(eventThree);
		nearByEvents.add(eventFour);
		nearByEvents.add(eventFive);
				
		Message m1 = new Message(user1.getUser_id(),"Ben", "So what do you guys want to do?", "3/29/2014 2:59PM",0);
		Message m2 = new Message(user2.getUser_id(),"Ashley", "I don't know", "3/29/2014 3:00PM",0);
		Message m3 = new Message(user3.getUser_id(),"James", "How about bird watching?", "3/29/2014 3:01PM",2);	
		chatLog.add(m1);
		chatLog.add(m2);
		chatLog.add(m3);
				
		suggestedEventsOne.add(eventOne);
		suggestedEventsTwo.add(eventTwo);
		suggestedEventsThree.add(eventThree);
		suggestedEventsFour.add(eventFour);
		suggestedEventsFive.add(eventFive);
		Group groupOne = new Group("Tech Students", groupOneMembers, chatLog, suggestedEventsOne);
		Group groupTwo = new Group("Georgia State Students", groupTwoMembers, chatLog, suggestedEventsTwo);
		Group groupThree = new Group("Alpha Beta Chi", groupThreeMembers, chatLog, suggestedEventsThree);
		Group groupFour = new Group("Football Team", groupFourMembers, chatLog, suggestedEventsFour);
		Group groupFive = new Group("Basket Weaving Club", groupFiveMembers, chatLog, suggestedEventsFive);
		
		groups.add(groupOne);
		groups.add(groupTwo);
		groups.add(groupThree);
		groups.add(groupFour);
		groups.add(groupFive);
		
		
	}
	
	public ArrayList<Event> getWatchListEvents(){
		return watchListEvents;
	}
	
	public ArrayList<Event> getNearByEvents(){
		return nearByEvents;
	}
	
	public ArrayList<Group> getGroups(){
		return groups;
	}


}
