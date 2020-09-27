package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private static final CustomerService instance = new CustomerService();

	private Map<String, Customer> customers;

	private CustomerService() {
		customers = new HashMap<String, Customer>();

		addCustomer(new Customer("id001", "alice", "alice.hansung.ac.kr", "1", "2"));
		addCustomer(new Customer("id002", "bob", "bob.hansung.ac.kr", "1", "2"));
		addCustomer(new Customer("id003", "charile", "charile.hansung.ac.kr", "1", "2"));
		addCustomer(new Customer("id004", "daniel", "daniel.hansung.ac.kr", "1", "2"));
		addCustomer(new Customer("id005", "trudy", "trudy.hansung.ac.kr", "1", "2"));
	}

	public static CustomerService getInstance() {
		return instance;
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
		customers.put(customer.getPassword(), customer);
		customers.put(customer.getName(), customer);
		customers.put(customer.getGender(), customer);
		customers.put(customer.getEmail(), customer);

	}

	public Customer findCustomer(String id) {
		if (id != null)
			return (customers.get(id.toLowerCase()));
		else
			return null;
	}

	public Customer login(String id, String password) {
		Customer customer = findCustomer(id);

		if (customer != null) {
			if (password.equals(customer.getPassword())) {
				System.out.println("login success");
				return customer;
			}

			else {
				System.out.println("login failed");
				return null;
			}
		}
		return null;
	}

	public List<Customer> getAllCustomers() {

		List<Customer> customerList = new ArrayList<Customer>(customers.values());

		return customerList;
	}
}
