package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_table")
public class Product 
{
	@Id
	private Integer productId;
	private String productName;
	private String customerMobile;
	private Double productPrice;
	private Integer productQuantity;
	private Double productTotal;
	private Double productDiscount;
	private Double productServiceCharges;
	private Double productInvoiceAmount;
	
}
