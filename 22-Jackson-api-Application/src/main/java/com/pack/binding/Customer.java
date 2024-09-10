package com.pack.binding;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder

public class Customer 
{
	@JsonProperty(value = "customerId")
	private Integer id;
	private String name;
	private String address;
	private Person personDetails;
	
}
