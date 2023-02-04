package br.com.cod3r.criacionais.factory.app.dbadapter.factory;

import java.util.Objects;

import br.com.cod3r.criacionais.factory.app.dbadapter.db.DB;
import br.com.cod3r.criacionais.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.criacionais.factory.app.dbadapter.db.PostgresDB;

public class DBFactoryClass implements DBFactory {

	@Override
	public DB getDatabase(String db) {

		if (Objects.equals("oracle", db)) {
			return new OracleDB();
		} else {
			return new PostgresDB();
		}
	}

}
