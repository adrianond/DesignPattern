package br.com.cod3r.comportamentais.chain.proposal.service;

import br.com.cod3r.comportamentais.chain.proposal.Proposal;
import br.com.cod3r.comportamentais.chain.proposal.ProposalHandler;

public class Ceo extends ProposalHandler {

    public Proposal handle(Proposal proposal) {
        System.out.println("O CEO aprovou a proposta");
        proposal.setApproved(true);
        return proposal;
    }

}
