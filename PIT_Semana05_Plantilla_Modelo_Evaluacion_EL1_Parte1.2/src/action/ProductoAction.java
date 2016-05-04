package action;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import com.opensymphony.xwork2.ActionSupport;
import beans.MarcaDTO;
import beans.ProductoDTO;
import service.ProductoService;
@ParentPackage("pit")
public class ProductoAction extends ActionSupport{
	private ProductoDTO producto; 
	private List<MarcaDTO> lstMarca;
	private String mensaje;

	@Action(value="/cargarMarca",results={@Result(name="listar",type="json")})
	public String cargarMarca(){
		lstMarca=new ProductoService().listaMarca();
		return "listar";
	}
	@Action(value="/registrarProducto",results={@Result(name="registrar",
												location="/mostrar_mensaje.jsp"),
			                                   @Result(name="error",
			                                  location="/mostrar_mensaje.jsp")})
	public String registrarProducto(){
		if(producto.getDescripcion().equals("")){
			mensaje="Ingrese Descripcion";
			return "error";
		}
		else if(String.valueOf(producto.getStock()).matches("\\d{1,2}")==false){
			mensaje="Ingrese Stock hasta dos cifras";
			return "error";
		}
		else if((producto.getStock()+"").equals("")){
			mensaje="Ingrese Stock";
			return "error";
		}
		else if(producto.getFecRegistro()==null){
			mensaje="Ingrese Fecha";
			return "error";
		}
		else
		new ProductoService().registraProducto(producto);
		mensaje="Registro ok";
		return "registrar";
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
