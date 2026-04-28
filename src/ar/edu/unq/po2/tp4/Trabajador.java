package ar.edu.unq.po2.tp4;
import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos;
	
	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso ingreso: this.ingresos) {
			total += ingreso.getMonto();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		for (Ingreso ingreso: this.ingresos) {
			total += ingreso.getMontoImponibleAlImpuestoAlTrabajador();

		}
		return total;
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 2 / 100;
	}
	
	public Trabajador() {
		super();
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public void agregarIngreso(Ingreso i) {
		this.ingresos.add(i);
	}
}
