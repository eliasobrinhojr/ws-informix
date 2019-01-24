package br.com.componel.ssp.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.componel.ssp.model.Empresa;

@XmlRootElement(name = "empresa")

public class ListaEmpresas implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Empresa> empresas;

	@XmlElement(name = "empresas")
	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	@Override
	public String toString() {
		return "ListaEmpresas [empresas=" + empresas + "]";
	}
}
