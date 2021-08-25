package com.mars.marsroverapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.mars.marsroverapi.response.MarsRoverApiResponse;

@Service
public class MarsRoverApiService {

    public MarsRoverApiResponse getRoverData() {
        RestTemplate returnApi = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = returnApi.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", MarsRoverApiResponse.class);
        return response.getBody();
    }
}
