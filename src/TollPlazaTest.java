
public class TollPlazaTest {

	public static void main(String[] args) {
		Truck ford=new Ford(5,12500,"ford");
		Truck nissan=new Nissan(2,5000,"nissan");
		Truck daewoo=new Daewoo(6,1700,"daewoo");
		TollPlaza tpz=new ORRTollPlaza();
		tpz.calculate_bill(ford);
		tpz.calculate_bill(nissan);
		tpz.calculate_bill(daewoo);
		((ORRTollPlaza)tpz).display();
		tpz.clear_Screen();
		

	}

}
