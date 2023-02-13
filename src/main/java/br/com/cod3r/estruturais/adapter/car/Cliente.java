package br.com.cod3r.estruturais.adapter.car;

import br.com.cod3r.estruturais.adapter.car.adapter.SpeedAdapter;
import br.com.cod3r.estruturais.adapter.car.service.ReportSpeed;
import br.com.cod3r.estruturais.adapter.car.service.SpeedHour;
import br.com.cod3r.estruturais.adapter.car.service.SpeedMile;

public class Cliente {
	
	public static void main(String[] args) {
		
		System.out.println("Speed per hour");
		ReportSpeed reportSpeedPerHour = new ReportSpeed(new SpeedHour());
		reportSpeedPerHour.getSpeed("hour");
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Speed in mile");
		ReportSpeed reportSpeedInMile = new ReportSpeed(new SpeedAdapter( new SpeedMile()));
		reportSpeedInMile.getSpeed("mile");
	}

}
