/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.entities.Beneficiaire;
import com.bootcamp.TP.entities.Fournisseur;
import com.bootcamp.TP.entities.Livrable;
import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.entities.Projet;
import com.bootcamp.TP.enums.TypeDeBailleur;
import com.bootcamp.TP.repositories.BailleurRepository;
import com.bootcamp.TP.repositories.BeneficiaireRepository;
import com.bootcamp.TP.repositories.FournisseurRepository;
import com.bootcamp.TP.repositories.LivrableRepository;
import com.bootcamp.TP.repositories.ProgrammeRepository;
import com.bootcamp.TP.repositories.ProjetRepository;
import java.sql.SQLException;
import java.util.Date;
import org.testng.annotations.Test;

/**
 *
 * @author ARESKO
 */
public class RemplirTableTest {
    
    //Définition des PU
    String persistOne = "TPPU-DERBY"; 
    String persistTwo = "TPPU-MYSQL";
    
    //création de bailleurs
    Bailleur bailleur1 = new Bailleur();
    Bailleur bailleur2 = new Bailleur();
    Bailleur bailleur3 = new Bailleur();
    Bailleur bailleur4 = new Bailleur();
    Bailleur bailleur5 = new Bailleur();
    
    //création de bénéficiaires
    Beneficiaire benef1 = new Beneficiaire();
    Beneficiaire benef2 = new Beneficiaire();
    Beneficiaire benef3 = new Beneficiaire();
    Beneficiaire benef4 = new Beneficiaire();
    Beneficiaire benef5 = new Beneficiaire();
    
    //création de fournisseurs
    Fournisseur fourniss1 = new Fournisseur();
    Fournisseur fourniss2 = new Fournisseur();
    Fournisseur fourniss3 = new Fournisseur();
    Fournisseur fourniss4 = new Fournisseur();
    Fournisseur fourniss5 = new Fournisseur();
    
    //création de programme
    Programme progr1 = new Programme();
    Programme progr2 = new Programme();
    Programme progr3 = new Programme();
    Programme progr4 = new Programme();
    Programme progr5 = new Programme();
    
    //création de projet
    Projet proj1 = new Projet();
    Projet proj2 = new Projet();
    Projet proj3 = new Projet();
    Projet proj4 = new Projet();
    Projet proj5 = new Projet();
    
    //création de livrable
    Livrable livr1 = new Livrable();
    Livrable livr2 = new Livrable();
    Livrable livr3 = new Livrable();
    Livrable livr4 = new Livrable();
    Livrable livr5 = new Livrable();
    
    
    @Test
    //Ajout de Bailleurs
    public void ajoutBailleur() throws SQLException{
        bailleur1.setId(1);
        bailleur1.setNom("ADOSSO");
        bailleur1.setTypeDeBailleur(TypeDeBailleur.Prive);
        
        bailleur2.setId(2);
        bailleur2.setNom("TOSSA");
        bailleur2.setTypeDeBailleur(TypeDeBailleur.Gouvernementale);
        
        bailleur3.setId(3);
        bailleur3.setNom("JIJOU");
        bailleur3.setTypeDeBailleur(TypeDeBailleur.Gouvernementale);
        
        bailleur4.setId(4);
        bailleur4.setNom("SAGBO");
        bailleur4.setTypeDeBailleur(TypeDeBailleur.Non_gouvernementale);
        
        bailleur5.setId(5);
        bailleur5.setNom("EKLOU");
        bailleur5.setTypeDeBailleur(TypeDeBailleur.Prive);
        
        BailleurRepository br1 = new BailleurRepository(persistOne);
        BailleurRepository br2 = new BailleurRepository(persistTwo);
        
        br1.create(bailleur1);
        br1.create(bailleur2);
        br1.create(bailleur3);
        br1.create(bailleur4);
        br1.create(bailleur5);
        
        br2.create(bailleur1);
        br2.create(bailleur2);
        br2.create(bailleur3);
        br2.create(bailleur4);
        br2.create(bailleur5);
        
    }
    
