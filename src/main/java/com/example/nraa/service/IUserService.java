package com.example.nraa.service;

import java.util.List;
import java.util.Optional;

import com.example.nraa.model.userEntity;

   public interface IUserService {
   public  List<userEntity> getAll();
   public Optional<userEntity> getUser(Long id);
   public userEntity addUser(userEntity u);
   public void deleteUser();
   public void deleteUser(Long id);
}
