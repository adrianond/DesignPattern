package br.com.cod3r.criacionais.prototype.shallowCopy.model;



public class Address {
	public String street;
	public Integer number;
	
	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + "]";
	}
}
