package br.com.componel.ssp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.domain.BaseDAO;
import br.com.componel.ssp.model.Fornecedor;

public class FornecedorDAO  extends BaseDAO {

	
	
	public List<Fornecedor> getFornecedores() throws SQLException {
		List<Fornecedor> fornecedores = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnectionCass();
			stmt = conn.prepareStatement("select FIRST 15 * from fornecedor;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fornecedor obj = createFornecedor(rs);
				fornecedores.add(obj);
			}
			rs.close();

		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		return fornecedores;

	}

	public Fornecedor createFornecedor(ResultSet rs) throws SQLException {
		Fornecedor obj = new Fornecedor();
				
		obj.setForcod(rs.getInt(1));
		obj.setForpjf(rs.getString(2));
		obj.setForcnpjcpf(rs.getString(3));
		obj.setForbai(rs.getString(4));
		obj.setFornome(rs.getString(5));
		obj.setFormun(rs.getString(6));
		obj.setForend(rs.getString(7));
		obj.setForcep(rs.getString(8));
		obj.setForuf(rs.getString(9));
		obj.setForfone(rs.getString(10));
		obj.setForfax(rs.getString(11));
		obj.setForemail(rs.getString(12));
		obj.setMuncod(rs.getInt(13));
		
		return obj;
	}
}
