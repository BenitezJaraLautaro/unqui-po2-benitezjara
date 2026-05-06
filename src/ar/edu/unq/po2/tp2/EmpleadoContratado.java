package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	public int numeroDeContrado;
	public String medioDePago;
	private int retencionConstante = 50;

	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, int numeroDeContrado, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroDeContrado = numeroDeContrado;
		this.medioDePago = medioDePago;
		
	}
	
	public int getRetencionConstante() {
		return this.retencionConstante;
	}

	@Override
	public double sueldoBruto() {	
		return this.getSueldoBasico();
	}
		
	@Override
	public String desgloceConceptos() {
		return "Sueldo Bruto: Sueldo basico " + this.sueldoBruto() + 
		"\nRetencion constante por Gastos Administrativos Contractuales " + this.getRetencionConstante();
	}
	
	@Override
	public double retenciones() {
		return super.retenciones() + this.getRetencionConstante();
	}
	

}
