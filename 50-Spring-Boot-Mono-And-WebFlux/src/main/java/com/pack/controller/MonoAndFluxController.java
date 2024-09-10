package com.pack.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.binding.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class MonoAndFluxController 
{
	@GetMapping( value = "/event" , produces = "application/json")
	public ResponseEntity<Mono<Customer>> monoObject()
	{
		Customer customer = new Customer(1, "Babu", new Date());
		Mono<Customer> mono = Mono.just(customer);
		return new ResponseEntity<Mono<Customer>>(mono, HttpStatus.OK);
	}
	
	@GetMapping(value = "/events" , produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<Customer>> fluxObject()
	{
		Customer customer = new Customer(1, "Babu", new Date());
		Stream<Customer> generate = Stream.generate(()-> customer);
		Flux<Customer> fromStream = Flux.fromStream(generate);
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(2));
		Flux<Tuple2<Long,Customer>> zip = Flux.zip(interval, fromStream);
		Flux<Customer> map = zip.map(Tuple2::getT2);
		return new ResponseEntity<Flux<Customer>>(map, HttpStatus.OK);
		
	}
}







