package Concrete;

import Abstract.BaseCustomerManager;
import Entity.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public  void save(Customer customer) {
		System.out.println("Saved to db: "+customer.getFirstName());
	}
		
}
