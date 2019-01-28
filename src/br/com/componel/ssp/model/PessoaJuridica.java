package br.com.componel.ssp.model;

import java.io.Serializable;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaJuridica implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cdemp;
	private String cdpre;
	private Integer cddoc;
	private String cdpar;
	private Date dtdoc;
	private Date dtdig;
	private Date dtpag;
	private String cdser;
	private Float vldes;
	private String ctdes;
	private Float vladi;
	private String ctadi;
	private Float qtiss;
	private Float qtirf;
	private Float vliss;
	private String ctiss;
	private Float vlirf;
	private String ctirf;
	private Float vlgps;
	private String ctgps;
	private Float vlliq;
	private String obser;
	private String stimp;
	private String prpgto;
	private Float vldesc;
	private String ctdesc;
	private Float vljur;
	private String ctjur;
	private Date dtreal;
	private Float vlpcc;
	private String ctpcc;
	private Float qtpcc;
	private String serie;
	private Float qtpis;
	private Float vlpis;
	private String ctpis;
	private Float qtcof;
	private Float vlcof;
	private String ctcof;
	private Float qtcsl;
	private Float vlcsl;
	private String ctcsl;
	private Float qtpcc1;
	private Float vlpcc1;
	private String ctpcc1;
	private String cdpcc1;
	private Float qtpcc2;
	private Float vlpcc2;
	private String ctpcc2;
	private String cdpcc2;
	private Float bspcc1;
	private Float bspcc2;
	private Float bsiss;
	private Integer ideletronica;
	private Date dthorlanc;
	private String cdusu;
	private Float bsirf;
	private Date dthorinterface;
	private Integer tpscod;
	private Integer cdregtrib;
	private Float bspiscofins;
	
	
	
	@Override
	public String toString() {
		return "PessoaJuridica [cdemp=" + cdemp + ", cdpre=" + cdpre + ", cddoc=" + cddoc + ", cdpar=" + cdpar
				+ ", dtdoc=" + dtdoc + ", dtdig=" + dtdig + ", dtpag=" + dtpag + ", cdser=" + cdser + ", vldes=" + vldes
				+ ", ctdes=" + ctdes + ", vladi=" + vladi + ", ctadi=" + ctadi + ", qtiss=" + qtiss + ", qtirf=" + qtirf
				+ ", vliss=" + vliss + ", ctiss=" + ctiss + ", vlirf=" + vlirf + ", ctirf=" + ctirf + ", vlgps=" + vlgps
				+ ", ctgps=" + ctgps + ", vlliq=" + vlliq + ", obser=" + obser + ", stimp=" + stimp + ", prpgto="
				+ prpgto + ", vldesc=" + vldesc + ", ctdesc=" + ctdesc + ", vljur=" + vljur + ", ctjur=" + ctjur
				+ ", dtreal=" + dtreal + ", vlpcc=" + vlpcc + ", ctpcc=" + ctpcc + ", qtpcc=" + qtpcc + ", serie="
				+ serie + ", qtpis=" + qtpis + ", vlpis=" + vlpis + ", ctpis=" + ctpis + ", qtcof=" + qtcof + ", vlcof="
				+ vlcof + ", ctcof=" + ctcof + ", qtcsl=" + qtcsl + ", vlcsl=" + vlcsl + ", ctcsl=" + ctcsl
				+ ", qtpcc1=" + qtpcc1 + ", vlpcc1=" + vlpcc1 + ", ctpcc1=" + ctpcc1 + ", cdpcc1=" + cdpcc1
				+ ", qtpcc2=" + qtpcc2 + ", vlpcc2=" + vlpcc2 + ", ctpcc2=" + ctpcc2 + ", cdpcc2=" + cdpcc2
				+ ", bspcc1=" + bspcc1 + ", bspcc2=" + bspcc2 + ", bsiss=" + bsiss + ", ideletronica=" + ideletronica
				+ ", dthorlanc=" + dthorlanc + ", cdusu=" + cdusu + ", bsirf=" + bsirf + ", dthorinterface="
				+ dthorinterface + ", tpscod=" + tpscod + ", cdregtrib=" + cdregtrib + ", bspiscofins=" + bspiscofins
				+ "]";
	}
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
	public String getCdpar() {
		return cdpar;
	}
	public void setCdpar(String cdpar) {
		this.cdpar = cdpar;
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
	public String getCdser() {
		return cdser;
	}
	public void setCdser(String cdser) {
		this.cdser = cdser;
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
	public Float getQtiss() {
		return qtiss;
	}
	public void setQtiss(Float qtiss) {
		this.qtiss = qtiss;
	}
	public Float getQtirf() {
		return qtirf;
	}
	public void setQtirf(Float qtirf) {
		this.qtirf = qtirf;
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
	public Float getVlliq() {
		return vlliq;
	}
	public void setVlliq(Float vlliq) {
		this.vlliq = vlliq;
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
	public Float getVlpcc() {
		return vlpcc;
	}
	public void setVlpcc(Float vlpcc) {
		this.vlpcc = vlpcc;
	}
	public String getCtpcc() {
		return ctpcc;
	}
	public void setCtpcc(String ctpcc) {
		this.ctpcc = ctpcc;
	}
	public Float getQtpcc() {
		return qtpcc;
	}
	public void setQtpcc(Float qtpcc) {
		this.qtpcc = qtpcc;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Float getQtpis() {
		return qtpis;
	}
	public void setQtpis(Float qtpis) {
		this.qtpis = qtpis;
	}
	public Float getVlpis() {
		return vlpis;
	}
	public void setVlpis(Float vlpis) {
		this.vlpis = vlpis;
	}
	public String getCtpis() {
		return ctpis;
	}
	public void setCtpis(String ctpis) {
		this.ctpis = ctpis;
	}
	public Float getQtcof() {
		return qtcof;
	}
	public void setQtcof(Float qtcof) {
		this.qtcof = qtcof;
	}
	public Float getVlcof() {
		return vlcof;
	}
	public void setVlcof(Float vlcof) {
		this.vlcof = vlcof;
	}
	public String getCtcof() {
		return ctcof;
	}
	public void setCtcof(String ctcof) {
		this.ctcof = ctcof;
	}
	public Float getQtcsl() {
		return qtcsl;
	}
	public void setQtcsl(Float qtcsl) {
		this.qtcsl = qtcsl;
	}
	public Float getVlcsl() {
		return vlcsl;
	}
	public void setVlcsl(Float vlcsl) {
		this.vlcsl = vlcsl;
	}
	public String getCtcsl() {
		return ctcsl;
	}
	public void setCtcsl(String ctcsl) {
		this.ctcsl = ctcsl;
	}
	public Float getQtpcc1() {
		return qtpcc1;
	}
	public void setQtpcc1(Float qtpcc1) {
		this.qtpcc1 = qtpcc1;
	}
	public Float getVlpcc1() {
		return vlpcc1;
	}
	public void setVlpcc1(Float vlpcc1) {
		this.vlpcc1 = vlpcc1;
	}
	public String getCtpcc1() {
		return ctpcc1;
	}
	public void setCtpcc1(String ctpcc1) {
		this.ctpcc1 = ctpcc1;
	}
	public String getCdpcc1() {
		return cdpcc1;
	}
	public void setCdpcc1(String cdpcc1) {
		this.cdpcc1 = cdpcc1;
	}
	public Float getQtpcc2() {
		return qtpcc2;
	}
	public void setQtpcc2(Float qtpcc2) {
		this.qtpcc2 = qtpcc2;
	}
	public Float getVlpcc2() {
		return vlpcc2;
	}
	public void setVlpcc2(Float vlpcc2) {
		this.vlpcc2 = vlpcc2;
	}
	public String getCtpcc2() {
		return ctpcc2;
	}
	public void setCtpcc2(String ctpcc2) {
		this.ctpcc2 = ctpcc2;
	}
	public String getCdpcc2() {
		return cdpcc2;
	}
	public void setCdpcc2(String cdpcc2) {
		this.cdpcc2 = cdpcc2;
	}
	public Float getBspcc1() {
		return bspcc1;
	}
	public void setBspcc1(Float bspcc1) {
		this.bspcc1 = bspcc1;
	}
	public Float getBspcc2() {
		return bspcc2;
	}
	public void setBspcc2(Float bspcc2) {
		this.bspcc2 = bspcc2;
	}
	public Float getBsiss() {
		return bsiss;
	}
	public void setBsiss(Float bsiss) {
		this.bsiss = bsiss;
	}
	public Integer getIdeletronica() {
		return ideletronica;
	}
	public void setIdeletronica(Integer ideletronica) {
		this.ideletronica = ideletronica;
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
	public Float getBsirf() {
		return bsirf;
	}
	public void setBsirf(Float bsirf) {
		this.bsirf = bsirf;
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
	public Float getBspiscofins() {
		return bspiscofins;
	}
	public void setBspiscofins(Float bspiscofins) {
		this.bspiscofins = bspiscofins;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
