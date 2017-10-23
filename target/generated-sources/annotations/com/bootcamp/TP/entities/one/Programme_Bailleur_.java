package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Programme_Bailleur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(Programme_Bailleur.class)
public class Programme_Bailleur_ { 

    public static volatile SingularAttribute<Programme_Bailleur, Integer> programmeId;
    public static volatile SingularAttribute<Programme_Bailleur, Double> capital;
    public static volatile SingularAttribute<Programme_Bailleur, Bailleur> bailleur;
    public static volatile SingularAttribute<Programme_Bailleur, Integer> bailleurId;
    public static volatile SingularAttribute<Programme_Bailleur, Programme> programme;

}