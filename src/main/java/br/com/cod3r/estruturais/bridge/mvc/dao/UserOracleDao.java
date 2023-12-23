package br.com.cod3r.estruturais.bridge.mvc.dao;


import br.com.cod3r.estruturais.bridge.mvc.model.User;

public class UserOracleDao implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
