package br.com.cod3r.comportamentais.chain.proposal;

public class ProposalHandler {

    protected ProposalHandler proposalNextHandler;


    protected Proposal handle(Proposal proposal) {
        if (proposalNextHandler != null && !proposal.isApproved())
            return this.proposalNextHandler.handle(proposal);
        else
            return proposal;
    }

    protected ProposalHandler setNextHander(ProposalHandler proposalHandler) {
        this.proposalNextHandler = proposalHandler;
        return proposalHandler;
    }


    public ProposalHandler getProposalNextHandler() {
        return proposalNextHandler;
    }

    public void setProposalNextHandler(ProposalHandler proposalNextHandler) {
        this.proposalNextHandler = proposalNextHandler;
    }
}
