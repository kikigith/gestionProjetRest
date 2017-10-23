/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Programme;

/**
 *
 * @author ARESKO
 */
public class ProgrammeRepository extends BaseRepository<Programme> {
   
    public ProgrammeRepository(String persistUnit) {
        super(persistUnit,Programme.class);
    }
   
    
}
