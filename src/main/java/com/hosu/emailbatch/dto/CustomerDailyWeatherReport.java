package com.hosu.emailbatch.dto;

import com.hosu.emailbatch.dto.enums.ReportChannel;
import java.util.List;

public class CustomerDailyWeatherReport {
    private Long customerId;
    private ReportChannel channel;
    private List<CustomerDailyWeatherReportDetails> customerDailyWeatherReportDetails;
}
