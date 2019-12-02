package com.conf.suvizD.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Created by surviz on 2019/12/02.
 */
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySources() {
        String propFile = "/Users/surviz/Downloads/suvizD/src/main/resources/application1.properties";
        PropertySourcesPlaceholderConfigurer ppConfig = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new FileSystemResource[]
                { new FileSystemResource(propFile) };
        ppConfig.setLocations( resources );
        return ppConfig;
    }

}
