package com.jersey.je.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jersey.je.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
	
}
