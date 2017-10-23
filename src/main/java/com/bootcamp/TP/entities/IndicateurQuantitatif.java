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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_indicateurquantitatif")
public class IndicateurQuantitatif implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, length = 45)
    private String nom;
    
    @Column(nullable = false, length = 45)
    private String propriete;
    
    @Column(nullable = false)
    private int valeur;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private IndicateurPerformance indicateurPerformance;
    
    
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
    
    public String getPropriete() {
        return propriete;
    }
    
    public void setPropriete(String propriete) {
        this.propriete = propriete;
    }
    
    public int getValeur() {
        return valeur;
    }
    
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
    public IndicateurPerformance getIndicateurPerformance() {
        return indicateurPerformance;
    }
    
    public void setIndicateurPerformance(IndicateurPerformance indicateurPerformance) {
        this.indicateurPerformance = indicateurPerformance;
    }
    
}
