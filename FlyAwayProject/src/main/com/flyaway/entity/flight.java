package com.flyaway.entity;



import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "flight")   
public class flight implements Comparable<flight> {
    private int idflight;
    private String source;
    private String  destination;
    private String  airline;
    private Double price;
    
	public int getIdflight() {
		return idflight;
	}
	public void setIdflight(int idflight) {
		this.idflight = idflight;
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
	public int compareTo(flight o) {
		// TODO Auto-generated method stub
		return this.idflight - o.getIdflight();
	}

}
