package com.lixn.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author lixiangnan
 * @since 2020/5/15 21:37
 */
@Configuration
public class PmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws Exception {
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }
}
