package com.example.nraa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typeDocument")
public class typeDocEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String description;
private String label;
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
