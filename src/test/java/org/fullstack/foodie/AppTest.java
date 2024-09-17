package org.fullstack.foodie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.fullstack.foodie.model.UserWrapper;
import org.fullstack.foodie.rest.RecipiesRest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTest {

	@Autowired
	private static RecipiesRest recipiesRest;

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	  @Test
	    public void testExample() {
	        assertEquals(1, 1, "1 should be equal to 1");
	    }

	@Test
	public void TestRegisterAPI() {
		System.out.println("Entered TestRegisterAPI");
		UserWrapper userWrapper = new UserWrapper();
		userWrapper.setFirstName("ratna");
		userWrapper.setLastName("kondet");
		userWrapper.setEmailId("rkondeti@eiu.edu");
		userWrapper.setPhoneNumber("2177905527");
		userWrapper.setPassword("Ratna@552");
		String result = recipiesRest.register(userWrapper);
	    assertTrue(true, result.concat("ratna"));

	}

}