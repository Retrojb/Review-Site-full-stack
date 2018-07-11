package org.wecancodeit.Reviewsitefullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewSiteController.class)
public class ReviewSiteControllerTest {

	@Autowired
	 private MockMvc mvc;
	
	@MockBean
	public ReviewRepository repo;
	
	@Mock
	public Review testReview;
	
	@Test
	public void shouldReturnReviews() throws Exception{
		mvc.perform(get("/reviews")).andExpect(view().name(is(equalTo("reviews"))));
	}
	@Test
	public void properRequest() throws Exception{
		mvc.perform(get("/reviews")).andExpect(status().is2xxSuccessful());
	}
	
	
	@Test
	public void properRequestShouldProvideTheCorrectModel() throws Exception{
		mvc.perform(get("/reviews")).andExpect(model().attribute("reviews", repo.findAll()));
	}
	
	
	@Test
	public void properRequestToReview() throws Exception{
		given(repo.findOne(1L)).willReturn(testReview);
		mvc.perform(get("/reviews/1")).andExpect(status().is2xxSuccessful());
	}
	@Test
	public void improperRequestToReviewNotOk() throws Exception{
		given(repo.findOne(1L)).willReturn(testReview);
		mvc.perform(get("/revview/1")).andExpect(status().is4xxClientError());
	}
	
	
	
	@Test
	public void properRequestShouldReturnExpectedViewReview() throws Exception{
		given(repo.findOne(1L)).willReturn(testReview);
		mvc.perform(get("/reviews/1")).andExpect(view().name("review"));
	}
	@Test
	public void properRequestShouldProvideTheCorrectModelReview() throws Exception{
		given(repo.findOne(1L)).willReturn(testReview);
		mvc.perform(get("/reviews/1")).andExpect(model().attribute("reviews", repo.findAll()));
	}
	
}

