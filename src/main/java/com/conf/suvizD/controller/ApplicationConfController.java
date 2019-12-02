package com.conf.suvizD.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import com.conf.suvizD.config.AppProperties;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


/**
 * Created by surviz on 2019/12/02.
 */
@RestController
public class ApplicationConfController {


    // Injecting ConfigurationProperties in your Beans
        @Autowired
        private AppProperties appProperties;

    	Logger log  = LoggerFactory.getLogger(ApplicationConfController.class);


    @GetMapping("/")
        public Map<String, String> getAppDetails() {
            Map<String, String> appDetails = new HashMap<>();
            appDetails.put("url", appProperties.getUrl());
            appDetails.put("uName", appProperties.getUname());
            appDetails.put("password", appProperties.getPassword());

            log.info("appProperties.getURL",appProperties.getUrl() );
            log.info("appProperties.getuName",appProperties.getUname() );
            log.info("appProperties.getPassword",appProperties.getPassword() );

            return appDetails;
        }


    }

