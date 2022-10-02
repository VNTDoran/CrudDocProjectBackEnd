package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.categorieEntity;
import com.example.nraa.repository.CategorieRepository;

@Service
public class CategorieService implements ICategorieService {
@Autowired
private CategorieRepository categorieRepository;

@Override
public List<categorieEntity> getAll() {
	// TODO Auto-generated method stub
	return categorieRepository.findAll();
}

@Override
public categorieEntity getCategorie(Long id) {
	// TODO Auto-generated method stub
	return categorieRepository.findById(id).get();
}

@Override
public categorieEntity addCategorie(categorieEntity c) {
	// TODO Auto-generated method stub
	return categorieRepository.save(c);
}

@Override
public void deleteCategorie() {
	// TODO Auto-generated method stub
	categorieRepository.deleteAll();
}

@Override
public void deleteCategorie(Long id) {
	// TODO Auto-generated method stub
	categorieRepository.deleteById(id);
}
}
