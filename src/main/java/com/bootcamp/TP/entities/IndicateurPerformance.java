/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_indicateurperformance")
public class IndicateurPerformance implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, length = 45)
    private String libelle;
    
    @Column(nullable = false, length = 45)
    private String nature;
    
    @Column(nullable = false, length = 45)
    private String valeur;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public String getNature() {
        return nature;
    }
    
    public void setNature(String nature) {
        this.nature = nature;
    }
    
    public String getValeur() {
        return valeur;
    }
    
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
    
}
