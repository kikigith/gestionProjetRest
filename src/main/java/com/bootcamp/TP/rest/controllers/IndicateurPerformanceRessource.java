/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.IndicateurPerformance;
import com.bootcamp.TP.repositories.IndicateurPerformanceRepository;
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
@Path("/indicateurperformances")
public class IndicateurPerformanceRessource {
    
    IndicateurPerformanceRepository ipRepository = new IndicateurPerformanceRepository("TPPU-DERBY");

    @GET
    @Path("/")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(
            value = "voir une donnée spéciique",
            notes = "mettre un commentaire",
            response = IndicateurPerformanceRessource.class,
            responseContainer = "List"
    )
    public Response getIndicateurPerformances() throws SQLException {
        List<IndicateurPerformance> ips = ipRepository.findAll();
        //access par le concept CORS
        return Response.status(200).entity(ips).header("Access-Control-Allow-Origin", "*").build();

    }
    
    @GET
    @Path("/{indicateurPerformanceId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getIndicateurPerformanceById(@PathParam("indicateurPerformanceId") int id) throws SQLException {

        IndicateurPerformance ip = ipRepository.findByPropertyUnique("id", id);

        if (ip != null) {
            return Response.status(200).entity(ip).build();
        } else {
            return Response.status(404).entity("Aucun Indicateur de Performance ne porte comme id : "+id).build();
        }
    }
    
    @POST   //ne marche pas
    @Path("/create")
    @Consumes({MediaType.APPLICATION_JSON}) 
    public Response addIndicateurPerformance(IndicateurPerformance ip) {
        String output = " Nouveau Indicateur de Performance créé : \n";
        try {
            ipRepository.create(ip);
            return Response.status(200).entity(output + ip.getId() + "\n").build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Indicateur de Performance non créé").build();
        }
    }
    
    @PUT    //ne marche pas
    @Path("/update")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateIndicateurPerformance(IndicateurPerformance ip) {
        String output = " Mise à jour de Indicateur de Performance effectuée avec succès pour : ";
        try {
            ipRepository.update(ip);
            return Response.status(200).entity(output + ip.getId() + "\n").build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Indicateur de Performance non mis à jour").build();
        }

    }
    
    @PUT    //ne marche pas
    @Path("/update/{indicateurPerformanceId}")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response updateIndicateurPerformanceById(IndicateurPerformance ip) {
        String output = " Mise à jour de Indicateur de Performance effectuée avec succès pour : ";
        try {
            ipRepository.update(ip);
            return Response.status(200).entity(output + ip.getId() + "\n").build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Indicateur de Performance non mis à jour").build();
        }

    }
    
    @DELETE //ne marche pas
    @Path("/delete")
    @Consumes({MediaType.APPLICATION_JSON})
    public Response deleteIndicateurPerformance(IndicateurPerformance ip) {
        String output = " Suppression de Indicateur de Performance effectuée avec succès pour : ";
        try {
            ipRepository.delete(ip);
            return Response.status(200).entity(output + ip.getId() + "\n").build();
        } catch (SQLException ex) {
            return Response.status(404).entity("Erreur: Indicateur de Performance non supprimé").build();
        }

    }
    
    @POST
    @Path("/{indicateurPerformanceId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateIndicateurPerformanceById(@PathParam("indicateurPerformanceId") int id) throws SQLException {

        IndicateurPerformance ip = ipRepository.findByPropertyUnique("id", id);

        if (ip != null) {
            return Response.status(200).entity(ip).build();
        } else {
            return Response.status(404).entity(ip).build();
        }
    }
}
