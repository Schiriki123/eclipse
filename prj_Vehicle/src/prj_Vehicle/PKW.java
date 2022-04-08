package prj_Vehicle;

public class PKW extends Land {
	String brand;
	int kilowatt;
	double wheel;
	PKW(String pBrand, int pKiloWatt, double pWheel){
		this.brand = pBrand;
		this.kilowatt = pKiloWatt;
		this.wheel = pWheel;
		counter++;
	}
	
	void showPKW() {
		System.out.println("Brand: " + brand);
		System.out.println("Kilowatt: " + kilowatt);
		System.out.println("Wheel: " + wheel);
		System.out.println();
	}
	


}
