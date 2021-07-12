package ud8_03;

public class Electrodomestico {
	
	// Atributos
	
	protected double precioBase;
	protected String color;
	protected char consumoElectrico;
	protected int peso;
	
	// Constantes
	
	final private double cPrecioBase = 100;
	final private String cColor = "Blanco";
	final private char cConsumoElectrico = 'F';
	final private int cPeso = 5;
	
	// Constructores
	
	public Electrodomestico() {
		this.precioBase = cPrecioBase;
		this.color = cColor;
		this.consumoElectrico = cConsumoElectrico;
		this.peso = cPeso;
	}

	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = cColor;
		this.consumoElectrico = cConsumoElectrico;
	}

	public Electrodomestico(double precioBase, String color, char consumoElectrico, int peso) {
		this.precioBase = precioBase;
		this.color = comprovarColor(color);
		this.consumoElectrico = comprovarLetra(consumoElectrico);
		this.peso = peso;
	}
	
	// Metodo
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoElectrico="
				+ consumoElectrico + ", peso=" + peso + "]";
	}
	
	public static String comprovarColor(String color) {
		
		color = color.toLowerCase();
		String colorFinal;
		
		switch (color) {
			case "blanco":
				colorFinal = "Blanco";
				break;
			case "negro":
				colorFinal = "Negro";
				break;
			case "rojo":
				colorFinal = "Rojo";
				break;
			case "azul":
				colorFinal = "Azul";
				break;
			case "gris":
				colorFinal = "Gris";
				break;
	
			default:
				colorFinal = "Blanco";
				break;
		}
		
		return colorFinal;
		
	}

	public static char comprovarLetra(char consumoElectrico) {
		
		char letra;
		
		switch (consumoElectrico) {
			case 'A':
				letra = 'A';
				break;
			case 'B':
				letra = 'B';
				break;
			case 'C':
				letra = 'C';
				break;
			case 'D':
				letra = 'D';
				break;
			case 'E':
				letra = 'E';
				break;
			case 'F':
				letra = 'F';
				break;
	
			default:
				letra = 'F';
				break;
		}
		
		return letra;
		
	}
	
	// Setters & Getters
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoElectrico() {
		return consumoElectrico;
	}

	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
