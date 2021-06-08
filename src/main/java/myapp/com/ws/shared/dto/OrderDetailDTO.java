package myapp.com.ws.shared.dto;

import java.math.BigDecimal;

public class OrderDetailDTO {

	private String orderXitem;
	private BigDecimal orderXqtyord;
	private BigDecimal orderXrate;
	public String getOrderXitem() {
		return orderXitem;
	}
	public void setOrderXitem(String orderXitem) {
		this.orderXitem = orderXitem;
	}
	public BigDecimal getOrderXqtyord() {
		return orderXqtyord;
	}
	public void setOrderXqtyord(BigDecimal orderXqtyord) {
		this.orderXqtyord = orderXqtyord;
	}
	public BigDecimal getOrderXrate() {
		return orderXrate;
	}
	public void setOrderXrate(BigDecimal orderXrate) {
		this.orderXrate = orderXrate;
	}


}
