package br.com.componel.ssp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaFisica implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cdemp;
	private String cdpre;
	private Integer cddoc;
	private Date dtdoc;
	private Date dtdig;
	private Date dtpag;
	private Float vldes;
	private String ctdes;
	private Float vladi;
	private String ctadi;
	private String cdser;
	private Float qtser;
	private Float vlser;
	private Integer qtdep;
	private Float vluni;
	private Float vldep;
	private Float vlbas;
	private Float vlded;
	private Float qtirf;
	private Float vlirf;
	private String ctirf;
	private Float qtiss;
	private Float vliss;
	private String ctiss;
	private Float vlliq;
	private String cdseq;
	private String obser;
	private String stimp;
	private String prpgto;
	private Float vldesc;
	private String ctdesc;
	private Float vljur;
	private String ctjur;
	private Date dtreal;
	private Float qtgps;
	private Float vlbsgps;
	private Float vlgps;
	private String ctgps;
	private String serie;
	private Date dthorlanc;
	private String cdusu;
	private Date dthorinterface;
	private Integer tpscod;
	private Integer cdregtrib;
	private Integer ideletronica;

	public String getCdemp() {
		return cdemp;
	}

	public void setCdemp(String cdemp) {
		this.cdemp = cdemp;
	}

	public String getCdpre() {
		return cdpre;
	}

	public void setCdpre(String cdpre) {
		this.cdpre = cdpre;
	}

	public Integer getCddoc() {
		return cddoc;
	}

	public void setCddoc(Integer cddoc) {
		this.cddoc = cddoc;
	}

	public Date getDtdoc() {
		return dtdoc;
	}

	public void setDtdoc(Date dtdoc) {
		this.dtdoc = dtdoc;
	}

	public Date getDtdig() {
		return dtdig;
	}

	public void setDtdig(Date dtdig) {
		this.dtdig = dtdig;
	}

	public Date getDtpag() {
		return dtpag;
	}

	public void setDtpag(Date dtpag) {
		this.dtpag = dtpag;
	}

	public Float getVldes() {
		return vldes;
	}

	public void setVldes(Float vldes) {
		this.vldes = vldes;
	}

	public String getCtdes() {
		return ctdes;
	}

	public void setCtdes(String ctdes) {
		this.ctdes = ctdes;
	}

	public Float getVladi() {
		return vladi;
	}

	public void setVladi(Float vladi) {
		this.vladi = vladi;
	}

	public String getCtadi() {
		return ctadi;
	}

	public void setCtadi(String ctadi) {
		this.ctadi = ctadi;
	}

	public String getCdser() {
		return cdser;
	}

	public void setCdser(String cdser) {
		this.cdser = cdser;
	}

	public Float getQtser() {
		return qtser;
	}

	public void setQtser(Float qtser) {
		this.qtser = qtser;
	}

	public Float getVlser() {
		return vlser;
	}

	public void setVlser(Float vlser) {
		this.vlser = vlser;
	}

	public Integer getQtdep() {
		return qtdep;
	}

	public void setQtdep(Integer qtdep) {
		this.qtdep = qtdep;
	}

	public Float getVluni() {
		return vluni;
	}

	public void setVluni(Float vluni) {
		this.vluni = vluni;
	}

	public Float getVldep() {
		return vldep;
	}

	public void setVldep(Float vldep) {
		this.vldep = vldep;
	}

	public Float getVlbas() {
		return vlbas;
	}

	public void setVlbas(Float vlbas) {
		this.vlbas = vlbas;
	}

	public Float getVlded() {
		return vlded;
	}

	public void setVlded(Float vlded) {
		this.vlded = vlded;
	}

	public Float getQtirf() {
		return qtirf;
	}

	public void setQtirf(Float qtirf) {
		this.qtirf = qtirf;
	}

	public Float getVlirf() {
		return vlirf;
	}

	public void setVlirf(Float vlirf) {
		this.vlirf = vlirf;
	}

	public String getCtirf() {
		return ctirf;
	}

	public void setCtirf(String ctirf) {
		this.ctirf = ctirf;
	}

	public Float getQtiss() {
		return qtiss;
	}

	public void setQtiss(Float qtiss) {
		this.qtiss = qtiss;
	}

	public Float getVliss() {
		return vliss;
	}

	public void setVliss(Float vliss) {
		this.vliss = vliss;
	}

	public String getCtiss() {
		return ctiss;
	}

	public void setCtiss(String ctiss) {
		this.ctiss = ctiss;
	}

	public Float getVlliq() {
		return vlliq;
	}

	public void setVlliq(Float vlliq) {
		this.vlliq = vlliq;
	}

	public String getCdseq() {
		return cdseq;
	}

	public void setCdseq(String cdseq) {
		this.cdseq = cdseq;
	}

	public String getObser() {
		return obser;
	}

	public void setObser(String obser) {
		this.obser = obser;
	}

	public String getStimp() {
		return stimp;
	}

	public void setStimp(String stimp) {
		this.stimp = stimp;
	}

	public String getPrpgto() {
		return prpgto;
	}

	public void setPrpgto(String prpgto) {
		this.prpgto = prpgto;
	}

	public Float getVldesc() {
		return vldesc;
	}

	public void setVldesc(Float vldesc) {
		this.vldesc = vldesc;
	}

	public String getCtdesc() {
		return ctdesc;
	}

	public void setCtdesc(String ctdesc) {
		this.ctdesc = ctdesc;
	}

	public Float getVljur() {
		return vljur;
	}

	public void setVljur(Float vljur) {
		this.vljur = vljur;
	}

	public String getCtjur() {
		return ctjur;
	}

	public void setCtjur(String ctjur) {
		this.ctjur = ctjur;
	}

	public Date getDtreal() {
		return dtreal;
	}

	public void setDtreal(Date dtreal) {
		this.dtreal = dtreal;
	}

	public Float getQtgps() {
		return qtgps;
	}

	public void setQtgps(Float qtgps) {
		this.qtgps = qtgps;
	}

	public Float getVlbsgps() {
		return vlbsgps;
	}

	public void setVlbsgps(Float vlbsgps) {
		this.vlbsgps = vlbsgps;
	}

	public Float getVlgps() {
		return vlgps;
	}

	public void setVlgps(Float vlgps) {
		this.vlgps = vlgps;
	}

	public String getCtgps() {
		return ctgps;
	}

	public void setCtgps(String ctgps) {
		this.ctgps = ctgps;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Date getDthorlanc() {
		return dthorlanc;
	}

	public void setDthorlanc(Date dthorlanc) {
		this.dthorlanc = dthorlanc;
	}

	public String getCdusu() {
		return cdusu;
	}

	public void setCdusu(String cdusu) {
		this.cdusu = cdusu;
	}

	public Date getDthorinterface() {
		return dthorinterface;
	}

	public void setDthorinterface(Date dthorinterface) {
		this.dthorinterface = dthorinterface;
	}

	public Integer getTpscod() {
		return tpscod;
	}

	public void setTpscod(Integer tpscod) {
		this.tpscod = tpscod;
	}

	public Integer getCdregtrib() {
		return cdregtrib;
	}

	public void setCdregtrib(Integer cdregtrib) {
		this.cdregtrib = cdregtrib;
	}

	public Integer getIdeletronica() {
		return ideletronica;
	}

	public void setIdeletronica(Integer ideletronica) {
		this.ideletronica = ideletronica;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
