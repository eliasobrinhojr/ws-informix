package br.com.componel.ssp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.domain.BaseDAO;
import br.com.componel.ssp.model.PessoaFisica;

public class PessoaFisicaDAO extends BaseDAO {

	public List<PessoaFisica> getListaPessoaFisica() throws SQLException {
		List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = getConnection();
			stmt = conn.prepareStatement("select * from fisicap;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				PessoaFisica pf = createPessoaFisica(rs);
				listaPessoaFisica.add(pf);
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

		return listaPessoaFisica;

	}

	public PessoaFisica createPessoaFisica(ResultSet rs) throws SQLException {
		PessoaFisica pessoaFisica = new PessoaFisica();

		pessoaFisica.setCdemp(rs.getString(1));
		pessoaFisica.setCdpre(rs.getString(2));
		pessoaFisica.setCddoc(rs.getInt(3));
		pessoaFisica.setDtdoc(rs.getDate(4));
		pessoaFisica.setDtdig(rs.getDate(5));
		pessoaFisica.setDtpag(rs.getDate(6));
		pessoaFisica.setVldes(rs.getFloat(7));
		pessoaFisica.setCtdes(rs.getString(8));
		pessoaFisica.setVladi(rs.getFloat(9));
		pessoaFisica.setCtadi(rs.getString(10));
		pessoaFisica.setCdser(rs.getString(11));
		pessoaFisica.setQtser(rs.getFloat(12));
		pessoaFisica.setVlser(rs.getFloat(13));
		pessoaFisica.setQtdep(rs.getInt(14));
		pessoaFisica.setVluni(rs.getFloat(15));
		pessoaFisica.setVldep(rs.getFloat(16));
		pessoaFisica.setVlbas(rs.getFloat(17));
		pessoaFisica.setVlded(rs.getFloat(18));
		pessoaFisica.setQtirf(rs.getFloat(19));
		pessoaFisica.setVlirf(rs.getFloat(20));
		pessoaFisica.setCtirf(rs.getString(21));
		pessoaFisica.setQtiss(rs.getFloat(22));
		pessoaFisica.setVliss(rs.getFloat(23));
		pessoaFisica.setCtiss(rs.getString(24));
		pessoaFisica.setVlliq(rs.getFloat(25));
		pessoaFisica.setCdseq(rs.getString(26));
		pessoaFisica.setObser(rs.getString(27));
		pessoaFisica.setStimp(rs.getString(28));
		pessoaFisica.setPrpgto(rs.getString(29));
		pessoaFisica.setVldesc(rs.getFloat(30));
		pessoaFisica.setCtdesc(rs.getString(31));
		pessoaFisica.setVljur(rs.getFloat(32));
		pessoaFisica.setCtjur(rs.getString(33));
		pessoaFisica.setDtreal(rs.getDate(34));
		pessoaFisica.setQtgps(rs.getFloat(35));
		pessoaFisica.setVlbsgps(rs.getFloat(36));
		pessoaFisica.setVlgps(rs.getFloat(37));
		pessoaFisica.setCtgps(rs.getString(38));
		pessoaFisica.setSerie(rs.getString(39));
		pessoaFisica.setDthorlanc(rs.getDate(40));
		pessoaFisica.setCdusu(rs.getString(41));
		pessoaFisica.setDthorinterface(rs.getDate(42));
		pessoaFisica.setTpscod(rs.getInt(43));
		pessoaFisica.setCdregtrib(rs.getInt(44));
		pessoaFisica.setIdeletronica(rs.getInt(45));

		return pessoaFisica;
	}

}
