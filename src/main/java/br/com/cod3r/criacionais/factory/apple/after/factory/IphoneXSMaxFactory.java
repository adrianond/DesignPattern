package br.com.cod3r.criacionais.factory.apple.after.factory;

import br.com.cod3r.criacionais.factory.apple.after.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.after.model.IPhoneXSMax;

public class IphoneXSMaxFactory extends IPhoneFactory{

	@Override
	public IPhone buildIPhone() {
		return new IPhoneXSMax();
	}

}
