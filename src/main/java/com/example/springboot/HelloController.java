package com.example.springboot;

import com.example.springboot.service.PrimeNumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

	private PrimeNumberService primeService;

	private static Logger log = LoggerFactory.getLogger(HelloController.class);

	public HelloController(final PrimeNumberService primeService) {
		this.primeService = primeService;
	}

	@GetMapping("/primes/{limit}")
	public Map<String, Object> index(@PathVariable("limit") Integer limit) throws Exception {

		log.info("PrimeNumbers Received: " + primeService.primeService(limit).toString());

		return primeService.primeService(limit);

	}

}
