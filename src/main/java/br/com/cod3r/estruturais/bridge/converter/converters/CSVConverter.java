package br.com.cod3r.estruturais.bridge.converter.converters;


import br.com.cod3r.estruturais.bridge.converter.employees.Employee;

public class CSVConverter implements  Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		return String.format("%s;%d;%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
