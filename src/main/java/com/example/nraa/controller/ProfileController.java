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

import com.example.nraa.model.profileEntity;
import com.example.nraa.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {
@Autowired
private ProfileService profileService;

@GetMapping("/getProfile/{id}")
public  Optional<profileEntity> getProfile(@PathVariable("id")Long id){

	return profileService.getProfile(id);
}
@GetMapping("/getAll")
public  List<profileEntity> getAll()
{
	return profileService.getAll();
}

@PostMapping("/addProfile")
public profileEntity addProfile(@RequestBody profileEntity profile) {
 return profileService.addProfile(profile);
}

@DeleteMapping("/deletetProfile")
public void deleteDocument()  {
	profileService.deleteProfile();
}
@DeleteMapping("/deletetProfile/{id}")
public void deleteProfile(@PathVariable("id") Long id)
{
	profileService.deleteProfile(id);
}
}
