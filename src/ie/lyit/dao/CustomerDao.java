package ie.lyit.dao;

import java.util.List;

import ie.lyit.hotel.Customer;

public interface CustomerDao {
	
	
	/**
	 * @author Berkan
	 * 
	 * Data Access Object Interface 
	 * This interface defines the standard operations to be performed on a model object(s).
	 * 
	 * @return
	 */

	public List<Customer> getAllCustomers();
	public Customer getCustomer(int custnr);
	public void updateCustomer(Customer cust);
	public void deleteCustomer(Customer cust);
	
}
