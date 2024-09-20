package org.fullstack.foodie;

import static org.junit.jupiter.api.Assertions.*;

import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.rest.RecipiesRest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class FullStackTest {
	@Autowired
	private static RecipiesRest recipiesRest;

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	public void TestRegisterAPI() {
		System.out.println("Entered TestRegisterAPI");
		UserWrapper userWrapper = new UserWrapper();
		userWrapper.setFirstName("ratna");
		userWrapper.setLastName("kondet");
		userWrapper.setEmailId("rkondeti@eiu.edu");
		userWrapper.setPhoneNumber("2167755270");
		userWrapper.setPassword("Ratna1234@");
		String result = recipiesRest.register(userWrapper);
	    assertEquals(true, result.contains("ratna"));

	}

}
