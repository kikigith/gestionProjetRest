/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_programme")
public class Programme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false, length = 45)
    private String nom;

    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false, length = 45)
    private String objectif;

    @NotNull(message = "Entrer une date")
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeDebut;

    @NotNull(message = "Entrer une date")
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeFin;

    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false)
    private double budgetPrevisionnel;

    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false)
    private double budgetEffectif;

    @OneToOne(cascade = CascadeType.PERSIST)
    private IndicateurPerformance indicateurPerformance;
    
    @OneToMany(mappedBy = "programme")
    private List<Programme_Bailleur> programmeDeBailleur;
    
    @OneToMany(mappedBy = "programme")
    private List<Programme_Beneficiaire> programmeDeBeneficiaire;
    
    @OneToMany(mappedBy = "programme")
    private List<Programme_Fournisseur> programmeDeFournisseur;
    
    @OneToMany(mappedBy = "programme")
    private List<Projet> projets;

    public Programme() {
        
    }
    
    
    //Getters et setters
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
    
    public String getObjectif() {
        return objectif;
    }
    
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
    
    public Date getDateDeDebut() {
        return dateDeDebut;
    }
    
    public void setDateDeDebut(Date dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }
    
    public Date getDateDeFin() {
        return dateDeFin;
    }
    
    public void setDateDeFin(Date dateDeFin) {
        this.dateDeFin = dateDeFin;
    }
    
    public double getBudgetPrevisionnel() {
        return budgetPrevisionnel;
    }
    
    public void setBudgetPrevisionnel(double budgetPrevisionnel) {
        this.budgetPrevisionnel = budgetPrevisionnel;
    }
    
    public double getBudgetEffectif() {
        return budgetEffectif;
    }
    
    public void setBudgetEffectif(double budgetEffectif) {
        this.budgetEffectif = budgetEffectif;
    }
    
    public IndicateurPerformance getIndicateurPerformance() {
        return indicateurPerformance;
    }
    
    public void setIndicateurPerformance(IndicateurPerformance indicateurPerformance) {
        this.indicateurPerformance = indicateurPerformance;
    }
    
    public List<Programme_Bailleur> getProgrammeDeBailleur() {
        return programmeDeBailleur;
    }
    
    public void setProgrammeDeBailleur(List<Programme_Bailleur> programmeDeBailleur) {
        this.programmeDeBailleur = programmeDeBailleur;
    }
    
    public List<Programme_Beneficiaire> getProgrammeDeBeneficiaire() {
        return programmeDeBeneficiaire;
    }
    
    public void setProgrammeDeBeneficiaire(List<Programme_Beneficiaire> programmeDeBeneficiaire) {
        this.programmeDeBeneficiaire = programmeDeBeneficiaire;
    }
    
    public List<Programme_Fournisseur> getProgrammeDeFournisseur() {
        return programmeDeFournisseur;
    }
    
    public void setProgrammeDeFournisseur(List<Programme_Fournisseur> programmeDeFournisseur) {
        this.programmeDeFournisseur = programmeDeFournisseur;
    }
    
    public List<Projet> getProjets() {
        return projets;
    }
    
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }
    
}
