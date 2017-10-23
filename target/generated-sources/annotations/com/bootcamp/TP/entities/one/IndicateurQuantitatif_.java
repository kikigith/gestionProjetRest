package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.entities.IndicateurQuantitatif;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(IndicateurQuantitatif.class)
public class IndicateurQuantitatif_ { 

    public static volatile SingularAttribute<IndicateurQuantitatif, Integer> valeur;
    public static volatile SingularAttribute<IndicateurQuantitatif, Integer> id;
    public static volatile SingularAttribute<IndicateurQuantitatif, String> propriete;
    public static volatile SingularAttribute<IndicateurQuantitatif, String> nom;
    public static volatile SingularAttribute<IndicateurQuantitatif, IndicateurPerformance> indicateurPerformance;

}