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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "tp_projet")
public class Projet implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull(message = "Entrer une valeur")
    @Column( nullable = false, length=45)
    private String nom;
    
    @NotNull(message = "Entrer une valeur")
    @Column( nullable = false, length=45)
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
    
    @ManyToMany
    private List<Bailleur> bailleurs;
    
    @ManyToMany
    private List<Beneficiaire> beneficiaires;
    
    @ManyToMany
    private List<Fournisseur> fournisseurs;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private IndicateurPerformance indicateurPerformance;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Programme programme;
    
    @OneToMany(mappedBy = "projet")
    private List<Livrable> livrables;
    
    
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
    
    public Programme getProgramme() {
        return programme;
    }
    
    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
    
    public List<Bailleur> getBailleurs() {
        return bailleurs;
    }

    public void setBailleurs(List<Bailleur> bailleurs) {
        this.bailleurs = bailleurs;
    }
    
    public List<Beneficiaire> getBeneficiaires() {
        return beneficiaires;
    }
    
    public void setBeneficiaires(List<Beneficiaire> beneficiaires) {
        this.beneficiaires = beneficiaires;
    }
    
    public List<Fournisseur> getFournisseurs() {
        return fournisseurs;
    }
    
    public void setFournisseurs(List<Fournisseur> fournisseurs) {
        this.fournisseurs = fournisseurs;
    }
    
    public List<Livrable> getLivrables() {
        return livrables;
    }
    
    public void setLivrables(List<Livrable> livrables) {
        this.livrables = livrables;
    }
    
}
