package com.flyaway.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "airline")   
public class airline  {
    private String idairline;
    private String airlineName;
    
	public String getIdairline() {
		return idairline;
	}
	public void setIdairline(String idairline) {
		this.idairline = idairline;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

}
