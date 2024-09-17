package org.fullstack.foodie.daoI;

import java.util.List;

import org.fullstack.foodie.exceptionhandler.BusinessException;
import org.fullstack.foodie.model.User;

public interface RecipiesDao {

	public boolean register(User user) throws BusinessException;

	public User getUserDetails(int userId) throws BusinessException;

	public List<User> getAllUserDetails();

	public String deleteDataById(int userId);

}
