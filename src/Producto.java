
public class Producto {
	private double precio;
	private String codigo;
	
	public Producto() {
		this.precio = 0;
		this.codigo = "";
	}
	
	public Producto(double precio, String codigo) {
		this.precio = precio;
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", codigo=" + codigo + "]";
	}
	
}
