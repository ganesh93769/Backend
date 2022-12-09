package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "feedback")
public class Feedback 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String uname;
	String email;
	String eventName;
	int webReview;
	int eventReview;
	int overallReview;
	String comments;
	
	
	
	public Feedback() {
		
	}
	
	public Feedback(int id, String uname, String email, String eventName, int webReview, int eventReview,
			int overallReview, String comments) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.eventName = eventName;
		this.webReview = webReview;
		this.eventReview = eventReview;
		this.overallReview = overallReview;
		this.comments = comments;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	
	public int getWebReview() {
		return webReview;
	}

	public void setWebReview(int webReview) {
		this.webReview = webReview;
	}

	public int getEventReview() {
		return eventReview;
	}

	public void setEventReview(int eventReview) {
		this.eventReview = eventReview;
	}

	public int getOverallReview() {
		return overallReview;
	}

	public void setOverallReview(int overallReview) {
		this.overallReview = overallReview;
	}

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", uname=" + uname + ", email=" + email + ", eventName=" + eventName
				+ ", webReview=" + webReview + ", eventReview=" + eventReview + ", overallReview=" + overallReview
				+ ", comments=" + comments + "]";
	}

	
	
	
    
    
    
    
}
