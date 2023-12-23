package br.com.cod3r.criacionais.singleton.connectionPool;

import br.com.cod3r.criacionais.singleton.connectionPool.conn.Connection;
import br.com.cod3r.criacionais.singleton.connectionPool.conn.ConnectionPool;

public class Client {
	
	/**
	 * Singleton pattern :( 
	 * 1. alto acoplamento; 
	 * 2. fere o SOLID (classe com mais de uma responsábilidade) 
	 * 3. não é possível trabalhar com interface para criar uma conexão, pois o getInstance é um método estatico e;
	 *    interfaces não trabalham com métodos estaticos, uma alternativa é o monostate.
	 */
	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
		
		//libera a conexão
		pool.leaveConnection(conn);
	}
	
	public static void doQuery2() {
		Connection conn = ConnectionPool.getInstance().getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		Connection conn = ConnectionPool.getInstance().getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
	    doQuery2(); 
		doQuery3();
		 
	}
}
