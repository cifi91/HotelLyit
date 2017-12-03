package ie.lyit.dao;

import ie.lyit.hotel.Customer;
import ie.lyit.hotel.Name;

public class DaoPatternDemo {

	public static void main(String[] args) {
		
		CustomerDao custDao = new CustomerDaoImpl();
		
		
		//print customers
		
		for(Customer cust : custDao.getAllCustomers()) {
			
			System.out.println("Customer: [CustommerNumber + " + cust.getNumber() + ", Name : " + cust.getName() + " ]");
			
		}
		
		
		// update customer
		
		Customer cust = custDao.getAllCustomers().get(0);
		cust.setName(new Name("Mr","Miachel","Schmidt"));
		custDao.updateCustomer(cust);

		//get customer
		custDao.getCustomer(0);
		System.out.println("Customer: [CustommerNumber + " + cust.getNumber() + ", Name : " + cust.getName() + " ]");
		
	}

}
