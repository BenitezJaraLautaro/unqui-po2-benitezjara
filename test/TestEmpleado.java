import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.Empleado;
import ar.edu.unq.po2.tp2.EmpleadoPlantaPermanente;

class TestEmpleado {
	Empleado e1;
	Empleado e2;
	Empleado e3;

	@BeforeEach
	void setUp() throws Exception {
		e1 = new EmpleadoPlantaPermanente("Lautaro", "marconi", "soltero", LocalDate.of(2004, 6, 7), 1000, 2, 3);
		e3 = new EmpleadoPlantaPermanente("jose", "Brasil", "casado", LocalDate.of(2004, 6, 7), 1000, 2, 3);
	}

	@Test
	void empleadoPermanenteSueldoBrutoyNeto() {
		assertEquals(1450,e1.sueldoBruto());
		assertEquals(1047.5,e1.sueldoNeto());
	}
	@Test
	void empleadoPermanenteCasado() {
		assertEquals(1550,e3.sueldoBruto());
	}

}
