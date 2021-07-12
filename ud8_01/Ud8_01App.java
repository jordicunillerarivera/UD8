package ud8_01;

public class Ud8_01App {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Jordi", 20, 'H');
		Persona persona3 = new Persona("Sara", 22, "9999999F", 'M', 58, 60);
		
		System.out.println(persona2.getNombre());
		System.out.println(persona3.getNombre());
		
		persona1.setNombre("Antonio");
		System.out.println(persona1.getNombre());

	}

}
