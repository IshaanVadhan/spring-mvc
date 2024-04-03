package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Spring MVC App");
		m.addAttribute("Desc", "Registration form");
		System.out.println("Adding common data");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Creating form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		if (user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id " + createdUser);
		return "success";
	}
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "email", required = false) String email,
//			@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
//		
//		User user = new User();
//		user.setEmail(email);
//		user.setUsername(username);
//		user.setPassword(password);
//		System.out.println(user);
//		
////		model.addAttribute("email", email);
////		model.addAttribute("username", username);
////		model.addAttribute("password", password);
//		model.addAttribute("user", user);
//		
//		return "success";
//	}
}
