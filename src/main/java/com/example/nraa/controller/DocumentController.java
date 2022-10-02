package com.example.nraa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nraa.model.categorieEntity;
import com.example.nraa.model.documentEntity;
import com.example.nraa.repository.CategorieRepository;
import com.example.nraa.repository.DocumentRepository;
import com.example.nraa.service.CategorieService;
import com.example.nraa.service.DocumentService;

    @RestController
    @RequestMapping("/document")
public class DocumentController {
	
	@Autowired
	private  DocumentService documentService ;
	@Autowired
	  private CategorieService categorieService;
	@GetMapping("/getDocument/{id}")
	  public  documentEntity getDocument(@PathVariable("id")Long id){

		return documentService.getDocument(id);
	}
	@GetMapping("/getAll")
	 public  List<documentEntity> getAll()
	{
		return documentService.getAll();
	}
	
   @PostMapping("/addDocument")
    public documentEntity addDocument(@RequestBody documentEntity d) {
	   return documentService.addDocument(d);
   }
   
    @DeleteMapping("/deleteDocument")
    public void deleteDocument(){
    	System.out.println("tsts");	
    	 documentService.deleteDocument();
    }
    @DeleteMapping("/deletetDocument/{id}")
    public void deleteDocument(@PathVariable("id") Long id)
    {
    	 documentService.deleteDocument(id);
    }
    
	  @PutMapping("/{id}/categorie/{categorie_id}")
	    documentEntity assignCateoryToDoc(
	            @PathVariable(value = "id") Long id,
	            @PathVariable(value = "categorie_id") Long categorie_id
	    ) {
	    	documentEntity Document = documentService.getDocument(id);
	    	categorieEntity Categorie = categorieService.getCategorie(categorie_id);
	    	
	    	Document.setCategorie(Categorie);
	    	
	        return documentService.addDocument(Document);
	    }
}
