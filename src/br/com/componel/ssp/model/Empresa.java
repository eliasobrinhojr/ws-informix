package br.com.componel.ssp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cdemp;
	private String cdcgc;
	private String cdmun;
	private String dsemp;
	private String ativi;
	private String cdcep;
	private String cdtri;
	private String compr;
	private String ender;
	private String nfts_sp;
	private String cdsynchro;
	private String resp_cpf;
	private String responsavel;
	private String uf;
	
	@Override
	public String toString() {
		return "Empresa [cdemp=" + cdemp + ", cdcgc=" + cdcgc + ", cdmun=" + cdmun + ", dsemp=" + dsemp + ", ativi="
				+ ativi + ", cdcep=" + cdcep + ", cdtri=" + cdtri + ", compr=" + compr + ", ender=" + ender
				+ ", nfts_sp=" + nfts_sp + ", cdsynchro=" + cdsynchro + ", resp_cpf=" + resp_cpf + ", responsavel="
				+ responsavel + ", uf=" + uf + "]";
	}

	public String getCdemp() {
		return cdemp;
	}

	public void setCdemp(String cdemp) {
		this.cdemp = cdemp;
	}

	public String getCdcgc() {
		return cdcgc;
	}

	public void setCdcgc(String cdcgc) {
		this.cdcgc = cdcgc;
	}

	public String getCdmun() {
		return cdmun;
	}

	public void setCdmun(String cdmun) {
		this.cdmun = cdmun;
	}

	public String getDsemp() {
		return dsemp;
	}

	public void setDsemp(String dsemp) {
		this.dsemp = dsemp;
	}

	public String getAtivi() {
		return ativi;
	}

	public void setAtivi(String ativi) {
		this.ativi = ativi;
	}

	public String getCdcep() {
		return cdcep;
	}

	public void setCdcep(String cdcep) {
		this.cdcep = cdcep;
	}

	public String getCdtri() {
		return cdtri;
	}

	public void setCdtri(String cdtri) {
		this.cdtri = cdtri;
	}

	public String getCompr() {
		return compr;
	}

	public void setCompr(String compr) {
		this.compr = compr;
	}

	public String getEnder() {
		return ender;
	}

	public void setEnder(String ender) {
		this.ender = ender;
	}

	public String getNfts_sp() {
		return nfts_sp;
	}

	public void setNfts_sp(String nfts_sp) {
		this.nfts_sp = nfts_sp;
	}

	public String getCdsynchro() {
		return cdsynchro;
	}

	public void setCdsynchro(String cdsynchro) {
		this.cdsynchro = cdsynchro;
	}

	public String getResp_cpf() {
		return resp_cpf;
	}

	public void setResp_cpf(String resp_cpf) {
		this.resp_cpf = resp_cpf;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
