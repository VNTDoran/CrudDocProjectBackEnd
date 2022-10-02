package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.agencyEntity;

public interface IAgencyService {
	 public  List<agencyEntity> getAll();
	   public Optional<agencyEntity> getAgency(Long id);
	   public agencyEntity addAgency(agencyEntity a);
	   public void deleteAgency();
	   public void deleteAgency(Long id);
}
