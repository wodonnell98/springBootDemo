package com.tsi.odonnell.will.springBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/glass")
public class SpringBootDemoApplication {

	@Autowired
	private CocktailGlassRepository cocktailGlassRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<CocktailGlass> getAllGlasses(){
		return cocktailGlassRepository.findAll();
	}


	/*@GetMapping("/customRoute")
	public String myResponse(){
		GlassesShelf glassesShelf = new GlassesShelf();
		return glassesShelf.toString();
	}*/

	@PostMapping("/addAGlass")
	public @ResponseBody String addAGlass (@RequestParam String id
			, @RequestParam String type , @RequestParam int volume) {


		CocktailGlass savedGlass = new CocktailGlass(id,type,volume);
		cocktailGlassRepository.save(savedGlass);
		return "Saved";

	}
}
