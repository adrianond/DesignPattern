package br.com.cod3r.criacionais.factory.apple.after.factory;

import br.com.cod3r.criacionais.factory.apple.after.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.after.model.IPhone11;

public class Iphone11Factory extends IPhoneFactory{

	@Override
	public IPhone buildIPhone() {
		return new IPhone11();
	}


}
