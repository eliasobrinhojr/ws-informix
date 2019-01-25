package br.com.componel.ssp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.dao.PessoaJuridicaDAO;
import br.com.componel.ssp.model.PessoaJuridica;

public class PessoaJuridicaService {

	private PessoaJuridicaDAO pjDAO = new PessoaJuridicaDAO();

	public List<PessoaJuridica> getListaPessoaJuridica() {
		try {
			List<PessoaJuridica> listaPessoaJuridica = pjDAO.getListaPessoaJuridica();
			return listaPessoaJuridica;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<PessoaJuridica>();
		}
	}

}
