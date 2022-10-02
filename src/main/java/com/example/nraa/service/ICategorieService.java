package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.categorieEntity;

public interface ICategorieService {
	 public  List<categorieEntity> getAll();
	   public categorieEntity getCategorie(Long id);
	   public categorieEntity addCategorie(categorieEntity c);
	   public void deleteCategorie();
	   public void deleteCategorie(Long id);
}
