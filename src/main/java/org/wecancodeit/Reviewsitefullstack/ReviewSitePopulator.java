package org.wecancodeit.Reviewsitefullstack;

import org.hibernate.engine.jdbc.spi.SqlExceptionHelper.StandardWarningHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

//turned off the @service annotation to stop duplicates, but to keep the populator in case 
public class ReviewSitePopulator implements CommandLineRunner {

	@Autowired
	private ReviewRepository reviewRepo;

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private TagRepository tagRepo;

	@Autowired
	private CommentsRepository commentRepo;

	@Override
	public void run(String... args) throws Exception {

		Tag action = tagRepo.save(new Tag("Action"));
		Tag romance = tagRepo.save(new Tag("Romance"));
		Tag Disney = tagRepo.save(new Tag("Disney"));
		Tag LucasFilms = tagRepo.save(new Tag("Lucas Film"));
		Tag SciFi = tagRepo.save(new Tag("Sci-Fi"));
		Tag Adventure = tagRepo.save(new Tag("Adventure"));
		Tag Future = tagRepo.save(new Tag("Future"));
		Tag Garbage = tagRepo.save(new Tag("Garbage"));
		Tag Amazing = tagRepo.save(new Tag("Amazing"));
		Tag Origin = tagRepo.save(new Tag("Origin Story"));

		Category catOriginal = categoryRepo.save(new Category("Original"));
		Category catPrequel = categoryRepo.save(new Category("Prequel"));
		Category catSequel = categoryRepo.save(new Category("Sequel"));
		Category catAnimated = categoryRepo.save(new Category("Animated"));
		Category catSideStory = categoryRepo.save(new Category("A Star Wars Story"));

		Review SWThePhantomMenace = reviewRepo.save(new Review("Star Wars: Episode I: The Phantom Menace",
				"Two Jedi Knights escape a hostile blockade to find allies and come across a young boy who may bring balance to the Force, but the long dormant Sith resurface to claim their old glory (IMDb)",
				"phantom", catPrequel, Garbage, LucasFilms, action, Adventure, SciFi, Future));

		Review SWAttckOfTheClones = reviewRepo.save(new Review("Star Wars: Episode II: Attack of the Clones",
				"Ten years after initially meeting, Anakin Skywalker shares a forbidden romance with Padmé Amidala, while Obi-Wan investigates an assassination attempt on the senator and discovers a secret clone army crafted for the Jedi. (IMDb)",
				"clones", catPrequel, Garbage, LucasFilms, action, Adventure, SciFi, Future));

		Review SWCloneWars = reviewRepo.save(new Review("Star Wars: A Star Wars Story: The Clone Wars",
				"After the Republic's victory on Christophsis, Anakin and his new apprentice Ahsoka Tano must rescue the kidnapped son of Jabba the Hutt. Political intrigue complicates their mission. (IMDb)",
				"clonewars", catAnimated, action, Adventure, SciFi));

		Review SWSolo = reviewRepo.save(new Review("Star Wars: A Star Wars Story: Solo",
				"During an adventure into the criminal underworld, Han Solo meets his future copilot Chewbacca and encounters Lando Calrissian years before joining the Rebellion. (IMDb)",
				"solo", catSideStory, Disney, Origin, action, Adventure, SciFi, Future));

		Review SWRevengeOfTheSith = reviewRepo.save(new Review("Star Wars: Episode III: Revenge of the Sith",
				"Three years into the Clone Wars, the Jedi rescue Palpatine from Count Dooku. As Obi-Wan pursues a new threat, Anakin acts as a double agent between the Jedi Council and Palpatine and is lured into a sinister plan to rule the galaxy. (IMDb)",
				"sith", catPrequel, LucasFilms, action, Adventure, SciFi, Future));

		Review SWRevelations = reviewRepo.save(new Review("Star Wars: Revelations",
				"The last Jedi fight to survive when they are hunted by the Empire. Taking place between Episodes III and Episode IV",
				"", catSideStory, action, Adventure));

		Review SWRogueOne = reviewRepo.save(new Review("Star Wars: A Star Wars Story: Rogue One",
				"A rag tag group of hero's must try and foil a plan by the Empire. The daughter of an Imperial scientist joins the Rebel Alliance in a risky move to steal the Death Star plans.",
				"rogue", catSideStory, Disney, Amazing, action, Adventure, SciFi, Future));

		Review SWNewHope = reviewRepo.save(new Review("Star Wars: Episode IV: A New Hope",
				"Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empire's world-destroying battle-station, while alalso attempting to rescue Princess Leia from the evil Darth Vader. (IMDb)",
				"newhope", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance));
		Review SWReturnOfJedi = reviewRepo.save(new Review("Star Wars: Episode V: The Empire Strikes Back",
				"After the rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued by Darth Vader. (IMDb)",
				"empirestrikes", catOriginal, SciFi, LucasFilms, Amazing, action, Adventure, romance));
		Review SWEmpireStrikesBack = reviewRepo.save(new Review("Star Wars: Episode VI: Return of the Jedi",
				"After a daring mission to rescue Han Solo from Jabba the Hutt, the rebels dispatch to Endor to destroy a more powerful Death Star. Meanwhile, Luke struggles to help Vader back from the dark side without falling into the Emperor's trap. (IMDb)",
				"returnjedi", catOriginal, LucasFilms, SciFi, LucasFilms, Amazing, action, Adventure, romance));
		Review SWForceAwakens = reviewRepo.save(new Review("Star Wars: Episode VII: The Force Awakens ",
				"Three decades after the Empire's defeat, a new threat arises in the militant First Order. Stormtrooper defector Finn and the scavenger Rey are caught up in the Resistance's search for the missing Luke Skywalker. (IMDb)",
				"forceawakens", catSequel, Disney, Amazing, action, Adventure, SciFi, Future));
		Review SWTheLastJedi = reviewRepo.save(new Review("Star Wars: Episode VIII:The Last Jedi",
				"Rey develops her newly discovered abilities with the guidance of Luke Skywalker, who is unsettled by the strength of her powers. Meanwhile, the Resistance prepares for battle with the First Order. (IMDb)",
				"lastjedi", catSequel, Disney, Amazing, action, Adventure, SciFi, Future, romance));

	}

}
