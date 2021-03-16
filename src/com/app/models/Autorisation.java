package com.app.models;

public class Autorisation {
	private Date date;
	private int id;
	private String type,description;
	private Etat etat;
	private String beneficier;
	public Autorisation(Date date, int id, String type, String description, Etat etat, String beneficier) {
		super();
		this.date = date;
		this.id = id;
		this.type = type;
		this.description = description;
		this.etat = etat;
		this.beneficier = beneficier;
	}
	public Autorisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public String getBeneficier() {
		return beneficier;
	}
	public void setBeneficier(String beneficier) {
		this.beneficier = beneficier;
	}
	
	
	
	
}
