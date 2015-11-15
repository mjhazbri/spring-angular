/**
 * 
 */
package fr.blogspot.mjhazbri.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jalel
 *
 */

@Controller
public interface UserController {

	@RequestMapping("/hello")
	ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name);
}
