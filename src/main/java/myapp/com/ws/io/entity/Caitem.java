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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "caitem", catalog = "ZABDB", schema = "dbo")

public class Caitem implements Serializable {

	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	@Column(name = "zid")
	private int zid;
	@Id
	@Basic(optional = false)
	@Column(name = "xitem")
	private String xitem;
	@Column(name = "ztime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date ztime;
	@Column(name = "zutime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date zutime;
	@Column(name = "zauserid")
	private String zauserid;
	@Column(name = "zuuserid")
	private String zuuserid;
	@Column(name = "xdesc")
	private String xdesc;
	@Column(name = "xgitem")
	private String xgitem;
	@Column(name = "xcitem")
	private String xcitem;
	@Column(name = "xcatitem")
	private String xcatitem;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "xrate")
	private BigDecimal xrate;
	@Column(name = "xunitpur")
	private String xunitpur;
	@Column(name = "xcost")
	private BigDecimal xcost;
	@Column(name = "xvatamt")
	private BigDecimal xvatamt;
	@Column(name = "xunit")
	private String xunit;
	@Column(name = "xlong")
	private String xlong;
	@Column(name = "xtitem")
	private String xtitem;
	@Column(name = "xreordlvl")
	private BigDecimal xreordlvl;
	@Column(name = "xlmax")
	private BigDecimal xlmax;
	@Column(name = "xlmin")
	private BigDecimal xlmin;
	@Column(name = "xbin")
	private String xbin;
	@Column(name = "xstype")
	private String xstype;
	@Column(name = "xalias")
	private String xalias;
	@Column(name = "xmrp")
	private BigDecimal xmrp;
	@Column(name = "xpacking")
	private String xpacking;
	@Column(name = "xdisc")
	private BigDecimal xdisc;
	@Column(name = "xcartoon")
	private BigDecimal xcartoon;
	@Column(name = "xdateeff")
	@Temporal(TemporalType.TIMESTAMP)
	private Date xdateeff;
	@Column(name = "xdateexp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date xdateexp;
	@Column(name = "xspecification")
	private String xspecification;
	@Column(name = "xrateexp")
	private BigDecimal xrateexp;
	@Column(name = "xhscode")
	private String xhscode;
	@Column(name = "xpackqty")
	private BigDecimal xpackqty;
	@Column(name = "zactive")
	private String zactive;
	@Column(name = "xdiscstatus")
	private String xdiscstatus;
	@Column(name = "xbnprintstatus")
	private String xbnprintstatus;
	@Column(name = "xbrand")
	private String xbrand;
	@Column(name = "xcfpur")
	private BigDecimal xcfpur;
	@Column(name = "xcfsel")
	private BigDecimal xcfsel;
	@Column(name = "xcfiss")
	private BigDecimal xcfiss;
	@Column(name = "xcfpck")
	private BigDecimal xcfpck;
	@Column(name = "xunitsel")
	private String xunitsel;
	@Column(name = "xunitiss")
	private String xunitiss;
	@Column(name = "xdealerp")
	private BigDecimal xdealerp;
	@Column(name = "xpsize")
	private String xpsize;
	@Column(name = "xpnature")
	private String xpnature;
	@Column(name = "xshelf")
	private String xshelf;
	@Column(name = "xvatrate")
	private BigDecimal xvatrate;
	@Column(name = "xirccode")
	private String xirccode;
	@Column(name = "xconstruction")
	private String xconstruction;
	@Column(name = "xcomposition")
	private String xcomposition;
	@Column(name = "xfabriccolor")
	private String xfabriccolor;
	@Column(name = "xgsm")
	private String xgsm;
	@Column(name = "xwidth")
	private String xwidth;
	@Column(name = "xlead")
	private Integer xlead;
	@Column(name = "xcus")
	private String xcus;
	@Column(name = "xwh")
	private String xwh;
	@Column(name = "xleadf")
	private Integer xleadf;
	@Column(name = "xleadv")
	private Integer xleadv;
	@Column(name = "xleadt")
	private Integer xleadt;
	@Column(name = "xgrade")
	private String xgrade;
	@Column(name = "xsafetystk")
	private BigDecimal xsafetystk;
	@Column(name = "xordmult")
	private BigDecimal xordmult;
	@Column(name = "xpoprcstime")
	private Integer xpoprcstime;
	@Column(name = "xinhouseprdtime")
	private Integer xinhouseprdtime;
	@Column(name = "xgrnprcstime")
	private Integer xgrnprcstime;
	@Column(name = "xsup")
	private String xsup;
	@Column(name = "ximageurl")
	private String ximageurl;

	public Caitem() {
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

	public String getXdesc() {
		return xdesc;
	}

	public void setXdesc(String xdesc) {
		this.xdesc = xdesc;
	}

	public String getXgitem() {
		return xgitem;
	}

	public void setXgitem(String xgitem) {
		this.xgitem = xgitem;
	}

	public String getXcitem() {
		return xcitem;
	}

	public void setXcitem(String xcitem) {
		this.xcitem = xcitem;
	}

	public String getXcatitem() {
		return xcatitem;
	}

	public void setXcatitem(String xcatitem) {
		this.xcatitem = xcatitem;
	}

	public BigDecimal getXrate() {
		return xrate;
	}

	public void setXrate(BigDecimal xrate) {
		this.xrate = xrate;
	}

	public String getXunitpur() {
		return xunitpur;
	}

	public void setXunitpur(String xunitpur) {
		this.xunitpur = xunitpur;
	}

	public BigDecimal getXcost() {
		return xcost;
	}

	public void setXcost(BigDecimal xcost) {
		this.xcost = xcost;
	}

	public BigDecimal getXvatamt() {
		return xvatamt;
	}

	public void setXvatamt(BigDecimal xvatamt) {
		this.xvatamt = xvatamt;
	}

	public String getXunit() {
		return xunit;
	}

	public void setXunit(String xunit) {
		this.xunit = xunit;
	}

	public String getXlong() {
		return xlong;
	}

	public void setXlong(String xlong) {
		this.xlong = xlong;
	}

	public String getXtitem() {
		return xtitem;
	}

	public void setXtitem(String xtitem) {
		this.xtitem = xtitem;
	}

	public BigDecimal getXreordlvl() {
		return xreordlvl;
	}

	public void setXreordlvl(BigDecimal xreordlvl) {
		this.xreordlvl = xreordlvl;
	}

	public BigDecimal getXlmax() {
		return xlmax;
	}

	public void setXlmax(BigDecimal xlmax) {
		this.xlmax = xlmax;
	}

	public BigDecimal getXlmin() {
		return xlmin;
	}

	public void setXlmin(BigDecimal xlmin) {
		this.xlmin = xlmin;
	}

	public String getXbin() {
		return xbin;
	}

	public void setXbin(String xbin) {
		this.xbin = xbin;
	}

	public String getXstype() {
		return xstype;
	}

	public void setXstype(String xstype) {
		this.xstype = xstype;
	}

	public String getXalias() {
		return xalias;
	}

	public void setXalias(String xalias) {
		this.xalias = xalias;
	}

	public BigDecimal getXmrp() {
		return xmrp;
	}

	public void setXmrp(BigDecimal xmrp) {
		this.xmrp = xmrp;
	}

	public String getXpacking() {
		return xpacking;
	}

	public void setXpacking(String xpacking) {
		this.xpacking = xpacking;
	}

	public BigDecimal getXdisc() {
		return xdisc;
	}

	public void setXdisc(BigDecimal xdisc) {
		this.xdisc = xdisc;
	}

	public BigDecimal getXcartoon() {
		return xcartoon;
	}

	public void setXcartoon(BigDecimal xcartoon) {
		this.xcartoon = xcartoon;
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

	public String getXspecification() {
		return xspecification;
	}

	public void setXspecification(String xspecification) {
		this.xspecification = xspecification;
	}

	public BigDecimal getXrateexp() {
		return xrateexp;
	}

	public void setXrateexp(BigDecimal xrateexp) {
		this.xrateexp = xrateexp;
	}

	public String getXhscode() {
		return xhscode;
	}

	public void setXhscode(String xhscode) {
		this.xhscode = xhscode;
	}

	public BigDecimal getXpackqty() {
		return xpackqty;
	}

	public void setXpackqty(BigDecimal xpackqty) {
		this.xpackqty = xpackqty;
	}

	public String getZactive() {
		return zactive;
	}

	public void setZactive(String zactive) {
		this.zactive = zactive;
	}

	public String getXdiscstatus() {
		return xdiscstatus;
	}

	public void setXdiscstatus(String xdiscstatus) {
		this.xdiscstatus = xdiscstatus;
	}

	public String getXbnprintstatus() {
		return xbnprintstatus;
	}

	public void setXbnprintstatus(String xbnprintstatus) {
		this.xbnprintstatus = xbnprintstatus;
	}

	public String getXbrand() {
		return xbrand;
	}

	public void setXbrand(String xbrand) {
		this.xbrand = xbrand;
	}

	public BigDecimal getXcfpur() {
		return xcfpur;
	}

	public void setXcfpur(BigDecimal xcfpur) {
		this.xcfpur = xcfpur;
	}

	public BigDecimal getXcfsel() {
		return xcfsel;
	}

	public void setXcfsel(BigDecimal xcfsel) {
		this.xcfsel = xcfsel;
	}

	public BigDecimal getXcfiss() {
		return xcfiss;
	}

	public void setXcfiss(BigDecimal xcfiss) {
		this.xcfiss = xcfiss;
	}

	public BigDecimal getXcfpck() {
		return xcfpck;
	}

	public void setXcfpck(BigDecimal xcfpck) {
		this.xcfpck = xcfpck;
	}

	public String getXunitsel() {
		return xunitsel;
	}

	public void setXunitsel(String xunitsel) {
		this.xunitsel = xunitsel;
	}

	public String getXunitiss() {
		return xunitiss;
	}

	public void setXunitiss(String xunitiss) {
		this.xunitiss = xunitiss;
	}

	public BigDecimal getXdealerp() {
		return xdealerp;
	}

	public void setXdealerp(BigDecimal xdealerp) {
		this.xdealerp = xdealerp;
	}

	public String getXpsize() {
		return xpsize;
	}

	public void setXpsize(String xpsize) {
		this.xpsize = xpsize;
	}

	public String getXpnature() {
		return xpnature;
	}

	public void setXpnature(String xpnature) {
		this.xpnature = xpnature;
	}

	public String getXshelf() {
		return xshelf;
	}

	public void setXshelf(String xshelf) {
		this.xshelf = xshelf;
	}

	public BigDecimal getXvatrate() {
		return xvatrate;
	}

	public void setXvatrate(BigDecimal xvatrate) {
		this.xvatrate = xvatrate;
	}

	public String getXirccode() {
		return xirccode;
	}

	public void setXirccode(String xirccode) {
		this.xirccode = xirccode;
	}

	public String getXconstruction() {
		return xconstruction;
	}

	public void setXconstruction(String xconstruction) {
		this.xconstruction = xconstruction;
	}

	public String getXcomposition() {
		return xcomposition;
	}

	public void setXcomposition(String xcomposition) {
		this.xcomposition = xcomposition;
	}

	public String getXfabriccolor() {
		return xfabriccolor;
	}

	public void setXfabriccolor(String xfabriccolor) {
		this.xfabriccolor = xfabriccolor;
	}

	public String getXgsm() {
		return xgsm;
	}

	public void setXgsm(String xgsm) {
		this.xgsm = xgsm;
	}

	public String getXwidth() {
		return xwidth;
	}

	public void setXwidth(String xwidth) {
		this.xwidth = xwidth;
	}

	public Integer getXlead() {
		return xlead;
	}

	public void setXlead(Integer xlead) {
		this.xlead = xlead;
	}

	public String getXcus() {
		return xcus;
	}

	public void setXcus(String xcus) {
		this.xcus = xcus;
	}

	public String getXwh() {
		return xwh;
	}

	public void setXwh(String xwh) {
		this.xwh = xwh;
	}

	public Integer getXleadf() {
		return xleadf;
	}

	public void setXleadf(Integer xleadf) {
		this.xleadf = xleadf;
	}

	public Integer getXleadv() {
		return xleadv;
	}

	public void setXleadv(Integer xleadv) {
		this.xleadv = xleadv;
	}

	public Integer getXleadt() {
		return xleadt;
	}

	public void setXleadt(Integer xleadt) {
		this.xleadt = xleadt;
	}

	public String getXgrade() {
		return xgrade;
	}

	public void setXgrade(String xgrade) {
		this.xgrade = xgrade;
	}

	public BigDecimal getXsafetystk() {
		return xsafetystk;
	}

	public void setXsafetystk(BigDecimal xsafetystk) {
		this.xsafetystk = xsafetystk;
	}

	public BigDecimal getXordmult() {
		return xordmult;
	}

	public void setXordmult(BigDecimal xordmult) {
		this.xordmult = xordmult;
	}

	public Integer getXpoprcstime() {
		return xpoprcstime;
	}

	public void setXpoprcstime(Integer xpoprcstime) {
		this.xpoprcstime = xpoprcstime;
	}

	public Integer getXinhouseprdtime() {
		return xinhouseprdtime;
	}

	public void setXinhouseprdtime(Integer xinhouseprdtime) {
		this.xinhouseprdtime = xinhouseprdtime;
	}

	public Integer getXgrnprcstime() {
		return xgrnprcstime;
	}

	public void setXgrnprcstime(Integer xgrnprcstime) {
		this.xgrnprcstime = xgrnprcstime;
	}

	public String getXsup() {
		return xsup;
	}

	public void setXsup(String xsup) {
		this.xsup = xsup;
	}

	public int getZid() {
		return zid;
	}

	public String getXitem() {
		return xitem;
	}

	public String getXimageurl() {
		return ximageurl;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public void setXitem(String xitem) {
		this.xitem = xitem;
	}

	public void setXimageurl(String ximageurl) {
		this.ximageurl = ximageurl;
	}

}
