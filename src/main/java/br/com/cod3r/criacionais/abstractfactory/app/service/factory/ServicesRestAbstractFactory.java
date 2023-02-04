package br.com.cod3r.criacionais.abstractfactory.app.service.factory;



import br.com.cod3r.criacionais.abstractfactory.app.service.services.CarRestApiService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.CarService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.UserRestApiService;
import br.com.cod3r.criacionais.abstractfactory.app.service.services.UserService;

public class ServicesRestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

}
