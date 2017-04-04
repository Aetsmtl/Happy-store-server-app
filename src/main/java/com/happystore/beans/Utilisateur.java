package com.happystore.beans;

public class Utilisateur {
	
	private int iD;
	private String name;
	
	public Utilisateur (){}
	
	public Utilisateur (int id , String name){
		this.setiD(id);
		this.setName(name);
	}
	
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
