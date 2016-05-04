package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import beans.MarcaDTO;
import interfaces.MarcaDAO;
import utils.MysqlDBConexion;
public class MySqlMarcaDAO implements MarcaDAO {
	@Override
	public List<MarcaDTO> listarMarca() {
		List<MarcaDTO> data=new ArrayList<MarcaDTO>();
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="select * from tb_marca";
			pstm=cn.prepareStatement(sql);
			rs=pstm.executeQuery();
			while(rs.next()){
				MarcaDTO m=new MarcaDTO();
				m.setCodigo(rs.getInt(1)); m.setNombre(rs.getString(2));
				data.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null) rs.close(); if(pstm!=null) pstm.close();if(cn!=null)cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return data;
	}

}
