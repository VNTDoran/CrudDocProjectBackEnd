package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.typeDocEntity;

public interface ItypeDocService {
	 public  List<typeDocEntity> getAll();
	   public Optional<typeDocEntity> getType(Long id);
	   public typeDocEntity addType(typeDocEntity type);
	   public void deleteType();
	   public void deleteType(Long id);
}
