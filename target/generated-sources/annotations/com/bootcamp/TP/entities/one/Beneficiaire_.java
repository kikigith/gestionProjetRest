package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.Beneficiaire;
import com.bootcamp.TP.entities.Programme_Beneficiaire;
import com.bootcamp.TP.entities.Projet;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(Beneficiaire.class)
public class Beneficiaire_ extends Personne_ {

    public static volatile ListAttribute<Beneficiaire, Projet> projets;
    public static volatile ListAttribute<Beneficiaire, Programme_Beneficiaire> programmeDeBeneficiaire;

}