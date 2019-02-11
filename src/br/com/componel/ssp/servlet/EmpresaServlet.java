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

import br.com.componel.ssp.dto.ListaEmpresas;
import br.com.componel.ssp.model.Empresa;
import br.com.componel.ssp.service.EmpresaService;
import br.com.componel.ssp.util.ServletUtil;

@WebServlet("/empresas/*")
public class EmpresaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EmpresaService empService = new EmpresaService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setAccessControlHeaders(resp);

		List<Empresa> empresas = empService.getEmpresas();
		ListaEmpresas lista = new ListaEmpresas();
		lista.setEmpresas(empresas);
		lista.setRecordsFiltered(empresas.size());
		lista.setRecordsTotal(empresas.size());

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		// String json = JAXBUtil.toJson(lista);
		String json = gson.toJson(lista);
		ServletUtil.writeJSON(resp, json);
	}

	private void setAccessControlHeaders(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "http://dev.grupois.mao");
		resp.setHeader("Access-Control-Allow-Methods", "GET");
	}

}
