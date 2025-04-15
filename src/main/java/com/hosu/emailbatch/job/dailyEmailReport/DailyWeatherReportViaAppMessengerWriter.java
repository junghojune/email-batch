package com.hosu.emailbatch.job.dailyEmailReport;

import com.hosu.emailbatch.dto.CustomerDailyWeatherReport;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Value;

public class DailyWeatherReportViaAppMessengerWriter implements ItemWriter<CustomerDailyWeatherReport> {

    public DailyWeatherReportViaAppMessengerWriter(@Value("#{jobParameters[targetYearMonth]}") String targetYearMonth) {
        // TODO: 만들어야 함
    }

    @Override
    public void write(Chunk<? extends CustomerDailyWeatherReport> chunk) throws Exception {
        //TODO: 만들어야 함
    }
}
