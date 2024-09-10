package com.pack.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person 
{
	private Integer pid;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public String getPsalary() {
		return psalary;
	}
	public void setPsalary(String psalary) {
		this.psalary = psalary;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	private String pname;
	private String paddress;
	private String psalary;
	private Integer page;
}
