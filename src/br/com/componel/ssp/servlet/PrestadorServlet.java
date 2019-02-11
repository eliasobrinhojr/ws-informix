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

import br.com.componel.ssp.dto.ListaPrestadores;
import br.com.componel.ssp.model.Prestador;
import br.com.componel.ssp.service.PrestadorService;
import br.com.componel.ssp.util.ServletUtil;

@WebServlet("/prestadores/*")
public class PrestadorServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;
	private PrestadorService prestService = new PrestadorService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setAccessControlHeaders(resp);
		List<Prestador> prestadores = prestService.getPrestadores();
		ListaPrestadores lista = new ListaPrestadores();
		lista.setPrestadores(prestadores);
		
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
