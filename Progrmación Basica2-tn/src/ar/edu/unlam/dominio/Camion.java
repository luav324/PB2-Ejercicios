package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Camion extends MedioDeTransporte {
	
	
	private static final int PESO_MAXIMO_DE_LA_CARGA_TOTAL = 16000;
	private static final int VOLUMEN_MAXIMO_DE_CARGA = 20;

	public Camion( ) {
		super( );
		
	}
	public boolean añadirPaquete(Paquete paquete) {
		boolean agregado = false;
		if( paquete.calcularVolumen() + this.getVolumenDeCarga() < VOLUMEN_MAXIMO_DE_CARGA  &&
				(this.getCarga() + paquete.getPeso() ) < PESO_MAXIMO_DE_LA_CARGA_TOTAL) {
		agregado = true;
		this.getPaquetes().add(paquete);
		this.setCarga(paquete.getPeso() + this.getCarga());
		this.setVolumenDeCarga(paquete.calcularVolumen() + this.getVolumenDeCarga());
		
		}
		return agregado;
		
	}
	
	public void añadirCiudad (String ciudad) {
			this.getCiudadesAViajar().add(ciudad);
	}

}
