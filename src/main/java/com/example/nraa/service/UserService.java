package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nraa.model.userEntity;
import com.example.nraa.repository.UserRepository;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<userEntity> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public userEntity addUser(userEntity u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}



	@Override
	public Optional<userEntity> getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}



}
