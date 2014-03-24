package com.example.tagalong;

public class Message {
	
	private int author; //user_id for author
	private String authorName;
	private String content;
	private String timestamp;  //TODO: change to a DateTime after prototyping is done
	private int likes;
	
	public Message(int author, String authorName, String content, String timestamp, int likes)
	{
		this.author = author;
		this.authorName = authorName;
		this.content = content;
		this.timestamp = timestamp;
		this.likes = likes;
	}
	
	public int getAuthor() {
		return author;
	}
	
	public void setAuthor(int author) {
		this.author = author;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
