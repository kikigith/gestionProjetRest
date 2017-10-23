/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.repositories;

import com.bootcamp.TP.entities.IndicateurPerformance;


/**
 *
 * @author ARESKO
 */
public class IndicateurPerformanceRepository extends BaseRepository<IndicateurPerformance>{
    
    public IndicateurPerformanceRepository(String persistUnit) {
        super(persistUnit,IndicateurPerformance.class);
    }
    
}
