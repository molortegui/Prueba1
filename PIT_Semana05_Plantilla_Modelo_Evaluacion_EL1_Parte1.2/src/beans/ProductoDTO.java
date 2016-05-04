package beans;
import java.util.Date;
public class ProductoDTO {
	private int codigo;
	private String descripcion;
	private int stock;
	private double precio;
	private Date fecRegistro;
	private int codMarca;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getFecRegistro() {
		return fecRegistro;
	}
	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}
	public int getCodMarca() {
		return codMarca;
	}
	public void setCodMarca(int codMarca) {
		this.codMarca = codMarca;
	}
	
	
	
}
