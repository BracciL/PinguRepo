package com.Noot.PinguGaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Noot.PinguGaming.repo.VenditeRepo;
@Service
public class VenditeService {

	private final VenditeRepo venditerepo;
	@Autowired
	public VenditeService(VenditeRepo venditerepo)
	{
		this.venditerepo = venditerepo;
	}
	
}
