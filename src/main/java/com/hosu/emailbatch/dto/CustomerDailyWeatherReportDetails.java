package com.hosu.emailbatch.dto;

import com.hosu.emailbatch.dto.enums.WeatherType;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDailyWeatherReportDetails {
    private String location;
    private LocalDateTime date;
    private WeatherType weatherType;
    private Double temperature;
    private Double feelsLike;
    private Double humidity;
}
