package org.fullstack.foodie.daoI;

import java.util.List;

import org.fullstack.foodie.exceptionhandler.BusinessException;
import org.fullstack.foodie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipiesDao  extends JpaRepository<User, Integer>{

	public boolean register(User user) throws BusinessException;

	public User getUserDetails(int userId) throws BusinessException;

	public List<User> getAllUserDetails();

	public String deleteDataById(int userId);

}
