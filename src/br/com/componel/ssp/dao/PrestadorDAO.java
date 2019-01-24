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
			stmt = conn.prepareStatement("select * from prestadores;");
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
		prest.setIdpre(rs.getString(2));
		prest.setCdcgc(rs.getString(3));
		prest.setCdmun(rs.getString(4));
		prest.setDspre(rs.getString(5));
		prest.setEnder(rs.getString(6));
		prest.setCdcep(rs.getString(7));
		prest.setCtadi(rs.getString(8));
		prest.setCtiss(rs.getString(9));
		prest.setCtirf(rs.getString(10));
		prest.setCtgps(rs.getString(11));
		prest.setCtdesc(rs.getString(12));
		prest.setCtjur(rs.getString(13));
		prest.setNmpre(rs.getString(14));
		prest.setStpre(rs.getString(15));
		prest.setCdemp(rs.getString(16));
		prest.setCdcent(rs.getString(17));
		prest.setInscgps(rs.getString(18));
		prest.setCtpcc(rs.getString(19));
		prest.setCtcof(rs.getString(20));
		prest.setCtpis(rs.getString(21));
		prest.setCtcsl(rs.getString(22));
		prest.setFlinscprefsp(rs.getString(23));
		
		return prest;
	}

}
