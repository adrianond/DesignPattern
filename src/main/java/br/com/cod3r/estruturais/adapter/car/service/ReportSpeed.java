package br.com.cod3r.estruturais.adapter.car.service;

import br.com.cod3r.estruturais.adapter.car.interfaces.SpeedPerHour;

public class ReportSpeed {
	private SpeedPerHour speed;
	
	
	public ReportSpeed(SpeedPerHour speed) {
		this.speed = speed;
	}
	
	public double getSpeed(String type) {
		System.out.println("Get speed " + type);
		return speed.getSpeedMaxPermited();
	}

}
