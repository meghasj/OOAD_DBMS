package com.ilp03.entity;

public class WellnessResources {
	 private int id;
	    private String resourceName;
	    private String resourceType;
	    private Employees uploadedById;
	    private HealthActivities activityId;
		
	    public WellnessResources(int id, String resourceName, String resourceType, Employees uploadedById,
				HealthActivities activityId) {
			super();
			this.id = id;
			this.resourceName = resourceName;
			this.resourceType = resourceType;
			this.uploadedById = uploadedById;
			this.activityId = activityId;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getResourceName() {
			return resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getResourceType() {
			return resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Employees getUploadedById() {
			return uploadedById;
		}

		public void setUploadedById(Employees uploadedById) {
			this.uploadedById = uploadedById;
		}

		public HealthActivities getActivityId() {
			return activityId;
		}

		public void setActivityId(HealthActivities activityId) {
			this.activityId = activityId;
		}
	    
	    
}
