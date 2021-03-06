package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@Autowired
	ReviewRepository reviewRepo;

	@RequestMapping(value = "/")
	public String getReview(Model model) {
		model.addAttribute("index", reviewRepo.findAll());
		return "index";
	}

}
