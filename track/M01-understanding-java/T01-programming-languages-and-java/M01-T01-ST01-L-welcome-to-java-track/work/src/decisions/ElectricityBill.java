package decisions;

public class ElectricityBill {
	
	public static void main(String[] args) {
		
		String name = "Rahul";
		int units = 350;
		int charge = 0;
		int totalBill = 0;
		if(units >= 0 && units <= 100) {
			charge = 2;
		}else if(units >= 101 && units <= 200) {
			charge = 3;
			
		}else if(units >= 201 && units <= 300) {
			charge = 5;
		}else {
			charge = 7;
		}
		
		totalBill = units * charge;
		
		System.out.println("Customer name: "+ name);
		System.out.println("Units consumed: " + units);
		System.out.println("Electricity bill: " + charge);
		System.out.println("Total bill: "+ totalBill);
	}

}
