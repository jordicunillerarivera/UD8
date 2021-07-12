package ud8_02;

public class Password {
	
	// Atributos
	
	private int longitud;
	private String contraseña;
	
	// Constante
	final private String key = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	// Constructor
	
		// Constructor vacio
	public Password() {
		this.longitud = 8;
		
		this.contraseña = generador(key, this.longitud);
		
	}
	
		// Constructor completo
	public Password(int longitud) {
		this.longitud = longitud;
		
		this.contraseña = generador(key, this.longitud);
		
	}

	// Metodos
	
		// Metodo para generar una contraseña aleatoria
	private static String generador(String key, int longitud) {
		String pswd = "";
 
		for (int i = 0; i < longitud; i++) {
			pswd+=(key.charAt((int)(Math.random() * key.length())));
		}
 
		return pswd;
	}
	
	// Getters & Setters
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

}
