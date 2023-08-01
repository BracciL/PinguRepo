package com.Noot.PinguGaming.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Noot.PinguGaming.model.admin;

@Service
public interface adminRepo extends JpaRepository<admin, Integer> {
	
	
	
	
	

}
