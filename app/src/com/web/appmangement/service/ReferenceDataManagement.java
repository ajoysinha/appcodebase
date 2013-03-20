package com.web.appmangement.service;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.appmanagement.bo.ReferenceDataManagementBO;


@Path("/referenceDataManagement")
public class ReferenceDataManagement extends Application {

		@Resource
		private ReferenceDataManagementBO referenceDataManagementBO;
	
	   @GET
	   @Path("/ping")
	   @Produces(MediaType.APPLICATION_JSON)
	   public String ping() {
		   String message = "Ping !!!";
		   System.out.println(" Message is "+message);
		   //referenceDataManagementBO.getSourceOfIncome();
		   return message;   
	   }
	   
	   @GET
	   @Path("/getSourceofincome")
	   public String getSourceofIncome() {
		   String message = "Ping !!!";
		   return message;   
	   }
	   
	   @POST
	   @Path("/setSourceofincome")
	   public String setSourceofIncome() {
		   String message = "Ping !!!";
		   return message;   
	   }
	   
	   @POST
	   @Path("/updateSourceofincome")
	   public String updateSourceofIncome() {
		   String message = "Ping !!!";
		   return message;   
	   }
}
