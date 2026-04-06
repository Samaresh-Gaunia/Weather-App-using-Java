package com.example.weather.model;

import java.util.List;

public class ForecastResponse {
    public List<Item> list;

    public static class Item {
        public Main main;
        public String dt_txt;
    }

    public static class Main {
        public double temp;
    }
}