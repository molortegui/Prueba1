package action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import service.ProductoService;
import beans.MarcaDTO;
import beans.ProductoDTO;

import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("pit")
public class ProductoAction extends ActionSupport {

	private ProductoDTO producto;
	private List<MarcaDTO>lstMarca;
	private String mensaje;
	
	@Action(value="/cargarMarca",results={@Result(name="lista",type="json")})
	
	public String cargarDatos(){
		lstMarca=new ProductoService().listarMarca();
		return "lista";
	}	
	@Action(value="/registrarProducto",results={@Result(name="registro",location="mostrar_mensaje.jsp")})
	
	public String registrarproducto(){
		new ProductoService().registrarProducto(producto);
		mensaje="Registro ok";
		return "registro";
	}
	
	public ProductoDTO getProducto() {
		return producto;
	}
	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}
	public List<MarcaDTO> getLstMarca() {
		return lstMarca;
	}
	public void setLstMarca(List<MarcaDTO> lstMarca) {
		this.lstMarca = lstMarca;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
