package myapp.com.ws.shared.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class CusDto implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private String xcus;
    private String xorg;
    private String xmadd;
    private String xphone;
    private BigDecimal xcrlimit;
	private String xgcus;
	private String xmarket;
	private BigDecimal xdisc;
	
	
	public BigDecimal getXdisc() {
		return xdisc;
	}
	public void setXdisc(BigDecimal xdisc) {
		this.xdisc = xdisc;
	}
    
    
	public String getXcus() {
		return xcus;
	}
	public void setXcus(String xcus) {
		this.xcus = xcus;
	}
	public BigDecimal getXcrlimit() {
		return xcrlimit;
	}
	public void setXcrlimit(BigDecimal xcrlimit) {
		this.xcrlimit = xcrlimit;
	}
	public String getXorg() {
		return xorg;
	}
	public void setXorg(String xorg) {
		this.xorg = xorg;
	}
	public String getXgcus() {
		return xgcus;
	}
	public void setXgcus(String xgcus) {
		this.xgcus = xgcus;
	}
	public String getXmarket() {
		return xmarket;
	}
	public void setXmarket(String xmarket) {
		this.xmarket = xmarket;
	}
	public String getXmadd() {
		return xmadd;
	}
	public void setXmadd(String xmadd) {
		this.xmadd = xmadd;
	}
	public String getXphone() {
		return xphone;
	}
	public void setXphone(String xphone) {
		this.xphone = xphone;
	}
    
    
    
}
