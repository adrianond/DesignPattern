package br.com.cod3r.comportamentais.chain.proposal.service;

import br.com.cod3r.comportamentais.chain.proposal.Proposal;
import br.com.cod3r.comportamentais.chain.proposal.ProposalHandler;

public class Director extends ProposalHandler {

    public Proposal handle(Proposal proposal) {
        if (proposal.getValue() <= Double.valueOf(100.000)) {
            System.out.println("O diretor aprovou a proposta");
            proposal.setApproved(true);
            return proposal;
        }
        return super.handle(proposal);
    }

}
