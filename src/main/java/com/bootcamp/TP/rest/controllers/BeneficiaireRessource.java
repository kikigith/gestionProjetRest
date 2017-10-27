/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.Beneficiaire;
import com.bootcamp.TP.repositories.BeneficiaireRepository;
import io.swagger.annotations.ApiOperation;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ARESKO
 */
@Path("/beneficiaires")
public class BeneficiaireRessource {
    
    BeneficiaireRepository beneficiaireRepository = new BeneficiaireRepository("TPPU-DERBY");

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(
            value = "voir une donnée spéciique",
            notes = "mettre un commentaire",
            response = Beneficiaire.class,
            responseContainer = "List"
    )
    public Response getBeneficiaires() throws SQLException {
        List<Beneficiaire> beneficiaires = beneficiaireRepository.findAll();
        //access par le concept CORS
        return Response.status(200).entity(beneficiaires).header("Access-Control-Allow-Origin", "*").build();

    }
    
    @GET
    @Path("/{beneficiaireId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getBeneficiaireById(@PathParam("beneficiaireId") int id) throws SQLException {

        Beneficiaire beneficiaire = beneficiaireRepository.findByPropertyUnique("id", id);

        if (beneficiaire != null) {
            return Response.status(200).entity(beneficiaire).build();
        } else {
            return Response.status(404).entity("Aucun beneficiaire ne porte comme id : "+id).build();
        }
    }
    
    @POST   //ne marche pas
    @Path("/create")
    @Consumes({MediaType.APPLICATION_JSON}) 
    public Response addBeneficiaire(Beneficiaire beneficiaire) {
        String output = " Nouveau beneficiaire créé : \n";
        try {
            beneficiaireRepository.create(beneficiaire);
            return Response.status(200).entity(output + beneficiaire.getId() + "\n"+
                    beneficiaire.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Beneficiaire non créé").build();
        }
    }
    
    @PUT    //ne marche pas
    @Path("/update")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateBeneficiaire(Beneficiaire beneficiaire) {
        String output = " Mise à jour de Beneficiaire effectuée avec succès pour : ";
        try {
            beneficiaireRepository.update(beneficiaire);
            return Response.status(200).entity(output + beneficiaire.getId() + "\n"+
                    beneficiaire.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Beneficiaire non mis à jour").build();
        }

    }
    
    @PUT    //ne marche pas
    @Path("/update/{beneficiaireId}")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateBeneficiaireById(Beneficiaire beneficiaire) {
        String output = " Mise à jour de Beneficiaire effectuée avec succès pour : ";
        try {
            beneficiaireRepository.update(beneficiaire);
            return Response.status(200).entity(output + beneficiaire.getId() + "\n"+
                    beneficiaire.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Beneficiaire non mis à jour").build();
        }

    }
    
    @DELETE //ne marche pas
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response deleteBeneficiaire(Beneficiaire beneficiaire) {
        String output = " Suppression de Beneficiaire effectuée avec succès pour : ";
        try {
            beneficiaireRepository.delete(beneficiaire);
            return Response.status(200).entity(output + beneficiaire.getId() + "\n"+
                    beneficiaire.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Beneficiaire non supprimé").build();
        }

    }
    
    @POST
    @Path("/{beneficiaireId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateBeneficiaireById(@PathParam("beneficiaireId") int id) throws SQLException {

        Beneficiaire beneficiaire = beneficiaireRepository.findByPropertyUnique("id", id);

        if (beneficiaire != null) {
            return Response.status(200).entity(beneficiaire).build();
        } else {
            return Response.status(404).entity(beneficiaire).build();
        }
    }
    
    //ne marche pas
    @Path("/findByFields/{field}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getByFields(@PathParam("field") String champ, @QueryParam("fieldValue") String valeurChamp) throws SQLException, IllegalArgumentException, IllegalAccessException, IntrospectionException, InvocationTargetException {
        //String[] fieldArray = valeurChamp.split(",");
        List<Beneficiaire> beneficiaire = beneficiaireRepository.findByProperty(champ, valeurChamp);
        //  Beneficiaire beneficiaireResponse=new Beneficiaire();
//        Map<String, Object> responseMap = new HashMap<>();
////
//        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(Beneficiaire.class).getPropertyDescriptors();
//
//        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
//
//            Method method = propertyDescriptor.getReadMethod();
//            if (check(fieldArray, propertyDescriptor.getName())) {
//                responseMap.put(propertyDescriptor.getName(), method.invoke(beneficiaire));
//            }
////                System.out.println(" " + propertyDescriptor.getName());
////
////                System.out.println(method.invoke(beneficiaire));
//        }
        //return Response.status(200).entity(beneficiaire).build();
        if ( beneficiaire != null )
            return Response.status(200).entity(beneficiaire).build();
        else
            return Response.status(404).entity(beneficiaire).build();
    }
    
    //Méthode pour trouver un champ spécifique
    private boolean check(String[] fields, String field) {

        for (String field1 : fields) {
            if (field.equals(field1)) {
                return true;
            }
        }
        return false;
    }
    
}
