package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewRepository reviewRepo;

	@RequestMapping(value = "/reviews")
	public String getReview(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping(value = "/review/{title}")
	public String getReview(@PathVariable(name = "title") String title, Model model) {
		model.addAttribute("review", reviewRepo.findByTitle(title));
		return "review";
	}

}
