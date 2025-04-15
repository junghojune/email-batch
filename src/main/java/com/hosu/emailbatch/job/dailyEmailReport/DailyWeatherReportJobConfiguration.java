package com.hosu.emailbatch.job.dailyEmailReport;

import com.hosu.emailbatch.dto.CustomerDailyWeatherReport;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.support.ClassifierCompositeItemWriter;
import org.springframework.batch.item.support.builder.ClassifierCompositeItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@RequiredArgsConstructor
public class DailyWeatherReportJobConfiguration extends DefaultBatchConfiguration {

    private static final String JOB_NAME = "dailyWeatherReportJob";

    private final DailyWeatherReportPagingItemReader dailyWeatherReportPagingItemReader;
    private final DailyWeatherReportClassifier dailyWeatherReportClassifier;

    @Bean
    public Job dailyWeatherReportJob(JobRepository jobRepository, Step customerDailyWeatherStep) {
        return new JobBuilder(JOB_NAME, jobRepository).start(customerDailyWeatherStep).build();
    }

    @Bean
    public Step customerDailyWeatherStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("customerDailyWeatherStep", jobRepository)
                .<CustomerDailyWeatherReport, CustomerDailyWeatherReport>chunk(100, transactionManager)
                .reader(dailyWeatherReportPagingItemReader)
                .writer(classifierCompositeItemWriter())
                .build();
    }
    @Bean
    @StepScope
    public ClassifierCompositeItemWriter<CustomerDailyWeatherReport> classifierCompositeItemWriter() {
        return new ClassifierCompositeItemWriterBuilder<CustomerDailyWeatherReport>().classifier(dailyWeatherReportClassifier).build();
    }
}
