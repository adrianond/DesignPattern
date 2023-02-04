package br.com.cod3r.criacionais.factory.app.dbadapter;

import br.com.cod3r.criacionais.factory.app.dbadapter.db.DB;
import br.com.cod3r.criacionais.factory.app.dbadapter.factory.DBFactoryClass;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Get Oracle conection");
		DBFactoryClass oracle = new DBFactoryClass();
		DB ora = oracle.getDatabase("oracle");
		ora.query("select....");
		ora.update("update");

		System.out.println("Get Postgree conection");
		DBFactoryClass postgree = new DBFactoryClass();
		DB p =  postgree.getDatabase("postgree");
		p.query("select....");
		p.update("update");
	}
}
