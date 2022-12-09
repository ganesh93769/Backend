package com.p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Booking")
public class Booking 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    String u_name;
    String e_name;
    String b_date;
    
    public Booking() {
	}
    
	public Booking(int id, String u_name, String e_name, String b_date) {
		super();
		this.id = id;
		this.u_name = u_name;
		this.e_name = e_name;
		this.b_date = b_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", u_name=" + u_name + ", e_name=" + e_name + ", b_date=" + b_date + "]";
	}
	
	
   
}
