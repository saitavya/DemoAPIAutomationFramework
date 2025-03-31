package com.api.models.request;

public class signUpRequest {
	@Override
	public String toString() {
		return "signUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public signUpRequest(String username, String password, String email, String firstName, String lastName,
			long mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	
	public static class Builder{
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		public Builder userName(String username) {
			this.username = username;
			return this;//This returns the current object. 
		}
		public Builder Password(String password) {
			this.password = password;
			return this;//This returns the current object. 
		}
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;//This returns the current object. 
		}
		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;//This returns the current object. 
		}
		public Builder email(String email) {
			this.email = email;
			return this;//This returns the current object. 
		}
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;//This returns the current object. 
		}
		
		public signUpRequest build() {
			signUpRequest signUpRequest = new signUpRequest(username, password, email, firstName, lastName, 0);
			return signUpRequest;		
		}
	}
	
}
