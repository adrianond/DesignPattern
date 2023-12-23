package br.com.cod3r.estruturais.bridge.mvc.services;

import br.com.cod3r.estruturais.bridge.mvc.dao.UserDao;
import br.com.cod3r.estruturais.bridge.mvc.model.User;

public abstract class UserService {

    UserDao userDao;
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void init() {

    }

    public abstract void save(User user);
}
