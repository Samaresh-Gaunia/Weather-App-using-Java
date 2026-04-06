package com.example.weather.model;

public class WeatherResponse {
    public Main main;

    public static class Main {
        public double temp;
        public int humidity;
    }
}