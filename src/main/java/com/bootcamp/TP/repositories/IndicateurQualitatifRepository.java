/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.IndicateurQualitatif;

/**
 *
 * @author ARESKO
 */
public class IndicateurQualitatifRepository extends BaseRepository<IndicateurQualitatif> {
    
    public IndicateurQualitatifRepository(String persistUnit) {
        super(persistUnit,IndicateurQualitatif.class);
    }
    
    
}
