package com.app.models;

public class Doléance {
	private int id;
	private Date date;
	private String sujet;
	private Etat etat;
	private String NomCitoyen;
	public Doléance(int id, Date date, String sujet, Etat etat, String nomCitoyen) {
		super();
		this.id = id;
		this.date = date;
		this.sujet = sujet;
		this.etat = etat;
		NomCitoyen = nomCitoyen;
	}
	public Doléance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public String getNomCitoyen() {
		return NomCitoyen;
	}
	public void setNomCitoyen(String nomCitoyen) {
		NomCitoyen = nomCitoyen;
	}
	

}
