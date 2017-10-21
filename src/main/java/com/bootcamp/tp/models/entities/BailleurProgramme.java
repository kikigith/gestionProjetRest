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
@Table(name="tp_bailleur_programme")
public class BailleurProgramme implements Serializable	 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@ManyToOne
	@JoinColumn(name="BAILLEUR_ID", referencedColumnName="id")
	private Bailleur bailleurduprogramme;
	
	@ManyToOne
	@JoinColumn(name="PROGRAMME_ID", referencedColumnName="id")
	private Programme programmedubailleur;
	
	private Double capitalApporte;

	public Bailleur getBailleurduprogramme() {
		return bailleurduprogramme;
	}

	public void setBailleurduprogramme(Bailleur bailleur) {
		this.bailleurduprogramme = bailleur;
	}

	public Programme getProgrammedubailleur() {
		return programmedubailleur;
	}

	public void setProgrammedubailleur(Programme programme) {
		this.programmedubailleur = programme;
	}

	public Double getCapitalApporte() {
		return capitalApporte;
	}

	public void setCapitalApporte(Double capitalApporte) {
		this.capitalApporte = capitalApporte;
	}
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
	
	
}
