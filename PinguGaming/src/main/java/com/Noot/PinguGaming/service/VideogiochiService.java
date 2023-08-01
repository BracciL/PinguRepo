package com.Noot.PinguGaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Noot.PinguGaming.repo.VideogiochiRepo;
@Service
public class VideogiochiService {
	private final VideogiochiRepo videogiochirepo;
@Autowired
	public VideogiochiService(VideogiochiRepo videogiochiRepo)
	{
		this.videogiochirepo = videogiochiRepo;
		
	}
	
	
}
