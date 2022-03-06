package Adapters;

import java.rmi.RemoteException;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter {

	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean check = kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				Integer.parseInt(customer.getDateOfBirth()));
		
		return check;
	}
}
