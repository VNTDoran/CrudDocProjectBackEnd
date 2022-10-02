package com.example.nraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nraa.model.typeDocEntity;
@Repository
public interface TypeDocRepository extends JpaRepository<typeDocEntity, Long> {

}
