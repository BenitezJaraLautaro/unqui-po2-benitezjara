package ar.edu.unq.po2.tp4;

public class IngresoHorasExtra extends Ingreso{
	private int cantidadHorasExtra;
	
	public IngresoHorasExtra(String mes, String concepto, double monto, int cantidadHorasExtra) {
		super(mes, concepto, monto);
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	

	@Override
	public double getMontoImponibleAlImpuestoAlTrabajador() {
		return 0;
	}

}
