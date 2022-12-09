package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Contact")
public class Contact 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
    String uname;
    String email;
    String message;
	
    public Contact()
    { }

	public Contact(String uname, String email, String message, int id) {
		
		this.uname = uname;
		this.email = email;
		this.message = message;
		this.id=id;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", uname=" + uname + ", email=" + email + ", message=" + message + "]";
	}

	
    
    
    
    
}
