package myapp.com.ws.ui.model.request;

import java.math.BigDecimal;

public class OrderDetailRequsetModel {
    private String xitem;
    private BigDecimal xqtyord;
    private BigDecimal xrate;
    
	public String getXitem() {
		return xitem;
	}
	public void setXitem(String xitem) {
		this.xitem = xitem;
	}
	public BigDecimal getXqtyord() {
		return xqtyord;
	}
	public void setXqtyord(BigDecimal xqtyord) {
		this.xqtyord = xqtyord;
	}
	public BigDecimal getXrate() {
		return xrate;
	}
	public void setXrate(BigDecimal xrate) {
		this.xrate = xrate;
	}
    
    
}
