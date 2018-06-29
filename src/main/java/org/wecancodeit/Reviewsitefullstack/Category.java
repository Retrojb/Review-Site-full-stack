package org.wecancodeit.Reviewsitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

		@Id
		@GeneratedValue
		private Long id;
		
		private String category;
		private String description;
		
		@OneToMany
		Collection <Review> reviews;
		
		protected Category() {}

		public Category(String genre, String description, Review...reviews ) {
			this.category = genre;
			this.description = description;
			this.reviews = Arrays.asList(reviews);
		}
		
		@Override
		public String toString() {
			return category + " " + description + " " + reviews;
		}

		public String getGenre() {
			return category;
		}

		public String getDescription() {
			return description;
		}
		//add toString
		// add collection to whatever we are collecting 
		// add it to parameter of the constructor too. 
		
}
