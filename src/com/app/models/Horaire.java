package com.app.models;

public class Horaire {
	private Date date;
	private int heure, minute;
	public Horaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Horaire(Date date, int heure, int minute) {
		super();
		this.date = date;
		this.heure = heure;
		this.minute = minute;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
}
