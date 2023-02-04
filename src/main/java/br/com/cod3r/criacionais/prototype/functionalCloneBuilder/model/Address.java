package br.com.cod3r.criacionais.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {
	private final String street;
	private final Integer number;

	public Address(String street, Integer number) {
		super();
		this.street = street;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public Integer getNumber() {
		return number;
	}

	public static class Builder {
		private String street;
		private Integer number;


		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setNumber(Integer number) {
			this.number = number;
			return this;
		}

		public Address build() {
			return new Address(street, number);

		}

	}


	@Override public Object clone( ) throws CloneNotSupportedException {
		return	super.clone();
	}

}
