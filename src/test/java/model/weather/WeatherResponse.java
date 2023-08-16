package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
    private double lat;
    private double lon;
    private String timezone;

    @JsonProperty("timezone_offset")
    private int timezoneOffset;

    private Current current;

    //HW...

    //Getters & Setters
}
