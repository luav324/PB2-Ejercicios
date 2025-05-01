package ar.edu.unlam.dominio;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class MedioDeTransporteTest {
	private Bicicleta bicicleta;
	private Automovil automovil;
	private Camion camion;
	private Paquete paquete;
	
	@Before
	public void init() {
		
		this.bicicleta = new Bicicleta();
		this.automovil = new Automovil();
		this.camion = new Camion();
	}
	
	@Test
	public void EnBicicletaSeAñadeUnPaqueteEsperandoUnPositivo() {
		
		this.paquete = new Paquete(0.2,0.3,0.2, 2,"");
		
		
		
		boolean paqueteAgregado = bicicleta.añadirPaquete(paquete);
		
		/
		assertTrue(paqueteAgregado);
	}
	
	@Test
	public void EnBicicletaSeAñadeUnPaqueteQueSobrapasaElVolumenDelPaqueteMaximo() {
		
		this.paquete = new Paquete(4,5,2, 2,"");
		
		
		boolean paqueteAgregado = bicicleta.añadirPaquete(paquete);
		
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnBicicletaSeAñadeUnPaqueteQueSobrapasaElPesoMaximo() {
		
		this.paquete = new Paquete(0.2,0.3,0.2,30,"");
		
		
		boolean paqueteAgregado = bicicleta.añadirPaquete(paquete);
		
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnBicicletaSeAñaden3PaquetesElUltimoDandoNegativo() {
		
		this.paquete = new Paquete(0.2,0.3,0.2,1,"");
		
		
		
		boolean paqueteAgregado1 = bicicleta.añadirPaquete(paquete);
		boolean paqueteAgregado2 = bicicleta.añadirPaquete(paquete);
		boolean paqueteAgregado3 = bicicleta.añadirPaquete(paquete);
		
		
		assertTrue(paqueteAgregado1);
		assertTrue(paqueteAgregado2);
		assertFalse(paqueteAgregado3);
	}
	
	@Test
	public void EnBicicletaSeAñadeUnDestino() {
		
		String destino = "San Justo";		
		
		
		bicicleta.elegirDestino(destino);
		
		
		assertEquals("San Justo", bicicleta.getDestino());
	}
	
	@Test
	public void EnBicicletaSeAñadeUnPaqueteConDestinoQueSobreEscribeElDestinoDeBicicleta() {
		
		this.paquete = new Paquete(0.2,0.3,0.2,1,"San Justo");		
		
		
		bicicleta.añadirPaquete(paquete);
		
		
		assertEquals("San Justo", bicicleta.getDestino());
	}
	
	@Test
	public void EnBicicletaSeAñadeUnPaqueteConDestinoQueNoSobreEscribeElDestinoDeBicicleta() {
		
		this.paquete = new Paquete(0.2,0.3,0.2,1,"Moron");
		bicicleta.elegirDestino("San Justo");
		
	
		bicicleta.añadirPaquete(paquete);
		
		
		assertEquals("San Justo", bicicleta.getDestino());
	}
	
	@Test
	public void EnBicicletaSeAñadeUnaCiudadEsperandoUnpositivo() {
		
			
		bicicleta.añadirCiudad("Moron");
		
		assertTrue(bicicleta.getCiudadesAViajar().contains("Moron"));
	}
	@Test
	public void EnBicicletaSeAñadenDosCiudadesElSegundoDandoNegativo() {
		

		bicicleta.añadirCiudad("Moron");
		bicicleta.añadirCiudad("San Justo");
		
		
		assertTrue(bicicleta.getCiudadesAViajar().contains("Moron"));
		assertFalse(bicicleta.getCiudadesAViajar().contains("San Justo"));
	}
	
	@Test
	public void EnAutomovilSeAñadeUnPaqueteEsperandoUnPositivo() {
		
		this.paquete = new Paquete(0.2,0.3,0.2, 2,"");
		
		
		
		boolean paqueteAgregado = automovil.añadirPaquete(paquete);
		
		
		assertTrue(paqueteAgregado);
	}
	
	@Test
	public void EnAutomovilSeAñadeUnPaqueteQueSobrapasaElVolumenDeCargaMaximo() {
		
		this.paquete = new Paquete(4,5,2, 2,"");
		
		
		
		boolean paqueteAgregado = automovil.añadirPaquete(paquete);
		
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnAutomovilSeAñadeUnPaqueteQueSobrapasaElPesoMaximo() {
		
		this.paquete = new Paquete(0.2,0.3,0.2,200,"");
		
		
		
		boolean paqueteAgregado = automovil.añadirPaquete(paquete);
		
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnAutomovilSeAñadeUnaCiudadEsperandoUnpositivo() {
	
		
		automovil.añadirCiudad("Moron");
		
		
		assertTrue(automovil.getCiudadesAViajar().contains("Moron"));
	}
	
	@Test
	public void EnAutomovilSeAñadeUnaCiudadYaRepetidaEsperandoUnnegativo() {
		
		String ciudad = "Moron";
		
			
		automovil.añadirCiudad(ciudad);
		boolean ciudadRepetida = automovil.añadirCiudad(ciudad);
		
		
		assertTrue(automovil.getCiudadesAViajar().contains("Moron"));
		assertFalse(ciudadRepetida);
	}
	
	@Test
	public void EnAutomovilSeAñaden4CiudadesElCuartoDandoNegativo() {
		
		
		
		automovil.añadirCiudad("Moron");
		automovil.añadirCiudad("San Justo");
		automovil.añadirCiudad("Moreno");
		automovil.añadirCiudad("Merlo");
		
		
		assertTrue(automovil.getCiudadesAViajar().contains("Moron"));
		assertTrue(automovil.getCiudadesAViajar().contains("San Justo"));
		assertTrue(automovil.getCiudadesAViajar().contains("Moreno"));
		assertFalse(automovil.getCiudadesAViajar().contains("Merlo"));
	}
	
	@Test
	public void EnCamionSeAñadeUnPaqueteEsperandoUnPositivo() {
		
		this.paquete = new Paquete(3,1,2, 2,"");
		
		
		boolean paqueteAgregado = camion.añadirPaquete(paquete);
		
		
		assertTrue(paqueteAgregado);
	}
	
	@Test
	public void EnCamionSeAñadeUnPaqueteQueSobrapasaElVolumenDeCargaMaximo() {
		
		this.paquete = new Paquete(2,5,3, 15,"");
		
		
		boolean paqueteAgregado = camion.añadirPaquete(paquete);
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnCamionSeAñadeUnPaqueteQueSobrapasaElPesoMaximo() {
		
		this.paquete = new Paquete(2,3,1,16001,"");
		
		
		boolean paqueteAgregado = camion.añadirPaquete(paquete);
		
		
		assertFalse(paqueteAgregado);
	}
	
	@Test
	public void EnCamionSeAñadeUnaCiudadEsperandoUnpositivo() {
		
			
		
		camion.añadirCiudad("Moron");
		
        
		assertTrue(camion.getCiudadesAViajar().contains("Moron"));
	}
	
	


}
