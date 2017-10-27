package com.bootcamp.TP.entities.two;

import com.bootcamp.TP.entities.Beneficiaire;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Programme_Beneficiaire;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-27T08:52:47")
@StaticMetamodel(Programme_Beneficiaire.class)
public class Programme_Beneficiaire_ { 

    public static volatile SingularAttribute<Programme_Beneficiaire, Integer> programmeId;
    public static volatile SingularAttribute<Programme_Beneficiaire, String> compteBancaire;
    public static volatile SingularAttribute<Programme_Beneficiaire, Integer> beneficiaireId;
    public static volatile SingularAttribute<Programme_Beneficiaire, Beneficiaire> beneficiaire;
    public static volatile SingularAttribute<Programme_Beneficiaire, Programme> programme;

}