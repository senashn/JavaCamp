package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer sena = new IndividualCustomer();
		sena.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber  ="6789";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.Add(hepsiBurada);
		//customerManager.Add(sena);
		
		Customer[] customers = {sena, hepsiBurada};		
		
		
		customerManager.addMultiple(null);

	}

}
