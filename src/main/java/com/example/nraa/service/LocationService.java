package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.locationEntity;
import com.example.nraa.repository.LocationRepository;

@Service
public class LocationService implements ILocationService {
@Autowired
private LocationRepository locationRepository;

@Override
public List<locationEntity> getAll() {
	// TODO Auto-generated method stub
	return locationRepository.findAll();
}

@Override
public Optional<locationEntity> getLocation(Long id) {
	// TODO Auto-generated method stub
	return locationRepository.findById(id);
}

@Override
public locationEntity addLocation(locationEntity loc) {
	// TODO Auto-generated method stub
	return locationRepository.save(loc);
}

@Override
public void deleteLocation() {
	// TODO Auto-generated method stub
	locationRepository.deleteAll();
}

@Override
public void deleteLocation(Long id) {
	// TODO Auto-generated method stub
	locationRepository.deleteById(id);
}
}
