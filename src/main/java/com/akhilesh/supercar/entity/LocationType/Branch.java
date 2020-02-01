package com.akhilesh.supercar.entity.LocationType;

public class Branch {

	private String branchId;
	private String locationName;
	private String ContactNumber;
	private String faxNumber;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param branchId
	 * @param locationName
	 * @param contactNumber
	 * @param faxNumber
	 */
	public Branch(String branchId, String locationName, String contactNumber, String faxNumber) {
		super();
		this.branchId = branchId;
		this.locationName = locationName;
		ContactNumber = contactNumber;
		this.faxNumber = faxNumber;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", locationName=" + locationName + ", ContactNumber=" + ContactNumber
				+ ", faxNumber=" + faxNumber + "]";
	}
	
	
}
