package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {


	private int cantidadHijos;
	private static final double valorAsignacionPorHijo = 150;
	private static final double retencionPorHijoObraSocial = 20;
	private int antiguedad;
	private static final double valorPorAnioAntiguedad = 50;
	
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, double sueldoBasico,
			int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad = antiguedad;
	}

	public double getValorPorAnioAntiguedad() {
		return valorPorAnioAntiguedad;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public double getValorAsignacionPorHijo() {
		return valorAsignacionPorHijo;
	}

	public double getRetencionPorHijoObraSocial() {
		return retencionPorHijoObraSocial;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.getSalarioFamiliar();
	}
	
	public double getSalarioFamiliar() {
		return this.asignacionPorHijos() + this.asignacionPorConyuge() + this.valorTotalAntiguedad();
	}
	
	public double asignacionPorHijos() {
		return this.getValorAsignacionPorHijo()*this.getCantidadHijos();
	}
	
	public double asignacionPorConyuge() {
		if ("casado".equals(this.getEstadoCivil()) ||"casada".equals(this.getEstadoCivil())) {
			return 100;
		} else {
			return 0;
		}
	}
	
	public double valorTotalAntiguedad() {
		return this.getValorPorAnioAntiguedad()*this.getAntiguedad();
	}
	
	@Override
	public double getObraSocial() {
		return super.getObraSocial() + this.retencionTotalPorHijo();
	}
	
	public double retencionTotalPorHijo() {
		return this.getCantidadHijos()*this.getRetencionPorHijoObraSocial();
	}
	
	
	@Override
	public String desgloceConceptos() {
		return "Sueldo Bruto: Sueldo Basico " + this.getSueldoBasico() +
				"\nAsignacion por hijo " + this.asignacionPorHijos() +
				"\nAsignacion por conguye " + this.asignacionPorConyuge() +
				"\nAntiguedad " + this.valorTotalAntiguedad() +
				"\nTotal: " + this.sueldoBruto() +
				"\nRetenciones aplicadas: Obra Social " + this.getObraSocial() +
				"\nAporte jubilatorio " + this.aporteJubilatorios();
				
	}
	

}
