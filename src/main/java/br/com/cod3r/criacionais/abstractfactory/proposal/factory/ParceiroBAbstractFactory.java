package br.com.cod3r.criacionais.abstractfactory.proposal.factory;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;
import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.ParceiroB;

public class ParceiroBAbstractFactory implements ParceiroAbstractFactory {

	@Override
	public Parceiro getParceiro() {
		return new ParceiroB();
	}

}
