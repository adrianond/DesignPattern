package br.com.cod3r.estruturais.bridge.mvc.services;


import br.com.cod3r.estruturais.bridge.mvc.dao.UserDao;
import br.com.cod3r.estruturais.bridge.mvc.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao userDao) {
		super(userDao);
	}

	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		userDao.save(user);
	}
}
