/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.Bailleur;
import com.bootcamp.TP.enums.TypeDeBailleur;
import com.bootcamp.TP.repositories.BailleurRepository;
import io.swagger.annotations.ApiOperation;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@Path("/bailleurs")
public class BailleurRessource {
    
    BailleurRepository bailleurRepository = new BailleurRepository("TPPU-DERBY");

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(
            value = "voir une donnée spéciique",
            notes = "mettre un commentaire",
            response = Bailleur.class,
            responseContainer = "List"
    )
    public Response getBailleurs() throws SQLException {
        List<Bailleur> bailleurs = bailleurRepository.findAll();
        //access par le concept CORS
        return Response.status(200).entity(bailleurs).header("Access-Control-Allow-Origin", "*").build();

    }
    
    @GET
    @Path("/{bailleurId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getBailleurById(@PathParam("bailleurId") int id) throws SQLException {

        Bailleur bailleur = bailleurRepository.findByPropertyUnique("id", id);

        if (bailleur != null) {
            return Response.status(200).entity(bailleur).build();
        } else {
            return Response.status(404).entity("Aucun bailleur ne porte comme id : "+id).build();
        }
    }
    
    @POST   //ne marche pas
    @Path("/create")
    @Consumes({MediaType.APPLICATION_JSON}) 
    public Response addBailleur(Bailleur bailleur) {
        String output = " Nouveau bailleur créé : \n";
        try {
            bailleurRepository.create(bailleur);
            return Response.status(200).entity(output + bailleur.getId() + "\n"+
                    bailleur.getNom() + "\n"+ bailleur.getTypeDeBailleur()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Bailleur non créé").build();
        }
    }
    
    @PUT    //ne marche pas
    @Path("/update")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateBailleur(Bailleur bailleur) {
        String output = " Mise à jour de Bailleur effectuée avec succès pour : ";
        try {
            bailleurRepository.update(bailleur);
            return Response.status(200).entity(output + bailleur.getId() + "\n"+
                    bailleur.getNom() + "\n"+ bailleur.getTypeDeBailleur()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Bailleur non mis à jour").build();
        }

    }
    
    @PUT    //ne marche pas
    @Path("/update/{bailleurId}")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateBailleurById(Bailleur bailleur) {
        String output = " Mise à jour de Bailleur effectuée avec succès pour : ";
        try {
            bailleurRepository.update(bailleur);
            return Response.status(200).entity(output + bailleur.getId() + "\n"+
                    bailleur.getNom() + "\n"+ bailleur.getTypeDeBailleur()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Bailleur non mis à jour").build();
        }

    }
    
    @DELETE //ne marche pas
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response deleteBailleur(Bailleur bailleur) {
        String output = " Suppression de Bailleur effectuée avec succès pour : ";
        try {
            bailleurRepository.delete(bailleur);
            return Response.status(200).entity(output + bailleur.getId() + "\n"+
                    bailleur.getNom() + "\n"+ bailleur.getTypeDeBailleur()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Bailleur non supprimé").build();
        }

    }
    
    @POST
    @Path("/{bailleurId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateBailleurById(@PathParam("bailleurId") int id) throws SQLException {

        Bailleur bailleur = bailleurRepository.findByPropertyUnique("id", id);

        if (bailleur != null) {
            return Response.status(200).entity(bailleur).build();
        } else {
            return Response.status(404).entity(bailleur).build();
        }
    }
    
    @GET
    @Path("/findByTypeBailleur/{typeBailleur}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getBailleurByType(@PathParam("typeBailleur") TypeDeBailleur type) throws SQLException{
        List<Bailleur> b = bailleurRepository.findByProperty("typeDeBailleur", type);
        
        
        if (b!=null)
            return Response.status(200).entity(b).build();
        else
            return Response.status(404).entity(b).build();
    }
    
    @GET
    @Path("/findByTypeBailleur")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getBailleurByTyp(@QueryParam ("typeBailleur") TypeDeBailleur typeBailleur) throws SQLException{
        List<Bailleur> b = bailleurRepository.findByProperty("typeDeBailleur", typeBailleur);
        
        
        if (b!=null)
            return Response.status(200).entity(b).build();
        else
            return Response.status(404).entity(b).build();
    }
    
    @GET    //ne marche pas
    @Path("/findByFields/{field}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getByFields(@PathParam("field") String champ, @QueryParam("fieldValue") String valeurChamp) throws SQLException, IllegalArgumentException, IllegalAccessException, IntrospectionException, InvocationTargetException {
        //String[] fieldArray = valeurChamp.split(",");
        List<Bailleur> bailleur = bailleurRepository.findByProperty(champ, valeurChamp);
        //  Bailleur bailleurResponse=new Bailleur();
//        Map<String, Object> responseMap = new HashMap<>();
////
//        PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(Bailleur.class).getPropertyDescriptors();
//
//        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
//
//            Method method = propertyDescriptor.getReadMethod();
//            if (check(fieldArray, propertyDescriptor.getName())) {
//                responseMap.put(propertyDescriptor.getName(), method.invoke(bailleur));
//            }
////                System.out.println(" " + propertyDescriptor.getName());
////
////                System.out.println(method.invoke(bailleur));
//        }
        //return Response.status(200).entity(bailleur).build();
        if ( bailleur != null )
            return Response.status(200).entity(bailleur).build();
        else
            return Response.status(404).entity(bailleur).build();
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
