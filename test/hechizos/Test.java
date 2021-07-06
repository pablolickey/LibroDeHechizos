package hechizos;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSePuedaAgregarUnHechizo() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expeliarmus("expeliarmus");
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expeliarmus"));
	}

	@org.junit.Test
	public void verSiUnAnimalEsHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expeliarmus("expeliarmus");
		Hechizable perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizoBuscado = libro.buscar("expeliarmus");
		hechizoBuscado.aplicarHechizo(perro);
		assertEquals("Me desarmaron",perro.getEstado());
	}
	
	@org.junit.Test
	public void verSiUnMuebleCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("engorgio");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizoBuscado = libro.buscar("engorgio");
		hechizoBuscado.aplicarHechizo(mesa);
		assertEquals("Me agrandaron",mesa.getEstado());
	}
	
}
