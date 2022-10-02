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

import com.example.nraa.model.typeDocEntity;
import com.example.nraa.service.TypeDocService;

@RestController
@RequestMapping("/typeDocument")
public class TypeDocController {
	@Autowired
private TypeDocService typeDocService;

	@GetMapping("/getType/{id}")
	  public  Optional<typeDocEntity> getType(@PathVariable("id")Long id){

		return typeDocService.getType(id);
	}
	@GetMapping("/getAll")
	 public  List<typeDocEntity> getAll()
	{
		return typeDocService.getAll();
	}
	
 @PostMapping("/addType")
  public typeDocEntity addType(@RequestBody typeDocEntity type) {
	 System.out.println("v");
	   return typeDocService.addType(type);
 }
 
  @DeleteMapping("/deleteType")
  public void deleteType()  {
	  typeDocService.deleteType();
  }
  @DeleteMapping("/deleteType/{id}")
  public void deleteType(@PathVariable("id") Long id)
  {
	  typeDocService.deleteType(id);
  }
}
