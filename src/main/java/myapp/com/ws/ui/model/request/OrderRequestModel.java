package myapp.com.ws.ui.model.request;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import myapp.com.ws.io.entity.Oporddetail;

public class OrderRequestModel {
	private String xordernum;
	private String xcus;
	private BigDecimal xprimetotamt;
	private String xdate;
	private List<OrderDetailRequsetModel> ordDetailRequsetModel;

	public BigDecimal getXprimetotamt() {
		return xprimetotamt;
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

	public List<OrderDetailRequsetModel> getOporddetailReqModel() {
		return ordDetailRequsetModel;
	}

	public String getXcus() {
		return xcus;
	}

	public void setXcus(String xcus) {
		this.xcus = xcus;
	}

	public void setOporddetailReqModel(List<OrderDetailRequsetModel> oporddetailReqModel) {
		this.ordDetailRequsetModel = oporddetailReqModel;
	}

}
