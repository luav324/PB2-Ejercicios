package ar.edu.unlam.dominio;

public class Rectangulo extends Figura {
	
	public Rectangulo(int height, int width) {
		super(height, width);
	}
	
	public int calcularPerimetro() {
		return (2 * this.getHeight() + 2 * this.getWidth());
	}

}
