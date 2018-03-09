package com.mercedes.tesDrive.dto;

public class Greetings {
	
	private String greeting;
	private int value;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Greetings [greeting=").append(greeting).append(", value=").append(value).append("]");
		return builder.toString();
	}
}
