package com.app.models;

public class Tache {
	private int idTache;
	private Horaire horaire;
	private String EquipeResponsable;
	private Etat etat;
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tache(int idTache, Horaire horaire, String equipeResponsable, Etat etat) {
		super();
		this.idTache = idTache;
		this.horaire = horaire;
		EquipeResponsable = equipeResponsable;
		this.etat = etat;
	}
	public int getIdTache() {
		return idTache;
	}
	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}
	public Horaire getHoraire() {
		return horaire;
	}
	public void setHoraire(Horaire horaire) {
		this.horaire = horaire;
	}
	public String getEquipeResponsable() {
		return EquipeResponsable;
	}
	public void setEquipeResponsable(String equipeResponsable) {
		EquipeResponsable = equipeResponsable;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
}
