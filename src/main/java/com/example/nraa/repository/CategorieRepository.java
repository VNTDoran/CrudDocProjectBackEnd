package com.example.nraa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nraa.model.categorieEntity;
@Repository
public interface CategorieRepository extends JpaRepository<categorieEntity, Long> {

}
