package com.app.models;

public class Evennement {
	private Date date;
	private String sujet,lieu;
	private double budget;
	public Evennement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evennement(Date date, String sujet, String lieu, double budget) {
		super();
		this.date = date;
		this.sujet = sujet;
		this.lieu = lieu;
		this.budget = budget;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
}
