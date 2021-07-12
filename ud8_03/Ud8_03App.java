package ud8_03;

public class Ud8_03App {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(150, 60);
		Electrodomestico e3 = new Electrodomestico(50, "Gris", 'B', 20);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	}

}
