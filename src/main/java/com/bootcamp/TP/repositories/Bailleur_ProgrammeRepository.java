/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Programme_Bailleur;

/**
 *
 * @author ARESKO
 */
public class Bailleur_ProgrammeRepository extends BaseRepository<Programme_Bailleur>{
    
    public Bailleur_ProgrammeRepository(String persistUnit) {
        super(persistUnit, Programme_Bailleur.class);
    }
    
}
