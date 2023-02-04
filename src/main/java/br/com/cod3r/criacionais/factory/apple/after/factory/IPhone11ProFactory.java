package br.com.cod3r.criacionais.factory.apple.after.factory;



import br.com.cod3r.criacionais.factory.apple.after.model.IPhone;
import br.com.cod3r.criacionais.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory{

	@Override
	public IPhone buildIPhone() {
		return new IPhone11Pro();
	}

}
