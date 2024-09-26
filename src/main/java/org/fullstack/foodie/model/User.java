package org.fullstack.foodie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	 @Id @GeneratedValue
	   @Column(name = "UserId")
	 private int id;
	 @Column(name="FirstName")
	 private String firstName;
	 
	 @Column(name="LastName")
	 private String lastName;
	 
	 @Column(name="Number")
	 private String phoneNumber;

	 @Column(name="EmailId")
	 private String emailId;
	 
	 @Column(name="Password")
	 private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
	 
	 

	
}
