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
import javax.validation.constraints.NotNull;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_programme_bailleur")
@IdClass(ProgrammeBailleurId.class)
public class Programme_Bailleur implements Serializable  {
    
    @Id
    private int programmeId;
    
    @Id
    private int bailleurId;
    
    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false, length = 45)
    private double capital;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Programme programme;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Bailleur bailleur;
    
    
    //Getters et setters
    public double getCapital() {
        return capital;
    }
    
    public void setCapital(double capital) {
        this.capital = capital;
    }
    
    public Programme getProgramme() {
        return programme;
    }
    
    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
    
    public Bailleur getBailleur() {
        return bailleur;
    }
    
    public void setBailleur(Bailleur bailleur) {
        this.bailleur = bailleur;
    }
    
}
