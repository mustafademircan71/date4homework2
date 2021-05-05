package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
		public CustomerCheckService customerCheckService;
		
		public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService=customerCheckService;
		}
		
	
		@Override
		public void save(Customer customer) {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println("M��teri Bilgileri Do�ruland�");
				super.save(customer);
			}else {
				System.out.println("M��teri Bilgileri Do�rulanamad�");
			}
		}

		
}
