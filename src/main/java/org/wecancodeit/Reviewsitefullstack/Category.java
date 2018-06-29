package org.wecancodeit.Reviewsitefullstack;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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
		
//		@ManyToOne
//		Review review;
		@OneToMany(mappedBy="category")
		private Collection<Review> review;
		
		protected Category() {}

		public Category(String category, String description) {
			this.category = category;
			this.description = description;
//			this.review = Arrays.asList(review);
		}
		
		@Override
		public String toString() {
			return category + " " + description + " " + review;
		}

		public String getGenre() {
			return category;
		}

		public String getDescription() {
			return description;
		}
		
		// add collection to whatever we are collecting 
		// add it to parameter of the constructor too. 

		public Long getId() {
			return id;
		}

//		public Review getReviews() {
//			return review;
//		}
		
}
