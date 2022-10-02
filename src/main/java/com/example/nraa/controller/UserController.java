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
import com.example.nraa.model.userEntity;
import com.example.nraa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	@GetMapping("/getAll")
	public  List<userEntity> getAll() {
		return userservice.getAll();
	}
	
	@GetMapping("/getUser/{id}")
	  public  Optional<userEntity> getUser(@PathVariable("id")Long id){

		return userservice.getUser(id);
	}
	@PostMapping("/addUser")
	public userEntity addUser(@RequestBody userEntity u) {
		return userservice.addUser(u);
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody userEntity u) {
		System.out.println("gtest");
		 userservice.deleteUser();
	}
	@DeleteMapping("/deleteUser/{id}")
    public void deleteDocument(@PathVariable("id") Long id)
    {
		System.out.println("gtest");
		userservice.deleteUser(id);
    }
}
