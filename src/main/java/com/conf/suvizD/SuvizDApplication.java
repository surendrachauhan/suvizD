package com.conf.suvizD;

import com.conf.suvizD.controller.ApplicationConfController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.conf.suvizD.config.AppProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

	@SpringBootApplication
	@EnableConfigurationProperties(AppProperties.class)
	public class SuvizDApplication {

	static	Logger log  = LoggerFactory.getLogger(SuvizDApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SuvizDApplication.class, args);
		SpringApplication application = new SpringApplicationBuilder(SuvizDApplication.class).application();
		ConfigurableApplicationContext context = application.run(args);
		ApplicationConfController s = context.getBean(ApplicationConfController.class);
		log.info("Hello Spring Boot");
		log.info("Valueee....",s.getAppDetails());
	}

}
