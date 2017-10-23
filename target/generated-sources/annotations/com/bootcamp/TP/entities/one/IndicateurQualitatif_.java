package com.bootcamp.TP.entities.one;

import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.entities.IndicateurQualitatif;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-23T19:41:55")
@StaticMetamodel(IndicateurQualitatif.class)
public class IndicateurQualitatif_ { 

    public static volatile SingularAttribute<IndicateurQualitatif, String> valeur;
    public static volatile SingularAttribute<IndicateurQualitatif, Integer> id;
    public static volatile SingularAttribute<IndicateurQualitatif, String> propriete;
    public static volatile SingularAttribute<IndicateurQualitatif, String> nom;
    public static volatile SingularAttribute<IndicateurQualitatif, IndicateurPerformance> indicateurPerformance;

}