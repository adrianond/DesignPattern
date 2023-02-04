package br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn;

public class PostgreeConnection implements Connection {
private boolean inUse;
	
	public PostgreeConnection() {
		inUse = false;
	}
	
	public Object query(String sql) {
		System.out.println("Running '" + sql + "' in Connection " + this);
		return null;
	}
	
	boolean isInUse() {
		return inUse;
	}
	
	void setInUse(boolean status) {
		inUse = status;
	}
}
