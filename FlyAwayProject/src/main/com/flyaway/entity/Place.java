package com.flyaway.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "place")   
public class Place {
    private String idPlace;
    private String placeName;
    
	public String getIdplace() {
		return idPlace;
	}
	public void setIdplace(String idplace) {
		this.idPlace = idplace;
	}
	public String getPlacename() {
		return placeName;
	}
	public void setPlacename(String placename) {
		this.placeName = placename;
	}
}
