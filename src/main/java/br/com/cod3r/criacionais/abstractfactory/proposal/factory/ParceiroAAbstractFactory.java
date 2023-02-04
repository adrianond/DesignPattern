package br.com.cod3r.criacionais.abstractfactory.proposal.factory;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;
import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.ParceiroA;

public class ParceiroAAbstractFactory implements ParceiroAbstractFactory {

	@Override
	public Parceiro getParceiro() {
		return new ParceiroA();
	}

}
