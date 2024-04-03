package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
//	using HttpServletResponse (not recommeneded)
//	@RequestMapping("/one")
//	public String one(HttpServletResponse response) {
//		System.out.println("This is one handler.");
//		try {
//			response.sendRedirect("");
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		return "";
//	}

//	using RedirectView
//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("This is one handler.");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("two");
//		return redirectView;
//	}

//	using redirect prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler.");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handler.");
		return "contact";
	}
}
