package br.com.cod3r.estruturais.adapter.adpters;

import br.com.cod3r.estruturais.adapter.interfaces.HDMI;
import br.com.cod3r.estruturais.adapter.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
	private VGA vga;
	
	public HDMIToVGAAdapter(VGA vga) {
		System.out.println("Conecting the HDMI/VGA adapter...");
		this.vga = vga;
	}

	@Override
	public void setImage(String image) {
		System.out.println("VGA set image");
		vga.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println("Do nothing!");
	}

}
