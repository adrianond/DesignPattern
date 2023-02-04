package br.com.cod3r.criacionais.prototype.deepCopy.model;

public class Phone implements Cloneable {
	
	public String numero;
	
	public Phone(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Phone [numero=" + numero + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
