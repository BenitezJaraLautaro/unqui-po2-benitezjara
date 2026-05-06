package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado{
	private LocalDate fechaFinDesignacionPlantaPermanente;
	private int cantidadHorasExtra;
	private double valorPorHoraExtra = 40;
	private int retencionPorHoraExtra = 5;
	


	public EmpleadoPlantaTemporaria(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico, LocalDate fechaFinDesignacionPlantaPermanente, int cantidadHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.cantidadHorasExtra = cantidadHorasExtra;
		this.fechaFinDesignacionPlantaPermanente = fechaFinDesignacionPlantaPermanente;
	}
	
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
	
	public double getValorPorHoraExtra() {
		return this.valorPorHoraExtra;
	}
	
	public double getRetencionPorHoraExtra() {
		return this.retencionPorHoraExtra;
	}
	
	public double getTotalRetenidoHorasExtra() {
		return this.getCantidadHorasExtra() * this.getRetencionPorHoraExtra();
	}


	@Override
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.totalPorHorasExtra();
	}
	
	public double totalPorHorasExtra() {
		return this.getCantidadHorasExtra() * this.getValorPorHoraExtra();
	}
	
	@Override
	public double getObraSocial() {
		return super.getObraSocial() + this.retencionSiSuperaLos50Anios();
	}
	
	public int retencionSiSuperaLos50Anios() {
		if (this.getEdad() > 50) {
			return 25;
		} else {
			return 0;
		}
	}
	
	@Override
	public double porcentajeRetenidoAporteJubilatorio() {
		return 10;
	}
	
	@Override
	public double aporteJubilatorios() {
		return super.aporteJubilatorios() + this.getTotalRetenidoHorasExtra();
	}
	
	@Override
	public String desgloceConceptos() {
		return "Sueldo Bruto: Sueldo Basico " + this.getSueldoBasico() + 
				"\nHoras extra: " + this.totalPorHorasExtra() +
				"\nTotal: " + this.sueldoBruto() +
				"\nRetenciones Aplicadas: Obra Social " + this.getObraSocial() + 
				"\nAporte Jubilatorios: " + this.aporteJubilatorios();
	}
	

}
