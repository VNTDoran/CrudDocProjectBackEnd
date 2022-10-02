package com.example.nraa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nraa.model.categorieEntity;
import com.example.nraa.service.CategorieService;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
  @Autowired
  private CategorieService categorieService;
  
	@GetMapping("/getCategorie/{id}")
	  public  categorieEntity getCategorie(@PathVariable("id")Long id){

		return categorieService.getCategorie(id);
	}
	@GetMapping("/getAll")
	 public  List<categorieEntity> getAll()
	{
		return categorieService.getAll();
	}
	
 @PostMapping("/addCategorie")
  public categorieEntity addCategorie(@RequestBody categorieEntity c) {
	   return categorieService.addCategorie(c);
 }
 
  @DeleteMapping("/deletetCategorie")
  public void deleteCategorie()  {
	  categorieService.deleteCategorie();
  }
  @DeleteMapping("/deletetCategorie/{id}")
  public void deleteCategorie(@PathVariable("id") Long id)
  {
	  categorieService.deleteCategorie(id);
  }
  
}
