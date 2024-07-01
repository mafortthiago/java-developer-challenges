package com.mafort.observer;

import org.springframework.context.ApplicationEvent;

public class WeatherEvent extends ApplicationEvent {
    private String weather;

    public WeatherEvent(Object source, String weather) {
        super(source);
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }
}
