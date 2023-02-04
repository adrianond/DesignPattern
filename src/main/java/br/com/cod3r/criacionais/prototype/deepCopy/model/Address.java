package br.com.cod3r.criacionais.prototype.deepCopy.model;

public class Address implements Cloneable {
	public String street;
	public Integer number;
	public Phone phone;
	
	public Address(String street, Integer number, Phone phone) {
		super();
		this.street = street;
		this.number = number;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + " phone=" + phone + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Address cloneAddress =  (Address) super.clone();
		cloneAddress.phone = (Phone) phone.clone();
		return cloneAddress;
	}
}
