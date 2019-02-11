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
	private int recordsTotal;
	private int recordsFiltered;

	@XmlElement(name = "data")
	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	
	@XmlElement(name = "recordsTotal")
	public int getRecordsTotal() {
		return recordsTotal;
	}
	
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	@XmlElement(name = "recordsFiltered")
	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	@Override
	public String toString() {
		return "ListaEmpresas [empresas=" + empresas + "]";
	}
}
