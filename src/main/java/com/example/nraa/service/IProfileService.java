package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.profileEntity;


public interface IProfileService {
	public  List<profileEntity> getAll();
	public Optional<profileEntity> getProfile(Long id);
    public profileEntity addProfile(profileEntity profile);
    public void deleteProfile();
    public void deleteProfile(Long id);
}
