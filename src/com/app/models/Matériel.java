package com.app.models;

public class Matériel {
	public Matériel() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String nom;
	private int id,reference; 
	private Etat etat;
	public Matériel(String nom, int id, int reference, Etat etat) {
		super();
		this.nom = nom;
		this.id = id;
		this.reference = reference;
		this.etat = etat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}

}
