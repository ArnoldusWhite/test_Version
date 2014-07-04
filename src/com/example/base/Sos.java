package com.example.base;

import com.android.dataframework.Entity;
public class Sos {
	private String objet;
	private String contenu;
	private String dateenvoie;
	private String idemp;
	
	public Sos(){
		super();
		this.objet="";
		this.contenu="";
		this.dateenvoie="";
		this.idemp="";
	}
	
	public Sos (String objet,String contenu,String dateEnvoie,String idEmp){
		super();
		this.objet=objet;
		this.contenu=contenu;
		this.dateenvoie=dateEnvoie;
		this.idemp=idEmp;
	}
	
	public Sos(Entity SosEntity){
		this.objet=(String)SosEntity.getValue("objet");
		this.contenu=(String)SosEntity.getValue("contenu");
		this.dateenvoie=(String)SosEntity.getValue("dateEnvoie");
		this.idemp=(String)SosEntity.getValue("idEmp");
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getDateEnvoie() {
		return dateenvoie;
	}

	public void setDateEnvoie(String dateEnvoie) {
		this.dateenvoie = dateEnvoie;
	}

	public String getIdEmp() {
		return idemp;
	}

	public void setIdEmp(String idEmp) {
		this.idemp = idEmp;
	}
	
	
}
