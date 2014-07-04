package com.example.base;
import com.android.dataframework.Entity;

public class Rapport {
	private String idemp;
	private String idincident;
	private String libellerapport;
	private String contenurapport;
	private String _idrapport;
	private String dateenvoie;
	
	public Rapport() {
		super();
		this.idemp="";
		this.idincident="";
		this.contenurapport="";
		this.libellerapport="";
		this.dateenvoie="";
		this._idrapport="";
	}
	
	public Rapport(String idEmp,String idIncident,String contenu,String libelle,String dateEnvoie,String _idRapport){
		super();
		this.idemp=idEmp;
		this.idincident=idIncident;
		this.contenurapport=contenu;
		this.libellerapport=libelle;
		this.dateenvoie=dateEnvoie;
		this._idrapport=_idRapport;
	}
	
	public Rapport(Entity eltRapport){
		this._idrapport=(String)eltRapport.getValue("_idrapport");
		this.idemp=(String)eltRapport.getValue("idemp");
		this.idincident=(String)eltRapport.getValue("idincident");
		this.contenurapport=(String)eltRapport.getValue("contenurapport");
		this.libellerapport=(String)eltRapport.getValue("libellerapport");
		this.dateenvoie=(String)eltRapport.getValue("dateenvoie");
	}

	public String getIdemp() {
		return idemp;
	}

	public void setIdemp(String idemp) {
		this.idemp = idemp;
	}

	public String getIdincident() {
		return idincident;
	}

	public void setIdincident(String idincident) {
		this.idincident = idincident;
	}

	public String getLibellerapport() {
		return libellerapport;
	}

	public void setLibellerapport(String libellerapport) {
		this.libellerapport = libellerapport;
	}

	public String getContenurapport() {
		return contenurapport;
	}

	public void setContenurapport(String contenurapport) {
		this.contenurapport = contenurapport;
	}

	public String get_idrapport() {
		return _idrapport;
	}

	public void set_idrapport(String _idrapport) {
		this._idrapport = _idrapport;
	}

	public String getDateenvoie() {
		return dateenvoie;
	}

	public void setDateenvoie(String dateenvoie) {
		this.dateenvoie = dateenvoie;
	}
	
	
}
