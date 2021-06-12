package com.flyaway.entity;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "flight")   
public class Flight implements Comparable<Flight> {
    private int idFlight;
    private String source;
    private String  destination;
    private String  airline;
    private Double price;
    
	public int getIdflight() {
		return idFlight;
	}
	public void setIdflight(int idflight) {
		this.idFlight = idflight;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Flight o) {
		return 0;
	}
	
}
