package br.com.cod3r.criacionais.factory.app.dbadapter.factory;

import br.com.cod3r.criacionais.factory.app.dbadapter.db.DB;

public interface DBFactory {
	DB getDatabase(String db);
}
