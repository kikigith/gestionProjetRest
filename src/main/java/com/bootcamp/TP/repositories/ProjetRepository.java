/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.Projet;

/**
 *
 * @author ARESKO
 */
public class ProjetRepository extends BaseRepository<Projet> {
    
    public ProjetRepository(String persistUnit) {
        super(persistUnit,Projet.class);
    }
    
}
