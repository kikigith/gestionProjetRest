package com.bootcamp.TP.entities.two;

import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.entities.Livrable;
import com.bootcamp.TP.entities.Projet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(Livrable.class)
public class Livrable_ { 

    public static volatile SingularAttribute<Livrable, Date> dateDeDebut;
    public static volatile SingularAttribute<Livrable, Projet> projet;
    public static volatile SingularAttribute<Livrable, Integer> id;
    public static volatile SingularAttribute<Livrable, Date> dateDeLivraison;
    public static volatile SingularAttribute<Livrable, String> nom;
    public static volatile SingularAttribute<Livrable, IndicateurPerformance> indicateurPerformance;

}