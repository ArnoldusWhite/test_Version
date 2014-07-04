package com.example.base;

import com.android.dataframework.Entity;
public class User {
	private String bt;
	private String type;
	private String sup;
	private String nom;
	private String prenom;
	private String sexe;
	private String nele;
	private String adresse;
	private String login;
	private String pwd;
	private String idemp;
	private String cni;
	
	public User() {
		super();
		this.bt="";
		this.type="";
		this.sup="";
		this.nom="";
		this.prenom="";
		this.sexe="";
		this.nele="";
		this.adresse="";
		this.login="";
		this.pwd="";
		this.idemp="";
		this.cni="";
	}
	
	public User(String nom,String prenom,String sexe,String nele,String adresse,String login,
			String pwd,String cni,String idemp,String bt,String type,String sup){
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.nele=nele;
		this.adresse=adresse;
		this.login=login;
		this.pwd=pwd;
		this.cni=cni;
		this.idemp=idemp;
		this.bt=bt;
		this.type=type;
		this.sup=sup;
	}
	
	public User(Entity UserEntity){
		this.idemp=(String)UserEntity.getValue("idemp");
		this.nom=(String)UserEntity.getValue("nom");
		this.prenom=(String)UserEntity.getValue("prenom");
		this.sexe=(String)UserEntity.getValue("sexe");
		this.nele=(String)UserEntity.getValue("nele");
		this.adresse=(String)UserEntity.getValue("adresse");
		this.login=(String)UserEntity.getValue("login");
		this.pwd=(String)UserEntity.getValue("pwd");
		this.cni=(String)UserEntity.getValue("cni");
		this.bt=(String)UserEntity.getValue("bt");
		this.type=(String)UserEntity.getValue("type");
		this.sup=(String)UserEntity.getValue("sup");
		
	}

	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSup() {
		return sup;
	}

	public void setSup(String sup) {
		this.sup = sup;
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

	public String getNele() {
		return nele;
	}

	public void setNele(String nele) {
		this.nele = nele;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getIdemp() {
		return idemp;
	}

	public void setIdemp(String idemp) {
		this.idemp = idemp;
	}

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}
	
	
	
	
}
