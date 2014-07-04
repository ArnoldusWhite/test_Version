package com.example.base;
import com.android.dataframework.Entity;

public class Incident {
	private String _idincident;
	private String dte_inc;
	private String libelleIncident;
	private String localisationincident;
	private String pointrepere;
	private String etatincident;
	private String descriptionincident;
	private String nature;
	
	public Incident() {
		super();
		this._idincident="";
		this.dte_inc="";
		this.libelleIncident="";
		this.localisationincident="";
		this.pointrepere="";
		this.etatincident="";
		this.descriptionincident="";
		this.nature="";
	}
	
	public Incident(String nature ,String etat,String description,String _idIncident,String dteInc,String libelle, String localisation,String point) {
		super();
		this._idincident=_idIncident;
		this.dte_inc=dteInc;
		this.libelleIncident=libelle;
		this.localisationincident=localisation;
		this.pointrepere=point;
		this.etatincident=etat;
		this.descriptionincident=description;
		this.nature=nature;
	}
	
	public Incident(Entity eltIncident){
		this._idincident=(String)eltIncident.getValue("_idincident");
		this.dte_inc=(String)eltIncident.getValue("dte_inc");
		this.libelleIncident=(String)eltIncident.getValue("libelleIncident");
		this.localisationincident=(String)eltIncident.getValue("localisationincident");
		this.pointrepere=(String)eltIncident.getValue("pointrepere");
		this.etatincident=(String)eltIncident.getValue("etatincident");
		this.descriptionincident=(String)eltIncident.getValue("descriptionincident");
		this.nature=(String)eltIncident.getValue("nature");
	}

	public String get_idincident() {
		return _idincident;
	}

	public void set_idincident(String _idincident) {
		this._idincident = _idincident;
	}

	public String getDte_inc() {
		return dte_inc;
	}

	public void setDte_inc(String dte_inc) {
		this.dte_inc = dte_inc;
	}

	public String getLibelleIncident() {
		return libelleIncident;
	}

	public void setLibelleIncident(String libelleIncident) {
		this.libelleIncident = libelleIncident;
	}

	public String getLocalisationincident() {
		return localisationincident;
	}

	public void setLocalisationincident(String localisationincident) {
		this.localisationincident = localisationincident;
	}

	public String getPointrepere() {
		return pointrepere;
	}

	public void setPointrepere(String pointrepere) {
		this.pointrepere = pointrepere;
	}

	public String getEtatincident() {
		return etatincident;
	}

	public void setEtatincident(String etatincident) {
		this.etatincident = etatincident;
	}

	public String getDescriptionincident() {
		return descriptionincident;
	}

	public void setDescriptionincident(String descriptionincident) {
		this.descriptionincident = descriptionincident;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	
		
}
