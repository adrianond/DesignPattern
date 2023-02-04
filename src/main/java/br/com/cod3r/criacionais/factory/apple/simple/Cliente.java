package br.com.cod3r.criacionais.factory.apple.simple;

import br.com.cod3r.criacionais.factory.apple.simple.factory.IPhoneFactory;

public class Cliente {
	
	public static void main(String[] args) {
		
		System.out.println("### Ordering an iPhone");
		IPhoneFactory iPhoneFactory = new IPhoneFactory();
		iPhoneFactory.createDevice("11Pro");
		
	}
}
