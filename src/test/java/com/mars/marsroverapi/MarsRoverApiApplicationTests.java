package com.mars.marsroverapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import response.MarsRoverApiResponse;

@SpringBootTest
class MarsRoverApiApplicationTests {

    @Test
    public void shouldReturnNasaApiJson() {
        RestTemplate returnApi = new RestTemplate();

       ResponseEntity<MarsRoverApiResponse> response = returnApi.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", MarsRoverApiResponse.class);
        System.out.println(response.getBody());
    }

}
