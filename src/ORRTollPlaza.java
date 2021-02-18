
public class ORRTollPlaza implements TollPlaza {
	int total_trucks;
	int total_bill;
	 String name;
	@Override
	public void calculate_bill(Truck truck) {
		int weight_money=0;
		int no_of_axles=truck.get_axles();
		int weight_noted=truck.get_weights();
		name=truck.get_info();
		weight_money=(5*no_of_axles)+10*(weight_noted/1000);
		total_bill=total_bill+weight_money;
		total_trucks++;
		System.out.println("-------TRUCK INFO--------");
		System.out.println("Truck entered type: "+name+" Axles: "+no_of_axles+"  weight of truck: "+weight_noted);
		System.out.println("Tollprice/Amount to be paid by "+name+" :"+weight_money);
		
	}

	@Override
	public void clear_Screen() {
		total_trucks=0;
		total_bill=0;
		System.out.println("----------After clearence of screen--------");
		System.out.println("Trucks tagged/charged: "+total_trucks);
		System.out.println("Amount collected by bills: "+total_bill);
	}
	
	public void display() {
		System.out.println("----------Collecting bills-----------");
		System.out.println("Trucks tagged/charged: "+total_trucks);
		System.out.println("Amount collected by bills: $"+total_bill);
	}
}
