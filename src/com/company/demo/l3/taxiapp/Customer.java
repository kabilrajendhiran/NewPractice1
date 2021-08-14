package com.company.demo.l3.taxiapp;

public class Customer {
	private String cid;
	private char pp;
	private char dp;
	private int pickupTime;


	public Customer(String cid, char pp, char dp, int pickupTime) {
		super();
		this.cid = cid;
		this.pp = pp;
		this.dp = dp;
		this.pickupTime = pickupTime;
	}

	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public char getPp() {
		return pp;
	}
	public void setPp(char pp) {
		this.pp = pp;
	}
	public char getDp() {
		return dp;
	}
	public void setDp(char dp) {
		this.dp = dp;
	}
	public int getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}
	@Override
	public String toString() {
		return "Customer{" +
				"cid='" + cid + '\'' +
				", pp=" + pp +
				", dp=" + dp +
				", pickupTime=" + pickupTime +
				'}';
	}
}
