package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {

	@Autowired
	CommentsRepository commentRepo;
	
	@Autowired
	ReviewRepository reviewRepo;
	
	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public String getReview(Model model) {
		model.addAttribute("review", reviewRepo.findAll());
		return "review";
	}
	
	@RequestMapping(value="/review", method = RequestMethod.POST)
	public String addComment(String userName, String content, String title) {
		Review review = reviewRepo.findByTitle(title);
		if(review != null) {
			commentRepo.save(new Comment(userName, content, review));
		}
		return "redirect:/review";
	}
}
