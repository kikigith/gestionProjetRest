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
@DiscriminatorValue("beneficiaire")
public class Beneficiaire extends Personne {
    
    @OneToMany(mappedBy = "beneficiaire")
    private List<Programme_Beneficiaire> programmeDeBeneficiaire;
    
    @ManyToMany(mappedBy = "beneficiaires")
    private List<Projet> projets;
    
    
    //Getters et setters
    public List<Programme_Beneficiaire> getProgrammeDeBeneficiaire() {
        return programmeDeBeneficiaire;
    }
    
    public void setProgrammeDeBeneficiaire(List<Programme_Beneficiaire> programmeDeBeneficiaire) {
        this.programmeDeBeneficiaire = programmeDeBeneficiaire;
    }
    
    public List<Projet> getProjets() {
        return projets;
    }
    
    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }
    
}
