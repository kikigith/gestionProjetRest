/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp;

import java.util.Properties;
import javax.persistence.Persistence;

import org.testng.annotations.Test;

/**
 *
 * @author ARESKO
 */
public class GenerateTableTest {

    String persistOne = "TPPU-DERBY"; 
    String persistTwo = "TPPU-MYSQL";
    
    @Test
    public void generateTables(){
        Persistence.createEntityManagerFactory(persistOne, new Properties() {});
        Persistence.createEntityManagerFactory(persistTwo, new Properties() {});
    }
    
}