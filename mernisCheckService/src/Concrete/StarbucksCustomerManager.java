package Concrete;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if (this.checkService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			System.out.println("invalid person");
		}
	}
}
