package com.Noot.PinguGaming.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Noot.PinguGaming.model.Videogiochi;

public interface VideogiochiRepo extends JpaRepository<Videogiochi, Integer>
{
  void deleteGiochiById(int id);
  Videogiochi findGiocoById(int id);
}
