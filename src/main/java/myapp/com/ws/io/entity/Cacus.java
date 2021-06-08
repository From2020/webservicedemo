/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Administrator
 */
@Entity
@Table(catalog = "ZABDB", schema = "dbo",name = "cacus")
public class Cacus implements Serializable {

	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	private int zid;
	@Basic(optional = false)
	@javax.persistence.Id
	private String xcus;
	@Temporal(TemporalType.TIMESTAMP)
	private Date ztime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date zutime;
	private String zauserid;
	private String zuuserid;
	private String xorg;
	private String xmadd;
	private String xemail;
	private String xphone;
	private String xfax;
	private String xurl;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	private BigDecimal xcrlimit;
	private String xgcus;
	private String xstatuscus;
	private String xwh;
	private String xmio;
	private String xterritory;
	private String xmarket;
	private String xfm;
	private String xdistrict;
	private String xthana;
	private String xfield;
	private Integer xcrterms;
	private String xpaymentterm;
	private String xproject;
	@Temporal(TemporalType.TIMESTAMP)
	private Date xdateeff;
	@Temporal(TemporalType.TIMESTAMP)
	private Date xdateexp;
	private String xso;
	private String xroute;
	@Temporal(TemporalType.DATE)
	private Date xlastcrdate;
	private String xinvtoinvcr;
	private String xallowcrinv;
	private String xallbndisc;
	private String xcode;
	private String xref;
	@Temporal(TemporalType.DATE)
	private Date xdate;
	private String xcontact;
	private BigDecimal xdisc;
	private String xsp;
	private String xoldcus;
	@Lob
	private byte[] xcrtermtype;
	private String xgsup;
	private String xtype;
	private String xsupcat;
	private String xmobile;
	private BigDecimal xcomm;
	private String xindustry;
	private String xsizeofemp;
	private BigDecimal xannualincome;
	private String xcustype;
	private String xcomments;
	private String xfbsite;
	private String xtwitersite;
	private String xskype;
	private String xpadd;
	private String xsite;
	private BigDecimal xcomm1;
	private BigDecimal xcomm2;
	private BigDecimal xcomm3;
	private BigDecimal xassessval1;
	private BigDecimal xassessval2;
	private BigDecimal xassessval3;
	private BigDecimal xsamtjar;
	private BigDecimal xsamtdispat;
	private String xpaymenttype;
	private String xcusold;
	private String xrsm;

	public Cacus() {
	}

	public Date getZtime() {
		return ztime;
	}

	public void setZtime(Date ztime) {
		this.ztime = ztime;
	}

	public Date getZutime() {
		return zutime;
	}

	public void setZutime(Date zutime) {
		this.zutime = zutime;
	}

	public String getZauserid() {
		return zauserid;
	}

	public void setZauserid(String zauserid) {
		this.zauserid = zauserid;
	}

	public String getZuuserid() {
		return zuuserid;
	}

	public void setZuuserid(String zuuserid) {
		this.zuuserid = zuuserid;
	}

	public String getXorg() {
		return xorg;
	}

	public void setXorg(String xorg) {
		this.xorg = xorg;
	}

	public String getXmadd() {
		return xmadd;
	}

	public void setXmadd(String xmadd) {
		this.xmadd = xmadd;
	}

	public String getXemail() {
		return xemail;
	}

	public void setXemail(String xemail) {
		this.xemail = xemail;
	}

	public String getXphone() {
		return xphone;
	}

	public void setXphone(String xphone) {
		this.xphone = xphone;
	}

	public String getXfax() {
		return xfax;
	}

	public void setXfax(String xfax) {
		this.xfax = xfax;
	}

	public String getXurl() {
		return xurl;
	}

	public void setXurl(String xurl) {
		this.xurl = xurl;
	}

	public BigDecimal getXcrlimit() {
		return xcrlimit;
	}

	public void setXcrlimit(BigDecimal xcrlimit) {
		this.xcrlimit = xcrlimit;
	}

	public String getXgcus() {
		return xgcus;
	}

	public void setXgcus(String xgcus) {
		this.xgcus = xgcus;
	}

	public String getXstatuscus() {
		return xstatuscus;
	}

	public void setXstatuscus(String xstatuscus) {
		this.xstatuscus = xstatuscus;
	}

