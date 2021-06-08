package myapp.com.ws.shared.dto;

import java.io.Serializable;
import java.math.BigDecimal;



public class ItemDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private String ximageurl;
	private String xitem;
	private String xdesc;
	private BigDecimal xmrp;
	private String xunit;
	private BigDecimal xpackqty;
	
	public String getXimageurl() {
		return ximageurl;
	}
	public String getXitem() {
		return xitem;
	}
	public String getXdesc() {
		return xdesc;
	}
	public BigDecimal getXmrp() {
		return xmrp;
	}
	public String getXunit() {
		return xunit;
	}
	public BigDecimal getXpackqty() {
		return xpackqty;
	}
	public void setXimageurl(String ximageurl) {
		this.ximageurl = ximageurl;
	}
	public void setXitem(String xitem) {
		this.xitem = xitem;
	}
	public void setXdesc(String xdesc) {
		this.xdesc = xdesc;
	}
	public void setXmrp(BigDecimal xmrp) {
		this.xmrp = xmrp;
	}
	public void setXunit(String xunit) {
		this.xunit = xunit;
	}
	public void setXpackqty(BigDecimal xpackqty) {
		this.xpackqty = xpackqty;
	}
	
	
}
