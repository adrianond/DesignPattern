package br.com.cod3r.estruturais.adapter.service;

import br.com.cod3r.estruturais.adapter.adpters.HDMIToVGAAdapter;
import br.com.cod3r.estruturais.adapter.interfaces.HDMI;

public class Computer {
	private HDMI port;
	
	public void connectPort(HDMI screen) {
		System.out.println("Connecting on HDMI port...");
		this.port = screen;
	}
	
	public void sendImageAndSound(String image, String sound) {
		if(port == null) {
			System.out.println("Connect a HDMI cable first");
		} else {
			port.setImage(image);
			if (!HDMIToVGAAdapter.class.isInstance(port))
				port.setSound(sound);
		}
	}
}
