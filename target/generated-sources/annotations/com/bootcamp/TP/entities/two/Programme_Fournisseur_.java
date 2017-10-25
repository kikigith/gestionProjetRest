package com.bootcamp.TP.entities.two;

import com.bootcamp.TP.entities.Fournisseur;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Programme_Fournisseur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-25T01:09:03")
@StaticMetamodel(Programme_Fournisseur.class)
public class Programme_Fournisseur_ { 

    public static volatile SingularAttribute<Programme_Fournisseur, Integer> programmeId;
    public static volatile SingularAttribute<Programme_Fournisseur, String> compteBancaire;
    public static volatile SingularAttribute<Programme_Fournisseur, Integer> fournisseurId;
    public static volatile SingularAttribute<Programme_Fournisseur, Fournisseur> fournisseur;
    public static volatile SingularAttribute<Programme_Fournisseur, Programme> programme;

}