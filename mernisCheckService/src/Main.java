import java.rmi.RemoteException;

import Concrete.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {

		BaseCustomerManager customerManager1 = new NeroCustomerManager();

		customerManager1.save(new Customer(1, "Safa", "Yesilyurt", "2001", "11111111111"));

		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());

		customerManager2.save(new Customer(1, "Safa", "Yesilyurt", "2001", "11111111111"));
	}
}