package br.com.componel.ssp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.domain.BaseDAO;
import br.com.componel.ssp.model.Prestador;

public class PrestadorDAO extends BaseDAO {

	public List<Prestador> getPrestadores() throws SQLException {
		List<Prestador> prestadores = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select FIRST 15 * from prestadores;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Prestador prest = createPrestador(rs);
				prestadores.add(prest);
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

		return prestadores;

	}

	public Prestador createPrestador(ResultSet rs) throws SQLException {
		Prestador prest = new Prestador();
				
		prest.setCdpre(rs.getString(1));
		prest.setCdirf(rs.getString(2));
		prest.setIdpre(rs.getString(3));
		prest.setCdcgc(rs.getString(4));
		prest.setCdmun(rs.getString(5));
		prest.setDspre(rs.getString(6));
		prest.setEnder(rs.getString(7));
		prest.setCdcep(rs.getString(8));
		prest.setCtadi(rs.getString(9));
		prest.setCtiss(rs.getString(10));
		prest.setCtirf(rs.getString(11));
		prest.setCtgps(rs.getString(12));
		prest.setCtdesc(rs.getString(13));
		prest.setCtjur(rs.getString(14));
		prest.setNmpre(rs.getString(15));
		prest.setStpre(rs.getString(16));
		prest.setCdemp(rs.getString(17));
		prest.setCdcent(rs.getString(18));
		prest.setInscgps(rs.getString(19));
		prest.setCtpcc(rs.getString(20));
		prest.setCtcof(rs.getString(21));
		prest.setCtpis(rs.getString(22));
		prest.setCtcsl(rs.getString(23));
		prest.setFlinscprefsp(rs.getString(24));
		
		return prest;
	}

}
