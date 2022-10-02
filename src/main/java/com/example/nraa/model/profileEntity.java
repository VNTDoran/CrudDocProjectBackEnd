package com.example.nraa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="profile")
public class profileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

private Date dateCreate;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")

private Date dateModify;
private Integer version;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public Integer getVersion() {
	return version;
}
public void setVersion(Integer version) {
	this.version = version;
}

	
}
