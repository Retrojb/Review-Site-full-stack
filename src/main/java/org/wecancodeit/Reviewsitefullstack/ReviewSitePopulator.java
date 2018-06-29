package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewSitePopulator implements CommandLineRunner {

		@Autowired
		private ReviewRepository reviewRepo;
		
		@Autowired
		private CategoryRepository categoryRepo;

		@Override
		public void run(String... args) throws Exception {
			
			Category action = categoryRepo.save(new Category("Action", "movies that will rock your socks"));
			Category romance = categoryRepo.save(new Category("Romance", "movies that will rock your socks"));
			Category Disney = categoryRepo.save(new Category("Disney", "movies that will rock your socks"));
			Category LucasFilms = categoryRepo.save(new Category("Lucas Film", "movies that will rock your socks"));
			Category SciFi = categoryRepo.save(new Category("Sci-Fi", "movies that will rock your socks"));
			Category Adventure = categoryRepo.save(new Category("Adventure", "movies that will rock your socks"));
			Category Original = categoryRepo.save(new Category("Original", "movies that will rock your socks"));
			Category Sequal = categoryRepo.save(new Category("Sequal", "movies that will rock your socks"));
			Category Garbage = categoryRepo.save(new Category("Garabage", "movies that will rock your socks"));
			Category Amazing = categoryRepo.save(new Category("Amazing", "movies that will rock your socks"));

			Review SWNewHope = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", action));
			Review SWReturnOfJedi = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", romance));
			Review SWEmpireStrikesBack= reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", LucasFilms));
			Review SWThePhantomMenace = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Garbage));
			Review SWAttckOfTheClones = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Garbage));
			Review SWRevengeOfTheSith = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Garbage));
			Review SWTheLastJedi = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Disney));
			Review SWRogueOne = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Disney));
			Review SWForceAwakens = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Disney));
			Review SWSolo = reviewRepo.save(new Review("Avengers Infinity Wars", "Great movie, Thanos is the bad guy", "All my friends are dead, push me to the edge", "infinitywars.jpg", Disney));

			categoryRepo.save(action);
			categoryRepo.save(romance);
		}
		
		
		
			
}
