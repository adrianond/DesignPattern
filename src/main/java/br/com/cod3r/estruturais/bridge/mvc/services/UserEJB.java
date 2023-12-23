package br.com.cod3r.estruturais.bridge.mvc.services;


import br.com.cod3r.estruturais.bridge.mvc.dao.UserDao;
import br.com.cod3r.estruturais.bridge.mvc.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao userDao) {
		super(userDao);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}
