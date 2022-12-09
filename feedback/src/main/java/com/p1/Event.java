package com.p1;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Events")
public class Event 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String event_name;
    Date event_sdate;
    Date event_edate;
    String event_stime;
    String event_etime;
    String event_venue;
    String description;
//    String status;
	public Event() {
		
		
	}
	public Event(int id, String event_name, Date event_sdate, Date event_edate, String event_stime,
			String event_etime, String event_venue, String description) {
		super();
		this.id = id;
		this.event_name = event_name;
		this.event_sdate = event_sdate;
		this.event_edate = event_edate;
		this.event_stime = event_stime;
		this.event_etime = event_etime;
		this.event_venue = event_venue;
		this.description = description;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public Date getEvent_sdate() {
		return event_sdate;
	}
	public void setEvent_sdate(Date event_sdate) {
		this.event_sdate = event_sdate;
	}
	public Date getEvent_edate() {
		return event_edate;
	}
	public void setEvent_edate(Date event_edate) {
		this.event_edate = event_edate;
	}
	public String getEvent_stime() {
		return event_stime;
	}
	public void setEvent_stime(String event_stime) {
		this.event_stime = event_stime;
	}
	public String getEvent_etime() {
		return event_etime;
	}
	public void setEvent_etime(String event_etime) {
		this.event_etime = event_etime;
	}
	public String getEvent_venue() {
		return event_venue;
	}
	public void setEvent_venue(String event_venue) {
		this.event_venue = event_venue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", event_name=" + event_name + ", event_sdate=" + event_sdate
				+ ", event_edate=" + event_edate + ", event_stime=" + event_stime + ", event_etime=" + event_etime
				+ ", event_venue=" + event_venue + ", description=" + description + "]";
	}
    
	
}
