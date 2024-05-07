package com.ilp03.entity;

import java.time.LocalDateTime;

public class ParticipationRecords {
	 private int id;
	    private Employees employee;
	    private HealthActivities activity;
	    private LocalDateTime startDate;
	    private LocalDateTime endDate;
	    private Status status;
	    private Employees createdBy; // Represent createdBy as Employee object
	    private Employees updatedBy; // Represent updatedBy as Employee object
	    private LocalDateTime createdDate;
	    private LocalDateTime updatedDate;
	    
	    

	    public ParticipationRecords(int id, Employees employee, HealthActivities activity, LocalDateTime startDate,
				LocalDateTime endDate, Status status, Employees createdBy, Employees updatedBy,
				LocalDateTime createdDate, LocalDateTime updatedDate) {
			super();
			this.id = id;
			this.employee = employee;
			this.activity = activity;
			this.startDate = startDate;
			this.endDate = endDate;
			this.status = status;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
		}

		public ParticipationRecords() {
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}






		public void setId(int id) {
			this.id = id;
		}

		public Employees getEmployee() {
			return employee;
		}

		public void setEmployee(Employees employee) {
			this.employee = employee;
		}

		public HealthActivities getActivity() {
			return activity;
		}

		public void setActivity(HealthActivities activity) {
			this.activity = activity;
		}

		public LocalDateTime getStartDate() {
			return startDate;
		}






		public void setStartDate(LocalDateTime startDate) {
			this.startDate = startDate;
		}






		public LocalDateTime getEndDate() {
			return endDate;
		}






		public void setEndDate(LocalDateTime endDate) {
			this.endDate = endDate;
		}






		public Status getStatus() {
			return status;
		}






		public void setStatus(Status status) {
			this.status = status;
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






		public enum Status {
	        active,
	        inactive,
	        completed,
	        
	    }
}
