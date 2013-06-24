package com.example.aroundtheworld;

import java.util.Date;

public class Photo {

	private Account account;
	
	private Date time;
	private double lat;
	private double lon;
	private int viewCount;
	private int likeCount;
	private boolean IsPrivate;
	

	public Photo (double lat, double lon,boolean IsPrivate){
		this.lat = lat;
		this.lon = lon;
		time = new Date();
		setViewCount(0);
		this.IsPrivate = IsPrivate;
	}
	
	/**
	 * Associate this photo with an account
	 * THE ACCOUNT CLASS WOULD CALL THIS METHOD
	 * @pre true
	 * @post getAccount = newAccount
	 */
	public void setAccount(Account newAccount){
		account = newAccount;
	}
	
	public Account getAccount(){
		return account;
	}
	
	public void setPrivate(String answer){
		if (answer.equals("yes") ){
			this.IsPrivate = true;
		}
		else this.IsPrivate = false;
		
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public void incrementViewCount(){
		setViewCount(getViewCount() + 1);
	}

	public void incrementLikeCount(){
		setLikeCount(getLikeCount() + 1);
	}
	
	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
	
}
