package org.wecancodeit.Reviewsitefullstack;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String imgUrl;

	@ManyToMany
	private Collection<Tag> tags;

	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;

	@ManyToOne
	Category category;

	@Lob
	private String content;

	protected Review() {
	}

	public Review(String title, String content, String imgUrl, Category category, Tag... tags) {
		this.title = title;
		this.content = content;
		this.imgUrl = imgUrl;
		this.category = category;
		this.tags = Arrays.asList(tags);
	}

	public String getTitle() {
		return title;
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

	public Collection<Tag> getTags() {
		return tags;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	@Override
	public String toString() {
		return title + " " + " " + content;
	}

}
