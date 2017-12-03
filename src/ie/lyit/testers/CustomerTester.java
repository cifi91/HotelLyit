package ie.lyit.testers;

import ie.lyit.hotel.Customer;

public class CustomerTester {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Mr", "Nico", "Konopke", "Germany", "Bremen",
				"DontKnow", 21, "testetst@test.de", 5444642, 0);
		Customer cust2 = new Customer("Mr", "Christian", "Albers", "Germany", "Bremen", 
				"DontKnow2", 78, "blabla@bla.de" , 7664642, 0);
		
		System.out.println("cust1: ");
		System.out.println(cust1.toString());
		
		System.out.println("cust2: ");
		System.out.println(cust2.toString());
		
		System.out.println(cust1.equals(cust2));
	}

}
