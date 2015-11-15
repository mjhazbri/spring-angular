/**
 * 
 */
package fr.blogspot.mjhazbri.webapp.controller.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fr.blogspot.mjhazbri.webapp.controller.UserController;
import fr.blogspot.mjhazbri.webapp.data.entities.User;

/**
 * @author Jalel
 *
 */

@Controller
public class UserControllerImpl implements UserController {
	String message = "Welcome to Spring MVC!";

	private static final Logger logger = Logger.getLogger(UserControllerImpl.class);

	@Override
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		logger.debug("in controller  .... !");
		ModelAndView mv = new ModelAndView("user");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

	@Override
	@RequestMapping(value = "/toJson", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody User toJson() {
		
		logger.debug("toJson in controller  .... !");
		User user = new User();
		user.setId("0123456789");
		user.setLasteName("lastName");
		user.setFirstName("firstName");
		user.setEmail("test@testcom");
		return user;
	}
}