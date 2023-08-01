package com.Noot.PinguGaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Noot.PinguGaming.repo.adminRepo;
@Service
public class adminService {

	private final adminRepo adminrepo;
	@Autowired
	public adminService(adminRepo adminrepo)
	{
		this.adminrepo = adminrepo;
		
		
	}
}
