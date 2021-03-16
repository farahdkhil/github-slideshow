package com.app.models;

public class Employe {
	private String nom,prenom,sexe,civilité,adresse,fonction;
	private int cin,numTel;
	private double salaire;
	private Date dateNaissance;
	private Date dateDeRecrutement; 
	private Horaire horaire;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom, String prenom, String sexe, String civilité, String adresse, String fonction, int cin,
			int numTel, double salaire, Date dateNaissance, Date dateDeRecrutement, Horaire horaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.civilité = civilité;
		this.adresse = adresse;
		this.fonction = fonction;
		this.cin = cin;
		this.numTel = numTel;
		this.salaire = salaire;
		this.dateNaissance = dateNaissance;
		this.dateDeRecrutement = dateDeRecrutement;
		this.horaire = horaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCivilité() {
		return civilité;
	}
	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Date getDateDeRecrutement() {
		return dateDeRecrutement;
	}
	public void setDateDeRecrutement(Date dateDeRecrutement) {
		this.dateDeRecrutement = dateDeRecrutement;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}

}
