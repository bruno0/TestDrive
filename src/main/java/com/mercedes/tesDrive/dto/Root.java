package com.mercedes.tesDrive.dto;

import java.util.ArrayList;

public class Root {
	
	private ArrayList<Dealer> dealers;  
	private ArrayList<Booking> bookings;
	
	public Root() {
		dealers = new ArrayList<Dealer>();  
		bookings = new ArrayList<Booking>();		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Root [dealers=").append(dealers).append(", bookings=").append(bookings).append("]");
		return builder.toString();
	}

	public void addDealers(Dealer d) {
		dealers.add(d);
	}
	
	public void addBooking(Booking b) {
		bookings.add(b);
	}
	
	public ArrayList<Dealer> getDealers() {
		return dealers;
	}
	
	public ArrayList<Booking> getBookings() {
		return bookings;
	}
	
}
