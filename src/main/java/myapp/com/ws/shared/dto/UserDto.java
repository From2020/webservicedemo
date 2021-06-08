package myapp.com.ws.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private	String zemail;
	private	String xname;
	private	String xpassword;
	private	String zactive;
	private	String xposition;
	private String xmadd;
	private String xdeptname;
	private String xdesignation;
	private String xphone;
	private String xbloodgroup;
	private String ximageurl;
	
	

	
	public String getXimageurl() {
		return ximageurl;
	}
	public void setXimageurl(String ximageurl) {
		this.ximageurl = ximageurl;
	}
	public String getZemail() {
		return zemail;
	}
	public void setZemail(String zemail) {
		this.zemail = zemail;
	}
	public String getXname() {
		return xname;
	}
	public void setXname(String xname) {
		this.xname = xname;
	}
	public String getXpassword() {
		return xpassword;
	}
	public void setXpassword(String xpassword) {
		this.xpassword = xpassword;
	}
	public String getZactive() {
		return zactive;
	}
	public void setZactive(String zactive) {
		this.zactive = zactive;
	}
	public String getXposition() {
		return xposition;
	}
	public void setXposition(String xposition) {
		this.xposition = xposition;
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
	
	

}
