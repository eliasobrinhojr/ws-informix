package br.com.componel.ssp.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.componel.ssp.model.PessoaFisica;

@XmlRootElement(name = "pessoaFisica")

public class ListaPessoaFisica implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<PessoaFisica> listaPessoaFisica;

	@XmlElement(name = "listaPessoaFisica")
	public List<PessoaFisica> getListaPessoaFisica() {
		return listaPessoaFisica;
	}

	public void setListaPessoaFisica(List<PessoaFisica> listaPessoaFisica) {
		this.listaPessoaFisica = listaPessoaFisica;
	}

	@Override
	public String toString() {
		return "ListaPessoaFisica [lista=" + listaPessoaFisica + "]";
	}
}
