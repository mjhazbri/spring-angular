/**
 * 
 */
package fr.blogspot.mjhazbri.webapp.controller;

import org.springframework.web.servlet.ModelAndView;

import fr.blogspot.mjhazbri.webapp.data.entities.User;

/**
 * @author Jalel
 *
 */

public interface UserController {

	ModelAndView showMessage(String name);

	User toJson();
}
