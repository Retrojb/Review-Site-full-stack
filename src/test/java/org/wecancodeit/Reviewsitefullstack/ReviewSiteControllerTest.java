package org.wecancodeit.Reviewsitefullstack;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

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
	public Review review;
	
	@Test
	public void shouldReturnReviews() throws Exception{
		mvc.perform(get("/reviews"))
		// I can not get this to accept request 'get' to return
		
		.andExpect(view().name(is(equalTo("reviews"))));

	}
//	@Test
//	public void shouldReturnReviewSite() throws Exception{
//	mvc.perform(get("/review"));//.andExpect(view().movieName(is(equalTo("review"))));	
//	}

}

