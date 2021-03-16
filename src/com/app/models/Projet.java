package com.app.models;

public class Projet {
	private Date dateDebut;
	private Date dateFin;
	private int budget;
	private String lieu;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(Date dateDebut, Date dateFin, int budget, String lieu) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.budget = budget;
		this.lieu = lieu;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
}
