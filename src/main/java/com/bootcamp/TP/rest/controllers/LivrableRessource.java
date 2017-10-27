/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.TP.rest.controllers;

import com.bootcamp.TP.entities.Livrable;
import com.bootcamp.TP.repositories.LivrableRepository;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author ARESKO
 */
@Path("/livrable")
public class LivrableRessource {
    
    LivrableRepository livrableRepository = new LivrableRepository("TPPU-DERBY");
    
    @GET
    @Path("/entre")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response lesLivrableDunePeriode(@QueryParam("debut") Date debut,
            @QueryParam("fin") Date fin) throws SQLException{
        Date []debutFin=new Date [2];
        debutFin[0]=debut;
        debutFin[1]=fin;
        List<Livrable> lesLivrables=livrableRepository.findInstancesBetweenDates(debutFin);
        return (lesLivrables!=null) ? Response.status(200).entity(lesLivrables).build():
            Response.status(404).entity(lesLivrables).build();
    }
    
}
