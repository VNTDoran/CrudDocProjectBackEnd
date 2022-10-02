package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.profileEntity;
import com.example.nraa.repository.ProfileRepository;

@Service
public class ProfileService implements IProfileService {
@Autowired
private ProfileRepository profileRepository;

@Override
public List<profileEntity> getAll() {
	// TODO Auto-generated method stub
	return profileRepository.findAll();
}



@Override
public profileEntity addProfile(profileEntity profile) {
	// TODO Auto-generated method stub
	return profileRepository.save(profile);
}

@Override
public void deleteProfile() {
	// TODO Auto-generated method stub
	profileRepository.deleteAll();
}

@Override
public void deleteProfile(Long id) {
	// TODO Auto-generated method stub
	profileRepository.deleteById(id);
}



@Override
public Optional<profileEntity> getProfile(Long id) {
	// TODO Auto-generated method stub
	return profileRepository.findById(id);
}
}
