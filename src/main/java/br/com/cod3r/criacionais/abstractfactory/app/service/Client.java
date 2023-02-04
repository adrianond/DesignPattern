package br.com.cod3r.criacionais.abstractfactory.app.service;



import br.com.cod3r.criacionais.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.app.service.factory.ServicesEbjAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.app.service.factory.ServicesRestAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.CarService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.UserEJBService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		  ServicesAbstractFactory factoryEjb = new ServicesEbjAbstractFactory();
		  ServicesAbstractFactory factoryRest = new ServicesRestAbstractFactory();
		  
		  System.out.println("Get Ejb service"); consultarServicos(factoryEjb);
		  
		  System.out.println("-------------------------------------------------");
		  
		  System.out.println("Get Rest service"); consultarServicos(factoryRest);
		 

		/**
		 * Sem usar fabrica de objetos...  
		 */
		consultarServicos(new CarEJBService());
		consultarServicos(new CarRestApiService());

		consultarServicos(new UserEJBService());
		consultarServicos(new UserRestApiService());

	}

	private static void consultarServicos(ServicesAbstractFactory factory) {
		System.out.println("Get car service");
		CarService service = factory.getCarService();
		service.save("entity");
		service.update("entity");

		System.out.println("----------------------------------------------------");

		System.out.println("Get user service");
		UserService user = factory.getUserService();
		user.save("Pedro Silva");
		user.delete(1);

	}

	private static void consultarServicos(CarService service) {
		System.out.println("Get car service");
		service.save("entity");
		service.update("entity");

	}

	private static void consultarServicos(UserService user) {
		System.out.println("Get user service");
		user.save("Pedro Silva");
		user.delete(1);

	}
}
