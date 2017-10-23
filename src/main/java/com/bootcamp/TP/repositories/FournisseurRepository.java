/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Fournisseur;

/**
 *
 * @author ARESKO
 */
public class FournisseurRepository extends BaseRepository<Fournisseur> {


    public FournisseurRepository(String persistUnit) {
        super(persistUnit,Fournisseur.class);
    }
    
   
    
}
