package br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryOracleConnection implements AbstractFactoryConnection {

	public final static int POOL_SIZE = 2;
	private static List<OracleConnection> connectionsPool;

	static {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<OracleConnection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new OracleConnection());
		}
	}

	public AbstractFactoryOracleConnection() {
		System.out.println("New instance of Connection Pool");
	}

	@Override
	public OracleConnection getConnection() {
		OracleConnection avaiable = null;
		for(OracleConnection conn: connectionsPool) {
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
