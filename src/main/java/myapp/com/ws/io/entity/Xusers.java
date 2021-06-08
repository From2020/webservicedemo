/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(catalog = "ZABDB", schema = "dbo")
public class Xusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected XusersPK xusersPK;
    @Temporal(TemporalType.TIMESTAMP)
    private Date ztime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date zutime;
    private String xpassword;
    private String xaccess;
    private String xdformat;
    private String xdsep;
    private String zactive;
    private String zauserid;
    private String zuuserid;
    @Temporal(TemporalType.TIMESTAMP)
    private Date xlastlogdate;
    private String xname;
    private String zaip;
    private String zuip;
    private String xwh;
    private String xsp;
    private String xrole;
    private String xoldpass;
    private String xposition;
    private String xfm;
    private String xrsm;
	private String xmadd;
	private String xdeptname;
	private String xdesignation;
	private String xphone;
	private String xbloodgroup;
	private String ximageurl;
	
	

    public Xusers() {
    }

    public Xusers(XusersPK xusersPK) {
        this.xusersPK = xusersPK;
    }

    public Xusers(int zid, String zemail) {
        this.xusersPK = new XusersPK(zid, zemail);
    }

    public XusersPK getXusersPK() {
        return xusersPK;
    }

    public void setXusersPK(XusersPK xusersPK) {
        this.xusersPK = xusersPK;
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

    public String getXpassword() {
        return xpassword;
    }

    public void setXpassword(String xpassword) {
        this.xpassword = xpassword;
    }

    public String getXaccess() {
        return xaccess;
    }

    public void setXaccess(String xaccess) {
        this.xaccess = xaccess;
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

    public String getZactive() {
        return zactive;
    }

    public void setZactive(String zactive) {
        this.zactive = zactive;
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

    public Date getXlastlogdate() {
        return xlastlogdate;
    }

    public void setXlastlogdate(Date xlastlogdate) {
        this.xlastlogdate = xlastlogdate;
    }

    public String getXname() {
        return xname;
    }

    public void setXname(String xname) {
        this.xname = xname;
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

    public String getXwh() {
        return xwh;
    }

    public void setXwh(String xwh) {
        this.xwh = xwh;
    }

    public String getXsp() {
        return xsp;
    }

    public void setXsp(String xsp) {
        this.xsp = xsp;
    }

    public String getXrole() {
        return xrole;
    }

    public void setXrole(String xrole) {
        this.xrole = xrole;
    }

    public String getXoldpass() {
        return xoldpass;
    }

    public void setXoldpass(String xoldpass) {
        this.xoldpass = xoldpass;
    }

    public String getXposition() {
        return xposition;
    }

    public void setXposition(String xposition) {
        this.xposition = xposition;
    }

    public String getXfm() {
        return xfm;
    }

    public void setXfm(String xfm) {
        this.xfm = xfm;
    }

    public String getXrsm() {
        return xrsm;
    }

    public void setXrsm(String xrsm) {
        this.xrsm = xrsm;
    }
    
    

    public String getXmadd() {
		return xmadd;
	}

	public void setXmadd(String xmadd) {
		this.xmadd = xmadd;
	}

	public String getXdeptname() {
		return xdeptname;
	}

	public void setXdeptname(String xdeptname) {
		this.xdeptname = xdeptname;
	}

	public String getXdesignation() {
		return xdesignation;
	}

	public void setXdesignation(String xdesignation) {
		this.xdesignation = xdesignation;
	}

	public String getXphone() {
		return xphone;
	}

	public void setXphone(String xphone) {
		this.xphone = xphone;
	}

	public String getXbloodgroup() {
		return xbloodgroup;
	}

	public void setXbloodgroup(String xbloodgroup) {
		this.xbloodgroup = xbloodgroup;
	}

	public String getXimageurl() {
		return ximageurl;
	}

	public void setXimageurl(String ximageurl) {
		this.ximageurl = ximageurl;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (xusersPK != null ? xusersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Xusers)) {
            return false;
        }
        Xusers other = (Xusers) object;
        if ((this.xusersPK == null && other.xusersPK != null) || (this.xusersPK != null && !this.xusersPK.equals(other.xusersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.Xusers[ xusersPK=" + xusersPK + " ]";
    }
    
}
