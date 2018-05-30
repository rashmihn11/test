package hello;

 class Basiccar {
	int passengers;
	int fuelcap;
	int mpg;
 }
 
 class Vehicle{
	public static void main(String[] args) {
		Basiccar minicar = new Basiccar();
		minicar.fuelcap = 17;
		minicar.mpg     = 21;
		int range;
		range = minicar.fuelcap + minicar.mpg;
		System.out.println("minicar carry" + range);
		// TODO Auto-generated method stub

	}

 }
