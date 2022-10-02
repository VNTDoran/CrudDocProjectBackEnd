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

import com.example.nraa.model.agencyEntity;

import com.example.nraa.service.AgencyService;

@RestController
@RequestMapping("/agency")
public class AgencyController {
@Autowired
private AgencyService agencyService ;



@GetMapping("/getAgency/{id}")
  public  Optional<agencyEntity> getAgency(@PathVariable("id")Long id){

	return agencyService.getAgency(id);
}
@GetMapping("/getAll")
 public  List<agencyEntity> getAll()
{
	return agencyService.getAll();
}

@PostMapping("/addAgency")
public agencyEntity addAgency(@RequestBody agencyEntity a) {
   return agencyService.addAgency(a);
}

@DeleteMapping("/deletetAgency")
public void deleteDocument()  {
	agencyService.deleteAgency();
}
@DeleteMapping("/deletetAgency/{id}")
public void deleteAgency(@PathVariable("id") Long id)
{
	agencyService.deleteAgency(id);
}

}
