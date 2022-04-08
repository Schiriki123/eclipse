
public class FirstClass {

	public static void main(String[] args) {
		PKW pkw1 = new PKW("Mercedes", 30, 8.94);
		PKW pkw2 = new PKW("Fiat", 50, 9.2);
		PKW pkw3 = new PKW("BMW", 38, 30.5);
		PKW pkw4 = new PKW("Baum", 500, 3.2);
		
		pkw1.showPKW();
		System.out.println();
		pkw2.showPKW();
		System.out.println();
		pkw3.showPKW();
		System.out.println();
		pkw4.showPKW();
		System.out.println();
		System.out.println("Anzahl: " + PKW.num);
		System.out.println(pkw1.test);
	}

}
