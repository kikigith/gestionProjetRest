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
@Table(name = "tp_bailleur_projet")
public class BailleurProjet implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@ManyToOne
	@JoinColumn(name="BAILLEUR_ID", referencedColumnName="id")
	private Bailleur bailleurduprojet;
	@ManyToOne
	@JoinColumn(name="PROJET_ID", referencedColumnName="id")
	private Projet projet;
	public Bailleur getBailleurduprojet() {
		return bailleurduprojet;
	}
	public void setBailleurduprojet(Bailleur bailleur) {
		this.bailleurduprojet = bailleur;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	
}
