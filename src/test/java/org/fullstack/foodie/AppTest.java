package org.fullstack.foodie;

import static org.junit.Assert.assertNotNull;

import org.fullstack.foodie.application.RunApplication;
import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.service.impl.RecipiesServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RunApplication.class)
@RunWith(SpringRunner.class)
public class AppTest {

	@Autowired
	private static RecipiesServiceImpl recipiesServiceImpl;

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
		String result = recipiesServiceImpl.register(userWrapper);
		log.info("Results are");
		assertNotNull(result.contains("ratna"));

	}
}