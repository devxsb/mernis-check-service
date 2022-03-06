package Concrete;

import java.rmi.RemoteException;

import Abstracts.CustomerService;
import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " saved in database.");
	}
}
