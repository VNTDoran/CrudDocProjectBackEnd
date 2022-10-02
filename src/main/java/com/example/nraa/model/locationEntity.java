package com.example.nraa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class locationEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Integer floor;
private Integer row;
private String description;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getFloor() {
	return floor;
}
public void setFloor(Integer floor) {
	this.floor = floor;
}
public int getRow() {
	return row;
}
public void setRow(Integer row) {
	this.row = row;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
