/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import org.glassfish.jersey.media.multipart.ContentDisposition;
//import org.glassfish.jersey.media.multipart.FormDataBodyPart;
//import org.glassfish.jersey.media.multipart.FormDataMultiPart;
//import org.glassfish.jersey.media.multipart.FormDataParam;




/**
 * REST Web Service
 *
 * @author Eivind M
 */
@Path("myservice")
public class MyserviceResource {

    @Context
    private UriInfo context;
    
    @PersistenceContext
    EntityManager em;
    
    @Resource(mappedName="java:app/jdbc/chat")
    DataSource dataSource;

    /**
     * Creates a new instance of MyserviceResource
     */
    public MyserviceResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.test.MyserviceResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        System.out.println("in getxml");
        return "my service works";
    }

    /**
     * PUT method for updating or creating an instance of MyserviceResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
    
//    @POST
//    @Path("send")    
//    @Consumes(MediaType.MULTIPART_FORM_DATA)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getMessage(@FormDataParam("userid")String userid,
//                               @FormDataParam("conversationid")Long conversationid,
//                               @FormDataParam("message")String text,
//                               FormDataMultiPart multiPart) {
//        
//        System.out.println("userid: "+userid);
//        System.out.println("con-id: "+conversationid);
//        System.out.println("message: "+text);
//    
//         return Response.ok("OK").build();

    public UriInfo getContext() {
        return context;
    }

    public void setContext(UriInfo context) {
        this.context = context;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
        
    
    
}
