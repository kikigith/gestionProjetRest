/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.Programme_Beneficiaire;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.bootcamp.TP.repositories.Beneficiaire_ProgrammeRepository;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ARESKO
 */
@Path("/benef/prog")
public class Beneficiaire_ProgrammeRestController {
    
    //instanciation du repository necessaire
    
    Beneficiaire_ProgrammeRepository bene_progRepository=new Beneficiaire_ProgrammeRepository("PostgresPuWeb");
   
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList() throws SQLException{
       
       List<Programme_Beneficiaire> bene_prog= bene_progRepository.findAll();
        return Response.status(200).entity(bene_prog).build();

    }
    
     @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") int id) throws SQLException {
                 
       Programme_Beneficiaire bene_prog = bene_progRepository.findByPropertyUnique("id", id);
        
        if(bene_prog != null)
            return Response.status(200).entity(bene_prog).build();
        else
            return Response.status(404).entity(bene_prog).build();
    }
    
    @POST
    @Path("/create")
//    @Produces(MediaType.)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Programme_Beneficiaire bene_prog) {
     String output = " Félicitations objet créé avec succès et son compte est: ";
        try {
            bene_progRepository.create(bene_prog);
           return Response.status(200).entity(output + bene_prog.getCompteBancaire()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Objet non créé").build();
        
        }
    

    }
    
      @PUT
    @Path("/update")
//    @Produces(MediaType.)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Programme_Beneficiaire bene_prog) {
     String output = " Félicitations Mise à jour effectuée avec succès pour : ";
        try {
            bene_progRepository.update(bene_prog);
            return Response.status(200).entity(output + bene_prog.getCompteBancaire()).build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Objet non mis à jour").build();
        }
        

    }

}
