package ud8_04;

public class Ud8_04App {

	public static void main(String[] args) {
		
		Serie s1 = new Serie();
		Serie s2 = new Serie("hola", "Jose");
		Serie s3 = new Serie("pepe", 4, true, "Accion", "Antonio");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
