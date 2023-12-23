package br.com.cod3r.estruturais.bridge.mvc.services;


import br.com.cod3r.estruturais.bridge.mvc.dao.UserDao;
import br.com.cod3r.estruturais.bridge.mvc.model.User;

public class UserSoap extends UserService {

	public UserSoap(UserDao userDao) {
		super(userDao);
	}

	public void save(User user) {
		System.out.println("Starting a save operation through Soap Protocol!");
		userDao.save(user);
	}
}
