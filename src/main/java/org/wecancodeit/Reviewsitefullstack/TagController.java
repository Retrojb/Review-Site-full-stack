package org.wecancodeit.Reviewsitefullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TagController {

	@Autowired
	private TagRepository tagRepo;
	
	@RequestMapping("/reviews/tags")
	public String getTags(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}
	
	@RequestMapping("/reviews/tags/{name}")
	public String getTitleFromTag(@PathVariable(name="name")String name, Model model) {
		model.addAttribute("tag", tagRepo.findByName(name));
		return "tag";
	}
}
