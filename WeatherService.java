package com.example.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCurrentWeather(String city) {
        String url = apiUrl + "/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        return restTemplate.getForObject(url, String.class);
    }

    public String getForecast(String city) {
        String url = apiUrl + "/forecast?q=" + city + "&appid=" + apiKey + "&units=metric";
        return restTemplate.getForObject(url, String.class);
    }
}
