package com.example.nraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nraa.model.userEntity;

@Repository
public interface UserRepository extends JpaRepository<userEntity, Long> {

}
