package TestTp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad; 
class TestProductoPrimeraNecesidad {
	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad vino;

	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		arroz = new ProductoPrimeraNecesidad("Arroz", 8d, false, 5);
		vino = new ProductoPrimeraNecesidad ("Vino",  8d, false, 50);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		assertEquals(7.6, arroz.getPrecio());
		assertEquals(4, vino.getPrecio());
	}

}
