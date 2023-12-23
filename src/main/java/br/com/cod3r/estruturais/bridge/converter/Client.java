package br.com.cod3r.estruturais.bridge.converter;

import br.com.cod3r.estruturais.bridge.converter.converters.CSVConverter;
import br.com.cod3r.estruturais.bridge.converter.converters.Converter;
import br.com.cod3r.estruturais.bridge.converter.converters.JsonConverter;
import br.com.cod3r.estruturais.bridge.converter.employees.ITGuy;
import br.com.cod3r.estruturais.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {

		ITGuy itGuy =  new ITGuy("Pedro", 18, 1000d);
		Converter csvConverterItGuy = new CSVConverter();
		String itGuyCsv = csvConverterItGuy.getEmployeeFormated(itGuy);
		System.out.println(itGuyCsv);

		Converter jsonConverterItGuy = new JsonConverter();
		String itGuyJson = jsonConverterItGuy.getEmployeeFormated(itGuy);
		System.out.println(itGuyJson);

		ProjectManager projectManager = new ProjectManager("Carlos", 42, 1000d);
		CSVConverter csvConverterManager = new CSVConverter();
		String managerCsv = csvConverterManager.getEmployeeFormated(projectManager);
		System.out.println(managerCsv);

		JsonConverter jsonConverterManager = new JsonConverter();
		String managerJson = jsonConverterManager.getEmployeeFormated(projectManager);
		System.out.println(managerJson);
	}
}
