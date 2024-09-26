package org.fullstack.foodie;

import static org.junit.Assert.assertNotNull;

import org.fullstack.foodie.application.RunApplication;
import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.service.impl.RecipiesServiceImpl;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = RunApplication.class)
@AutoConfigureMockMvc
public class AppTest {

	@Autowired
	private RecipiesServiceImpl recipiesServiceImpl; // Removed static modifier

	private static final Logger log = LoggerFactory.getLogger(AppTest.class);

	@Test
	public void TestRegisterAPI() {
		log.info("inside Test");
		System.out.println("Entered TestRegisterAPI");

		UserWrapper userWrapper = new UserWrapper();
		userWrapper.setFirstName("mani");
		userWrapper.setLastName("hreghjdfh");
		userWrapper.setEmailId("rkondjdjksdbjaweeti@eiu.edu");
		userWrapper.setPhoneNumber("sjadbajedb");
		userWrapper.setPassword("7823	4y23@");

		String result = recipiesServiceImpl.register(userWrapper);
		log.info("Results are: {}", result); // Log the result for better visibility

		assertNotNull("Result should not be null", result);
	}
}
