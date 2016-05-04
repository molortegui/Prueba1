package dao;

import interfaces.MarcaDAO;
import interfaces.ProductoDAO;




public class MySqlDAOFactory extends DAOFactory {

	@Override
	public MarcaDAO getMarcaDAO() {
		// TODO Auto-generated method stub
		return new MySqlMarcaDAO();
	}

	@Override
	public ProductoDAO getProductoDAO() {
		// TODO Auto-generated method stub
		return new MySqlProductoDAO();
	}

	



}

