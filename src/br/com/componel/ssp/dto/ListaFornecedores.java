package br.com.componel.ssp.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.componel.ssp.model.Fornecedor;

@XmlRootElement(name = "fornecedor")

public class ListaFornecedores implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Fornecedor> fornecedores;

	@XmlElement(name = "fornecedores")
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public String toString() {
		return "ListaFornecedores [fornecedores=" + fornecedores + "]";
	}
}
