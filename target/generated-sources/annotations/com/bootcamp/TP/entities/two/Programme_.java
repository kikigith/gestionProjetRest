package com.bootcamp.TP.entities.two;

import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Programme_Bailleur;
import com.bootcamp.TP.entities.Programme_Beneficiaire;
import com.bootcamp.TP.entities.Programme_Fournisseur;
import com.bootcamp.TP.entities.Projet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-27T08:52:47")
@StaticMetamodel(Programme.class)
public class Programme_ { 

    public static volatile SingularAttribute<Programme, Date> dateDeDebut;
    public static volatile SingularAttribute<Programme, Double> budgetEffectif;
    public static volatile ListAttribute<Programme, Projet> projets;
    public static volatile SingularAttribute<Programme, String> objectif;
    public static volatile ListAttribute<Programme, Programme_Bailleur> programmeDeBailleur;
    public static volatile SingularAttribute<Programme, Date> dateDeFin;
    public static volatile ListAttribute<Programme, Programme_Beneficiaire> programmeDeBeneficiaire;
    public static volatile SingularAttribute<Programme, Integer> id;
    public static volatile SingularAttribute<Programme, String> nom;
    public static volatile SingularAttribute<Programme, IndicateurPerformance> indicateurPerformance;
    public static volatile SingularAttribute<Programme, Double> budgetPrevisionnel;
    public static volatile ListAttribute<Programme, Programme_Fournisseur> programmeDeFournisseur;

}