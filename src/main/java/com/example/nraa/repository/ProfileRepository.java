package com.example.nraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nraa.model.profileEntity;
@Repository
public interface ProfileRepository extends JpaRepository<profileEntity, Long> {

}
