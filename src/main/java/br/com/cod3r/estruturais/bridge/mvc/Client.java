package br.com.cod3r.estruturais.bridge.mvc;


import br.com.cod3r.estruturais.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.estruturais.bridge.mvc.dao.UserMysqlDao;
import br.com.cod3r.estruturais.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.estruturais.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.estruturais.bridge.mvc.model.User;
import br.com.cod3r.estruturais.bridge.mvc.services.UserEJB;
import br.com.cod3r.estruturais.bridge.mvc.services.UserRest;
import br.com.cod3r.estruturais.bridge.mvc.services.UserService;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userEJB = new UserEJB(new UserMongoDao());
		userEJB.init();
		userEJB.save(user);

		UserService userRest = new UserRest(new UserMysqlDao());
		userRest.init();
		userRest.save(user);

		UserService userRestOracle = new UserRest(new UserOracleDao());
		userRestOracle.init();
		userRestOracle.save(user);

		UserService userSoap = new UserRest(new UserPostgresDao());
		userSoap.init();
		userSoap.save(user);

	}
}
