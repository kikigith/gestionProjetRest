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

import com.bootcamp.TP.entities.Livrable;
import com.bootcamp.TP.repositories.LivrableRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 *
 * @author ARESKO
 */
@Path("/livrab")
@Api(value="/livrab",description="Api gérant  les livrables ")
public class LivrableRestController {

	//instanciation d'un livrable repository

	LivrableRepository livrableRepository=new LivrableRepository("TPPU-MYSQL");

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList() throws SQLException{

		List<Livrable> livrables= livrableRepository.findAll();
		return Response.status(200).entity(livrables).build();

	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") int id) throws SQLException {

		Livrable livrable = livrableRepository.findByPropertyUnique("id", id);

		if(livrable != null)
			return Response.status(200).entity(livrable).build();
		else
			return Response.status(404).entity(livrable).build();
	}

	@POST
	@Path("/create")
	//    @Produces(MediaType.)
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(
			value="create",
			notes="Ajouter un nouveau livrable",
			response=Livrable.class,
			responseContainer="Livrable"
			)
	@ApiResponses({
	     @ApiResponse(code=201, message="Ajout avec succès"),
	     @ApiResponse(code=404, message="impossible d'ajouter ce livrable")
	})
	public Response create(Livrable livrable) {
		String output = " Félicitations objet créé avec succès : ";
		try {
			livrableRepository.create(livrable);
			return Response.status(200).entity(output + livrable.getNom()).build(); 
		} catch (SQLException ex) {
			return Response.status(404).entity("Erreur: Objet non créé").build();

		}


	}

	@PUT
	@Path("/update")
	//    @Produces(MediaType.)
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(
			value="update",
			notes="mettre à jour un livrable",
			response=Livrable.class,
			responseContainer="Livrable"
			)
	@ApiResponses({
	     @ApiResponse(code=201, message="Livrable mis à jour avec succès"),
	     @ApiResponse(code=404, message="Aucun livrable dans la période définie")
	})
	public Response update(Livrable livrable) {
		String output = " Félicitations Mise à jour effectuée avec succès pour : ";
		try {
			livrableRepository.update(livrable);
			return Response.status(200).entity(output + livrable.getNom()).build();
		} catch (SQLException ex) {
			return Response.status(404).entity("Erreur: Objet non mis à jour").build();
		}


	}



	@GET
	@ApiOperation(
			value="lesLivrableDunePeriode",
			notes="Liste les livrables d'une période définie",
			response=Livrable.class,
			responseContainer="List"
			)
	@ApiResponse(
			code=404, 
			message="Aucun livrable dans la période définie"
			)
	@Produces(MediaType.APPLICATION_JSON)
	public Response lesLivrableDunePeriode(@QueryParam("debut") String debut,
			@QueryParam("fin") String fin) throws SQLException,ParseException{
		Date []debutFin=new Date [2];
		String format="yyyy-MM-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		debutFin[0]=sdf.parse(debut);
		debutFin[1]=sdf.parse(fin);
		List<Livrable> lesLivrables=livrableRepository.findInstancesBetweenDates(debutFin);
		return (lesLivrables!=null) ? Response.status(200).entity(lesLivrables).build():
			Response.status(404).entity(lesLivrables).build();

	}



}
