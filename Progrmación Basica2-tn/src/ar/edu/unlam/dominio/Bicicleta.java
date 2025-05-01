package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Bicicleta extends MedioDeTransporte {
	
	private static final double VOLUMEN_MAXIMO_DEL_PAQUETE = 0.125;
	private static final int CARGA_MAXIMA = 15;
	private static final int CANTIDAD_MAXIMA_PAQUETES = 2;
	
	public Bicicleta( ) {
		super( );
		
	}
	public boolean añadirPaquete(Paquete paquete) {
	boolean añadido = false;
	if(this.getPaquetes().size() < CANTIDAD_MAXIMA_PAQUETES && paquete.calcularVolumen() < VOLUMEN_MAXIMO_DEL_PAQUETE
			&& (this.getCarga() + paquete.getPeso() ) < CARGA_MAXIMA ) {
		añadido = true;
		this.getPaquetes().add(paquete);
		this.setCarga(this.getCarga() + paquete.getPeso());
		if (this.getDestino().isBlank() ) {
			this.setDestino(paquete.getDestino());
		}
	}
	return añadido;
		
	}
	
	public void elegirDestino (String destino) {
		this.setDestino(destino);
	}
	public boolean añadirCiudad (String ciudad) {
		boolean añadido = false;
		if (this.getCiudadesAViajar().size() < 1) {
			añadido = true;
			this.getCiudadesAViajar().add(ciudad);
		}
		return añadido;
	}
	
	

}
