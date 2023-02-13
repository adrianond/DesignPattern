package br.com.cod3r.estruturais.adapter.car.adapter;

import br.com.cod3r.estruturais.adapter.car.interfaces.SpeedInMile;
import br.com.cod3r.estruturais.adapter.car.interfaces.SpeedPerHour;

public class SpeedAdapter implements SpeedPerHour {
	private SpeedInMile speedInMile;
	
	public SpeedAdapter(SpeedInMile speedInMile) {
		this.speedInMile = speedInMile;
	}

	@Override
	public double getSpeedMaxPermited() {
		return speedInMile.getSpeedMaxPermited();
	}

}
