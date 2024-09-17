package org.fullstack.foodie.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.fullstack.foodie.daoI.RecipiesDao;
import org.fullstack.foodie.exceptionhandler.BusinessException;
import org.fullstack.foodie.model.User;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class RecipiesDaoImpl implements RecipiesDao {

	@PersistenceContext
	private EntityManager entityManager;

	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public boolean register(User user) throws BusinessException {
		try {
			entityTransaction.begin();
			entityManager.persist(user); // Save the user to the database
			entityTransaction.commit();
			return true; // Indicate success
		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
			e.printStackTrace();
		}
		throw new BusinessException("No Output Exception");
	}

	@Override
	public User getUserDetails(int userId) throws BusinessException {
		try {
			entityTransaction.begin();
			User user = entityManager.find(User.class, userId);
			entityTransaction.commit();
			return user;
		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
			throw new BusinessException(e.getLocalizedMessage());
		}
	}

	@Override
	public List<User> getAllUserDetails() {
		return null;
	}

	@Override
	public String deleteDataById(int userId) {
		return null;
	}

}
