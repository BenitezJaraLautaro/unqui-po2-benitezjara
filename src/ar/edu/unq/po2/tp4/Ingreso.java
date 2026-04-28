package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mes;
	private String concepto;
	private double monto;	
	
	public double getMonto() {
		return monto;
	}

	public double getMontoImponibleAlImpuestoAlTrabajador() {
		return this.getMonto();
	}
	
	public Ingreso(String mes, String concepto, double monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	
}
