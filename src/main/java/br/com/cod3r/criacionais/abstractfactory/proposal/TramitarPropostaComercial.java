package br.com.cod3r.criacionais.abstractfactory.proposal;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;

public class TramitarPropostaComercial extends TramitarProposta {

	public TramitarPropostaComercial(Parceiro parceiro) {
		super(parceiro);
	}

	@Override
	protected void finalizarProcesso() {
		System.out.println("Envio da selfie concluido - TramitarPropostaComercial");
	}

}
