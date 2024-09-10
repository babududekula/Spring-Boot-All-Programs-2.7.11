package com.pack.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
@Data
public class Person 
{
	@XmlAttribute
	private Integer personId;
	
	@XmlTransient
	private String personName;
	
	@XmlElement(name = "personLocation")
	private String personAddress;
	private Company companyDetails;
}
