package com.fltech.schoollearningcenter.configuration

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment

@Configuration
class FlywayConfiguration {

    @Autowired
    DataSourceProvider dataSourceProvider

    @Autowired
    Environment environment

    @Bean("flyway")
    Flyway flyway() {
        if(environment.getProperty("spring.flyway.enabled").toBoolean()){
            Flyway flyway = Flyway.configure()
                .locations(environment.getProperty("spring.flyway.locations"))
                .dataSource(dataSourceProvider.schoolLearningCenterDataSource)
                .load()
            flyway.repair()
            flyway.migrate()
            flyway
        }
    }

}
