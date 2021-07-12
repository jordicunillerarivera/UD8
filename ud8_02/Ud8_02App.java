package ud8_02;

public class Ud8_02App {

	public static void main(String[] args) {

		Password pswd1 = new Password();
		Password pswd2 = new Password(16);
		
		System.out.println(pswd1.getContraseña());
		System.out.println(pswd2.getContraseña());

	}

}
