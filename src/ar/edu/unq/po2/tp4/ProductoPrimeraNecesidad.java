package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	/*Al querer cambiar el precio con setPrecio(), se debe tener en cuenta que se cambia el precio sin contar el descuento*/
	private double descuentoAplicado;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuentoAplicado) {
		super(nombre, precio, esPrecioCuidado);
		this.setDescuentoAplicado(descuentoAplicado);
		
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuentoAplicado) {
		super(nombre, precio);
		this.setDescuentoAplicado(descuentoAplicado);
		
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
		return this.precio * (1-this.getDescuentoAplicado()/ 100);
	}

	

}
