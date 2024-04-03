package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Student;

@Controller
public class FormController {

	@RequestMapping("/complexForm")
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handleComplexForm", method = RequestMethod.POST)
	public String handleComplexForm(@ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		return "success_form";
	}
}
