package com.hosu.emailbatch.job.dailyEmailReport;

import com.hosu.emailbatch.dto.CustomerDailyWeatherReport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.classify.Classifier;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class DailyWeatherReportClassifier implements
        Classifier<CustomerDailyWeatherReport, ItemWriter<? super CustomerDailyWeatherReport>> {

    @Override
    public ItemWriter<? super CustomerDailyWeatherReport> classify(CustomerDailyWeatherReport customerDailyWeatherReport) {
        return null;
    }
}
