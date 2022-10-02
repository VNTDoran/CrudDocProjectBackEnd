package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.agencyEntity;
import com.example.nraa.repository.AgencyRepository;

@Service
public class AgencyService implements IAgencyService{
@Autowired
private AgencyRepository agencyRepository;

@Override
public List<agencyEntity> getAll() {
	// TODO Auto-generated method stub
	return agencyRepository.findAll();
}

@Override
public Optional<agencyEntity> getAgency(Long id) {
	// TODO Auto-generated method stub
	return agencyRepository.findById(id);
}

@Override
public agencyEntity addAgency(agencyEntity a) {
	// TODO Auto-generated method stub
	return agencyRepository.save(a);
}

@Override
public void deleteAgency() {
	// TODO Auto-generated method stub
	agencyRepository.deleteAll();
}

@Override
public void deleteAgency(Long id) {
	// TODO Auto-generated method stub
	agencyRepository.deleteById(id);
}




}
