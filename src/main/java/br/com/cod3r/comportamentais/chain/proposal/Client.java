package br.com.cod3r.comportamentais.chain.proposal;

import br.com.cod3r.comportamentais.chain.proposal.service.Ceo;
import br.com.cod3r.comportamentais.chain.proposal.service.Director;
import br.com.cod3r.comportamentais.chain.proposal.service.Manager;

public class Client {
    public static void main(String[] args) {

        //Proposal proposal = new Proposal(Double.valueOf(50.000));
        //Proposal proposal = new Proposal(Double.valueOf(50.001));
        Proposal proposal = new Proposal(Double.valueOf(200.000));

        Manager manager = new Manager();
        manager
                .setNextHander(new Director())
                .setNextHander(new Ceo());

        manager.handle(proposal);
    }
}
