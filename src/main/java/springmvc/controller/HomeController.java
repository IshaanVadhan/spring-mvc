package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url.");

		model.addAttribute("name", "Ishaan Vadhan");
		model.addAttribute("id", 41074);

		List<String> friends = new ArrayList<String>();
		friends.add("Parth");
		friends.add("Abhishek");
		friends.add("Vinayak");
		model.addAttribute("friends", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url.");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url.");

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("name", "Ishaan");

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("datetime", now);

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		modelAndView.addObject("marks", marks);

		modelAndView.setViewName("help");

		return modelAndView;
	}
}
