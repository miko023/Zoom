package com.example.aroundtheworld;

public class Person {
	
	private String fName; 
	private String lName; 
	private String username; 

	private Account account;
	

//	public Person() {
//		fName = "First Name";
//		lName = "Last Name";
//		username = "Username";
//	}
	
	/**
	 * Associate this person with an account
	 * @pre true
	 * @post getAccount = newAccount
	 */
	public void setAccount(Account newAccount){
		account = newAccount;
	}
	
	/**
	 * 
	 * @return returns the account connecting with this person
	 */
	public Account getAccount(){
		return account;
	}
	
	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	} 
	public String getLName() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}

}

