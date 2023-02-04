package br.com.cod3r.criacionais.prototype.deepCopy;

import br.com.cod3r.criacionais.prototype.deepCopy.model.Address;
import br.com.cod3r.criacionais.prototype.deepCopy.model.Phone;
import br.com.cod3r.criacionais.prototype.deepCopy.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000, new Phone("11956788766")));
		System.out.println(user);
		
		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		
		System.out.println("Após clonar o objeto");
		
		cloneUser.address.street = "Double Street";
		cloneUser.address.phone.numero = "11999999999";
		System.out.println(user);
		System.out.println(cloneUser);
	}
}
