package com.app.models;

public class Municipalité {
	private String adresse,email,siteWeb;
	private int telephone;
	private Horaire horaire;
	public Municipalité() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Municipalité(String adresse, String email, String siteWeb, int telephone, Horaire horaire) {
		super();
		this.adresse = adresse;
		this.email = email;
		this.siteWeb = siteWeb;
		this.telephone = telephone;
		this.horaire = horaire;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}
	
	
	

}