	public String getXwh() {
		return xwh;
	}

	public void setXwh(String xwh) {
		this.xwh = xwh;
	}

	public String getXmio() {
		return xmio;
	}

	public void setXmio(String xmio) {
		this.xmio = xmio;
	}

	public String getXterritory() {
		return xterritory;
	}

	public void setXterritory(String xterritory) {
		this.xterritory = xterritory;
	}

	public String getXmarket() {
		return xmarket;
	}

	public void setXmarket(String xmarket) {
		this.xmarket = xmarket;
	}

	public String getXfm() {
		return xfm;
	}

	public void setXfm(String xfm) {
		this.xfm = xfm;
	}

	public String getXdistrict() {
		return xdistrict;
	}

	public void setXdistrict(String xdistrict) {
		this.xdistrict = xdistrict;
	}

	public String getXthana() {
		return xthana;
	}

	public void setXthana(String xthana) {
		this.xthana = xthana;
	}

	public String getXfield() {
		return xfield;
	}

	public void setXfield(String xfield) {
		this.xfield = xfield;
	}

	public Integer getXcrterms() {
		return xcrterms;
	}

	public void setXcrterms(Integer xcrterms) {
		this.xcrterms = xcrterms;
	}

	public String getXpaymentterm() {
		return xpaymentterm;
	}

	public void setXpaymentterm(String xpaymentterm) {
		this.xpaymentterm = xpaymentterm;
	}

	public String getXproject() {
		return xproject;
	}

	public void setXproject(String xproject) {
		this.xproject = xproject;
	}

	public Date getXdateeff() {
		return xdateeff;
	}

	public void setXdateeff(Date xdateeff) {
		this.xdateeff = xdateeff;
	}

	public Date getXdateexp() {
		return xdateexp;
	}

	public void setXdateexp(Date xdateexp) {
		this.xdateexp = xdateexp;
	}

	public String getXso() {
		return xso;
	}

	public void setXso(String xso) {
		this.xso = xso;
	}

	public String getXroute() {
		return xroute;
	}

	public void setXroute(String xroute) {
		this.xroute = xroute;
	}

	public Date getXlastcrdate() {
		return xlastcrdate;
	}

	public void setXlastcrdate(Date xlastcrdate) {
		this.xlastcrdate = xlastcrdate;
	}

	public String getXinvtoinvcr() {
		return xinvtoinvcr;
	}

	public void setXinvtoinvcr(String xinvtoinvcr) {
		this.xinvtoinvcr = xinvtoinvcr;
	}

	public String getXallowcrinv() {
		return xallowcrinv;
	}

	public void setXallowcrinv(String xallowcrinv) {
		this.xallowcrinv = xallowcrinv;
	}

	public String getXallbndisc() {
		return xallbndisc;
	}

	public void setXallbndisc(String xallbndisc) {
		this.xallbndisc = xallbndisc;
	}

	public String getXcode() {
		return xcode;
	}

	public void setXcode(String xcode) {
		this.xcode = xcode;
	}

	public String getXref() {
		return xref;
	}

	public void setXref(String xref) {
		this.xref = xref;
	}

	public Date getXdate() {
		return xdate;
	}

	public void setXdate(Date xdate) {
		this.xdate = xdate;
	}

	public String getXcontact() {
		return xcontact;
	}

	public void setXcontact(String xcontact) {
		this.xcontact = xcontact;
	}

	public BigDecimal getXdisc() {
		return xdisc;
	}

	public void setXdisc(BigDecimal xdisc) {
		this.xdisc = xdisc;
	}

	public String getXsp() {
		return xsp;
	}

	public void setXsp(String xsp) {
		this.xsp = xsp;
	}

	public String getXoldcus() {
		return xoldcus;
	}

	public void setXoldcus(String xoldcus) {
		this.xoldcus = xoldcus;
	}

	public byte[] getXcrtermtype() {
		return xcrtermtype;
	}

	public void setXcrtermtype(byte[] xcrtermtype) {
		this.xcrtermtype = xcrtermtype;
	}

	public String getXgsup() {
		return xgsup;
	}

	public void setXgsup(String xgsup) {
		this.xgsup = xgsup;
	}

