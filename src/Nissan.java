
public class Nissan implements Truck {

	int axles;
	 int  weight;
	 String name;
	 	Nissan(int a,int w,String n)
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
			// TODO Auto-generated method stub
			return axles;
		}

		@Override
		public int get_weights() {
			// TODO Auto-generated method stub
			return weight;
		}

}
