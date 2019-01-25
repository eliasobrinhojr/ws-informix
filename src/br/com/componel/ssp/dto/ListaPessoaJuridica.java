package br.com.componel.ssp.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.componel.ssp.model.PessoaJuridica;

@XmlRootElement(name = "pessoaJuridica")

public class ListaPessoaJuridica implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<PessoaJuridica> listaPessoaJuridica;

	@XmlElement(name = "listaPessoaJuridica")
	public List<PessoaJuridica> getListaPessoaFisica() {
		return listaPessoaJuridica;
	}

	public void setListaPessoaJuridica(List<PessoaJuridica> listaPessoaJuridica) {
		this.listaPessoaJuridica = listaPessoaJuridica;
	}

	@Override
	public String toString() {
		return "ListaPessoaFisica [lista=" + listaPessoaJuridica + "]";
	}
}
