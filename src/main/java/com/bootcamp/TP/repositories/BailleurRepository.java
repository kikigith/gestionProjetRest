/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Bailleur;

/**
 *
 * @author ARESKO
 */
public class BailleurRepository extends BaseRepository<Bailleur>{
 
    public BailleurRepository(String persistUnit) {
        super(persistUnit,Bailleur.class);
    }
  
}
