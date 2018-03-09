package com.mercedes.tesDrive.dto;

import java.util.ArrayList;

public class Dealer {
	
	
	public String id;
	
	public String name;
	
	public double latitude;
	
	public double longitude;
	
	public ArrayList<Vehicle> vehicles;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dealer [id=").append(id).append(", name=").append(name).append(", latitude=").append(latitude)
				.append(", longitude=").append(longitude).append(", vehicles=").append(vehicles).append(", close=")
				.append(close).append("]");
		return builder.toString();
	}

	public ArrayList<String> close;
	
	public Dealer(String id, String name, double latitude,double longitude) {
		
		setId(id);
		setName(name);
		setLatitude(latitude);
		setLongitude(longitude);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public ArrayList<String> getClose() {
		return close;
	}

	public void setClose(ArrayList<String> close) {
		this.close = close;
	}
	
	
}
