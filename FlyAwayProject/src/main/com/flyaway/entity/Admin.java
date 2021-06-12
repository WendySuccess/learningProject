package com.flyaway.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "admin")   
public class Admin {
	
   
    private String idAdmin;
    private String password;

	public String getIdadmin() {
		return idAdmin;
	}

	public void setIdadmin(String idadmin) {
		this.idAdmin = idadmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
