package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaNacimiento;
	private double sueldoBasico; 
	private double porcentajeRetenidoObraSocial = 10;
	
	
	public String getNombre() {
		return nombre;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public double getPorcentajeRetenidoObraSocial() {
		return porcentajeRetenidoObraSocial;
	}
	

	public int getEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }
	
	public abstract double sueldoBruto();

    public double retenciones() {
        return this.obraSocial() + this.aporteJubilatorios();
    }
    
    public double sueldoNeto() {
        return sueldoBruto() - retenciones();
    }
    
    public double obraSocial() {
        return this.elPorcientoDe(this.porcentajeRetenidoObraSocial, this.sueldoBruto());
    }
    
    public double aporteJubilatorios() {
        return this.elPorcientoDe(
            this.porcentajeRetenidoAporteJubilatorio(),
            this.sueldoBruto()
        );
    }

    public double porcentajeRetenidoAporteJubilatorio() {
        return 15;
    }

    public double elPorcientoDe(double porciento, double numero) {
        return (numero * porciento) / 100;
    }

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
    
    
}
