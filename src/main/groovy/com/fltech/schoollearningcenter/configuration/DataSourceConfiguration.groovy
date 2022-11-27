package com.fltech.schoollearningcenter.configuration

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.core.env.Environment

import javax.sql.DataSource

@Configuration
class DataSourceConfiguration {

    @Autowired
    Environment environment

    @Primary
    @Bean(name = "schoolLearningCenterDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.school-learning-center")
    DataSource dataSource() {
        HikariConfig hikariConfig = new HikariConfig()
        hikariConfig.setJdbcUrl(environment.getProperty("spring.datasource.school-learning-center.url"))
        hikariConfig.setUsername(environment.getProperty("spring.datasource.school-learning-center.username"))
        hikariConfig.setPassword(environment.getProperty("spring.datasource.school-learning-center.password"))
        new HikariDataSource(hikariConfig)
    }

}
