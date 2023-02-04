package br.com.cod3r.criacionais.singleton.connectionPool.monostate;

import br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn.AbstractFactoryOracleConnection;
import br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn.AbstractFactoryPostgreeConnection;
import br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn.ExecuteQuery;

public class Client {
	public static void doQuery1(AbstractFactoryOracleConnection factory) {
		System.out.println("Connection Pool Size: " + AbstractFactoryOracleConnection.POOL_SIZE);
		int pool = AbstractFactoryOracleConnection.POOL_SIZE;
		System.out.println(pool);


		ExecuteQuery executeQuery = new ExecuteQuery(factory.getConnection());
		executeQuery.executarConsulta("SELECT * FROM A1");
	}


	public static void doQuery2(AbstractFactoryPostgreeConnection factory) { 
		System.out.println("Connection Pool Size: " + AbstractFactoryPostgreeConnection.POOL_SIZE);
		int pool = AbstractFactoryOracleConnection.POOL_SIZE;
		System.out.println(pool);

		ExecuteQuery executeQuery = new ExecuteQuery(factory.getConnection());
		executeQuery.executarConsulta("SELECT * FROM A2"); 
	}

	public static void doQuery3(AbstractFactoryPostgreeConnection factory) {
		System.out.println("Connection Pool Size: " + AbstractFactoryPostgreeConnection.POOL_SIZE);
		int pool = AbstractFactoryOracleConnection.POOL_SIZE;
		System.out.println(pool);

		ExecuteQuery executeQuery = new ExecuteQuery(factory.getConnection());
		executeQuery.executarConsulta("SELECT * FROM A3");
	}


	public static void main(String[] args) throws InterruptedException {

		doQuery1(new AbstractFactoryOracleConnection());
		doQuery2( new AbstractFactoryPostgreeConnection());
		doQuery3( new AbstractFactoryPostgreeConnection());
	}
}
