package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.typeDocEntity;
import com.example.nraa.repository.TypeDocRepository;


@Service
public class TypeDocService implements ItypeDocService{
	@Autowired
private TypeDocRepository typeDocReposiyory;

@Override
public List<typeDocEntity> getAll() {
	// TODO Auto-generated method stub
	return typeDocReposiyory.findAll();
}

@Override
public Optional<typeDocEntity> getType(Long id) {
	// TODO Auto-generated method stub
	return typeDocReposiyory.findById(id);
}

@Override
public typeDocEntity addType(typeDocEntity type) {
	// TODO Auto-generated method stub
	return typeDocReposiyory.save(type);
}

@Override
public void deleteType() {
	// TODO Auto-generated method stub
	typeDocReposiyory.deleteAll();
}

@Override
public void deleteType(Long id) {
	// TODO Auto-generated method stub
	typeDocReposiyory.deleteById(id);
}
 
}
