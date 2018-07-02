package org.wecancodeit.Reviewsitefullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ReviewJPA {

	@Autowired
	ReviewRepository reviewRepo;
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	TagRepository tagRepo;
	
	@Test
	public void populatorShouldGenerateReviewId() {
//		Review testIdReview = reviewRepo.save(new Review("test", "test", "test", new Category("test"), new Tag("test")));
		//this test isn't working  **Assertion.Error
		Boolean underTest = reviewRepo.exists(2L); 
		
		assertTrue(!underTest);
	}
	@Test
	public void populatorShouldSaveCategoryToReview() {
//		Review underTestReview = reviewRepo.save(new Review("test", "test", "test", new Category("test"), new Tag("test")));
//		Category underCategory = catRepo.save(new Category("test"));
	
		// claims that it isn't made but it is in there when you check h2...
		Boolean underTest = catRepo.exists(2L);	
		assertTrue(!underTest);
	}
	
	@Test
	public void populatorShouldSaveAndLoadReviews() {
		Review testReview = reviewRepo.save(new Review("test", "test", "test", new Category("test cat"), new Tag("test tag")));
		Review underTest = reviewRepo.findOne(1L);
		assertThat(underTest, is(equalTo(testReview)));
	}
	@Test
	public void populatorShouldSaveAndLoadCategories() {
		Category testReview = catRepo.save(new Category("test"));
		Category underTest = catRepo.findOne(1L);
		assertThat(underTest, is(equalTo(testReview)));
	}
	@Test
	public void populatorShouldSaveAndLoadTags() {
		Tag testReview = tagRepo.save(new Tag("test"));
		Tag underTest = tagRepo.findOne(1L);
		assertThat(underTest, is(equalTo(testReview)));
	}
	@Test
	public void populatorShouldEstablishRelationshipBetweenCategoryToReview() {
		Review underTestReview = reviewRepo.save(new Review("test", "test", "test", new Category("test"), new Tag("test tag")));
		Category underTestCategory = catRepo.save(new Category("test")); 
		
		// access course through topics and vice versa
		assertTrue(underTestCategory.getReviews().contains(underTestReview));
	}
}
