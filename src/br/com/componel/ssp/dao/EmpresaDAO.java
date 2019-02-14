package br.com.componel.ssp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.domain.BaseDAO;
import br.com.componel.ssp.model.Empresa;

public class EmpresaDAO extends BaseDAO {


	public List<Empresa> getEmpresas() throws SQLException {
		List<Empresa> empresas = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select FIRST 15 * from empresas;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Empresa emp = createEmpresa(rs);
				empresas.add(emp);
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

		return empresas;

	}
	
	
	public Empresa createEmpresa(ResultSet rs) throws SQLException {
		Empresa emp = new Empresa();

		emp.setCdemp(rs.getString(1));
		emp.setCdcgc(rs.getString(2));
		emp.setCdmun(rs.getString(3));
		emp.setDsemp(rs.getString(4));
		emp.setAtivi(rs.getString(5));
		emp.setCdcep(rs.getString(6));
		emp.setCdtri(rs.getString(7));
		emp.setCompr(rs.getString(8));
		emp.setEnder(rs.getString(9));
		emp.setNfts_sp(rs.getString(10));
		emp.setCdsynchro(rs.getString(11));
		emp.setResp_cpf(rs.getString(12));
		emp.setResponsavel(rs.getString(13));
		emp.setUf(rs.getString(14));

		return emp;
	}

}
