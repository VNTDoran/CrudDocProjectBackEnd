package com.example.nraa.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="documents")
public class documentEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titreDocument;
private String descriptionDocument;
@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

private Date dateCreate;
@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

private Date dateModify;


@ManyToOne
@JoinColumn(name = "categorie_id", referencedColumnName="id")
private categorieEntity categorie;
public Date getDateCreate() {
	return dateCreate;
}
public void setDateCreate(Date dateCreate) {
	this.dateCreate = dateCreate; 
}
public Date getDateModify() {
	return dateModify;
}
public void setDateModify(Date dateModify) {
	this.dateModify = dateModify;
}



public categorieEntity getCategorie() {
	return categorie;
}
public void setCategorie(categorieEntity categorie_id) {
	System.out.println(categorie_id);
	this.categorie = categorie_id;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitreDocument() {
	return titreDocument;
}
public void setTitreDocument(String titreDocument) {
	this.titreDocument = titreDocument;
}
public String getDescriptionDocument() {
	return descriptionDocument;
}
public void setDescriptionDocument(String descriptionDocument) {
	this.descriptionDocument = descriptionDocument;
}

}
