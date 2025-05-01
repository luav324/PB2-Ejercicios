package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Automovil extends MedioDeTransporte  {
	private static final int CANTIDAD_MAXIMA_DE_CIUDADES_A_VIAJAR = 3;
	private static final int PESO_MAXIMO_DE_LA_CARGA_TOTAL = 200;
	private static final int VOLUMEN_MAXIMO_DE_CARGA = 2;
	
	
	public Automovil( ) {
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
	
	
	public boolean añadirCiudad (String ciudad) {
		boolean agregado = false;
		if (this.getCiudadesAViajar().size() < CANTIDAD_MAXIMA_DE_CIUDADES_A_VIAJAR && !this.getCiudadesAViajar().contains(ciudad)) {
			this.getCiudadesAViajar().add(ciudad);
			agregado = true;
		}
		return agregado;
	}

}
