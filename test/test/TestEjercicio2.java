package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Ejercicio2;

class TestEjercicio2 {
	Ejercicio2 e = new Ejercicio2();
	int[] t = {2,22};
	
	@Test
	void test() {
		
		assertEquals(22, e.elMayorNumeroConDigitosPares(t));
	}

}
