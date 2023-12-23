package br.com.cod3r.comportamentais.chain.proposal;

public class Proposal {
    private boolean approved;

    private Double value;

    public Proposal(Double valor) {
        this.value = valor;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
