package br.com.cod3r.estruturais.adapter.car.service;

import br.com.cod3r.estruturais.adapter.car.interfaces.SpeedInMile;

public class SpeedMile implements SpeedInMile {

	@Override
	public double getSpeedMaxPermited() {
		double max = 120 * 1.60934;
		System.out.println("Speed max permited in miles: " + max);
		return max;
	}

}
