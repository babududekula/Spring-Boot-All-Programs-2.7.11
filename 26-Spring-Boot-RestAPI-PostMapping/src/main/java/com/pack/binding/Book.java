package com.pack.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book 
{
	private String bookid;
	private String bookname;
	private Integer bookprice;
	private String bookaddress;
}
