package br.com.cod3r.estruturais.adapter.service;

import br.com.cod3r.estruturais.adapter.interfaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
