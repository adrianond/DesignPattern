package br.com.cod3r.estruturais.adapter;

import br.com.cod3r.estruturais.adapter.adpters.HDMIToOldMonitorAdapter;
import br.com.cod3r.estruturais.adapter.adpters.HDMIToVGAAdapter;
import br.com.cod3r.estruturais.adapter.service.Computer;
import br.com.cod3r.estruturais.adapter.service.OldMonitor;
import br.com.cod3r.estruturais.adapter.service.TV;

public class Cliente {
	
	public static void main(String[] args) {
		
		Computer computer  = new Computer();
		computer.connectPort(new TV());
		computer.sendImageAndSound("TV image", "TV sound");
		
		System.out.println("------ Monitor ----------");
		
		Computer computer2  = new Computer();
		OldMonitor oldMonitor = new OldMonitor();
		
		// oldMonitor não é uma HDMI
		//computer2.connectPort(oldMonitor);
		
		computer2.connectPort(new HDMIToVGAAdapter(oldMonitor));//adapter com composicao
		
		computer2.sendImageAndSound("VGA image", "VGA sound");
		
		
        System.out.println("------ Monitor Class Adapter ----------");
		
		Computer pc3 = new Computer();
		HDMIToOldMonitorAdapter monitorAdaptee = new HDMIToOldMonitorAdapter();//adapter  com heranca
		pc3.connectPort(monitorAdaptee);
		pc3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
	}

}
