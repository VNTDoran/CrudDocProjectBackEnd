package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.documentEntity;

import com.example.nraa.repository.DocumentRepository;

@Service
public class DocumentService implements IDocumentService{
	@Autowired
	private  DocumentRepository documentRepository ;
	
	
	

	@Override
	public  List<documentEntity> getAll() {
		// TODO Auto-generated method stub
		return documentRepository.findAll();
	}



	@Override
	public void deleteDocument() {
		// TODO Auto-generated method stub
		 documentRepository.deleteAll();
	}




	@Override
	public documentEntity addDocument(documentEntity d) {
		// TODO Auto-generated method stub
		System.out.print(d);
		return documentRepository.save(d);
	}




	@Override
	public void deleteDocument(Long id) {
		// TODO Auto-generated method stub
		documentRepository.deleteById(id);
	}



	@Override
	public documentEntity getDocument(Long id) {
		// TODO Auto-generated method stub
		System.out.println("******************************"+documentRepository.findById(id).get());
		return documentRepository.findById(id).get();
	}











	


	

	 
}
