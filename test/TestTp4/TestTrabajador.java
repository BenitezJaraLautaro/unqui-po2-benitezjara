package TestTp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoHorasExtra;
import ar.edu.unq.po2.tp4.Trabajador;

class TestTrabajador {
	Trabajador t;
	Ingreso i1;
	Ingreso i2;
	IngresoHorasExtra i3;
	
	@BeforeEach
	void setUp() throws Exception {
		t = new Trabajador();
		i1 = new Ingreso("Enero", "Sueldo", 1000);
		i2 = new Ingreso("Febrero", "Bono", 500);
		i3 = new IngresoHorasExtra("Febrero", "Horas extra", 300, 10);
		
		t.agregarIngreso(i1);
		t.agregarIngreso(i2);
		t.agregarIngreso(i3);
	}

	@Test
	public void testTotalPercibido() {
		assertEquals(1800, t.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		assertEquals(1500, t.getMontoImponible());
	}
	@Test
	public void testImpuestoAPagar() {
		assertEquals(30, t.getImpuestoAPagar());
	}

}
