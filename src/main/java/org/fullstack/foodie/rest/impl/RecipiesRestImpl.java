/**
 * 
 */
package org.fullstack.foodie.rest.impl;

import java.util.List;

import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.rest.RecipiesRest;
import org.fullstack.foodie.serviceI.RecipiesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RecipiesRestImpl implements RecipiesRest {

	@Autowired
	private static RecipiesService recipieService;

	private static final Logger log = LoggerFactory.getLogger(RecipiesRestImpl.class);

	@Override
	public String register(UserWrapper wrapper) {
		try {
			log.info("Inside Rest API @Register");
			return recipieService.register(wrapper);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recipieService.register(wrapper);

	}

	@Override
	public UserWrapper getUserDetails(int userId) {
		return recipieService.getUserDetails(userId);
	}

	@Override
	public List<UserWrapper> getAllUserDetails() {
		return recipieService.getAllUserDetails();
	}

	@Override
	public String deleteDataById(int userId) {
		return recipieService.deleteDataById(userId);
	}

}
