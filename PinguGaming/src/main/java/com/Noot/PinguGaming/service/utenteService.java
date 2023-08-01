package com.Noot.PinguGaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Noot.PinguGaming.repo.utenteRepo;
@Service
public class utenteService {

	private final utenteRepo utenterepo;
	@Autowired
	public utenteService (utenteRepo utenterepo)
	{
		this.utenterepo = utenterepo;
		
	}
	
}
