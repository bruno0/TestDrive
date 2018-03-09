package com.mercedes.tesDrive.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mercedes.tesDrive.dto.Booking;
import com.mercedes.tesDrive.dto.Dealer;
import com.mercedes.tesDrive.dto.JsonParser;
import com.mercedes.tesDrive.dto.Root;
import com.mercedes.tesDrive.dto.Vehicle;

@RestController

public class TestDriveController {
	
	
	@RequestMapping(value = "/model", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Vehicle> getVehicleByModel(@RequestParam(value="model") String model) throws FileNotFoundException, IOException, ParseException {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();
		
		
		for( Dealer d: r.getDealers()) {
			for( Vehicle v:d.getVehicles()) {
				if(v.getModel().equals(model)) {
					vehicles.add(v);
				}
			}
		}
		
		
		
		return vehicles;
	}
	
	@RequestMapping(value = "/fuel",method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Vehicle> getVehicleByFuel(@RequestParam(value="fuel") String fuel) throws FileNotFoundException, IOException, ParseException {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();
		
		
		for( Dealer d: r.getDealers()) {
			for( Vehicle v:d.getVehicles()) {
				if(v.getFuel().equals(fuel)) {
					vehicles.add(v);
				}
			}
		}
		
		
		
		return vehicles;
	}
	
	
	@RequestMapping(value = "/transmission", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Vehicle> getVehicleByTransmission(@RequestParam(value="transmission") String transmission) throws FileNotFoundException, IOException, ParseException {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();
		
		
		for( Dealer d: r.getDealers()) {
			for( Vehicle v:d.getVehicles()) {
				if(v.getTransmission().equals(transmission)) {
					vehicles.add(v);
				}
			}
		}

		return vehicles;
	}
	
	@RequestMapping(value = "/dealer", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Vehicle> getVehicleByDealer(@RequestParam(value="dealer") String name) throws FileNotFoundException, IOException, ParseException {
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();
		
		
		for( Dealer d: r.getDealers()) {
			if(d.getName().equals(name)){
				for( Vehicle v:d.getVehicles()) {					
					vehicles.add(v);
				}
			}			
		}
		
		return vehicles;
	}
	
	
	@RequestMapping(value = "/bookings", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Booking> getBookingList(@RequestParam(value="list") String name) throws FileNotFoundException, IOException, ParseException {
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();		
		return r.getBookings();
	}
	
	/*@RequestMapping(value = "/bookings/create", method = RequestMethod.POST)   
	@ResponseBody
	public ArrayList<Booking> createBookings(@RequestParam Map<String,String> requestParams) throws FileNotFoundException, IOException, ParseException {
		JsonParser j = new JsonParser();	
		Root r = j.getRoot();		
		return r.getBookings();
	}*/
}
