package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.Date;
import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Name;

public class EmployeeTester {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees  = new ArrayList<Employee>();
	
		
		Employee emp1 = new Employee("Mr", "Nico", "Konopke", "Germany", "Bremen",
				"Waynestreet", 21, 5444642, 11, 2, 1993, 15, 8, 2015, 50);
		Employee emp2 = new Employee("Mr", "Christian", "Albers", "Germany", "Bremen", 
				"NoOneCared", 78, 7664642, 25, 6, 1996, 14, 9, 2016, 1);
		Employee emp3 = new Employee("Mr", "Berkan", "Bulut", "Germany", "Bremen", 
				"TotallyHeaven", 78, 7664642, 22, 7, 1991, 3, 9, 2016, 90000);
		Employee emp4 = new Employee("Mr", "Dennis", "Ehrenberg", "Germany", "Bremen", 
				"TotallynotHeaven", 78, 7664642, 7, 4, 1995, 14, 9, 2016, 4.50);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);

		for(int i=0; i< employees.size();i++) {
			
			
			System.out.println(employees.get(i).toString());
			
			
		}

	}
	
	public boolean employeeSearch(Employee searchedEmployee, ArrayList<Employee> employees) {
		
		for(Employee employee : employees) {
			
			if(searchedEmployee.equals(employee)) {
				return true;
			}
			
		}
		
		return false;
		
		
		
	}
	

	
}
