package ie.lyit.dao;

import java.util.List;

import ie.lyit.hotel.Customer;

public interface CustomerDao {

	public List<Customer> getAllCustomers();
	public Customer getCustomer(int custnr);
	public void updateCustomer(Customer cust);
	public void deleteCustomer(Customer cust);
	
}
