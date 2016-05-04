package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import beans.ProductoDTO;
import interfaces.ProductoDAO;
import utils.MysqlDBConexion;
public class MySqlProductoDAO implements ProductoDAO {
	@Override
	public int registrarProducto(ProductoDTO x) {
		int estado=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		
		try{
			cn=MysqlDBConexion.getConexion();
			String sql="insert into tb_producto values(null,?,?,?,?,?)";
			pstm=cn.prepareStatement(sql);
			pstm.setString(1, x.getDescripcion());
			pstm.setInt(2, x.getStock());
			pstm.setDouble(3, x.getPrecio());
			pstm.setString(4, new SimpleDateFormat("yyyy/MM/dd").
											format(x.getFecRegistro()));
			pstm.setInt(5, x.getCodMarca());
			estado=pstm.executeUpdate();
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
				return 0;
	}

}
