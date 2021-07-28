package com.example.springboot.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberTests {

    @Test
    public void testService() throws Exception {
        String jsonStr = "{Initial=120,Primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47" +
                ",53,59,61,67,71,73,79,83,89,97,101,103,107,109,113]}";
        PrimeNumberService spyPrimeNumberService = new PrimeNumberService();
        assertThat(spyPrimeNumberService.primeService(120).toString().replaceAll(" ",""))
                .isEqualTo(jsonStr);

    }
}
