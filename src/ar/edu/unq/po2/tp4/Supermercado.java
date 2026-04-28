package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.Arrays;

public class Supermercado {
	private String nombre; 
	private String direccion;
	private ArrayList<Producto> catalago = new ArrayList<Producto>();
	/*nombre*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*direccion*/
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/*catalago de productos*/
	public ArrayList<Producto> getCatalago() {
		return catalago;
	}

	public Supermercado(String nombre, String direccion) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
	}
	
	public int getCantidadProductos() {
		return this.getCatalago().size();
	}
	
	public void agregarProducto(Producto producto) {
		this.getCatalago().add(producto);
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p: this.getCatalago()) {
			precioTotal= precioTotal + p.getPrecio();
		}
		return precioTotal;
	}
	
	
	
}
