package br.com.cod3r.criacionais.factory.apple.simple.factory;

import java.util.Objects;

import br.com.cod3r.criacionais.factory.apple.simple.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.simple.model.IPhone11;
import br.com.cod3r.criacionais.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.criacionais.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.criacionais.factory.apple.simple.model.IPhoneXSMax;

public class IPhoneFactory {

	public IPhone createDevice(String model) {
		IPhone device = null;

		device = buildIPhone(model);
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;

	}
	
	
	private IPhone buildIPhone(String model) {

		if (Objects.equals("11", model)) {
			return new IPhone11();
		} else if (Objects.equals("11Pro", model)) {
			return new IPhone11Pro();
		} else if (Objects.equals("X", model)) {
			return new IPhoneX();
		}else {
			return new IPhoneXSMax();
		}
	}
}
