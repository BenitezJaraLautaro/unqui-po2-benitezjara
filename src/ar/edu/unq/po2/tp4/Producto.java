package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean precioCuidado = false;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		
	}
	
	public boolean isPrecioCuidado() {
		return precioCuidado;
	}
	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
	public Producto(String nombre, double precio) {/*Crea una instancia donde precioCuidado es false*/
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.getPrecio() + aumento);
	}
	
	
}
