package br.com.cod3r.criacionais.factory.apple.after;

import java.util.Objects;

import br.com.cod3r.criacionais.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.criacionais.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.criacionais.factory.apple.after.factory.Iphone11Factory;
import br.com.cod3r.criacionais.factory.apple.after.factory.IphoneXFactory;
import br.com.cod3r.criacionais.factory.apple.after.factory.IphoneXSMaxFactory;

public class Client {
	static IPhoneFactory iPhoneFactory = null;

	public static void main(String[] args) {

		buildIphone("A");

		imprimeDevice(new Iphone11Factory());
	}

	private static void imprimeDevice(IPhoneFactory iPhoneFactory) {
		iPhoneFactory.createDevice();
	}

	private static void buildIphone(String model) {

		if (Objects.equals("11", model)) {
			iPhoneFactory = new Iphone11Factory();
			iPhoneFactory.createDevice();
		}else if (Objects.equals("11PRO", model)) {
			iPhoneFactory = new IPhone11ProFactory();
			iPhoneFactory.createDevice();
		}else if (Objects.equals("X", model)) {
			iPhoneFactory = new IphoneXFactory();
			iPhoneFactory.createDevice();
		}else  {
			iPhoneFactory = new IphoneXSMaxFactory();
			iPhoneFactory.createDevice();
		}
	}
}