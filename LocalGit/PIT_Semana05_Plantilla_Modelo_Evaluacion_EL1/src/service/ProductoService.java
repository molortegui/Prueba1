package service;

import interfaces.MarcaDAO;
import interfaces.ProductoDAO;

import java.util.ArrayList;
import java.util.List;

import utils.Constantes;
import dao.DAOFactory;
import beans.MarcaDTO;
import beans.ProductoDTO;

public class ProductoService {
	DAOFactory fabrica=DAOFactory.getDAOFactory(Constantes.ORIGEN_DATOS);
	MarcaDAO objMarca=fabrica.getMarcaDAO();
	ProductoDAO objProducto=fabrica.getProductoDAO();
	
	public int registrarProducto(ProductoDTO x) {
		return objProducto.registrarProducto(x);
	}
	public List<MarcaDTO> listarMarca() {
		return objMarca.listarMarca();
	}
}
