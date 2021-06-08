package myapp.com.ws.shared.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDto implements Serializable {

	private static final long serialVersionUID = 2876340927743103477L;

	private String xordernum;
	private String xcus;
	private BigDecimal xprimetotamt;
	private String xdate;
	private List<OrderDetailDTO> orderDetailDTO;
	

	public List<OrderDetailDTO> getOrderDetailDto() {
		return orderDetailDTO;
	}

	public void setOrderDetailDto(List<OrderDetailDTO> orderDetailDTO) {
		this.orderDetailDTO = orderDetailDTO;
	}


	public BigDecimal getXprimetotamt() {
		return xprimetotamt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getXdate() {
		return xdate;
	}


	public void setXprimetotamt(BigDecimal xprimetotamt) {
		this.xprimetotamt = xprimetotamt;
	}

	public void setXdate(String xdate) {
		this.xdate = xdate;
	}

	public String getXordernum() {
		return xordernum;
	}

	public void setXordernum(String xordernum) {
		this.xordernum = xordernum;
	}

	public String getXcus() {
		return xcus;
	}

	public void setXcus(String xcus) {
		this.xcus = xcus;
	}

}