    @Test
    //Ajout de Bénéficiaires
    public void ajoutBeneficiaire() throws SQLException{
        benef1.setId(1);
        benef1.setNom("LUC");
        
        benef2.setId(2);
        benef2.setNom("ZINGO");
        
        benef3.setId(3);
        benef3.setNom("AKOUABA");
        
        benef4.setId(4);
        benef4.setNom("DAVI");
        
        benef5.setId(5);
        benef5.setNom("JOSEPH");
        
        BeneficiaireRepository br1 = new BeneficiaireRepository(persistOne);
        BeneficiaireRepository br2 = new BeneficiaireRepository(persistTwo);
        
        br1.create(benef1);
        br1.create(benef2);
        br1.create(benef3);
        br1.create(benef4);
        br1.create(benef5);
        
        br2.create(benef1);
        br2.create(benef2);
        br2.create(benef3);
        br2.create(benef4);
        br2.create(benef5);
        
    }
    
    @Test
    //Ajout de Fournisseurs
    public void ajoutFournisseur() throws SQLException{
        fourniss1.setId(1);
        fourniss1.setNom("JANVIER");
        
        fourniss2.setId(2);
        fourniss2.setNom("PIERRE");
        
        fourniss3.setId(3);
        fourniss3.setNom("OLAMIDE");
        
        fourniss4.setId(4);
        fourniss4.setNom("PASCAL");
        
        fourniss5.setId(5);
        fourniss5.setNom("LANDRY");
        
        FournisseurRepository br1 = new FournisseurRepository(persistOne);
        FournisseurRepository br2 = new FournisseurRepository(persistTwo);
        
        br1.create(fourniss1);
        br1.create(fourniss2);
        br1.create(fourniss3);
        br1.create(fourniss4);
        br1.create(fourniss5);
        
        br2.create(fourniss1);
        br2.create(fourniss2);
        br2.create(fourniss3);
        br2.create(fourniss4);
        br2.create(fourniss5);
    }
    
    
    @Test
    //Ajout de Programmes
    public void ajoutProgramme() throws SQLException{
        progr1.setId(1);
        progr1.setNom("Lutte contre la pauvreté");
        progr1.setBudgetEffectif(15_000_000);
        progr1.setBudgetPrevisionnel(20_000_000);
        progr1.setDateDeDebut(new Date());
        progr1.setDateDeFin(new Date());
        progr1.setObjectif("objectif1");
        
        progr2.setId(2);
        progr2.setNom("Scolarisation des filles");
        progr2.setBudgetEffectif(25_000_000);
        progr2.setBudgetPrevisionnel(20_000_000);
        progr2.setDateDeDebut(new Date());
        progr2.setDateDeFin(new Date());
        progr2.setObjectif("objectif2");
        
        progr3.setId(3);
        progr3.setNom("Polio");
        progr3.setBudgetEffectif(35_000_000);
        progr3.setBudgetPrevisionnel(20_000_000);
        progr3.setDateDeDebut(new Date());
        progr3.setDateDeFin(new Date());
        progr3.setObjectif("objectif3");
        
        progr4.setId(4);
        progr4.setNom("Distrinution de moustiquaire");
        progr4.setBudgetEffectif(45_000_000);
        progr4.setBudgetPrevisionnel(20_000_000);
        progr4.setDateDeDebut(new Date());
        progr4.setDateDeFin(new Date());
        progr4.setObjectif("objectif4");
        
        progr5.setId(5);
        progr5.setNom("développement");
        progr5.setBudgetEffectif(55_000_000);
        progr5.setBudgetPrevisionnel(20_000_000);
        progr5.setDateDeDebut(new Date());
        progr5.setDateDeFin(new Date());
        progr5.setObjectif("objectif5");
        
        ProgrammeRepository br1 = new ProgrammeRepository(persistOne);
        ProgrammeRepository br2 = new ProgrammeRepository(persistTwo);
        
        br1.create(progr1);
        br1.create(progr2);
        br1.create(progr3);
        br1.create(progr4);
        br1.create(progr5);
        
        br2.create(progr1);
        br2.create(progr2);
        br2.create(progr3);
        br2.create(progr4);
        br2.create(progr5);
    }
    
