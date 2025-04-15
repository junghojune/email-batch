package com.hosu.emailbatch.configuration;

import javax.sql.DataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DataSourceConnectionProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

@Configuration
public class DslConfig {

    @Bean
    public DataSourceConnectionProvider emailBatchConnectionProvider(DataSource dataSource) {
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
    }

    @Bean
    public DSLContext  emailBatchDsl(DataSource dataSource) {
        return DSL.using(emailBatchConnectionProvider(dataSource), SQLDialect.MYSQL);
    }
}
