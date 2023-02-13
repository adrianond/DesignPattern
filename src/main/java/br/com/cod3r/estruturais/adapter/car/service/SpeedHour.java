package br.com.cod3r.estruturais.adapter.car.service;

import br.com.cod3r.estruturais.adapter.car.interfaces.SpeedPerHour;

public class SpeedHour implements SpeedPerHour {

	@Override
	public double getSpeedMaxPermited() {
		System.out.println("Speed max permited per hour: " + 120);
		return 120;
	}

}
