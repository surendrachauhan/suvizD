package com.conf.suvizD.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;

/**
 * Created by surviz on 2019/12/02.
 */

    @ConfigurationProperties(prefix = "app")
    @Validated
    public class AppProperties {

    @NotNull
    private String url;
    private String uname;
    private String password;

    @Value("${fPath}")
    private String filePath;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
