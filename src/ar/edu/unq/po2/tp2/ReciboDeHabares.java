package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class ReciboDeHabares {
	private String nombreEmpleado;
	private String direccionEmpleado;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String desgloceConceptos;
	
	public ReciboDeHabares(Empleado e, LocalDate fechaEmision) {
		this.nombreEmpleado = e.getNombre();
		this.direccionEmpleado = e.getDireccion();
		this.sueldoBruto    = e.sueldoBruto();
		this.sueldoNeto     = e.sueldoNeto();
		this.fechaEmision   = fechaEmision;
		this.desgloceConceptos = e.desgloceConceptos();
	}
	
}
