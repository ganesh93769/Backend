package com.p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usersu")
public class Usersu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name", nullable = false ,length=12)
	private String firstName;
	@Column(name = "last_name" , nullable = false)
	private String lastName;
	@Column(name = "gender" , nullable = false)
	private String gender;
	@Column(name = "email_id", nullable = false ,unique = true)
	private String emailId;
	@Column(name = "password", nullable = false )
	private String password;
	@Column(name = "mobile_number", nullable = false)
	private long mobileNumber;
	@Column(name = "pin", nullable = false)
	private long pin;

	public Usersu() {

	}

	public Usersu(String firstName, String lastName, String gender, String emailId, String password, long mobileNumber,
			long pin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.pin = pin;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



}
