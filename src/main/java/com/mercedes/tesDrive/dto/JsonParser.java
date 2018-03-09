package com.mercedes.tesDrive.dto;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Type; 

public class JsonParser {
	
	public Root getRoot() throws FileNotFoundException, IOException, ParseException {
		Root root = new Root();
		Availability availability= null;
		Vehicle v;
		Dealer d;
		Booking b;
		ArrayList<Vehicle> _vehicles = null;
        JSONParser parser = new JSONParser();
       
        //Change path to the Json file here
        Object obj = parser.parse(new FileReader("/home/bruno/Desktop/dataset.json"));
		
        
        JSONObject jsonObject = (JSONObject) obj;
        
        JSONArray dealers = (JSONArray) jsonObject.get("dealers");
       
        for(int i=0; i<dealers.size(); i++){
            JSONObject innerObj = (JSONObject) dealers.get(i);
            
            d = new Dealer((String) innerObj.get("id"), (String) innerObj.get("name"), (double) innerObj.get("latitude"),
            		(double) innerObj.get("longitude"));
            JSONArray vehicles = (JSONArray) innerObj.get("vehicles");
            
            _vehicles = new ArrayList<Vehicle> ();
            for(int j=0; j<vehicles.size(); j++){
            	
            	
            	
            	JSONObject innerObj2 = (JSONObject) vehicles.get(j);
            	
            	v = new Vehicle((String) innerObj2.get("id"), (String) innerObj2.get("model"), (String) innerObj2.get("fuel"), (String) innerObj2.get("transmission"));
            	

            	JSONObject _availability = (JSONObject) innerObj2.get("availability");
            	
            	
            	JSONArray array = new JSONArray();
            	array.add(_availability);
            	
            	availability = new Availability();
            	
            	for(int l=0; l<array.size(); l++){
                	JSONObject innerObj3 = (JSONObject) array.get(l);
                	
                	Gson googleJson = new Gson();
                	if(innerObj3.get("tuesday")!=null) {
                	 ArrayList javaArrayListFromGSON = googleJson.fromJson(innerObj3.get("tuesday").toString(), ArrayList.class);
                	 availability.setMap("tuesday", javaArrayListFromGSON );
                	}else if(innerObj3.get("wednesday")!=null) {
                		ArrayList javaArrayListFromGSON = googleJson.fromJson(innerObj3.get("tuesday").toString(), ArrayList.class);
                   	 	availability.setMap("wednesday", javaArrayListFromGSON );
                	}
                
                	v.setAvailability(availability);
                	
                	
            	}
            	
            	_vehicles.add(v);        	
            }
            d.setVehicles(_vehicles);
        	root.addDealers(d);	
        }
        
	    JSONArray bookings = (JSONArray) jsonObject.get("bookings");
		
		for(int i=0; i<bookings.size(); i++){
			
	        JSONObject innerBooking = (JSONObject) bookings.get(i);
	        b = new Booking ((String) innerBooking.get("id"), (String) innerBooking.get("vehicleId"), (String) innerBooking.get("firstName"),(String) innerBooking.get("lastName"), (String) innerBooking.get("pickupDate"),(String) innerBooking.get("createdAt") ,(String) innerBooking.get("cancelledAt") , (String)innerBooking.get("cancelledReason"));
	        root.addBooking(b);
		}
    	
      return root;  
	 }
}
