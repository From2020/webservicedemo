/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class XusersPK implements Serializable {

    @Basic(optional = false)
    private int zid;
    @Basic(optional = false)
    private String zemail;

    public XusersPK() {
    }

    public XusersPK(int zid, String zemail) {
        this.zid = zid;
        this.zemail = zemail;
    }

    public int getZid() {
        return zid;
    }

    public void setZid(int zid) {
        this.zid = zid;
    }

    public String getZemail() {
        return zemail;
    }

    public void setZemail(String zemail) {
        this.zemail = zemail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) zid;
        hash += (zemail != null ? zemail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof XusersPK)) {
            return false;
        }
        XusersPK other = (XusersPK) object;
        if (this.zid != other.zid) {
            return false;
        }
        if ((this.zemail == null && other.zemail != null) || (this.zemail != null && !this.zemail.equals(other.zemail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.XusersPK[ zid=" + zid + ", zemail=" + zemail + " ]";
    }
    
}
