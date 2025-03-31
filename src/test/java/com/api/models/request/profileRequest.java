package com.api.models.request;

public class profileRequest {
	@Override
	public String toString() {
		return "profileRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	public profileRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	
	public static class Builder{
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;
		
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		public profileRequest build() {
			profileRequest profilerequest = new profileRequest(firstName, lastName, email, mobileNumber);
		return profilerequest;
		}
	}
	
	
}
