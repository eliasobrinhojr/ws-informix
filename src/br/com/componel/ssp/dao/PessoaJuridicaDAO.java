package br.com.componel.ssp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.domain.BaseDAO;
import br.com.componel.ssp.model.PessoaJuridica;

public class PessoaJuridicaDAO extends BaseDAO {

	public List<PessoaJuridica> getListaPessoaJuridica() throws SQLException {
		List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select first 10 * from juridicap;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				PessoaJuridica pj = createPessoaJuridica(rs);
				listaPessoaJuridica.add(pj);
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

		return listaPessoaJuridica;

	}

	public PessoaJuridica createPessoaJuridica(ResultSet rs) throws SQLException {
		PessoaJuridica pessoaJuridica = new PessoaJuridica();



//		pessoaJuridica.setCdemp(rs.getString(1));
//		pessoaJuridica.setCdpre(rs.getString(2));
//		pessoaJuridica.setCddoc(rs.getInt(3));
//		pessoaJuridica.setCdpar(rs.getDate(4));
//		pessoaJuridica.setDtdoc(rs.getDate(5));
//		pessoaJuridica.setDtdig(rs.getDate(6));
//		pessoaJuridica.setDtpag(rs.getFloat(7));
//		pessoaJuridica.setVldes(rs.getString(8));
//		pessoaJuridica.setCtdes(rs.getFloat(9));
//		pessoaJuridica.setVladi(rs.getString(10));
//		pessoaJuridica.setCtadi(rs.getString(11));
//		pessoaJuridica.setQtiss(rs.getFloat(12));
//		pessoaJuridica.setQtirf(rs.getFloat(13));
//		pessoaJuridica.setVliss(rs.getInt(14));
//		pessoaJuridica.setCtiss(rs.getFloat(15));
//		pessoaJuridica.setVlirf(rs.getFloat(16));
//		pessoaJuridica.setCtirf(rs.getFloat(17));
//		pessoaJuridica.setVlgps(rs.getFloat(18));
//		pessoaJuridica.setCtgps(rs.getFloat(19));
//		pessoaJuridica.setVlliq(rs.getFloat(20));
//		pessoaJuridica.setObser(rs.getString(21));
//		pessoaJuridica.setStimp(rs.getFloat(22));
//		pessoaJuridica.setPrpgto(rs.getFloat(23));
//		pessoaJuridica.setVldesc(rs.getString(24));
//		pessoaJuridica.setCtdesc(rs.getFloat(25));
//		pessoaJuridica.setVljur(rs.getString(26));
//		pessoaJuridica.setCtjur(rs.getString(27));
//		pessoaJuridica.setDtreal(rs.getString(28));
//		pessoaJuridica.setVlpcc(rs.getString(29));
//		pessoaJuridica.setCtpcc(rs.getFloat(30));
//		pessoaJuridica.setQtpcc(rs.getString(31));
//		pessoaJuridica.setQtpis(rs.getFloat(32));
//		pessoaJuridica.setVlpis(rs.getString(33));
//		pessoaJuridica.setCtpis(rs.getDate(34));
//		pessoaJuridica.setQtcof(rs.getFloat(35));
//		pessoaJuridica.setVlcof(rs.getFloat(36));
//		pessoaJuridica.setCtcof(rs.getFloat(37));
//		pessoaJuridica.setQtcsl(rs.getString(38));
//		pessoaJuridica.setVlcsl(rs.getString(39));
//		pessoaJuridica.setCtcsl(rs.getDate(40));
//		pessoaJuridica.setQtpcc1(rs.getString(41));
//		pessoaJuridica.setVlpcc1(rs.getDate(42));
//		pessoaJuridica.setCtpcc1(rs.getInt(43));
//		pessoaJuridica.setCdpcc1(rs.getInt(44));
//		pessoaJuridica.setQtpcc2(rs.getInt(45));
//		pessoaJuridica.setVlpcc2(rs.getString(41));
//		pessoaJuridica.setCtpcc2(rs.getDate(42));
//		pessoaJuridica.setCdpcc2(rs.getInt(43));
//		pessoaJuridica.setBspcc1(rs.getInt(44));
//		pessoaJuridica.setBspcc2(rs.getInt(45));
//		pessoaJuridica.setBsiss(rs.getString(41));
//		pessoaJuridica.setIdeletronica(rs.getDate(42));
//		pessoaJuridica.setDthorlanc(rs.getInt(43));
//		pessoaJuridica.setCdusu(rs.getInt(44));
//		pessoaJuridica.setBsirf(rs.getInt(45));
//		pessoaJuridica.setDthorinterface(rs.getInt(43));
//		pessoaJuridica.setTpscod(rs.getInt(44));
//		pessoaJuridica.setCdregtrib(rs.getInt(45));
//		pessoaJuridica.setBspiscofins(rs.getInt(43));


		return pessoaJuridica;
	}

}
