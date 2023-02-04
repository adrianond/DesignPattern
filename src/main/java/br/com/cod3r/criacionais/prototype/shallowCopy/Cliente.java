package br.com.cod3r.criacionais.prototype.shallowCopy;

import br.com.cod3r.criacionais.prototype.shallowCopy.model.Address;
import br.com.cod3r.criacionais.prototype.shallowCopy.model.User;

public class Cliente {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("Clone", 25, new Address("ABC Street", 1000));
		System.out.println(user);

		User cloneUser = user.clone();
		cloneUser.name = "Clone x2";
		cloneUser.address.street = "Double Street";
		System.out.println("Após o clone");
		System.out.println(user);
		System.out.println(cloneUser);
	}
}


