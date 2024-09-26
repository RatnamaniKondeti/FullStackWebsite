package org.fullstack.foodie.serviceI;

import java.util.List;

import org.fullstack.foodie.model.UserWrapper;
import org.springframework.stereotype.Service;

@Service
public interface RecipiesService {

	public String register(UserWrapper userWrapper);

	public UserWrapper getUserDetails(int userId);

	public List<UserWrapper> getAllUserDetails();

	public String deleteDataById(int userId);
}
