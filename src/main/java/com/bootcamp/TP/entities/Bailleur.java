/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import com.bootcamp.TP.enums.TypeDeBailleur;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ARESKO
 */
@Entity  
@DiscriminatorValue("bailleur")
public class Bailleur extends Personne {
    
    @Enumerated(EnumType.STRING)
    @Lob
    private TypeDeBailleur typeDeBailleur;
    
    @OneToMany(mappedBy = "bailleur")
    private List<Programme_Bailleur> programmeDeBailleur;
    
    @ManyToMany(mappedBy = "bailleurs")
    private List<Projet> projets;
    
    
    //Getters et setters
    public TypeDeBailleur getTypeDeBailleur() {
        return typeDeBailleur;
    }
    
    public void setTypeDeBailleur(TypeDeBailleur typeDeBailleur) {
        this.typeDeBailleur = typeDeBailleur;
    }
    
    public List<Projet> getProjets() {
        return projets;
    }
    
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }
    
    public List<Programme_Bailleur> getProgrammeDeBailleur() {
        return programmeDeBailleur;
    }
    
    public void setProgrammeDeBailleur(List<Programme_Bailleur> programmeDeBailleur) {
        this.programmeDeBailleur = programmeDeBailleur;
    }
    
}
