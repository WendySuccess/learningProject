package com.flyaway.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "airline")   
public class Airline  {
    private String idAirline;
    private String airlineName;
    
	public String getIdairline() {
		return idAirline;
	}
	public void setIdairline(String idairline) {
		this.idAirline = idairline;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

}
