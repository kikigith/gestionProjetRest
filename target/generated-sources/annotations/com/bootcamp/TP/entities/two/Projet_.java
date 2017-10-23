package com.bootcamp.TP.entities.two;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.entities.Beneficiaire;
import com.bootcamp.TP.entities.Fournisseur;
import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.entities.Livrable;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Projet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(Projet.class)
public class Projet_ { 

    public static volatile SingularAttribute<Projet, Date> dateDeDebut;
    public static volatile ListAttribute<Projet, Bailleur> bailleurs;
    public static volatile ListAttribute<Projet, Livrable> livrables;
    public static volatile SingularAttribute<Projet, String> nom;
    public static volatile SingularAttribute<Projet, IndicateurPerformance> indicateurPerformance;
    public static volatile SingularAttribute<Projet, Double> budgetPrevisionnel;
    public static volatile ListAttribute<Projet, Beneficiaire> beneficiaires;
    public static volatile SingularAttribute<Projet, Double> budgetEffectif;
    public static volatile SingularAttribute<Projet, String> objectif;
    public static volatile SingularAttribute<Projet, Date> dateDeFin;
    public static volatile SingularAttribute<Projet, Integer> id;
    public static volatile SingularAttribute<Projet, Programme> programme;
    public static volatile ListAttribute<Projet, Fournisseur> fournisseurs;

}