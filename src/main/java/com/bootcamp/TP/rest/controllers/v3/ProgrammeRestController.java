/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bootcamp.TP.rest.controllers.v3;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bootcamp.TP.entities.Programme;
import com.bootcamp.TP.repositories.ProgrammeRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

/**
 *
 * @author ARESKO
 */
@Path("/programme")
public class ProgrammeRestController {
    
    //instanciation d'un livrable repository
    
    ProgrammeRepository programmeRepository=new ProgrammeRepository("PostgresPuWeb");
   
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList() throws SQLException{
       
       List<Programme> programmes= programmeRepository.findAll();
        return Response.status(200).entity(programmes).build();

    }
    
     @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") int id) throws SQLException {
                 
       Programme programme = programmeRepository.findByPropertyUnique("id", id);
        
        if(programme != null)
            return Response.status(200).entity(programme).build();
        else
            return Response.status(404).entity(programme).build();
    }
    
    @POST
    @Path("/create")
//    @Produces(MediaType.)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Programme programme) {
     String output = " Félicitations objet créé avec succès : ";
        try {
            programmeRepository.create(programme);
            return Response.status(200).entity(output + programme.getNom()).build();
        } catch (SQLException ex) {
              return Response.status(200).entity("Erreur création").build();
        }
   
    

    }
    
      @PUT
    @Path("/update")
//    @Produces(MediaType.)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Programme programme) {
     String output = " Félicitations Mise à jour effectuée avec succès pour : ";
        try {
            programmeRepository.update(programme);
             return Response.status(200).entity(output + programme.getNom()).build();
        } catch (SQLException ex) {
            return Response.status(200).entity("Erreur création").build();
        }
    
        

    }
      
      @GET
  	@ApiOperation(
  			value="lesProgrammeDunePeriode",
  			notes="Liste les Programmes d'une période définie",
  			response=Programme.class,
  			responseContainer="List"
  			)
  	@ApiResponse(
  			code=404, 
  			message="Aucun Programme dans la période définie"
  			)
  	@Produces(MediaType.APPLICATION_JSON)
  	public Response lesProgrammeDunePeriode(@QueryParam("debut") String debut,
  			@QueryParam("fin") String fin) throws SQLException,ParseException{
  		Date []debutFin=new Date [2];
  		String format="yyyy-MM-dd";
  		SimpleDateFormat sdf=new SimpleDateFormat(format);
  		debutFin[0]=sdf.parse(debut);
  		debutFin[1]=sdf.parse(fin);
  		List<Programme> lesProgrammes=programmeRepository.findInstancesBetweenDates(debutFin);
  		return (lesProgrammes!=null) ? Response.status(200).entity(lesProgrammes).build():
  			Response.status(404).entity(lesProgrammes).build();

  	}

}
