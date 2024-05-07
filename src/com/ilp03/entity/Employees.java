package com.ilp03.entity;

import java.time.LocalDateTime;

public class Employees {
	private int id;
    private String firstName;
    private String lastName;
    private String address;
    private Gender gender;
    private Employees createdBy; 
    private Employees updatedBy; 
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    
	public Employees(int id, String firstName, String lastName, String address, Gender gender, Employees createdBy,
			Employees updatedBy, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
	
	
	 public Employees() {
		// TODO Auto-generated constructor stub
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
	}



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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Employees getCreatedBy() {
		return createdBy;
	}



	public void setCreatedBy(Employees createdBy) {
		this.createdBy = createdBy;
	}

	public Employees getUpdatedBy() {
	        return updatedBy;
	    }

	public void setUpdatedBy(Employees updatedBy) {
	        this.updatedBy = updatedBy;
	    }


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}



	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}



	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}



	public enum Gender {
	        M,
	        F,
	        
	    }
    
    
}
