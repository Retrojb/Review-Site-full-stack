package org.wecancodeit.Reviewsitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {
	
	@Id
	@GeneratedValue	
	private Long id;
	private String movieName;
	private String review;
	private String content;
	private String imgUrl;
//	
//	@OneToMany(mappedBy="review")
//	private Collection<Category> category;
//	
	@ManyToOne
	Category category;
	
	public Review() {}
	public Review(String movieName, String review, String content, String imgUrl, Category category) {
		this.movieName = movieName;
		this.review = review;
		this.content = content;
		this.imgUrl = imgUrl;
//		this.category = Arrays.asList(categories);
		this.category = category;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public String getReview() {
		return review;
	}
	public String getContent() {
		return content;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public Category getCategory() {
		return category;
	}
	@Override
	public String toString() {
		return movieName + " " + review + " " + content;
	}

}
