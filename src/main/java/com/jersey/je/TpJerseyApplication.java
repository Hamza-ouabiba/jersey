package com.jersey.je;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jersey.je.entities.Compte;
import com.jersey.je.entities.enums.TypeCompte;
import com.jersey.je.repository.CompteRepository;

import aj.org.objectweb.asm.Type;
@SpringBootApplication
public class TpJerseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpJerseyApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
				
			compteRepository.save(
					new Compte(null,Math.random()*9000,new Date(),TypeCompte.EPARGNE));
			compteRepository.save(
					new Compte(null,Math.random()*9000,new Date(),TypeCompte.EPARGNE));
			
			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
