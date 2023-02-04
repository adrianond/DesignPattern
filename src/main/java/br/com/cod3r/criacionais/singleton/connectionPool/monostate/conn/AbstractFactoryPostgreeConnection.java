package br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryPostgreeConnection implements AbstractFactoryConnection {
	
	public final static int POOL_SIZE = 1;
	private static List<PostgreeConnection> connectionsPool;
	
	static {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<PostgreeConnection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new PostgreeConnection());
		}
	}
	
	public AbstractFactoryPostgreeConnection() {
		System.out.println("New instance of Connection Pool");
	}

	@Override
	public PostgreeConnection getConnection() {
		PostgreeConnection avaiable = null;
		for(PostgreeConnection conn: connectionsPool) {
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

}
