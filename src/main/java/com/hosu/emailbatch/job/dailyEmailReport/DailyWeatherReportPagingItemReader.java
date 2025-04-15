package com.hosu.emailbatch.job.dailyEmailReport;

import com.hosu.emailbatch.dto.CustomerDailyWeatherReport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.AbstractPagingItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@StepScope
public class DailyWeatherReportPagingItemReader extends AbstractPagingItemReader<CustomerDailyWeatherReport> {

    public DailyWeatherReportPagingItemReader(@Value("#{jobParameters[targetYearMonth]}") String targetYearMonth) {
        // TODO: 만들어야 함
    }

    @Override
    protected void doReadPage() {
        // TODO: 만들어야 함
    }
}
