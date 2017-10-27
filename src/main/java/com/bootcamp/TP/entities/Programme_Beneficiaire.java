/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_programme_beneficiaire")
@IdClass(ProgrammeBeneficiaireId.class)
public class Programme_Beneficiaire implements Serializable {
    
    @Id
    private int programmeId;
    
    @Id
    private int beneficiaireId;
    
    @Column(nullable = false, length = 45)
    private String compteBancaire;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Programme programme;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Beneficiaire beneficiaire;
    
    //Getters et setters
    public String getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(String compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

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
    
}
