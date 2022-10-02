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

import com.example.nraa.model.locationEntity;
import com.example.nraa.service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {
@Autowired
private LocationService locationService;
@GetMapping("/getAll")
public  List<locationEntity> getAll() {
	return locationService.getAll();
}
@GetMapping("/getLocation/{id}")
  public  Optional<locationEntity> getLocation(@PathVariable("id")Long id){

	return locationService.getLocation(id);
}
@PostMapping("/addLocation")
public locationEntity addLocation(@RequestBody locationEntity loc) {
	return locationService.addLocation(loc);
}

@DeleteMapping("/deleteLocation")
public void deleteLocation() {
	locationService.deleteLocation();
}
@DeleteMapping("/deleteLocation/{id}")
public void deleteLocation(@PathVariable("id") Long id)
{
	locationService.deleteLocation(id);
}
}
