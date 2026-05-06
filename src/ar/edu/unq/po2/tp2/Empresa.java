package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList; 
import java.time.LocalDate;

public class Empresa {
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados;
	
	public double montoTotalSueldoNeto() {
		double totalSueldoNeto = 0;
		for (Empleado e: empleados) {
			totalSueldoNeto = totalSueldoNeto + e.sueldoNeto();
		}
		return totalSueldoNeto;
	}
	
	public double montoTotalSueldoBruto() {
		double totalSueldoBruto = 0;
		for (Empleado e: empleados) {
			totalSueldoBruto = totalSueldoBruto + e.sueldoBruto();
		}
		return totalSueldoBruto;
	}
	
	public double montoTotalRetenciones() {
		double totalRetenciones = 0;
		for (Empleado e: empleados) {
			totalRetenciones = totalRetenciones + e.retenciones();
		}
		return totalRetenciones;
	}
	
	public void liquidacionSueldos(LocalDate fecha) {
		for(Empleado e: empleados) {
			e.generarRecibo(fecha);;
		}
	}
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
	}
	
}