	public String getXtype() {
		return xtype;
	}

	public void setXtype(String xtype) {
		this.xtype = xtype;
	}

	public String getXsupcat() {
		return xsupcat;
	}

	public void setXsupcat(String xsupcat) {
		this.xsupcat = xsupcat;
	}

	public String getXmobile() {
		return xmobile;
	}

	public void setXmobile(String xmobile) {
		this.xmobile = xmobile;
	}

	public BigDecimal getXcomm() {
		return xcomm;
	}

	public void setXcomm(BigDecimal xcomm) {
		this.xcomm = xcomm;
	}

	public String getXindustry() {
		return xindustry;
	}

	public void setXindustry(String xindustry) {
		this.xindustry = xindustry;
	}

	public String getXsizeofemp() {
		return xsizeofemp;
	}

	public void setXsizeofemp(String xsizeofemp) {
		this.xsizeofemp = xsizeofemp;
	}

	public BigDecimal getXannualincome() {
		return xannualincome;
	}

	public void setXannualincome(BigDecimal xannualincome) {
		this.xannualincome = xannualincome;
	}

	public String getXcustype() {
		return xcustype;
	}

	public void setXcustype(String xcustype) {
		this.xcustype = xcustype;
	}

	public String getXcomments() {
		return xcomments;
	}

	public void setXcomments(String xcomments) {
		this.xcomments = xcomments;
	}

	public String getXfbsite() {
		return xfbsite;
	}

	public void setXfbsite(String xfbsite) {
		this.xfbsite = xfbsite;
	}

	public String getXtwitersite() {
		return xtwitersite;
	}

	public void setXtwitersite(String xtwitersite) {
		this.xtwitersite = xtwitersite;
	}

	public String getXskype() {
		return xskype;
	}

	public void setXskype(String xskype) {
		this.xskype = xskype;
	}

	public String getXpadd() {
		return xpadd;
	}

	public void setXpadd(String xpadd) {
		this.xpadd = xpadd;
	}

	public String getXsite() {
		return xsite;
	}

	public void setXsite(String xsite) {
		this.xsite = xsite;
	}

	public BigDecimal getXcomm1() {
		return xcomm1;
	}

	public void setXcomm1(BigDecimal xcomm1) {
		this.xcomm1 = xcomm1;
	}

	public BigDecimal getXcomm2() {
		return xcomm2;
	}

	public void setXcomm2(BigDecimal xcomm2) {
		this.xcomm2 = xcomm2;
	}

	public BigDecimal getXcomm3() {
		return xcomm3;
	}

	public void setXcomm3(BigDecimal xcomm3) {
		this.xcomm3 = xcomm3;
	}

	public BigDecimal getXassessval1() {
		return xassessval1;
	}

	public void setXassessval1(BigDecimal xassessval1) {
		this.xassessval1 = xassessval1;
	}

	public BigDecimal getXassessval2() {
		return xassessval2;
	}

	public void setXassessval2(BigDecimal xassessval2) {
		this.xassessval2 = xassessval2;
	}

	public BigDecimal getXassessval3() {
		return xassessval3;
	}

	public void setXassessval3(BigDecimal xassessval3) {
		this.xassessval3 = xassessval3;
	}

	public BigDecimal getXsamtjar() {
		return xsamtjar;
	}

	public void setXsamtjar(BigDecimal xsamtjar) {
		this.xsamtjar = xsamtjar;
	}

	public BigDecimal getXsamtdispat() {
		return xsamtdispat;
	}

	public void setXsamtdispat(BigDecimal xsamtdispat) {
		this.xsamtdispat = xsamtdispat;
	}

	public String getXpaymenttype() {
		return xpaymenttype;
	}

	public void setXpaymenttype(String xpaymenttype) {
		this.xpaymenttype = xpaymenttype;
	}

	public String getXcusold() {
		return xcusold;
	}

	public void setXcusold(String xcusold) {
		this.xcusold = xcusold;
	}

	public String getXrsm() {
		return xrsm;
	}

	public void setXrsm(String xrsm) {
		this.xrsm = xrsm;
	}

	public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public String getXcus() {
		return xcus;
	}

	public void setXcus(String xcus) {
		this.xcus = xcus;
	}

}
