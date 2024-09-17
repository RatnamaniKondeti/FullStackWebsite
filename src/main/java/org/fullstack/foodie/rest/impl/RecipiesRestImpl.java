/**
 * 
 */
package org.fullstack.foodie.rest.impl;

import java.util.List;

import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.rest.RecipiesRest;
import org.fullstack.foodie.serviceI.RecipiesService;
import org.springframework.beans.factory.annotation.Autowired;


public class RecipiesRestImpl implements RecipiesRest{

	@Autowired
	private static RecipiesService recipieService; 
	
	@Override
	public String register(UserWrapper wrapper) {
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
