package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.locationEntity;


public interface ILocationService {
	   public  List<locationEntity> getAll();
	   public Optional<locationEntity> getLocation(Long id);
	   public locationEntity addLocation(locationEntity loc);
	   public void deleteLocation();
	   public void deleteLocation(Long id);
}
