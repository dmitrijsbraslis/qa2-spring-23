package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Current {
    private long dt;
    private long sunrise;
    private long sunset;
    private double temp;

    @JsonProperty("feels_like")
    private double feelsLike;

    //HW...

    @JsonProperty("weather")
    private List<Weather> weathers;

    //Getters & Setters here!
}
