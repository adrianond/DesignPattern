package br.com.cod3r.criacionais.abstractfactory.proposal;

import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.Parceiro;

public abstract class TramitarProposta {

	private Parceiro parceiro;
	
	public TramitarProposta(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	protected void executar(String base64) {
		System.out.println("Iniciando o envio da selfie");

		enviarSelfie(base64);

		finalizarProcesso();

	}

	protected void enviarSelfie(String base64) {
		parceiro.enviarSelfie(base64);
	}
	
	protected abstract void finalizarProcesso();
}
