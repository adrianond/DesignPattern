package br.com.cod3r.criacionais.singleton.connectionPool.monostate.conn;

public class ExecuteQuery {
	private Connection conn;
	
	public ExecuteQuery(Connection conn) {
		this.conn = conn;
		
	}
	
	public void executarConsulta(String sql) {
		if(conn != null)
			conn.query(sql);
	}

}
