package ie.lyit.dao;

import java.util.ArrayList;
import java.util.List;

import ie.lyit.hotel.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	
	/**
	 * @author Berkan
	 * 
	 * Data Access Object concrete class 
	 * This class implements above interface. 
	 * This class is responsible to get data from a data source which can be database, 
	 * xml or any other storage mechanism.
	 * 
	 * 
	 */
	
	List<Customer> customer;
	
	public CustomerDaoImpl() {
		
		customer = new ArrayList<Customer>();
		Customer cust1 = new Customer("Mr", "Nico", "Konopke", "Germany", "Bremen",
				"DontKnow", 21, "testetst@test.de", 5444642, 0);
		Customer cust2 = new Customer("Mr", "Christian", "Albers", "Germany", "Bremen", 
				"DontKnow2", 78, "blabla@bla.de" , 7664642, 0);
		
		customer.add(cust1);
		customer.add(cust2);
		
	}
	

	@Override
	public List<Customer> getAllCustomers() {
		
			return customer;
	}

	@Override
	public Customer getCustomer(int custnr) {

		return customer.get(custnr);
		
	}

	@Override
	public void updateCustomer(Customer cust) {
		customer.get(cust.getNumber()).setName((cust.getName()));
	      System.out.println("Customer: Number " + cust.getNumber() + ", updated in the database");
		
	}

	@Override
	public void deleteCustomer(Customer cust) {
		customer.remove(cust.getNumber());
	      System.out.println("Customer: Number " + cust.getNumber() + ", deleted from database");
		
	}

}
