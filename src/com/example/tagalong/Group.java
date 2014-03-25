package com.example.tagalong;

import java.util.List;

public class Group {
	
	private List<Integer> members;
	private List<Message> chatLog;
	private List<Event> suggestedEvents;
	private String title;
	
	public Group(String title, List<Integer> members, List<Message> chatLog, List<Event> suggestedEvents)
	{
		this.title = title;
		this.members = members;
		this.chatLog = chatLog;
		this.suggestedEvents = suggestedEvents;
	}

	public List<Message> getChatLog() {
		return chatLog;
	}
	
	public void setChatLog(List<Message> chatLog) {
		this.chatLog = chatLog;
	}
	
	public List<Integer> getMembers() {
		return members;
	}
	
	public void setMembers(List<Integer> members) {
		this.members = members;
	}
	
	public List<Event> getSuggestedEvents() {
		return suggestedEvents;
	}
	
	public void setSuggestedEvents(List<Event> suggestedEvents) {
		this.suggestedEvents = suggestedEvents;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
}
