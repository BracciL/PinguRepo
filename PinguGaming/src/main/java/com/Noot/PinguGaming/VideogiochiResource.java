package com.Noot.PinguGaming;

import com.Noot.PinguGaming.model.Videogiochi;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Noot.PinguGaming.service.VideogiochiService;
import java.util.List;

@RestController
@RequestMapping("/videogiochi")
public class VideogiochiResource {
	private final VideogiochiService videogiochiservice;
	
	public VideogiochiResource(VideogiochiService videogiochiservice)
	{
		this.videogiochiservice = videogiochiservice;
	}

	@GetMapping	()
	public ResponseEntity<List<Videogiochi>> getAllVideogiochi()
	{
		List<Videogiochi> listavideogiochi = videogiochiservice.findallVideogiochi();
		return new ResponseEntity<>(listavideogiochi, HttpStatus.OK);
	}


	@GetMapping	("/find/{id}")
	public ResponseEntity<Videogiochi> getVideogiochiById(@PathVariable("id") int id)
	{
		Videogiochi videogiochi = videogiochiservice.findGiocoById(id);
		return new ResponseEntity<>(videogiochi, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Videogiochi> addVideogiochi(@RequestBody Videogiochi videogiochi)
	{
		Videogiochi videogiochi1 = videogiochiservice.addGioco(videogiochi);
		return new ResponseEntity<>(videogiochi1, HttpStatus.CREATED);
	}

	@PostMapping("/update")
	public ResponseEntity<Videogiochi> UpdateVideogiochi(@RequestBody Videogiochi videogiochi)
	{
		Videogiochi videogiochi1 = videogiochiservice.updateGioco(videogiochi);
		return new ResponseEntity<>(videogiochi1, HttpStatus.OK);
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> DeleteVideogiochi (@PathVariable("id") int id)
	{
		videogiochiservice.deleteGioco(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}