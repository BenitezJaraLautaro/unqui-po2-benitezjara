package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Ejercicio3;

class Ejercicio3Test {
	Ejercicio3 e = new Ejercicio3();
	@Test
	void elNumeroMultiploDe3y9Entre0Y1Es999() {
		assertEquals(999, e.numeroMasAlto(3, 9));
	}

}
