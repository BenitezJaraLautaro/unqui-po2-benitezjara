package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	/*Al querer cambiar el precio con setPrecio(), se debe tener en cuenta que se cambia el precio sin contar el descuento*/
	private double descuentoAplicado = 0.9;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
		
	}
	
	public double getDescuentoAplicado() {
		return this.descuentoAplicado;
	}

	public void setDescuentoAplicado(double descuentoAplicado) {
		this.descuentoAplicado = descuentoAplicado;
	}
	
	public double getPrecioBase() {
		return this.precio;
	}
	
	@Override
	public double getPrecio() {
		return this.precio * this.getDescuentoAplicado();
	}

	

}
