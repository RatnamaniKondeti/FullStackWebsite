package org.fullstack.foodie;

import static org.junit.Assert.assertNotNull;

import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.service.impl.RecipiesServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AppTest {

	@Autowired
	private static RecipiesServiceImpl recipiesRest;

	private static final Logger log = LoggerFactory.getLogger(AppTest.class);

	@Test
	public void TestRegisterAPI() {
		log.info("inside Test");
		System.out.println("Entered TestRegisterAPI");
		UserWrapper userWrapper = new UserWrapper();
		userWrapper.setFirstName("ratna");
		userWrapper.setLastName("kondet");
		userWrapper.setEmailId("rkondeti@eiu.edu");
		userWrapper.setPhoneNumber("2167755270");
		userWrapper.setPassword("Ratna1234@");
		String result = recipiesRest.register(userWrapper);
		
		assertNotNull(result.contains("ratna"));
	}

}