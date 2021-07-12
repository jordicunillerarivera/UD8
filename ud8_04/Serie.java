package ud8_04;

public class Serie {
	
	// Atributos
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constantes
	final private int cNumTemporadas = 3;
	final private boolean cEntregado = false;
	
	// Constructores
	
		// Constructor vacio
	public Serie() {
		this.titulo = "";
		this.numTemporadas = cNumTemporadas;
		this.entregado = cEntregado;
		this.genero = "";
		this.creador = "";
	}
	
		// Constructor minimo
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = cNumTemporadas;
		this.entregado = cEntregado;
		this.genero = "";
		this.creador = creador;
	}
	
		// Constructor completo
	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
		// Metodo para ver por pantalla los atributos del objeto
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	// Setters & Getters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
}
