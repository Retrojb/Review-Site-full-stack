package org.wecancodeit.Reviewsitefullstack;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue	
	private Long id;
	private String movieName;
	private String review;
	private String content;
	private String imgUrl;
	
	@ManyToOne
	Collection<Category> category;
	
	public Review(String movieName, String review, String content, String imgUrl) {
		this.movieName = movieName;
		this.review = review;
		this.content = content;
		this.imgUrl = imgUrl;
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
	
	@Override
	public String toString() {
		return movieName + " " + review + " " + content;
	}

}
