package service;
import java.util.List;
import beans.MarcaDTO;
import beans.ProductoDTO;
import dao.DAOFactory;
import interfaces.MarcaDAO;
import interfaces.ProductoDAO;
import utils.Constantes;
public class ProductoService {
	//Fabrica de DAO
	DAOFactory fabrica=DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	//trabajar con dos dao´s
	MarcaDAO objMarca=fabrica.getMarcaDAO();
	ProductoDAO objProducto=fabrica.getProductoDAO();
	public List<MarcaDTO> listaMarca() {
		return objMarca.listarMarca();
	}
	public int registraProducto(ProductoDTO x) {
		return objProducto.registrarProducto(x);
	}
}