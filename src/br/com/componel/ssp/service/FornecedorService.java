package br.com.componel.ssp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.dao.FornecedorDAO;
import br.com.componel.ssp.dao.PrestadorDAO;
import br.com.componel.ssp.model.Fornecedor;
import br.com.componel.ssp.model.Prestador;

public class FornecedorService {

	private FornecedorDAO fornDAO = new FornecedorDAO();

	public List<Fornecedor> getFornecedores() {
		try {
			List<Fornecedor> fornecedores = fornDAO.getFornecedores();
			return fornecedores;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<Fornecedor>();
		}
	}

}
