package br.com.cod3r.criacionais.prototype.functionalCloneBuilder;

import br.com.cod3r.criacionais.prototype.functionalCloneBuilder.model.Address;
import br.com.cod3r.criacionais.prototype.functionalCloneBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User user = new User("nome", 9, new Address("R dos bobos", 0));
		
		System.out.println(user.getAge());
		System.out.println(user.getAddress().getStreet());
		
		User cloneUser = user.cloneBuilder()
				.setAge(10)
				.setAddress(new Address("Rua 12", 10))
				.build();
		
		System.out.println(cloneUser.getAge());
		System.out.println(cloneUser.getAddress().getStreet());
		
		
		System.out.println("----------------------- Builder ----------------------------------------");
		
		User userBuilder = new User.Builder("Pedro", 17, new Address("Rua 14", 14))
				.build();
		
		System.out.println(userBuilder.getName());
		System.out.println(userBuilder.getAge());
		System.out.println(userBuilder.getAddress().getStreet());
		
		User clone = userBuilder.cloneBuilder()
				.setAddress(new Address("Rua Treze", 10))
				.build();
		
		System.out.println(clone.getAge());
		System.out.println(clone.getAddress().getStreet());
		
		
		
		
		
	}
}