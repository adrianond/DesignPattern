package br.com.cod3r.criacionais.abstractfactory.proposal;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;

public abstract class TramitarProposta {

	private Parceiro parceiro;
	
	public TramitarProposta(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	protected void executar(String base64) {
		System.out.println("Iniciando o envio da selfie");

		envioSelfie(base64);

		finalizarProcesso();

	}

	protected void envioSelfie(String base64) {
		parceiro.envioSelfie(base64);
	}
	
	protected abstract void finalizarProcesso();
}
