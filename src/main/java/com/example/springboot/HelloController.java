package com.example.springboot;

import com.example.springboot.service.PrimeNumberService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

	private PrimeNumberService primeService;

	public HelloController(final PrimeNumberService primeService) {
		this.primeService = primeService;
	}

	@GetMapping("/primes/{limit}")
	public Map<String, Object> index(@PathVariable("limit") Integer limit) throws Exception {

		return primeService.primeService(limit);

	}

}
