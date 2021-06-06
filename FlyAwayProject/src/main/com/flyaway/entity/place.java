package com.flyaway.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "place")   
public class place {
    private String idplace;
    private String placename;
    
	public String getIdplace() {
		return idplace;
	}
	public void setIdplace(String idplace) {
		this.idplace = idplace;
	}
	public String getPlacename() {
		return placename;
	}
	public void setPlacename(String placename) {
		this.placename = placename;
	}
}
