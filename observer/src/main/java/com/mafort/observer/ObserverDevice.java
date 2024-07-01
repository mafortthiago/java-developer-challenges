package com.mafort.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ObserverDevice implements ApplicationListener<WeatherEvent> {
    @Override
    public void onApplicationEvent(WeatherEvent event) {
        System.out.println("Weather updated received: " + event.getWeather());
    }
}
