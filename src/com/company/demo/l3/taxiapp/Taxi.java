package com.company.demo.l3.taxiapp;

public class Taxi {
	private String taxiId;
	private char cp;
	private int earned;
	private boolean isFree;
	private int availBy;
	private int notAvailBy;


	public Taxi(String taxiId) {
		this.taxiId = taxiId;
		this.cp = 'A';
		this.earned = 0;
		this.isFree = true;
		this.availBy = 0;
		this.notAvailBy = -1;
	}


	public String getTaxiId() {
		return taxiId;
	}
	public void setTaxiId(String taxiId) {
		this.taxiId = taxiId;
	}
	public char getCp() {
		return cp;
	}
	public void setCp(char cp) {
		this.cp = cp;
	}
	public int getEarned() {
		return earned;
	}
	public void setEarned(int earned) {
		this.earned = earned;
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public int getAvailBy() {
		return availBy;
	}
	public void setAvailBy(int availBy) {
		this.availBy = availBy;
	}
	public int getNotAvailBy() {
		return notAvailBy;
	}
	public void setNotAvailBy(int notAvailBy) {
		this.notAvailBy = notAvailBy;
	}

    @Override
    public String toString() {
        return "Taxi{" +
                "taxiId='" + taxiId + '\'' +
                ", cp=" + cp +
                ", earned=" + earned +
                ", isFree=" + isFree +
                ", availBy=" + availBy +
                ", notAvailBy=" + notAvailBy +
                '}';
    }
}
