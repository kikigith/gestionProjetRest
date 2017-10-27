/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.Fournisseur;
import com.bootcamp.TP.repositories.FournisseurRepository;
import io.swagger.annotations.ApiOperation;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ARESKO
 */
@Path("/fournisseurs")
public class FournisseurRessource {
    
    FournisseurRepository fournisseurRepository = new FournisseurRepository("TPPU-DERBY");

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(
            value = "voir une donnée spéciique",
            notes = "mettre un commentaire",
            response = Fournisseur.class,
            responseContainer = "List"
    )
    public Response getFournisseurs() throws SQLException {
        List<Fournisseur> fournisseurs = fournisseurRepository.findAll();
        //access par le concept CORS
        return Response.status(200).entity(fournisseurs).header("Access-Control-Allow-Origin", "*").build();

    }
    
    @GET
    @Path("/{fournisseurId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getFournisseurById(@PathParam("fournisseurId") int id) throws SQLException {

        Fournisseur fournisseur = fournisseurRepository.findByPropertyUnique("id", id);

        if (fournisseur != null) {
            return Response.status(200).entity(fournisseur).build();
        } else {
            return Response.status(404).entity("Aucun fournisseur ne porte comme id : "+id).build();
        }
    }
    
    @POST   //ne marche pas
    @Path("/create")
    @Consumes({MediaType.APPLICATION_JSON}) 
    public Response addFournisseur(Fournisseur fournisseur) {
        String output = " Nouveau fournisseur créé : \n";
        try {
            fournisseurRepository.create(fournisseur);
            return Response.status(200).entity(output + fournisseur.getId() + "\n"+
                    fournisseur.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Fournisseur non créé").build();
        }
    }
    
    @PUT    //ne marche pas
    @Path("/update")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateFournisseur(Fournisseur fournisseur) {
        String output = " Mise à jour de Fournisseur effectuée avec succès pour : ";
        try {
            fournisseurRepository.update(fournisseur);
            return Response.status(200).entity(output + fournisseur.getId() + "\n"+
                    fournisseur.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Fournisseur non mis à jour").build();
        }

    }
    
    @PUT    //ne marche pas
    @Path("/update/{fournisseurId}")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateFournisseurById(Fournisseur fournisseur) {
        String output = " Mise à jour de Fournisseur effectuée avec succès pour : ";
        try {
            fournisseurRepository.update(fournisseur);
            return Response.status(200).entity(output + fournisseur.getId() + "\n"+
                    fournisseur.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Fournisseur non mis à jour").build();
        }

    }
    
    @DELETE //ne marche pas
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response deleteFournisseur(Fournisseur fournisseur) {
        String output = " Suppression de Fournisseur effectuée avec succès pour : ";
        try {
            fournisseurRepository.delete(fournisseur);
            return Response.status(200).entity(output + fournisseur.getId() + "\n"+
                    fournisseur.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Fournisseur non supprimé").build();
        }

    }
    
    @POST
    @Path("/{fournisseurId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateFournisseurById(@PathParam("fournisseurId") int id) throws SQLException {

        Fournisseur fournisseur = fournisseurRepository.findByPropertyUnique("id", id);

        if (fournisseur != null) {
            return Response.status(200).entity(fournisseur).build();
        } else {
            return Response.status(404).entity(fournisseur).build();
        }
    }
    
}
