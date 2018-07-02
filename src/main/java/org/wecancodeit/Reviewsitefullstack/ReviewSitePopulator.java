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
			Tag	Future  = tagRepo.save(new Tag("future"));
			Tag Garbage = tagRepo.save(new Tag("Garbage"));
			Tag Amazing = tagRepo.save(new Tag("Amazing"));
			
			Category catOriginal = categoryRepo.save(new Category("Original"));
			Category catPrequel = categoryRepo.save(new Category("Prequel"));
			Category catSequel = categoryRepo.save(new Category("Sequel"));
		
			
			Review SWNewHope = reviewRepo.save(new Review("Star Wars: Episode IV: A New Hope", "young mans journey", "image/newhope.jpg", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance));
			Review SWReturnOfJedi = reviewRepo.save(new Review("Star Wars: Episode V: The Empire Strikes Back", "The saga continues, as the rebels lose control, and Luke learns from a Jedi Master", "empirestrike.jpg", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance ));
//			Review SWEmpireStrikesBack= reviewRepo.save(new Review("Star Wars: Episode VI: Return of the Jedi", "Han Solo is saved from the Jabba the Hut, While Luke must face Darth Vader", "IT'S A TRAP!!!!!", "returnjedi.jpg", LucasFilms));
//			Review SWThePhantomMenace = reviewRepo.save(new Review("Star Wars: Episode I: The Phantom Menace", "Some lame kid who loves to podrace is abducted by two Jedi", "I'ma Jar Jar Binks!", "infinitywars.jpg", Garbage));
//			Review SWAttckOfTheClones = reviewRepo.save(new Review("Star Wars: Episode II: Attack of the Clones", "The Jedi order continue to fight off the Sith armies", "All my friends are dead, push me to the edge", "infinitywars.jpg", Garbage));
//			Review SWRevengeOfTheSith = reviewRepo.save(new Review("Star Wars: Episode III: Revenge of the Seth ", "Anakin Skywaler acts like a brat, turns to the dark side, a Obi-wan leaves him ina burning pile", "*HEAVY BREATHING... ", "infinitywars.jpg", action));
//			Review SWTheLastJedi = reviewRepo.save(new Review("Star Wars: Episode VII: The Last Jedi", "With the rebels attempts falling apart, the need for a new hope", "All my friends are ", "infinitywars.jpg", Disney));
//			Review SWRogueOne = reviewRepo.save(new Review("Star Wars: Episode III.V: Rogue One", "a rag tag group of hero's must try and foil a plan by the empire", "my friends", "infinitywars.jpg", Amazing));
//			Review SWForceAwakens = reviewRepo.save(new Review("Star Wars: Episode VIII: The Force Awakens", "Is ", "All ", "infinitywars.jpg", Disney));
//			Review SWSolo = reviewRepo.save(new Review("Star Wars: Episode II.V: Solo", "Han Solo, origin story", "Enter Donald Glover", "infinitywars.jpg", Disney));

			reviewRepo.save(SWNewHope);
			reviewRepo.save(SWReturnOfJedi);
//			reviewRepo.save(SWEmpireStrikesBack);
//			reviewRepo.save(SWThePhantomMenace);
//			reviewRepo.save(SWAttckOfTheClones);
//			reviewRepo.save(SWRevengeOfTheSith);
//			reviewRepo.save(SWTheLastJedi);
//			reviewRepo.save(SWRogueOne);
//			reviewRepo.save(SWForceAwakens);
//			reviewRepo.save(SWSolo);
			
			}
		
		
		
			
}
