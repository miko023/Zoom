package com.example.aroundtheworld;

import java.util.HashSet;
import java.util.Set;

public class Account {

	private String username; 
	private String password; 
	private String email;
	
	private Set<Photo> photos;
	private Person person;
	
	/**
	 * when we make an account, we have to check that the username is not taken...
	 * Might need an accountmanager to hold all the collection of accounts.
	 * @param username
	 * @param password
	 * @param email
	 */
	public Account (String username, String password, String email){
		photos = new HashSet<Photo>();
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		person.setAccount(this);
	}
	
	public void addPhoto(Photo photo){
		photos.add(photo);
		photo.setAccount(this);
	}
	
	public void removePhoto(Photo photo) throws PhotoDoesNotExistException{
		if (!photos.contains(photo))
			throw new PhotoDoesNotExistException();
		photos.remove(photo);
		photo.setAccount(null);
	}

	
	
	/*
	 * GETTERS AND SETTERS
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
}
