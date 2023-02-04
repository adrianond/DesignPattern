package br.com.cod3r.criacionais.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private final static int POOL_SIZE = 2;
	private static ConnectionPool connectionPool;
	private List<Connection> connectionsPool;

	/**
	 * Inicialização lazy
	 * @return ConnectionPool
	 */
	public static ConnectionPool getInstance() {
		if (null == connectionPool) {
			connectionPool = new ConnectionPool();
		}
		return connectionPool;
	}

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<Connection>();

		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}

	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}

	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
