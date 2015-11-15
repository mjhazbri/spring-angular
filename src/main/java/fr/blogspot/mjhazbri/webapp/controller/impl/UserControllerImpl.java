/**
 * 
 */
package fr.blogspot.mjhazbri.webapp.controller.impl;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.blogspot.mjhazbri.webapp.controller.UserController;

/**
 * @author Jalel
 *
 */
public class UserControllerImpl implements UserController {
	String message = "Welcome to Spring MVC!";

	@Override
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}