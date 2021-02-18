
public class Daewoo implements Truck {

	int axles;
	 int  weight;
	 String name;
	 	Daewoo(int a,int w,String n)
	 	{
	 		this.axles=a;
	 		this.weight=w;
	 		this.name=n;
	 	}
	 	
	 	@Override
	 	public String get_info() {
	 		return name;
	 	}
		@Override
		public int get_axles() {
			
			return axles;
		}

		@Override
		public int get_weights() {
			
			return weight;
		}
}
