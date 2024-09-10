package com.pack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pack.customeException.NoNameFoundException;
import com.pack.customer.Customer;

@RestControllerAdvice
public class ExceptionClass 
{
	@ExceptionHandler(value = {NullPointerException.class})
	public ResponseEntity<Customer> nullPointerException(NullPointerException ne)
	{
		Customer customer = new Customer();
		customer.setMessage(ne.getMessage());
		customer.setErrorCode("NUPE234");
		
		return new ResponseEntity<Customer>(customer, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {ArithmeticException.class})
	public ResponseEntity<Customer> arithmeticException(ArithmeticException ae)
	{
		Customer customer = new Customer();
		customer.setMessage(ae.getMessage());
		customer.setErrorCode("ERROR2345");
		
		return new ResponseEntity<Customer>(customer, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {NoNameFoundException.class})
	public ResponseEntity<Customer> myException(NoNameFoundException nne)
	{
		Customer customer = new Customer();
		customer.setMessage(nne.getMessage());
		customer.setErrorCode("NNSE3465");
		
		return new ResponseEntity<Customer>(customer , HttpStatus.BAD_REQUEST);
	}
}
