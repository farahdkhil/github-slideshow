package com.app.models;

public class RapportActivite {
	private Date dateRevenus;
	public RapportActivite() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Date dateDepence;
	private String sourceRevenus;
	private String destinationDepence;
	public RapportActivite(Date dateRevenus, Date dateDepence, String sourceRevenus, String destinationDepence) {
		super();
		this.dateRevenus = dateRevenus;
		this.dateDepence = dateDepence;
		this.sourceRevenus = sourceRevenus;
		this.destinationDepence = destinationDepence;
	}
	public Date getDateRevenus() {
		return dateRevenus;
	}
	public void setDateRevenus(Date dateRevenus) {
		this.dateRevenus = dateRevenus;
	}
	public Date getDateDepence() {
		return dateDepence;
	}
	public void setDateDepence(Date dateDepence) {
		this.dateDepence = dateDepence;
	}
	public String getSourceRevenus() {
		return sourceRevenus;
	}
	public void setSourceRevenus(String sourceRevenus) {
		this.sourceRevenus = sourceRevenus;
	}
	public String getDestinationDepence() {
		return destinationDepence;
	}
	public void setDestinationDepence(String destinationDepence) {
		this.destinationDepence = destinationDepence;
	}
	
}
