package br.com.cod3r.criacionais.factory.apple.hafSimple.factory;

import java.util.Objects;

import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhoneX;
import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhoneXSMax;



public class IPhoneXFactory extends IPhoneFactory{

	@Override
	protected IPhone buildIPhone(String model) {

		if (Objects.equals("X", model)) {
			return new IPhoneX();
		}else  {
			return new IPhoneXSMax();
		}
	}
}
