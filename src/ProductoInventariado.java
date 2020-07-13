
public class ProductoInventariado extends Producto {
	private double beneficio;
	private double aumento;
	
	public ProductoInventariado() {
		this.beneficio = 0;
		this.aumento = 0;
		this.setPrecio(0);
		this.setCodigo("");
	}
	
	public ProductoInventariado(double beneficio, double aumento, double precio, String codigo) {
		this.beneficio = beneficio;
		this.aumento = aumento;
		this.setPrecio(precio);
		this.setCodigo(codigo);
	}
	
	public void setAumento(double precio, double beneficio) {
		this.aumento = precio + beneficio;
	}
	
	public double getAumento() {
		return aumento;
	}

	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "ProductoInventariado [codigo=" + this.getCodigo() + " precio: " + this.getPrecio() + " beneficio= " + this.beneficio + 
				" aumento = " + this.getAumento() + "]";
	}
	

}
