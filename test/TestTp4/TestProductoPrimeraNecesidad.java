package TestTp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad; 
class TestProductoPrimeraNecesidad {
	private ProductoPrimeraNecesidad leche;

	@BeforeEach
	public void setUpBeforeClass() throws Exception {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}

}
