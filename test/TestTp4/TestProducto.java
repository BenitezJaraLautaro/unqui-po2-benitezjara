package TestTp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.Producto;

class TestProducto {
	private Producto arroz;
	private Producto vino;

	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}

	@Test
	public void testContructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.getPrecio());
		assertTrue(arroz.isPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55, vino.getPrecio());
		assertFalse(vino.isPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrecio());
	}

}
