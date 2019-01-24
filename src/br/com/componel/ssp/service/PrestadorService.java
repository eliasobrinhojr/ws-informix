package br.com.componel.ssp.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.componel.ssp.dao.PrestadorDAO;
import br.com.componel.ssp.model.Prestador;

public class PrestadorService {

	private PrestadorDAO prestDAO = new PrestadorDAO();

	public List<Prestador> getPrestadores() {
		try {
			List<Prestador> prestadores = prestDAO.getPrestadores();
			return prestadores;
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<Prestador>();
		}
	}

}
