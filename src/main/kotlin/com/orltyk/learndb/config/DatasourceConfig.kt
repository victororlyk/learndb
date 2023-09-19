package com.orltyk.learndb.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
class DatasourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties("app.database.main")
    fun hikariDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource::class.java).build()
    }

    @Bean
    fun jdbcTemplate(hikariDataSource: HikariDatasource): JdbcTemplate {
        return Jdb
    }
}

