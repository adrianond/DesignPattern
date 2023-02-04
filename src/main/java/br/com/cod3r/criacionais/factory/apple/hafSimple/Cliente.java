package br.com.cod3r.criacionais.factory.apple.hafSimple;

import br.com.cod3r.criacionais.factory.apple.hafSimple.factory.IPhone11Factory;
import br.com.cod3r.criacionais.factory.apple.hafSimple.factory.IPhoneFactory;
import br.com.cod3r.criacionais.factory.apple.hafSimple.factory.IPhoneXFactory;

public class Cliente {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone 11");
		IPhoneFactory iPhone11Factory = new IPhone11Factory(); 
		iPhone11Factory.createDevice("1");
		
		System.out.println("\n\n### Ordering an iPhone X");
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory(); 
		iPhoneXFactory.createDevice("X");
	}
}
