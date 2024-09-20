package org.fullstack.foodie.service.impl;

import java.util.List;

import org.fullstack.foodie.daoI.RecipiesDao;
import org.fullstack.foodie.exceptionhandler.BusinessException;
import org.fullstack.foodie.model.User;
import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.serviceI.RecipiesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipiesServiceImpl implements RecipiesService {

	@Autowired
	private RecipiesDao recipiesDao;
	
	private static Logger log=LoggerFactory.getLogger(RecipiesServiceImpl.class);

	@Override
	public String register(UserWrapper userWrapper) {
		log.info("Inside Log Folder");

		User user = new User();
		user.setFirstName(userWrapper.getFirstName());
		user.setLastName(userWrapper.getLastName());
		user.setPhoneNumber(userWrapper.getPhoneNumber());
		user.setPassword(userWrapper.getPassword());
		user.setEmailId(userWrapper.getEmailId());
		try {
			recipiesDao.register(user);
			return "Welcome" + userWrapper.getFirstName();
		} catch (BusinessException ex) {
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
			return "Unexpected Exception Occured";
			}
	}

	@Override
	public UserWrapper getUserDetails(int userId) {
		System.out.println("Inside Method getUserDetails with UserId:"+userId);
		try{
			User user= recipiesDao.getUserDetails(userId);
		UserWrapper userWrapper=new UserWrapper();
		userWrapper.setFirstName(user.getFirstName());
		userWrapper.setLastName(user.getLastName());
		userWrapper.setEmailId(user.getEmailId());
		userWrapper.setPhoneNumber(user.getPhoneNumber());
		userWrapper.setPassword(user.getPassword());
		return userWrapper;
		}catch (BusinessException ex) {
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
			return null;
			
			}
	}

	@Override
	public List<UserWrapper> getAllUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteDataById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
