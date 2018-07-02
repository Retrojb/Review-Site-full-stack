package org.wecancodeit.Reviewsitefullstack;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper.StandardWarningHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewSitePopulator implements CommandLineRunner {

		@Autowired
		private ReviewRepository reviewRepo;
		
		@Autowired
		private CategoryRepository categoryRepo;

		@Autowired
		private TagRepository tagRepo;
		
		@Override
		public void run(String... args) throws Exception {
			
			Tag action = tagRepo.save(new Tag("Action"));
			Tag romance = tagRepo.save(new Tag("Romance"));
			Tag Disney = tagRepo.save(new Tag("Disney"));
			Tag LucasFilms = tagRepo.save(new Tag("Lucas Film"));
			Tag SciFi = tagRepo.save(new Tag("Sci-Fi"));
			Tag Adventure = tagRepo.save(new Tag("Adventure"));
			Tag	Future  = tagRepo.save(new Tag("Future"));
			Tag Garbage = tagRepo.save(new Tag("Garbage"));
			Tag Amazing = tagRepo.save(new Tag("Amazing"));
			
			Category catOriginal = categoryRepo.save(new Category("Original"));
			Category catPrequel = categoryRepo.save(new Category("Prequel"));
			Category catSequel = categoryRepo.save(new Category("Sequel"));
		
			
			Review SWThePhantomMenace = reviewRepo.save(new Review("Star Wars: Episode I: The Phantom Menace", "Some lame kid who loves to podrace is abducted by two Jedi", "phantom", catPrequel, Garbage, LucasFilms, action, Adventure, SciFi, Future));
			Review SWAttckOfTheClones = reviewRepo.save(new Review("Star Wars: Episode II: Attack of the Clones", "The Jedi order continue to fight off the Sith armies", "clones", catPrequel, Garbage, LucasFilms, action, Adventure, SciFi, Future));
			Review SWSolo = reviewRepo.save(new Review("Star Wars: A Star Wars Story: Solo", "Han Solo, origin story", "solo", catSequel, Disney, Amazing, action, Adventure, SciFi, Future));
			Review SWRevengeOfTheSith = reviewRepo.save(new Review("Star Wars: Episode III: Revenge of the Sith", "Anakin Skywaler acts like a brat, turns to the dark side, a Obi-wan leaves him ina burning pile", "sith",catPrequel, Garbage, LucasFilms, action, Adventure, SciFi, Future));
			Review SWRogueOne = reviewRepo.save(new Review("Star Wars: A Star Wars Story: Rogue One", "a rag tag group of hero's must try and foil a plan by the empire", "rogue",catSequel, Disney, Amazing, action, Adventure, SciFi, Future));
			Review SWNewHope = reviewRepo.save(new Review("Star Wars: Episode IV: A New Hope", "young", "newhope", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance));
			Review SWReturnOfJedi = reviewRepo.save(new Review("Star Wars: Episode V: The Empire Strikes Back", "The saga continues, as the rebels lose control, and Luke learns from a Jedi Master", "empirestrikes", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance ));
			Review SWEmpireStrikesBack= reviewRepo.save(new Review("Star Wars: Episode VI: Return of the Jedi", "Han Solo is saved from the Jabba the Hut, While Luke must face Darth Vader", "returnjedi", catOriginal, LucasFilms, SciFi, LucasFilms, Amazing, action, Adventure, romance));
			Review SWForceAwakens = reviewRepo.save(new Review("Star Wars: Episode VII: The Force Awakens ", "With the rebels attempts falling apart, the need for a new hope","forceawakens", catSequel, Disney, Amazing, action, Adventure, SciFi, Future));
			Review SWTheLastJedi = reviewRepo.save(new Review("Star Wars: Episode VIII:The Last Jedi", "Is ","lastjedi", catSequel, Disney, Amazing, action, Adventure, SciFi, Future, romance));

			
			}
		
		
		
			
}
