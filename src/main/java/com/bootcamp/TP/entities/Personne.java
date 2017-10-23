/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ARESKO
 */
@Entity
@Table(name = "tp_personne")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_de_personne")
@DiscriminatorValue("PERSONNE")
public class Personne implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    
    @NotNull(message = "Entrer une valeur")
    @Column(nullable = false, length = 45)
    protected String nom;
	
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
	
}
