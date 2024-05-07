package com.ilp03.entity;

import java.time.LocalDateTime;

public class HealthActivities {
	    private int id;
	    private String type;
	    private int duration;
	    private int locationId;
	    private Employees organizer; 
	    private Employees createdBy; 
	    private Employees updatedBy; 
	    private LocalDateTime createdDate;
	    private LocalDateTime updatedDate;
		
	    public HealthActivities(int id, String type, int duration, int locationId, Employees organizer,
				Employees createdBy, Employees updatedBy, LocalDateTime createdDate, LocalDateTime updatedDate) {
			super();
			this.id = id;
			this.type = type;
			this.duration = duration;
			this.locationId = locationId;
			this.organizer = organizer;
			this.createdBy = createdBy;
			this.updatedBy = updatedBy;
			this.createdDate = createdDate;
			this.updatedDate = updatedDate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public int getLocationId() {
			return locationId;
		}

		public void setLocationId(int locationId) {
			this.locationId = locationId;
		}

		public Employees getOrganizer() {
			return organizer;
		}

		public void setOrganizer(Employees organizer) {
			this.organizer = organizer;
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

	    
	    
	   
	
}
