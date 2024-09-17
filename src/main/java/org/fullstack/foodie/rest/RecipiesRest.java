package org.fullstack.foodie.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.fullstack.foodie.model.UserWrapper;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/foodie")
public interface RecipiesRest {
	
	@PostMapping("/register/")
	public String register(@RequestBody UserWrapper wrapper);
	
	@GetMapping("/getUserDetails/{userId}")
	public UserWrapper getUserDetails(@PathParam("userId")int userId);
	
	@GetMapping("/getAllUserDetails")
	public List<UserWrapper> getAllUserDetails();
	
	@DeleteMapping("/getAllUserDetails/userId")
	public String deleteDataById(@PathParam("userId") int userId);

}
