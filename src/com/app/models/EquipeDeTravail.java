package com.app.models;

public class EquipeDeTravail {
	private int id;
	private String responsable;
	private int nbEmploye;
	public EquipeDeTravail(int id, String responsable, int nbEmploye) {
		super();
		this.id = id;
		this.responsable = responsable;
		this.nbEmploye = nbEmploye;
	}
	public EquipeDeTravail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public int getNbEmploye() {
		return nbEmploye;
	}
	public void setNbEmploye(int nbEmploye) {
		this.nbEmploye = nbEmploye;
	}

}
