package prj_Vehicle;

public class MainClass {

	public static void main(String[] args) {

		PKW pkw1 = new PKW("Audi", 230, 21.3);
		PKW pkw2 = new PKW("Mercedes", 132, 12.5);
		PKW pkw3 = new PKW("BMW", 198, 13.7);
		
		pkw1.showPKW();
		pkw2.showPKW();
		pkw3.showPKW();
		
	}

}
