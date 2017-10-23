/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.entities;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ARESKO
 */
@Entity
@DiscriminatorValue("FOURNISSEUR")
public class Fournisseur extends Personne {

    @OneToMany(mappedBy = "fournisseur")
    private List<Programme_Fournisseur> programmeDeFournisseur;

    @ManyToMany(mappedBy = "fournisseurs")
    private List<Projet> projets;
    
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
