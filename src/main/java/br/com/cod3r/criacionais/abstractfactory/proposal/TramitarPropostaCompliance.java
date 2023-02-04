package br.com.cod3r.criacionais.abstractfactory.proposal;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;

public class TramitarPropostaCompliance extends TramitarProposta {

	public TramitarPropostaCompliance(Parceiro parceiro) {
		super(parceiro);
	}

	@Override
	protected void finalizarProcesso() {
		System.out.println("Envio da selfie concluido - TramitarPropostaCompliance");
	}


}
