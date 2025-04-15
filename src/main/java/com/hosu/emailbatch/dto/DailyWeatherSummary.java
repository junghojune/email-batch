package com.hosu.emailbatch.dto;

import com.hosu.emailbatch.dto.enums.WeatherType;
import lombok.Data;

@Data
public class DailyWeatherSummary {
    private final String location;
    private final WeatherType weatherType;
    private final Double temperature;
}
