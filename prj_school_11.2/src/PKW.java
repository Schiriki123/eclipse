
public class PKW extends Vehicle {
	private String brand;
	private int kw;
	private double wheel;
	static int num = 0;
	
	public PKW(String pBrand, int pKw, double pWheel) {
		this.brand = pBrand;
		this.kw = pKw;
		this.wheel = pWheel;
		num ++;
	}
	
	public void showPKW() {
		System.out.println("Brand: " + brand);
		System.out.println("Kilowatt: " + kw);
		System.out.println("Wheel: " + wheel);
	}
	

}
