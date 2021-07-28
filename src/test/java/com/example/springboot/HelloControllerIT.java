package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

	@Autowired
	private TestRestTemplate template;

    @Test
    public void getHello() throws Exception {
        String jsonStr = "{\"Initial\":120,\"Primes\":[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47" +
                ",53,59,61,67,71,73,79,83,89,97,101,103,107,109,113]}";
        ResponseEntity<String> response = template.getForEntity("/primes/120", String.class);
        //log.info("Log message");
        assertThat(response.getBody()).isEqualTo(jsonStr);
    }
}
