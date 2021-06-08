/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.com.ws.io.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class OporddetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "zid")
    private int zid;
    @Basic(optional = false)
    @Column(name = "xordernum")
    private String xordernum;
    @Basic(optional = false)
    @Column(name = "xorderrow")
    private int xorderrow;

    public OporddetailPK() {
    }

    public OporddetailPK(int zid, String xordernum, int xorderrow) {
        this.zid = zid;
        this.xordernum = xordernum;
        this.xorderrow = xorderrow;
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

    public int getXorderrow() {
        return xorderrow;
    }

    public void setXorderrow(int xorderrow) {
        this.xorderrow = xorderrow;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) zid;
        hash += (xordernum != null ? xordernum.hashCode() : 0);
        hash += (int) xorderrow;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OporddetailPK)) {
            return false;
        }
        OporddetailPK other = (OporddetailPK) object;
        if (this.zid != other.zid) {
            return false;
        }
        if ((this.xordernum == null && other.xordernum != null) || (this.xordernum != null && !this.xordernum.equals(other.xordernum))) {
            return false;
        }
        if (this.xorderrow != other.xorderrow) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pojo.OporddetailPK[ zid=" + zid + ", xordernum=" + xordernum + ", xorderrow=" + xorderrow + " ]";
    }
    
}
