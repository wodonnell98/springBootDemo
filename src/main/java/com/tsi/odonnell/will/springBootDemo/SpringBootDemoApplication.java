package com.tsi.odonnell.will.springBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/cocktail")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Autowired
	private IngredientRepository ingredientRepository;

	@GetMapping("/allIngredients")
	public @ResponseBody Iterable<ingredient> getAllIngredients(){
		return ingredientRepository.findAll();
	}

	@PostMapping("/addIngredient")
	public @ResponseBody String addIngredient (@RequestParam String Name)
	{

		ingredient savedIngredient = new ingredient(Name);
		ingredientRepository.save(savedIngredient);
		return "Saved";
	}

	@Autowired
	private CocktailGlassRepository cocktailGlassRepository;

	@GetMapping("/allGlasses")
	public @ResponseBody Iterable<CocktailGlass> getAllGlasses(){
		return cocktailGlassRepository.findAll();
	}

	@PostMapping("/addAGlass")
	public @ResponseBody String addAGlass (@RequestParam String glassID
			, @RequestParam String type , @RequestParam int volume) {


		CocktailGlass savedGlass = new CocktailGlass(glassID,type,volume);
		cocktailGlassRepository.save(savedGlass);
		return "Saved";

	}


}
/*@GetMapping("/customRoute")
	public String myResponse(){
		GlassesShelf glassesShelf = new GlassesShelf();
		return glassesShelf.toString();
	}*/