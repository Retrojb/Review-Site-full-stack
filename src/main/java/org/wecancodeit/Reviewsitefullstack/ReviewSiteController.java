package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewRepository reviewRepo;
	@Autowired
	CategoryRepository categoryRepo;
	
	@RequestMapping(value = "/review")
	public String getReview(Model model) {
		model.addAttribute("review", reviewRepo.findAll());
		return "review";
	}
	
//	@RequestMapping(value = "/review")
//	public String reviewHome(Model model) {
//		model.addAttribute("review", reviewRepo.findAll());
//		return "review";
//	}
	
	@RequestMapping("/category/{id}")
	public String getCategory(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findById(id));
		return "category";
	}
		
	
}
