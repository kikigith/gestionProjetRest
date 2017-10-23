/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.repositories.BailleurRepository;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARESKO
 */
public class RestBailleurTest {

    //@Test
    public void queryFindUnique() throws IntrospectionException, InvocationTargetException {

        BailleurRepository donnees = new BailleurRepository("PostgresPuWeb");
        String[] fields = {"nom", "id"};
        try {
            Bailleur lebailleur = donnees.findByPropertyUnique("id", 1);
            Map<String, Object> responseMap = new HashMap<String, Object>();

            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(Bailleur.class).getPropertyDescriptors();

            for (PropertyDescriptor propertyDescriptor
                    : propertyDescriptors) {

                Method method = propertyDescriptor.getReadMethod();

                System.out.println(" " + propertyDescriptor.getName());

                System.out.println(method.invoke(lebailleur));
            }

        } catch (SQLException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(RestBailleurTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private boolean check(String[] fields, String field) {

        for (String field1 : fields) {
            if (field.equals(field1)) {
                return true;
            }
        }
        return false;
    }
}
