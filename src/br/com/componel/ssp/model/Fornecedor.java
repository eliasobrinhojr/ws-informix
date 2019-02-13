package br.com.componel.ssp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Fornecedor implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private int forcod;
	private String forpjf;
	private String forcnpjcpf;
	private String forbai;
	private String fornome;
	private String formun;
	private String forend;
	private String forcep;
	private String foruf;
	private String forfone;
	private String forfax;
	private String foremail;
	private int esrcod;
	private int fornum;
	private int muncod;
	
	public int getForcod() {
		return forcod;
	}
	public void setForcod(int forcod) {
		this.forcod = forcod;
	}
	public String getForpjf() {
		return forpjf;
	}
	public void setForpjf(String forpjf) {
		this.forpjf = forpjf;
	}
	public String getForcnpjcpf() {
		return forcnpjcpf;
	}
	public void setForcnpjcpf(String forcnpjcpf) {
		this.forcnpjcpf = forcnpjcpf;
	}
	public String getForbai() {
		return forbai;
	}
	public void setForbai(String forbai) {
		this.forbai = forbai;
	}
	public String getFornome() {
		return fornome;
	}
	public void setFornome(String fornome) {
		this.fornome = fornome;
	}
	public String getFormun() {
		return formun;
	}
	public void setFormun(String formun) {
		this.formun = formun;
	}
	public String getForend() {
		return forend;
	}
	public void setForend(String forend) {
		this.forend = forend;
	}
	public String getForcep() {
		return forcep;
	}
	public void setForcep(String forcep) {
		this.forcep = forcep;
	}
	public String getForuf() {
		return foruf;
	}
	public void setForuf(String foruf) {
		this.foruf = foruf;
	}
	public String getForfone() {
		return forfone;
	}
	public void setForfone(String forfone) {
		this.forfone = forfone;
	}
	public String getForfax() {
		return forfax;
	}
	public void setForfax(String forfax) {
		this.forfax = forfax;
	}
	public String getForemail() {
		return foremail;
	}
	public void setForemail(String foremail) {
		this.foremail = foremail;
	}
	public int getEsrcod() {
		return esrcod;
	}
	public void setEsrcod(int esrcod) {
		this.esrcod = esrcod;
	}
	public int getFornum() {
		return fornum;
	}
	public void setFornum(int fornum) {
		this.fornum = fornum;
	}
	public int getMuncod() {
		return muncod;
	}
	public void setMuncod(int muncod) {
		this.muncod = muncod;
	}
	
	

}
