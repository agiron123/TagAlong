package com.example.tagalong;

public class SuggestedEvent {

	private Event event;
	private int numSuggestions;
	
	public SuggestedEvent(Event event, int numSuggestions)
	{
		this.event = event;
		this.numSuggestions = numSuggestions;
	}
	
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	
	public int getNumSuggestions() {
		return numSuggestions;
	}
	
	public void setNumSuggestions(int numSuggestions) {
		this.numSuggestions = numSuggestions;
	}
	
	public void suggest()
	{
		this.numSuggestions++;
	}
	
}
