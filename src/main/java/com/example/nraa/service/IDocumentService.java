package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.documentEntity;


public interface IDocumentService {
	public  List<documentEntity> getAll();
	public documentEntity getDocument(Long id);
    public documentEntity addDocument(documentEntity d);
    public void deleteDocument();
    public void deleteDocument(Long id);
}
