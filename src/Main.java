
import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;

import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"Mustafa","Demircan",new GregorianCalendar(1994,5,30).getTime(),"11111111111");
		
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		starbucksCustomerManager.save(customer);
		
	
	}

}
