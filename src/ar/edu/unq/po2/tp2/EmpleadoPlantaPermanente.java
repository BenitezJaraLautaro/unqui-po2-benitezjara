package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPermanente extends Empleado {
	private double cantidadHijos;
	private double valorAsignacionPorHijo = 150;
	private double valorPorHijoObraSocial = 20;
	private double antiguedad;
	private double valorPorAnioAntiguedad = 50;
	

	public double getValorPorAnioAntiguedad() {
		return valorPorAnioAntiguedad;
	}

	public void setValorPorAnioAntiguedad(double valorPorAnioAntiguedad) {
		this.valorPorAnioAntiguedad = valorPorAnioAntiguedad;
	}

	public double getCantidadHijos() {
		return cantidadHijos;
	}

	public double getValorAsignacionPorHijo() {
		return valorAsignacionPorHijo;
	}

	public double getValorPorHijoObraSocial() {
		return valorPorHijoObraSocial;
	}

	public double getAntiguedad() {
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
		if (this.getEstadoCivil() == "casado" || this.getEstadoCivil() == "casada") {
			return 150;
		} else {
			return 0;
		}
	}
	
	public double valorTotalAntiguedad() {
		return this.getValorPorAnioAntiguedad()*this.getAntiguedad();
	}
	@Override
	public double obraSocial() {
		return super.obraSocial() + this.valorTotalPorHijo();
	}
	
	public double valorTotalPorHijo() {
		return this.getCantidadHijos()*this.getValorPorHijoObraSocial();
	}

}
