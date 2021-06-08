/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "zbusiness")
@NamedQueries({
    @NamedQuery(name = "Zbusiness.findAll", query = "SELECT z FROM Zbusiness z")})
public class Zbusiness implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ztime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ztime;
    @Column(name = "zutime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date zutime;
    @Id
    @Basic(optional = false)
    @Column(name = "zid")
    private Integer zid;
    @Column(name = "xshort")
    private String xshort;
    @Column(name = "xtaxnum")
    private String xtaxnum;
    @Column(name = "zorg")
    private String zorg;
    @Column(name = "xcity")
    private String xcity;
    @Column(name = "xstate")
    private String xstate;
    @Column(name = "xzip")
    private String xzip;
    @Column(name = "xcountry")
    private String xcountry;
    @Column(name = "xphone")
    private String xphone;
    @Column(name = "xfax")
    private String xfax;
    @Column(name = "xcontact")
    private String xcontact;
    @Column(name = "xemail")
    private String xemail;
    @Column(name = "xurl")
    private String xurl;
    @Column(name = "xdformat")
    private String xdformat;
    @Column(name = "xdsep")
    private String xdsep;
    @Column(name = "xtimage")
    private String xtimage;
    @Column(name = "xbimage")
    private String xbimage;
    @Column(name = "xcustom")
    private String xcustom;
    @Column(name = "zactive")
    private String zactive;
    @Column(name = "xmadd")
    private String xmadd;
    @Column(name = "zauserid")
    private String zauserid;
    @Column(name = "zuuserid")
    private String zuuserid;
    @Column(name = "zaip")
    private String zaip;
    @Column(name = "zuip")
    private String zuip;
    @Column(name = "xsignatory")
    private String xsignatory;
    @Column(name = "xdesignation")
    private String xdesignation;
    @Column(name = "xpadd")
    private String xpadd;
    @Lob
    @Column(name = "ximage")
    private byte[] ximage;
    @Column(name = "xcat")
    private String xcat;

    public Zbusiness() {
    }

    public Zbusiness(Integer zid) {
        this.zid = zid;
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

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getXshort() {
        return xshort;
    }

    public void setXshort(String xshort) {
        this.xshort = xshort;
    }

    public String getXtaxnum() {
        return xtaxnum;
    }

    public void setXtaxnum(String xtaxnum) {
        this.xtaxnum = xtaxnum;
    }

    public String getZorg() {
        return zorg;
    }

    public void setZorg(String zorg) {
        this.zorg = zorg;
    }

    public String getXcity() {
        return xcity;
    }

    public void setXcity(String xcity) {
        this.xcity = xcity;
    }

    public String getXstate() {
        return xstate;
    }

    public void setXstate(String xstate) {
        this.xstate = xstate;
    }

    public String getXzip() {
        return xzip;
    }

    public void setXzip(String xzip) {
        this.xzip = xzip;
    }

    public String getXcountry() {
        return xcountry;
    }

    public void setXcountry(String xcountry) {
        this.xcountry = xcountry;
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

    public String getXcontact() {
        return xcontact;
    }

    public void setXcontact(String xcontact) {
        this.xcontact = xcontact;
    }

    public String getXemail() {
        return xemail;
    }

    public void setXemail(String xemail) {
        this.xemail = xemail;
    }

    public String getXurl() {
        return xurl;
    }

    public void setXurl(String xurl) {
        this.xurl = xurl;
    }

    public String getXdformat() {
        return xdformat;
    }

    public void setXdformat(String xdformat) {
        this.xdformat = xdformat;
    }

    public String getXdsep() {
        return xdsep;
    }

    public void setXdsep(String xdsep) {
        this.xdsep = xdsep;
    }

    public String getXtimage() {
        return xtimage;
    }

    public void setXtimage(String xtimage) {
        this.xtimage = xtimage;
    }

    public String getXbimage() {
        return xbimage;
    }

    public void setXbimage(String xbimage) {
        this.xbimage = xbimage;
    }

    public String getXcustom() {
        return xcustom;
    }

    public void setXcustom(String xcustom) {
        this.xcustom = xcustom;
    }

    public String getZactive() {
        return zactive;
    }

    public void setZactive(String zactive) {
        this.zactive = zactive;
    }

    public String getXmadd() {
        return xmadd;
    }

    public void setXmadd(String xmadd) {
        this.xmadd = xmadd;
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

    public String getZaip() {
        return zaip;
    }

    public void setZaip(String zaip) {
        this.zaip = zaip;
    }

    public String getZuip() {
        return zuip;
    }

    public void setZuip(String zuip) {
        this.zuip = zuip;
    }

    public String getXsignatory() {
        return xsignatory;
    }

    public void setXsignatory(String xsignatory) {
        this.xsignatory = xsignatory;
    }

    public String getXdesignation() {
        return xdesignation;
    }

    public void setXdesignation(String xdesignation) {
        this.xdesignation = xdesignation;
    }

    public String getXpadd() {
        return xpadd;
    }

    public void setXpadd(String xpadd) {
        this.xpadd = xpadd;
    }

    public byte[] getXimage() {
        return ximage;
    }

    public void setXimage(byte[] ximage) {
        this.ximage = ximage;
    }

    public String getXcat() {
        return xcat;
    }

    public void setXcat(String xcat) {
        this.xcat = xcat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zid != null ? zid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zbusiness)) {
            return false;
        }
        Zbusiness other = (Zbusiness) object;
        if ((this.zid == null && other.zid != null) || (this.zid != null && !this.zid.equals(other.zid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Zbusiness[ zid=" + zid + " ]";
    }
    
}
