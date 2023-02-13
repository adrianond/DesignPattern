package br.com.cod3r.estruturais.adapter.service;

import br.com.cod3r.estruturais.adapter.interfaces.HDMI;

public class TV implements HDMI {
	
	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
