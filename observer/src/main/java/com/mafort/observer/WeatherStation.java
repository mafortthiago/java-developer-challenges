package com.mafort.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class WeatherStation{
    private final ApplicationEventPublisher publisher;

    @Autowired
    public WeatherStation(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void updateWeather(String newWeather) {
        System.out.println("Publishing weather actualization...");
        this.publisher.publishEvent(new WeatherEvent(this, newWeather));
    }
}