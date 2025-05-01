package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class MedioDeTransporte {
	
	
	
	private double carga = 0;
	private double VolumenDeCarga = 0;
	
	private String destino = "";
	private ArrayList<String> ciudadesAViajar = new ArrayList();
	private ArrayList<Paquete> paquetes = new ArrayList();
	public MedioDeTransporte( ) {
		super();
		
		
	
	}
	
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	public double getVolumenDeCarga() {
		return VolumenDeCarga;
	}

	public void setVolumenDeCarga(double volumenDeCarga) {
		VolumenDeCarga = volumenDeCarga;
	}
	public ArrayList<String> getCiudadesAViajar() {
		return ciudadesAViajar;
	}
	public void setCiudadesAViajar(ArrayList<String> ciudadesAViajar) {
		this.ciudadesAViajar = ciudadesAViajar;
	}
	public ArrayList<Paquete> getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(ArrayList<Paquete> paquetes) {
		this.paquetes = paquetes;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
	
	
	

}
