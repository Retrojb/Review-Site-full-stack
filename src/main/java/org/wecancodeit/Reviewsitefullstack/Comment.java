package org.wecancodeit.Reviewsitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private String userName;

	@Lob
	private String contents;

	@ManyToOne
	Review review;

	protected Comment() {
	}

	public Comment(String userName, String contents, Review review) {
		this.userName = userName;
		this.contents = contents;
		this.review = review;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getContents() {
		return contents;
	}

	public Review getReview() {
		return review;
	}

}
