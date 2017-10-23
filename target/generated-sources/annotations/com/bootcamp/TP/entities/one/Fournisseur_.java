package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.Fournisseur;
import com.bootcamp.TP.entities.Programme_Fournisseur;
import com.bootcamp.TP.entities.Projet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(Fournisseur.class)
public class Fournisseur_ extends Personne_ {

    public static volatile ListAttribute<Fournisseur, Projet> projets;
    public static volatile ListAttribute<Fournisseur, Programme_Fournisseur> programmeDeFournisseur;

}