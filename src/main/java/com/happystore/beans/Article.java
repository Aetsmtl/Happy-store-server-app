package com.happystore.beans;

public class Article {
	
	private int iD;
	private String libelle;
	
	public Article (){}
	
	public Article (int id , String libelle){
		this.setiD(id);
		this.setLibelle(libelle);
	}
	
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String name) {
		this.libelle = name;
	}
	
}
