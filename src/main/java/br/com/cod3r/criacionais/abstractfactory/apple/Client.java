package br.com.cod3r.criacionais.abstractfactory.apple;

import br.com.cod3r.criacionais.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.criacionais.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.criacionais.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.criacionais.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		
		System.out.println("Iphone 11");
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory USrules = new USRulesAbstractFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory(USrules);
		IPhone iPhone = iPhone11Factory.orderIPhone("standard");
		System.out.println(iPhone);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Iphone X");
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(USrules);
		IPhone iPhonex = iPhoneXFactory.orderIPhone("highEnd");
		System.out.println(iPhonex);

	}
}
