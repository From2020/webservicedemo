/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Administrator
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "oporddetail", catalog = "ZABDB", schema = "dbo")
public class Oporddetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OporddetailPK oporddetailPK;
    @CreationTimestamp
    @Column(name = "ztime",updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ztime;
    @UpdateTimestamp
    @Column(name = "zutime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zutime;
    @CreatedBy
    @Column(name = "zauserid",updatable = false)
    private String zauserid;
    @LastModifiedBy
    @Column(name = "zuuserid")
    private String zuuserid;
    @Column(name = "zemail")
    private String zemail;
    @Column(name = "xlong")
    private String xlong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "xqtyord")
    private BigDecimal xqtyord;
    @Column(name = "xqtydel")
    private BigDecimal xqtydel;
    @Column(name = "xqtydoc")
    private BigDecimal xqtydoc;
    @Column(name = "xqtyreq")
    private BigDecimal xqtyreq;
    @Column(name = "xrate")
    private BigDecimal xrate;
    @Column(name = "xcount")
    private String xcount;
    @Column(name = "xlineamt")
    private BigDecimal xlineamt;
    @Column(name = "xnetweight")
    private BigDecimal xnetweight;
    @Column(name = "xqtyinv")
    private BigDecimal xqtyinv;
    @Column(name = "xqtymor")
    private BigDecimal xqtymor;
    @Column(name = "xprcstype")
    private String xprcstype;
    @Column(name = "xstyle")
    private String xstyle;
    @Column(name = "xcomposition")
    private String xcomposition;
    @Column(name = "xdatedel")
    @Temporal(TemporalType.DATE)
    private Date xdatedel;
    @Column(name = "xdatesch")
    @Temporal(TemporalType.DATE)
    private Date xdatesch;
    @Column(name = "xbrate")
    private BigDecimal xbrate;
    @Column(name = "xdocrow")
    private Integer xdocrow;
    @Column(name = "xgsm")
    private String xgsm;
    @Column(name = "xwidth")
    private Integer xwidth;
    @Column(name = "xconstruction")
    private String xconstruction;
    @Column(name = "xfabriccolor")
    private String xfabriccolor;
    @Column(name = "xfabrictype")
    private String xfabrictype;
    @Column(name = "xunitsel")
    private String xunitsel;
    @Column(name = "xhscode")
    private String xhscode;
    @Column(name = "xfabricfinish")
    private String xfabricfinish;
    @Column(name = "xseason")
    private String xseason;
    @Column(name = "xunit")
    private String xunit;
    @Column(name = "xdoamount")
    private BigDecimal xdoamount;
    @Column(name = "xadamount")
    private BigDecimal xadamount;
    @Column(name = "xqtyprd")
    private BigDecimal xqtyprd;
    @Column(name = "xshipdate")
    @Temporal(TemporalType.DATE)
    private Date xshipdate;
    @Column(name = "xdatedue")
    @Temporal(TemporalType.DATE)
    private Date xdatedue;
    @Column(name = "xbomnum")
    private String xbomnum;
    @Column(name = "xitem")
    private String xitem;

    public Oporddetail() {
    }

    public Oporddetail(OporddetailPK oporddetailPK) {
        this.oporddetailPK = oporddetailPK;
    }

    public Oporddetail(int zid, String xordernum, int xorderrow) {
        this.oporddetailPK = new OporddetailPK(zid, xordernum, xorderrow);
    }

    public OporddetailPK getOporddetailPK() {
        return oporddetailPK;
    }

    public void setOporddetailPK(OporddetailPK oporddetailPK) {
        this.oporddetailPK = oporddetailPK;
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

    public String getXlong() {
        return xlong;
    }

    public void setXlong(String xlong) {
        this.xlong = xlong;
    }

    public BigDecimal getXqtyord() {
        return xqtyord;
    }

    public void setXqtyord(BigDecimal xqtyord) {
        this.xqtyord = xqtyord;
    }

    public BigDecimal getXqtydel() {
        return xqtydel;
    }

    public void setXqtydel(BigDecimal xqtydel) {
        this.xqtydel = xqtydel;
    }

    public BigDecimal getXqtydoc() {
        return xqtydoc;
    }

    public void setXqtydoc(BigDecimal xqtydoc) {
        this.xqtydoc = xqtydoc;
    }

    public BigDecimal getXqtyreq() {
        return xqtyreq;
    }

    public void setXqtyreq(BigDecimal xqtyreq) {
        this.xqtyreq = xqtyreq;
    }

    public BigDecimal getXrate() {
        return xrate;
    }

    public void setXrate(BigDecimal xrate) {
        this.xrate = xrate;
    }

    public String getXcount() {
        return xcount;
    }

    public void setXcount(String xcount) {
        this.xcount = xcount;
    }

    public BigDecimal getXlineamt() {
        return xlineamt;
    }

    public void setXlineamt(BigDecimal xlineamt) {
        this.xlineamt = xlineamt;
    }

    public BigDecimal getXnetweight() {
        return xnetweight;
    }

    public void setXnetweight(BigDecimal xnetweight) {
        this.xnetweight = xnetweight;
    }

    public BigDecimal getXqtyinv() {
        return xqtyinv;
    }

    public void setXqtyinv(BigDecimal xqtyinv) {
        this.xqtyinv = xqtyinv;
    }

    public BigDecimal getXqtymor() {
        return xqtymor;
    }

    public void setXqtymor(BigDecimal xqtymor) {
        this.xqtymor = xqtymor;
    }

    public String getXprcstype() {
        return xprcstype;
    }

    public void setXprcstype(String xprcstype) {
        this.xprcstype = xprcstype;
    }

    public String getXstyle() {
        return xstyle;
    }

    public void setXstyle(String xstyle) {
        this.xstyle = xstyle;
    }

    public String getXcomposition() {
        return xcomposition;
    }

    public void setXcomposition(String xcomposition) {
        this.xcomposition = xcomposition;
    }

    public Date getXdatedel() {
        return xdatedel;
    }

    public void setXdatedel(Date xdatedel) {
        this.xdatedel = xdatedel;
    }

    public Date getXdatesch() {
        return xdatesch;
    }

    public void setXdatesch(Date xdatesch) {
        this.xdatesch = xdatesch;
    }

    public BigDecimal getXbrate() {
        return xbrate;
    }

    public void setXbrate(BigDecimal xbrate) {
        this.xbrate = xbrate;
    }

    public Integer getXdocrow() {
        return xdocrow;
    }

    public void setXdocrow(Integer xdocrow) {
        this.xdocrow = xdocrow;
    }

    public String getXgsm() {
        return xgsm;
    }

    public void setXgsm(String xgsm) {
        this.xgsm = xgsm;
    }

    public Integer getXwidth() {
        return xwidth;
    }

    public void setXwidth(Integer xwidth) {
        this.xwidth = xwidth;
    }

    public String getXconstruction() {
        return xconstruction;
    }

    public void setXconstruction(String xconstruction) {
        this.xconstruction = xconstruction;
    }

    public String getXfabriccolor() {
        return xfabriccolor;
    }

    public void setXfabriccolor(String xfabriccolor) {
        this.xfabriccolor = xfabriccolor;
    }

    public String getXfabrictype() {
        return xfabrictype;
    }

    public void setXfabrictype(String xfabrictype) {
        this.xfabrictype = xfabrictype;
    }

    public String getXunitsel() {
        return xunitsel;
    }

    public void setXunitsel(String xunitsel) {
        this.xunitsel = xunitsel;
    }

    public String getXhscode() {
        return xhscode;
    }

    public void setXhscode(String xhscode) {
        this.xhscode = xhscode;
    }

    public String getXfabricfinish() {
        return xfabricfinish;
    }

    public void setXfabricfinish(String xfabricfinish) {
        this.xfabricfinish = xfabricfinish;
    }

    public String getXseason() {
        return xseason;
    }

    public void setXseason(String xseason) {
        this.xseason = xseason;
    }

    public String getXunit() {
        return xunit;
    }

    public void setXunit(String xunit) {
        this.xunit = xunit;
    }

    public BigDecimal getXdoamount() {
        return xdoamount;
    }

    public void setXdoamount(BigDecimal xdoamount) {
        this.xdoamount = xdoamount;
    }

    public BigDecimal getXadamount() {
        return xadamount;
    }

    public void setXadamount(BigDecimal xadamount) {
        this.xadamount = xadamount;
    }

    public BigDecimal getXqtyprd() {
        return xqtyprd;
    }

    public void setXqtyprd(BigDecimal xqtyprd) {
        this.xqtyprd = xqtyprd;
    }

    public Date getXshipdate() {
        return xshipdate;
    }

    public void setXshipdate(Date xshipdate) {
        this.xshipdate = xshipdate;
    }

    public Date getXdatedue() {
        return xdatedue;
    }

    public void setXdatedue(Date xdatedue) {
        this.xdatedue = xdatedue;
    }

    public String getXbomnum() {
        return xbomnum;
    }

    public void setXbomnum(String xbomnum) {
        this.xbomnum = xbomnum;
    }



    public String getXitem() {
		return xitem;
	}

	public void setXitem(String xitem) {
		this.xitem = xitem;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (oporddetailPK != null ? oporddetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oporddetail)) {
            return false;
        }
        Oporddetail other = (Oporddetail) object;
        if ((this.oporddetailPK == null && other.oporddetailPK != null) || (this.oporddetailPK != null && !this.oporddetailPK.equals(other.oporddetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Oporddetail[ oporddetailPK=" + oporddetailPK + " ]";
    }
    
}
