package br.com.componel.ssp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.componel.ssp.dto.ListaPessoaFisica;
import br.com.componel.ssp.model.PessoaFisica;
import br.com.componel.ssp.service.PessoaFisicaService;
import br.com.componel.ssp.util.ServletUtil;

@WebServlet("/pessoaFisica/*")
public class PessoaFisicaServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
	private PessoaFisicaService pfService = new PessoaFisicaService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<PessoaFisica> listaPessoaFisica = pfService.getListaPessoaFisica();
		ListaPessoaFisica lista = new ListaPessoaFisica();
		lista.setListaPessoaFisica(listaPessoaFisica);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//String json = JAXBUtil.toJson(lista);
		String json = gson.toJson(lista);
		ServletUtil.writeJSON(resp, json);
	}
	
}
