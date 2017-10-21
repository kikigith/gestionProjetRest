package com.bootcamp.tp.models.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="tp_projet_fournisseur")
public class ProjetFournisseur   implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@ManyToOne 
	@JoinColumn(name ="PROJET_ID", referencedColumnName="id")
	private Projet projet;
	@ManyToOne 
	@JoinColumn(name ="FOURNISSEUR_ID", referencedColumnName="id")
	private Fournisseur fournisseur;
	
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
