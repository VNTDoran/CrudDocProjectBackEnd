package com.example.nraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nraa.model.documentEntity;

@Repository
public interface DocumentRepository extends JpaRepository<documentEntity, Long>{

	
}
