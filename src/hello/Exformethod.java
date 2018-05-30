package hello;

class Basiccarr {
	int passengers;
	int fuelcap;
	int mpg;


void range1() {
	System.out.println("minicar carry>>>>>>" + fuelcap * mpg);

} // range1 is method contained within the Exformethos class
}

class Exformethod {
	public static void main(String[] args) {
		Basiccarr minicar = new Basiccarr();
		minicar.fuelcap = 17;
		minicar.mpg     = 21;
		int range;
		minicar.range1();
		range = minicar.fuelcap + minicar.mpg;
		System.out.println("minicar carry" + range);

	}

}
