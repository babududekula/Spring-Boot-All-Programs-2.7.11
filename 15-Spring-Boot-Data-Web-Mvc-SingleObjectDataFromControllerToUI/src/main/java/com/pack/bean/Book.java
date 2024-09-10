package com.pack.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book 
{
	private Integer bookId;
	private String bookName;
	private String bookPrice;
}
