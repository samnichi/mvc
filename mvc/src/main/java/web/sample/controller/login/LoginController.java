package web.sample.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 public String login(final ModelMap modelMap) {
		 System.out.println("login");
		 return "redirect:/employee/new";
	 }
	 
}
