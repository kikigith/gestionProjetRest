/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Programme_Beneficiaire;

/**
 *
 * @author ARESKO
 */
public class Beneficiaire_ProgrammeRepository extends BaseRepository<Programme_Beneficiaire> {
    
    public Beneficiaire_ProgrammeRepository(String persistUnit) {
        super(persistUnit, Programme_Beneficiaire.class);
    }
    
}
