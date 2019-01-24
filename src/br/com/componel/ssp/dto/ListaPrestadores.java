package br.com.componel.ssp.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.componel.ssp.model.Prestador;

@XmlRootElement(name = "prestador")

public class ListaPrestadores implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Prestador> prestadores;

	@XmlElement(name = "prestadores")
	public List<Prestador> getPrestadores() {
		return prestadores;
	}

	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}

	@Override
	public String toString() {
		return "ListaPrestadores [prestadores=" + prestadores + "]";
	}
}
