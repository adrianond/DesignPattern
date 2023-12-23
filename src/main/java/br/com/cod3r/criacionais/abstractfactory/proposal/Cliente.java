package br.com.cod3r.criacionais.abstractfactory.proposal;

import br.com.cod3r.criacionais.abstractfactory.proposal.factory.ParceiroAAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.proposal.factory.ParceiroAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.proposal.factory.ParceiroBAbstractFactory;
import br.com.cod3r.criacionais.abstractfactory.proposal.parceiro.ParceiroA;

public class Cliente {
	
	public static void main(String[] args) {
		
		System.out.println("Enviando a selfie para parceiroA - TramitarPropostaComercial");
		
		ParceiroAbstractFactory factoryPaceiroA =  new ParceiroAAbstractFactory();

		 ParceiroA parceiroA = new ParceiroA();
		 TramitarPropostaComercial c = new TramitarPropostaComercial(parceiroA);
		 c.executar("imageBase64");;

		TramitarPropostaComercial comercial = new TramitarPropostaComercial(factoryPaceiroA.getParceiro());
		comercial.executar("imageBase64");;
		
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Enviando a selfie para parceiroB - TramitarPropostaCompliance");
		ParceiroAbstractFactory factoryPaceiroB =  new ParceiroBAbstractFactory();
		TramitarPropostaCompliance compliance = new TramitarPropostaCompliance(factoryPaceiroB.getParceiro());
		compliance.executar("imageBase64");;
		
	}

}
