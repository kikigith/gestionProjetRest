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
@Table(name="tp_programme_beneficiaire")
public class ProgrammeBeneficiaire  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@ManyToOne
	@JoinColumn(name="PROGRAMME_ID", referencedColumnName="id")
	private Programme programme;
	@ManyToOne
	@JoinColumn(name="BENEFICIAIRE_ID", referencedColumnName="id")
	private Beneficiaire beneficiaire;
	public Programme getProgramme() {
		return programme;
	}
	public void setProgramme(Programme programme) {
		this.programme = programme;
	}
	public Beneficiaire getBeneficiaire() {
		return beneficiaire;
	}
	public void setBeneficiaire(Beneficiaire beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
