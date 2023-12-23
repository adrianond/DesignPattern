package br.com.cod3r.estruturais.composite.folders.model;

public class Arquivo implements FileSystemItem {
	private String name;
	
	public Arquivo(String name) {
		this.name = name;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + name);
	}
}
