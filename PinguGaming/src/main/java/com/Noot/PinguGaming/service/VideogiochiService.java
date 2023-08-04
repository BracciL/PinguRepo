package com.Noot.PinguGaming.service;


import java.util.UUID;
import java.io.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.*;
import com.Noot.PinguGaming.model.Videogiochi;
import com.Noot.PinguGaming.repo.VideogiochiRepo;


@Service
public class VideogiochiService 
{
	private final VideogiochiRepo rep;
	
	@Autowired
	public VideogiochiService (VideogiochiRepo rep)
	{
		this.rep = rep;
	}

	public List<Videogiochi> findallVideogiochi()
	{
		return rep.findAll();
	}
	public Videogiochi addGioco(Videogiochi repo)
	{
		repo.setNome(toString());
		return rep.save(repo);
	}
	public Videogiochi findGiocoById(int id)
	{
		return rep.findGiocoById(id);
	}

    public void deleteGioco(int id)
    {
    	rep.deleteGiochiById(id);
    }
    
    public Videogiochi updateGioco(Videogiochi gio)
    {
    	return rep.save(gio);
    }
}
