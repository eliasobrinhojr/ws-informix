package br.com.componel.ssp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.dao.EmpresaDAO;
import br.com.componel.ssp.model.Empresa;

public class EmpresaService {

	private EmpresaDAO empDAO = new EmpresaDAO();

	public List<Empresa> getEmpresas() {
		try {
			List<Empresa> empresas = empDAO.getEmpresas();
			return empresas;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<Empresa>();
		}
	}

}
