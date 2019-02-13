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

import br.com.componel.ssp.dto.ListaFornecedores;
import br.com.componel.ssp.model.Fornecedor;
import br.com.componel.ssp.service.FornecedorService;
import br.com.componel.ssp.util.ServletUtil;

@WebServlet("/fornecedores/*")
public class FornecedorServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
	private FornecedorService service = new FornecedorService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setAccessControlHeaders(resp);
		List<Fornecedor> fornecedores = service.getFornecedores();
		ListaFornecedores lista = new ListaFornecedores();
		lista.setFornecedores(fornecedores);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//String json = JAXBUtil.toJson(lista);
		String json = gson.toJson(lista);
		ServletUtil.writeJSON(resp, json);
	}
	

	private void setAccessControlHeaders(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "http://dev.grupois.mao");
		resp.setHeader("Access-Control-Allow-Methods", "GET");
	}
	
}
