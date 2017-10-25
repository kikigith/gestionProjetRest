package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.entities.Programme_Bailleur;
import com.bootcamp.TP.entities.Projet;
import com.bootcamp.TP.enums.TypeDeBailleur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-25T01:09:03")
@StaticMetamodel(Bailleur.class)
public class Bailleur_ extends Personne_ {

    public static volatile ListAttribute<Bailleur, Projet> projets;
    public static volatile ListAttribute<Bailleur, Programme_Bailleur> programmeDeBailleur;
    public static volatile SingularAttribute<Bailleur, TypeDeBailleur> typeDeBailleur;

}