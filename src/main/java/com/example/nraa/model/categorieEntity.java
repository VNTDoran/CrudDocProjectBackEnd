package com.example.nraa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="categorie")
public class categorieEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomCategorie;
	
	@JsonIgnore
	@OneToMany(mappedBy = "categorie")
	private List<documentEntity> document;
	
	public List<documentEntity> getDocument() {
		return document;
	}
	public void setDocument(List<documentEntity> document) {
		this.document = document;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		
		this.id = id;
	}
	public String getNomCategorie() {
		return nomCategorie; 
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}


}
