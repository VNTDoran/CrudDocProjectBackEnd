package com.example.nraa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="agency")
public class agencyEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nomAgency;

/*@OneToMany(mappedBy = "agency")
private List<userEntity> user;

public List<userEntity> getUser() {
	return user;
}
public void setUser(List<userEntity> user) {
	this.user = user;
}*/
public Long getId() {
	return id;
}
public void setId(Long id) {
	
	this.id = id;
}
public String getNomAgency() {
	return nomAgency;
}
public void setNomAgency(String nomAgency) {
	this.nomAgency = nomAgency;
}

}
