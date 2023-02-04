package br.com.cod3r.criacionais.prototype.functionalCloneBuilder.model;


public class User implements Cloneable {

	public final String name;
	public final Integer age;
	public final Address address;

	public User(String name, Integer age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
	
	public Builder cloneBuilder() {
		return new Builder(name, age, address);
	}

	public static class Builder {
		public String name;
		public Integer age;
		public Address address;
		
		public Builder(String name, Integer age, Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}


		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setAge(Integer age) {
			this.age = age;
			return this;
		}
		public Builder setAddress(Address address) {
			this.address = address;
			return this;
		}

		public User build( ) {
			return new User(name, age, address);
		}

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (User) super.clone();

	}




}
