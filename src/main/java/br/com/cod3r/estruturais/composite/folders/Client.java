package br.com.cod3r.estruturais.composite.folders;

import br.com.cod3r.estruturais.composite.folders.model.Arquivo;
import br.com.cod3r.estruturais.composite.folders.model.FileSystemItem;
import br.com.cod3r.estruturais.composite.folders.model.Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Client {

	public static FileSystemItem createCompositeFromFile(File file) {
		if(!file.isDirectory()) return (FileSystemItem) new File(file.getName());
		List<FileSystemItem> childs = new ArrayList<>();
		File[] files = file.listFiles();
		for(File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), childs);
	}
	
	public static void main(String[] args) {
		FileSystemItem file1 =  new Arquivo("File1.txt");
		FileSystemItem file2 = new Arquivo("File2.txt");
		FileSystemItem file3 = new Arquivo("File3.txt");
		FileSystemItem file4 = new Arquivo("File4.txt");
		FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));
		
		folder.print("");
		
		System.out.println("------------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
		fromDisk.print(">");
	}
}
