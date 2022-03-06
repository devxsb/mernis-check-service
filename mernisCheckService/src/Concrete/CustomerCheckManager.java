package Concrete;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		return new MernisServiceAdapter().checkIfRealPerson(customer);
	}
}
