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

import br.com.componel.ssp.dto.ListaPessoaJuridica;
import br.com.componel.ssp.model.PessoaJuridica;
import br.com.componel.ssp.service.PessoaJuridicaService;
import br.com.componel.ssp.util.ServletUtil;

@WebServlet("/pessoaJuridica/*")
public class PessoaJuridicaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private PessoaJuridicaService pjService = new PessoaJuridicaService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<PessoaJuridica> listaPessoaJuridica = pjService.getListaPessoaJuridica();
		ListaPessoaJuridica lista = new ListaPessoaJuridica();
		lista.setListaPessoaJuridica(listaPessoaJuridica);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// String json = JAXBUtil.toJson(lista);
		String json = gson.toJson(lista);
		ServletUtil.writeJSON(resp, json);
	}

}
