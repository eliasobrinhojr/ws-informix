package br.com.componel.ssp.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Prestador implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cdpre;
	private String cdirf;
	private String idpre;
	private String cdcgc;
	private String cdmun;
	private String dspre;
	private String ender;
	private String cdcep;
	private String ctadi;
	private String ctiss;
	private String ctirf;
	private String ctgps;
	private String ctdesc;
	private String ctjur;
	private String nmpre;
	private String stpre;
	private String cdemp;
	private String cdcent;
	private String inscgps;
	private String ctpcc;
	private String ctcof;
	private String ctpis;
	private String ctcsl;
	private String flinscprefsp;
	

	@Override
	public String toString() {
		return "Prestador [cdpre=" + cdpre + ", cdirf=" + cdirf + ", idpre=" + idpre + ", cdcgc=" + cdcgc + ", cdmun="
				+ cdmun + ", dspre=" + dspre + ", ender=" + ender + ", cdcep=" + cdcep + ", ctadi=" + ctadi + ", ctiss="
				+ ctiss + ", ctirf=" + ctirf + ", ctgps=" + ctgps + ", ctdesc=" + ctdesc + ", ctjur=" + ctjur
				+ ", nmpre=" + nmpre + ", stpre=" + stpre + ", cdemp=" + cdemp + ", cdcent=" + cdcent + ", inscgps="
				+ inscgps + ", ctpcc=" + ctpcc + ", ctcof=" + ctcof + ", ctpis=" + ctpis + ", ctcsl=" + ctcsl
				+ ", flinscprefsp=" + flinscprefsp + "]";
	}

	public String getCdpre() {
		return cdpre;
	}

	public void setCdpre(String cdpre) {
		this.cdpre = cdpre;
	}

	public String getCdirf() {
		return cdirf;
	}

	public void setCdirf(String cdirf) {
		this.cdirf = cdirf;
	}

	public String getIdpre() {
		return idpre;
	}

	public void setIdpre(String idpre) {
		this.idpre = idpre;
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

	public String getDspre() {
		return dspre;
	}

	public void setDspre(String dspre) {
		this.dspre = dspre;
	}

	public String getEnder() {
		return ender;
	}

	public void setEnder(String ender) {
		this.ender = ender;
	}

	public String getCdcep() {
		return cdcep;
	}

	public void setCdcep(String cdcep) {
		this.cdcep = cdcep;
	}

	public String getCtadi() {
		return ctadi;
	}

	public void setCtadi(String ctadi) {
		this.ctadi = ctadi;
	}

	public String getCtiss() {
		return ctiss;
	}

	public void setCtiss(String ctiss) {
		this.ctiss = ctiss;
	}

	public String getCtirf() {
		return ctirf;
	}

	public void setCtirf(String ctirf) {
		this.ctirf = ctirf;
	}

	public String getCtgps() {
		return ctgps;
	}

	public void setCtgps(String ctgps) {
		this.ctgps = ctgps;
	}

	public String getCtdesc() {
		return ctdesc;
	}

	public void setCtdesc(String ctdesc) {
		this.ctdesc = ctdesc;
	}

	public String getCtjur() {
		return ctjur;
	}

	public void setCtjur(String ctjur) {
		this.ctjur = ctjur;
	}

	public String getNmpre() {
		return nmpre;
	}

	public void setNmpre(String nmpre) {
		this.nmpre = nmpre;
	}

	public String getStpre() {
		return stpre;
	}

	public void setStpre(String stpre) {
		this.stpre = stpre;
	}

	public String getCdemp() {
		return cdemp;
	}

	public void setCdemp(String cdemp) {
		this.cdemp = cdemp;
	}

	public String getCdcent() {
		return cdcent;
	}

	public void setCdcent(String cdcent) {
		this.cdcent = cdcent;
	}

	public String getInscgps() {
		return inscgps;
	}

	public void setInscgps(String inscgps) {
		this.inscgps = inscgps;
	}

	public String getCtpcc() {
		return ctpcc;
	}

	public void setCtpcc(String ctpcc) {
		this.ctpcc = ctpcc;
	}

	public String getCtcof() {
		return ctcof;
	}

	public void setCtcof(String ctcof) {
		this.ctcof = ctcof;
	}

	public String getCtpis() {
		return ctpis;
	}

	public void setCtpis(String ctpis) {
		this.ctpis = ctpis;
	}

	public String getCtcsl() {
		return ctcsl;
	}

	public void setCtcsl(String ctcsl) {
		this.ctcsl = ctcsl;
	}

	public String getFlinscprefsp() {
		return flinscprefsp;
	}

	public void setFlinscprefsp(String flinscprefsp) {
		this.flinscprefsp = flinscprefsp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
