package br.com.cod3r.criacionais.factory.apple.hafSimple.factory;

import java.util.Objects;

import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhone11;
import br.com.cod3r.criacionais.factory.apple.hafSimple.model.IPhone11Pro;



public class IPhone11Factory extends IPhoneFactory{

	@Override
	protected IPhone buildIPhone(String model) {

		if (Objects.equals("11", model)) {
			return new IPhone11();
		}else  {
			return new IPhone11Pro();
		}
	}
}
