package br.com.componel.ssp.dao;

import java.sql.Connection;
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
			stmt = conn.prepareStatement("select first 100 * from juridicap;");
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

		pessoaJuridica.setCdemp(rs.getString(1));
		pessoaJuridica.setCdpre(rs.getString(2));
		pessoaJuridica.setCddoc(rs.getInt(3));
		pessoaJuridica.setCdpar(rs.getString(4));
		pessoaJuridica.setDtdoc(rs.getDate(5));
		pessoaJuridica.setDtdig(rs.getDate(6));
		pessoaJuridica.setDtpag(rs.getDate(7));
		pessoaJuridica.setVldes(rs.getFloat(8));
		pessoaJuridica.setCtdes(rs.getString(9));
		pessoaJuridica.setVladi(rs.getFloat("vladi"));
		pessoaJuridica.setCtadi(rs.getString("ctadi"));
		pessoaJuridica.setQtiss(rs.getFloat("qtiss"));
		pessoaJuridica.setQtirf(rs.getFloat(13));
		pessoaJuridica.setVliss(rs.getFloat(14));
		pessoaJuridica.setCtiss(rs.getString(15));
		pessoaJuridica.setVlirf(rs.getFloat("vlirf"));
		pessoaJuridica.setCtirf(rs.getString("ctirf"));
		pessoaJuridica.setVlgps(rs.getFloat("vlgps"));
		pessoaJuridica.setCtgps(rs.getString("ctgps"));
		pessoaJuridica.setVlliq(rs.getFloat("vlliq"));
		pessoaJuridica.setObser(rs.getString("obser"));
		pessoaJuridica.setStimp(rs.getString("stimp"));
		pessoaJuridica.setPrpgto(rs.getString("prpgto"));
		pessoaJuridica.setVldesc(rs.getFloat("vldesc"));
		pessoaJuridica.setCtdesc(rs.getString("ctdesc"));
		pessoaJuridica.setVljur(rs.getFloat("vljur"));
		pessoaJuridica.setCtjur(rs.getString("ctjur"));
		pessoaJuridica.setDtreal(rs.getDate("dtreal"));
		pessoaJuridica.setVlpcc(rs.getFloat("vlpcc"));
		pessoaJuridica.setCtpcc(rs.getString("ctpcc"));
		pessoaJuridica.setQtpcc(rs.getFloat("qtpcc"));
		pessoaJuridica.setQtpis(rs.getFloat("qtpis"));
		pessoaJuridica.setVlpis(rs.getFloat("vlpis"));
		pessoaJuridica.setCtpis(rs.getString("ctpis"));
		pessoaJuridica.setQtcof(rs.getFloat("qtcof"));
		pessoaJuridica.setVlcof(rs.getFloat("vlcof"));
		pessoaJuridica.setCtcof(rs.getString("ctcof"));
		pessoaJuridica.setQtcsl(rs.getFloat("qtcsl"));
		pessoaJuridica.setVlcsl(rs.getFloat("vlcsl"));
		pessoaJuridica.setCtcsl(rs.getString("ctcsl"));
		pessoaJuridica.setQtpcc1(rs.getFloat("qtpcc1"));
		pessoaJuridica.setVlpcc1(rs.getFloat("vlpcc1"));
		pessoaJuridica.setCtpcc1(rs.getString("ctpcc1"));
		pessoaJuridica.setCdpcc1(rs.getString("cdpcc1"));
		pessoaJuridica.setQtpcc2(rs.getFloat("qtpcc2"));
		pessoaJuridica.setVlpcc2(rs.getFloat("vlpcc2"));
		pessoaJuridica.setCtpcc2(rs.getString("ctpcc2"));
		pessoaJuridica.setCdpcc2(rs.getString("cdpcc2"));
		pessoaJuridica.setBspcc1(rs.getFloat("bspcc1"));
		pessoaJuridica.setBspcc2(rs.getFloat("bspcc2"));
		pessoaJuridica.setBsiss(rs.getFloat("bsiss"));
		pessoaJuridica.setIdeletronica(rs.getInt("ideletronica"));
		pessoaJuridica.setDthorlanc(rs.getDate("dthorlanc"));
		pessoaJuridica.setCdusu(rs.getString("cdusu"));
		pessoaJuridica.setBsirf(rs.getFloat("bsirf"));
		pessoaJuridica.setDthorinterface(rs.getDate("dthorinterface"));
		pessoaJuridica.setTpscod(rs.getInt("tpscod"));
		pessoaJuridica.setCdregtrib(rs.getInt("cdregtrib"));
		pessoaJuridica.setBspiscofins(rs.getFloat("bspiscofins"));

		return pessoaJuridica;
	}

}
