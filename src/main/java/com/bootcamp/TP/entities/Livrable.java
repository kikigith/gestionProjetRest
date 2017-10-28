/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_livrable")//
@ApiModel(value="Livrable",
	description="représentation d'une resource REST Livrable"
		)
public class Livrable implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="id du livrable", required=true)
    private int id;
    
    @Column(nullable = false,length=45)
    @ApiModelProperty(value="nom du livrable", required=true)
    private String nom;
    
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(value="date debut du livrable", required=true)
    private Date dateDeDebut;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @ApiModelProperty(value="date livraison du livrable", required=true)
    private Date dateDeLivraison;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Projet projet;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private IndicateurPerformance indicateurPerformance;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(Date dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public Date getDateDeLivraison() {
        return dateDeLivraison;
    }

    public void setDateDeLivraison(Date dateDeLivraison) {
        this.dateDeLivraison = dateDeLivraison;
    }

  
    public IndicateurPerformance getIndicateurPerformance() {
        return indicateurPerformance;
    }

    public void setIndicateurPerformance(IndicateurPerformance indicateurPerformance) {
        this.indicateurPerformance = indicateurPerformance;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    
}
