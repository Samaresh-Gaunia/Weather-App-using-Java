package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/current")
    public String getCurrentWeather(@RequestParam String city) {
        return weatherService.getCurrentWeather(city);
    }

    @GetMapping("/forecast")
    public String getForecast(@RequestParam String city) {
        return weatherService.getForecast(city);
    }
}