    @Test
    public void ajoutProjet() throws SQLException{
        proj1.setId(1);
        proj1.setNom("PPAE");
        proj1.setBudgetEffectif(481_000_000);
        proj1.setBudgetPrevisionnel(315_000_000);
        proj1.setDateDeDebut(new Date());
        proj1.setDateDeFin(new Date());
        proj1.setObjectif("objectif11");
        
        proj2.setId(2);
        proj2.setNom("POEA");
        proj2.setBudgetEffectif(482_000_000);
        proj2.setBudgetPrevisionnel(325_000_000);
        proj2.setDateDeDebut(new Date());
        proj2.setDateDeFin(new Date());
        proj2.setObjectif("objectif22");
        
        proj3.setId(3);
        proj3.setNom("PIAO");
        proj3.setBudgetEffectif(483_000_000);
        proj3.setBudgetPrevisionnel(335_000_000);
        proj3.setDateDeDebut(new Date());
        proj3.setDateDeFin(new Date());
        proj3.setObjectif("objectif33");
        
        proj4.setId(4);
        proj4.setNom("PPE");
        proj4.setBudgetEffectif(484_000_000);
        proj4.setBudgetPrevisionnel(344_000_000);
        proj4.setDateDeDebut(new Date());
        proj4.setDateDeFin(new Date());
        proj4.setObjectif("objectif44");
        
        proj5.setId(5);
        proj5.setNom("PEOVI");
        proj5.setBudgetEffectif(485_000_000);
        proj5.setBudgetPrevisionnel(355_000_000);
        proj5.setDateDeDebut(new Date());
        proj5.setDateDeFin(new Date());
        proj5.setObjectif("objectif55");
        
        ProjetRepository br1 = new ProjetRepository(persistOne);
        ProjetRepository br2 = new ProjetRepository(persistTwo);
        
        br1.create(proj1);
        br1.create(proj2);
        br1.create(proj3);
        br1.create(proj4);
        br1.create(proj5);
        
        br2.create(proj1);
        br2.create(proj2);
        br2.create(proj3);
        br2.create(proj4);
        br2.create(proj5);
    }
    
    @Test
    //Ajout de Livrables
    public void ajoutLivrable() throws SQLException{
        livr1.setId(1);
        livr1.setNom("Introduction");
        livr1.setDateDeDebut(new Date());
        livr1.setDateDeLivraison(new Date());
        
        livr2.setId(2);
        livr2.setNom("Préambule");
        livr2.setDateDeDebut(new Date());
        livr2.setDateDeLivraison(new Date());
        
        livr3.setId(3);
        livr3.setNom("Activité");
        livr3.setDateDeDebut(new Date());
        livr3.setDateDeLivraison(new Date());
        
        livr4.setId(4);
        livr4.setNom("Partie technique");
        livr4.setDateDeDebut(new Date());
        livr4.setDateDeLivraison(new Date());
        
        livr5.setId(5);
        livr5.setNom("Partie financière");
        livr5.setDateDeDebut(new Date());
        livr5.setDateDeLivraison(new Date());
        
        LivrableRepository br1 = new LivrableRepository(persistOne);
        LivrableRepository br2 = new LivrableRepository(persistTwo);
        
        br1.create(livr1);
        br1.create(livr2);
        br1.create(livr3);
        br1.create(livr4);
        br1.create(livr5);
        
        br2.create(livr1);
        br2.create(livr2);
        br2.create(livr3);
        br2.create(livr4);
        br2.create(livr5);
    }
    
}
