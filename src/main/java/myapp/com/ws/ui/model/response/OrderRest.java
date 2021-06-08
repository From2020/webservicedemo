package myapp.com.ws.ui.model.response;

import java.math.BigDecimal;
import java.util.Date;

public class OrderRest {
	private String cacus;
	private BigDecimal xprimetotamt;
	private Date xdate;
	public String getCacus() {
		return cacus;
	}
	public void setCacus(String cacus) {
		this.cacus = cacus;
	}
	public BigDecimal getXprimetotamt() {
		return xprimetotamt;
	}
	public void setXprimetotamt(BigDecimal xprimetotamt) {
		this.xprimetotamt = xprimetotamt;
	}
	public Date getXdate() {
		return xdate;
	}
	public void setXdate(Date xdate) {
		this.xdate = xdate;
	}
	
	
}
