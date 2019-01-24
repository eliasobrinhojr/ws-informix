package br.com.componel.ssp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.dao.PessoaFisicaDAO;
import br.com.componel.ssp.model.PessoaFisica;

public class PessoaFisicaService {

	private PessoaFisicaDAO pfDAO = new PessoaFisicaDAO();

	public List<PessoaFisica> getListaPessoaFisica() {
		try {
			List<PessoaFisica> listaPessoaFisica = pfDAO.getListaPessoaFisica();
			return listaPessoaFisica;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<PessoaFisica>();
		}
	}

}
