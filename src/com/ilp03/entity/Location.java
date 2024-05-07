package com.ilp03.entity;

public class Location {
	  private int id;
	    private String locationCode;
	    private String locationName;
		
	    public Location(int id, String locationCode, String locationName) {
			super();
			this.id = id;
			this.locationCode = locationCode;
			this.locationName = locationName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLocationCode() {
			return locationCode;
		}

		public void setLocationCode(String locationCode) {
			this.locationCode = locationCode;
		}

		public String getLocationName() {
			return locationName;
		}

		public void setLocationName(String locationName) {
			this.locationName = locationName;
		}
	    
	    
}
