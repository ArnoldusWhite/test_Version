package com.example.base;
import com.android.dataframework.Entity;

public class Assignation {
	private String idincident;
	private String idemp;
	private String dateajout;
	
	public Assignation() {
		super();
		this.idincident="";
		this.idemp="";
		this.dateajout="";
	}
	
	public Assignation(String idIncident, String idEmp,String dateAjout){
		super();
		this.idincident=idIncident;
		this.idemp=idEmp;
		this.dateajout=dateAjout;
	}
	
	public Assignation(Entity eltAssignation){
		this.idincident=(String)eltAssignation.getValue("idincident");
		this.idemp=(String)eltAssignation.getValue("idemp");
		this.dateajout=(String)eltAssignation.getValue("dateajout");
	}

	public String getIdincident() {
		return idincident;
	}

	public void setIdincident(String idincident) {
		this.idincident = idincident;
	}

	public String getIdemp() {
		return idemp;
	}

	public void setIdemp(String idemp) {
		this.idemp = idemp;
	}

	public String getDateajout() {
		return dateajout;
	}

	public void setDateajout(String dateajout) {
		this.dateajout = dateajout;
	}
	
	
}
