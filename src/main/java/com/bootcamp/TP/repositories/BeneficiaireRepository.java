/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Beneficiaire;

/**
 *
 * @author ARESKO
 */
public class BeneficiaireRepository extends BaseRepository<Beneficiaire> {
   
    public BeneficiaireRepository(String persistUnit) {
        super(persistUnit,Beneficiaire.class);
    }
   
    
}
