/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import myapp.com.ws.io.entity.Oporddetail;

/**
 *
 * @author Administrator
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "opordheader", catalog = "ZABDB", schema = "dbo")
public class Opordheader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "zid")
    private int zid;
    @Id
    @Basic(optional = false)
    @Column(name = "xordernum")
    private String xordernum;
    @Column(name = "ztime",updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date ztime;
    @Column(name = "zutime")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date zutime;
    @Column(name = "zauserid",updatable = false)
    @CreatedBy
    private String zauserid;
    @Column(name = "zuuserid")
    @LastModifiedBy
    private String zuuserid;
    @Column(name = "zemail")
    private String zemail;
    @Column(name = "xlcno")
    private String xlcno;
    @Column(name = "xshipdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xshipdate;
    @Column(name = "xlcissuedate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xlcissuedate;
    @Column(name = "xexpirydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xexpirydate;
    @Column(name = "xopenbank")
    private String xopenbank;
    @Column(name = "xadvisingbank")
    private String xadvisingbank;
    @Column(name = "xpiref")
    private String xpiref;
    @Column(name = "xpidate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xpidate;
    @Column(name = "xstyle")
    private String xstyle;
    @Column(name = "xpirefr")
    private String xpirefr;
    @Column(name = "xcur")
    private String xcur;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "xexch")
    private BigDecimal xexch;
    @Column(name = "xlcstatus")
    private String xlcstatus;
    @Column(name = "xlctype")
    private String xlctype;
    @Column(name = "xprimetotamt")
    private BigDecimal xprimetotamt;
    @Column(name = "xbasetotamt")
    private BigDecimal xbasetotamt;
    @Column(name = "xtype")
    private String xtype;
    @Column(name = "xstatusord")
    private String xstatusord;
    @Column(name = "xstype")
    private String xstype;
    @Column(name = "xtrn")
    private String xtrn;
    @Column(name = "xbuyer")
    private String xbuyer;
    @Column(name = "xbblcno")
    private String xbblcno;
    @Column(name = "xbblcdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xbblcdate;
    @Column(name = "xhscode")
    private String xhscode;
    @Column(name = "xircno")
    private String xircno;
    @Column(name = "xstatuspi")
    private String xstatuspi;
    @Column(name = "xstatusdor")
    private String xstatusdor;
    @Column(name = "xmkfilerow")
    private Integer xmkfilerow;
    @Column(name = "xmaturitydate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xmaturitydate;
    @Column(name = "zbid")
    private Integer zbid;
    @Column(name = "xdocnum")
    private String xdocnum;
    @Column(name = "xstatusbooking")
    private String xstatusbooking;
    @Column(name = "xorigin")
    private String xorigin;
    @Column(name = "xpornum")
    private String xpornum;
    @Column(name = "xref")
    private String xref;
    @Column(name = "xdatedocrec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdatedocrec;
    @Column(name = "xata")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xata;
    @Column(name = "xdateeff")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdateeff;
    @Column(name = "xdateporec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdateporec;
    @Column(name = "xdaterel")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdaterel;
    @Column(name = "xdateassest")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdateassest;
    @Column(name = "xmawb")
    private String xmawb;
    @Column(name = "xbilloflad")
    private String xbilloflad;
    @Column(name = "xvendor")
    private String xvendor;
    @Column(name = "xcweight")
    private BigDecimal xcweight;
    @Column(name = "xbillofexch")
    private String xbillofexch;
    @Column(name = "xdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdate;
    @Column(name = "xwh")
    private String xwh;
    @Column(name = "xlong")
    private String xlong;
    @Column(name = "xdatebillofexch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdatebillofexch;
    @Column(name = "xdatemwab")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdatemwab;
    @Column(name = "xdatebilloflad")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdatebilloflad;
    @Column(name = "xlcdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xlcdate;
    @Column(name = "xconsignment")
    private String xconsignment;
    @Column(name = "xsteamer")
    private String xsteamer;
    @Column(name = "xinvnum")
    private String xinvnum;
    @Column(name = "xdateeta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xdateeta;
    @Column(name = "xexportdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xexportdate;
    @Column(name = "xexportno")
    private String xexportno;
    @Column(name = "xpayorder")
    private String xpayorder;
    @Column(name = "xassessmentday")
    private Integer xassessmentday;
    @Column(name = "xporevdday")
    private Integer xporevdday;
    @Column(name = "xtotwdday")
    private Integer xtotwdday;
    @Column(name = "xreleaseday")
    private Integer xreleaseday;
    @Column(name = "xdornum")
    private String xdornum;
    @Column(name = "xnote")
    private String xnote;
    @Column(name = "xstatusar")
    private String xstatusar;
    @Column(name = "xtotamt")
    private BigDecimal xtotamt;
    @Column(name = "xdisc")
    private BigDecimal xdisc;
    @Column(name = "xdiscf")
    private BigDecimal xdiscf;
    @Column(name = "xdatecom")
    @Temporal(TemporalType.DATE)
    private Date xdatecom;
    @Column(name = "xait")
    private BigDecimal xait;
    @Column(name = "xamount")
    private BigDecimal xamount;
    @Column(name = "xvatrate")
    private BigDecimal xvatrate;
    @Column(name = "xdatedue")
    @Temporal(TemporalType.DATE)
    private Date xdatedue;
    @Column(name = "xavlperc")
    private BigDecimal xavlperc;
    @Column(name = "xsp")
    private String xsp;
    @Column(name = "xpp")
    private String xpp;
    @Column(name = "xvatamt")
    private BigDecimal xvatamt;
    @Column(name = "xaitamt")
    private BigDecimal xaitamt;
    @Column(name = "xdiscamt")
    private BigDecimal xdiscamt;
    @Column(name = "xfm")
    private String xfm;
    @Column(name = "xsm")
    private String xsm;
    @Column(name = "xrsm")
    private String xrsm;
    @Column(name = "xterritory")
    private String xterritory;
    @Column(name = "xfield")
    private String xfield;
    @Column(name = "xregion")
    private String xregion;
    @Column(name = "xarea")
    private String xarea;
    @Column(name = "xpaymentterm")
    private String xpaymentterm;
    @Column(name = "xproject")
    private String xproject;
    @Column(name = "xyear")
    private Integer xyear;
    @Column(name = "xper")
    private Integer xper;
    @Column(name = "xmarket")
    private String xmarket;
    @Column(name = "xroute")
    private String xroute;
    @Column(name = "xstatus")
    private String xstatus;
    @Column(name = "xprime")
    private BigDecimal xprime;
    @Column(name = "xdatepo")
    @Temporal(TemporalType.DATE)
    private Date xdatepo;
    @Column(name = "xdeltime")
    private String xdeltime;
    @Column(name = "xdatedel")
    @Temporal(TemporalType.DATE)
    private Date xdatedel;
    @Column(name = "xsumnum")
    private String xsumnum;
    @Column(name = "xbomnum")
    private String xbomnum;
    @Column(name = "xcus")
    private String xcus;


    public String getXcus() {
		return xcus;
	}



	public void setXcus(String xcus) {
		this.xcus = xcus;
	}



	public Opordheader() {
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

    public String getZemail() {
        return zemail;
    }

    public void setZemail(String zemail) {
        this.zemail = zemail;
    }

    public String getXlcno() {
        return xlcno;
    }

    public void setXlcno(String xlcno) {
        this.xlcno = xlcno;
    }

    public Date getXshipdate() {
        return xshipdate;
    }

    public void setXshipdate(Date xshipdate) {
        this.xshipdate = xshipdate;
    }

    public Date getXlcissuedate() {
        return xlcissuedate;
    }

    public void setXlcissuedate(Date xlcissuedate) {
        this.xlcissuedate = xlcissuedate;
    }

    public Date getXexpirydate() {
        return xexpirydate;
    }

    public void setXexpirydate(Date xexpirydate) {
        this.xexpirydate = xexpirydate;
    }

    public String getXopenbank() {
        return xopenbank;
    }

    public void setXopenbank(String xopenbank) {
        this.xopenbank = xopenbank;
    }

    public String getXadvisingbank() {
        return xadvisingbank;
    }

    public void setXadvisingbank(String xadvisingbank) {
        this.xadvisingbank = xadvisingbank;
    }

    public String getXpiref() {
        return xpiref;
    }

    public void setXpiref(String xpiref) {
        this.xpiref = xpiref;
    }

    public Date getXpidate() {
        return xpidate;
    }

    public void setXpidate(Date xpidate) {
        this.xpidate = xpidate;
    }

    public String getXstyle() {
        return xstyle;
    }

    public void setXstyle(String xstyle) {
        this.xstyle = xstyle;
    }

    public String getXpirefr() {
        return xpirefr;
    }

    public void setXpirefr(String xpirefr) {
        this.xpirefr = xpirefr;
    }

    public String getXcur() {
        return xcur;
    }

    public void setXcur(String xcur) {
        this.xcur = xcur;
    }

    public BigDecimal getXexch() {
        return xexch;
    }

    public void setXexch(BigDecimal xexch) {
        this.xexch = xexch;
    }

    public String getXlcstatus() {
        return xlcstatus;
    }

    public void setXlcstatus(String xlcstatus) {
        this.xlcstatus = xlcstatus;
    }

    public String getXlctype() {
        return xlctype;
    }

    public void setXlctype(String xlctype) {
        this.xlctype = xlctype;
    }

    public BigDecimal getXprimetotamt() {
        return xprimetotamt;
    }

    public void setXprimetotamt(BigDecimal xprimetotamt) {
        this.xprimetotamt = xprimetotamt;
    }

    public BigDecimal getXbasetotamt() {
        return xbasetotamt;
    }

    public void setXbasetotamt(BigDecimal xbasetotamt) {
        this.xbasetotamt = xbasetotamt;
    }

    public String getXtype() {
        return xtype;
    }

    public void setXtype(String xtype) {
        this.xtype = xtype;
    }

    public String getXstatusord() {
        return xstatusord;
    }

    public void setXstatusord(String xstatusord) {
        this.xstatusord = xstatusord;
    }

    public String getXstype() {
        return xstype;
    }

    public void setXstype(String xstype) {
        this.xstype = xstype;
    }

    public String getXtrn() {
        return xtrn;
    }

    public void setXtrn(String xtrn) {
        this.xtrn = xtrn;
    }

    public String getXbuyer() {
        return xbuyer;
    }

    public void setXbuyer(String xbuyer) {
        this.xbuyer = xbuyer;
    }

    public String getXbblcno() {
        return xbblcno;
    }

    public void setXbblcno(String xbblcno) {
        this.xbblcno = xbblcno;
    }

    public Date getXbblcdate() {
        return xbblcdate;
    }

    public void setXbblcdate(Date xbblcdate) {
        this.xbblcdate = xbblcdate;
    }

    public String getXhscode() {
        return xhscode;
    }

    public void setXhscode(String xhscode) {
        this.xhscode = xhscode;
    }

    public String getXircno() {
        return xircno;
    }

    public void setXircno(String xircno) {
        this.xircno = xircno;
    }

    public String getXstatuspi() {
        return xstatuspi;
    }

    public void setXstatuspi(String xstatuspi) {
        this.xstatuspi = xstatuspi;
    }

    public String getXstatusdor() {
        return xstatusdor;
    }

    public void setXstatusdor(String xstatusdor) {
        this.xstatusdor = xstatusdor;
    }

    public Integer getXmkfilerow() {
        return xmkfilerow;
    }

    public void setXmkfilerow(Integer xmkfilerow) {
        this.xmkfilerow = xmkfilerow;
    }

    public Date getXmaturitydate() {
        return xmaturitydate;
    }

    public void setXmaturitydate(Date xmaturitydate) {
        this.xmaturitydate = xmaturitydate;
    }

    public Integer getZbid() {
        return zbid;
    }

    public void setZbid(Integer zbid) {
        this.zbid = zbid;
    }

    public String getXdocnum() {
        return xdocnum;
    }

    public void setXdocnum(String xdocnum) {
        this.xdocnum = xdocnum;
    }

    public String getXstatusbooking() {
        return xstatusbooking;
    }

    public void setXstatusbooking(String xstatusbooking) {
        this.xstatusbooking = xstatusbooking;
    }

    public String getXorigin() {
        return xorigin;
    }

    public void setXorigin(String xorigin) {
        this.xorigin = xorigin;
    }

    public String getXpornum() {
        return xpornum;
    }

    public void setXpornum(String xpornum) {
        this.xpornum = xpornum;
    }

    public String getXref() {
        return xref;
    }

    public void setXref(String xref) {
        this.xref = xref;
    }

    public Date getXdatedocrec() {
        return xdatedocrec;
    }

    public void setXdatedocrec(Date xdatedocrec) {
        this.xdatedocrec = xdatedocrec;
    }

    public Date getXata() {
        return xata;
    }

    public void setXata(Date xata) {
        this.xata = xata;
    }

    public Date getXdateeff() {
        return xdateeff;
    }

    public void setXdateeff(Date xdateeff) {
        this.xdateeff = xdateeff;
    }

    public Date getXdateporec() {
        return xdateporec;
    }

    public void setXdateporec(Date xdateporec) {
        this.xdateporec = xdateporec;
    }

    public Date getXdaterel() {
        return xdaterel;
    }

    public void setXdaterel(Date xdaterel) {
        this.xdaterel = xdaterel;
    }

    public Date getXdateassest() {
        return xdateassest;
    }

    public void setXdateassest(Date xdateassest) {
        this.xdateassest = xdateassest;
    }

    public String getXmawb() {
        return xmawb;
    }

    public void setXmawb(String xmawb) {
        this.xmawb = xmawb;
    }

    public String getXbilloflad() {
        return xbilloflad;
    }

    public void setXbilloflad(String xbilloflad) {
        this.xbilloflad = xbilloflad;
    }

    public String getXvendor() {
        return xvendor;
    }

    public void setXvendor(String xvendor) {
        this.xvendor = xvendor;
    }

    public BigDecimal getXcweight() {
        return xcweight;
    }

    public void setXcweight(BigDecimal xcweight) {
        this.xcweight = xcweight;
    }

    public String getXbillofexch() {
        return xbillofexch;
    }

    public void setXbillofexch(String xbillofexch) {
        this.xbillofexch = xbillofexch;
    }

    public Date getXdate() {
        return xdate;
    }

    public void setXdate(Date xdate) {
        this.xdate = xdate;
    }

    public String getXwh() {
        return xwh;
    }

    public void setXwh(String xwh) {
        this.xwh = xwh;
    }

    public String getXlong() {
        return xlong;
    }

    public void setXlong(String xlong) {
        this.xlong = xlong;
    }

    public Date getXdatebillofexch() {
        return xdatebillofexch;
    }

    public void setXdatebillofexch(Date xdatebillofexch) {
        this.xdatebillofexch = xdatebillofexch;
    }

    public Date getXdatemwab() {
        return xdatemwab;
    }

    public void setXdatemwab(Date xdatemwab) {
        this.xdatemwab = xdatemwab;
    }

    public Date getXdatebilloflad() {
        return xdatebilloflad;
    }

    public void setXdatebilloflad(Date xdatebilloflad) {
        this.xdatebilloflad = xdatebilloflad;
    }

    public Date getXlcdate() {
        return xlcdate;
    }

    public void setXlcdate(Date xlcdate) {
        this.xlcdate = xlcdate;
    }

    public String getXconsignment() {
        return xconsignment;
    }

    public void setXconsignment(String xconsignment) {
        this.xconsignment = xconsignment;
    }

    public String getXsteamer() {
        return xsteamer;
    }

    public void setXsteamer(String xsteamer) {
        this.xsteamer = xsteamer;
    }

    public String getXinvnum() {
        return xinvnum;
    }

    public void setXinvnum(String xinvnum) {
        this.xinvnum = xinvnum;
    }

    public Date getXdateeta() {
        return xdateeta;
    }

    public void setXdateeta(Date xdateeta) {
        this.xdateeta = xdateeta;
    }

    public Date getXexportdate() {
        return xexportdate;
    }

    public void setXexportdate(Date xexportdate) {
        this.xexportdate = xexportdate;
    }

    public String getXexportno() {
        return xexportno;
    }

    public void setXexportno(String xexportno) {
        this.xexportno = xexportno;
    }

    public String getXpayorder() {
        return xpayorder;
    }

    public void setXpayorder(String xpayorder) {
        this.xpayorder = xpayorder;
    }

    public Integer getXassessmentday() {
        return xassessmentday;
    }

    public void setXassessmentday(Integer xassessmentday) {
        this.xassessmentday = xassessmentday;
    }

    public Integer getXporevdday() {
        return xporevdday;
    }

    public void setXporevdday(Integer xporevdday) {
        this.xporevdday = xporevdday;
    }

    public Integer getXtotwdday() {
        return xtotwdday;
    }

    public void setXtotwdday(Integer xtotwdday) {
        this.xtotwdday = xtotwdday;
    }

    public Integer getXreleaseday() {
        return xreleaseday;
    }

    public void setXreleaseday(Integer xreleaseday) {
        this.xreleaseday = xreleaseday;
    }

    public String getXdornum() {
        return xdornum;
    }

    public void setXdornum(String xdornum) {
        this.xdornum = xdornum;
    }

    public String getXnote() {
        return xnote;
    }

    public void setXnote(String xnote) {
        this.xnote = xnote;
    }

    public String getXstatusar() {
        return xstatusar;
    }

    public void setXstatusar(String xstatusar) {
        this.xstatusar = xstatusar;
    }

    public BigDecimal getXtotamt() {
        return xtotamt;
    }

    public void setXtotamt(BigDecimal xtotamt) {
        this.xtotamt = xtotamt;
    }

    public BigDecimal getXdisc() {
        return xdisc;
    }

    public void setXdisc(BigDecimal xdisc) {
        this.xdisc = xdisc;
    }

    public BigDecimal getXdiscf() {
        return xdiscf;
    }

    public void setXdiscf(BigDecimal xdiscf) {
        this.xdiscf = xdiscf;
    }

    public Date getXdatecom() {
        return xdatecom;
    }

    public void setXdatecom(Date xdatecom) {
        this.xdatecom = xdatecom;
    }

    public BigDecimal getXait() {
        return xait;
    }

    public void setXait(BigDecimal xait) {
        this.xait = xait;
    }

    public BigDecimal getXamount() {
        return xamount;
    }

    public void setXamount(BigDecimal xamount) {
        this.xamount = xamount;
    }

    public BigDecimal getXvatrate() {
        return xvatrate;
    }

    public void setXvatrate(BigDecimal xvatrate) {
        this.xvatrate = xvatrate;
    }

    public Date getXdatedue() {
        return xdatedue;
    }

    public void setXdatedue(Date xdatedue) {
        this.xdatedue = xdatedue;
    }

    public BigDecimal getXavlperc() {
        return xavlperc;
    }

    public void setXavlperc(BigDecimal xavlperc) {
        this.xavlperc = xavlperc;
    }

    public String getXsp() {
        return xsp;
    }

    public void setXsp(String xsp) {
        this.xsp = xsp;
    }

    public String getXpp() {
        return xpp;
    }

    public void setXpp(String xpp) {
        this.xpp = xpp;
    }

    public BigDecimal getXvatamt() {
        return xvatamt;
    }

    public void setXvatamt(BigDecimal xvatamt) {
        this.xvatamt = xvatamt;
    }

    public BigDecimal getXaitamt() {
        return xaitamt;
    }

    public void setXaitamt(BigDecimal xaitamt) {
        this.xaitamt = xaitamt;
    }

    public BigDecimal getXdiscamt() {
        return xdiscamt;
    }

    public void setXdiscamt(BigDecimal xdiscamt) {
        this.xdiscamt = xdiscamt;
    }

    public String getXfm() {
        return xfm;
    }

    public void setXfm(String xfm) {
        this.xfm = xfm;
    }

    public String getXsm() {
        return xsm;
    }

    public void setXsm(String xsm) {
        this.xsm = xsm;
    }

    public String getXrsm() {
        return xrsm;
    }

    public void setXrsm(String xrsm) {
        this.xrsm = xrsm;
    }

    public String getXterritory() {
        return xterritory;
    }

    public void setXterritory(String xterritory) {
        this.xterritory = xterritory;
    }

    public String getXfield() {
        return xfield;
    }

    public void setXfield(String xfield) {
        this.xfield = xfield;
    }

    public String getXregion() {
        return xregion;
    }

    public void setXregion(String xregion) {
        this.xregion = xregion;
    }

    public String getXarea() {
        return xarea;
    }

    public void setXarea(String xarea) {
        this.xarea = xarea;
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

    public Integer getXyear() {
        return xyear;
    }

    public void setXyear(Integer xyear) {
        this.xyear = xyear;
    }

    public Integer getXper() {
        return xper;
    }

    public void setXper(Integer xper) {
        this.xper = xper;
    }

    public String getXmarket() {
        return xmarket;
    }

    public void setXmarket(String xmarket) {
        this.xmarket = xmarket;
    }

    public String getXroute() {
        return xroute;
    }

    public void setXroute(String xroute) {
        this.xroute = xroute;
    }

    public String getXstatus() {
        return xstatus;
    }

    public void setXstatus(String xstatus) {
        this.xstatus = xstatus;
    }

    public BigDecimal getXprime() {
        return xprime;
    }

    public void setXprime(BigDecimal xprime) {
        this.xprime = xprime;
    }

    public Date getXdatepo() {
        return xdatepo;
    }

    public void setXdatepo(Date xdatepo) {
        this.xdatepo = xdatepo;
    }

    public String getXdeltime() {
        return xdeltime;
    }

    public void setXdeltime(String xdeltime) {
        this.xdeltime = xdeltime;
    }

    public Date getXdatedel() {
        return xdatedel;
    }

    public void setXdatedel(Date xdatedel) {
        this.xdatedel = xdatedel;
    }

    public String getXsumnum() {
        return xsumnum;
    }

    public void setXsumnum(String xsumnum) {
        this.xsumnum = xsumnum;
    }

    public String getXbomnum() {
        return xbomnum;
    }

    public void setXbomnum(String xbomnum) {
        this.xbomnum = xbomnum;
    }


    public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public String getXordernum() {
		return xordernum;
	}

	public void setXordernum(String xordernum) {
		this.xordernum = xordernum;
	}



}
