package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer engin = new IndividualCustomer();
		engin.id=1;
		engin.customerNumber="5234234";
		
		CorporateCustomer fako = new CorporateCustomer();
		
		fako.companyName="fakosoft";
		fako.customerNumber="23423";
		
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add(engin);
		
		IndividualCustomer customer = new IndividualCustomer();
		customer.customerNumber="143";
		
		Customer [] customers = {fako,engin,customer};
		
		customerManager.addMultiple(customers);
		
	}

}
