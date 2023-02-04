package br.com.cod3r.criacionais.factory.app.dbadapter.db;

public interface DB {
	public void query(String sql);
	public void update(String sql);
}
