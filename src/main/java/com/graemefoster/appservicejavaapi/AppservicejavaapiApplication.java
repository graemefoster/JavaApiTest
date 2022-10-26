package com.graemefoster.appservicejavaapi;

import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppservicejavaapiApplication {

    public static void main(String[] args) {
        ApplicationInsights.attach();
        SpringApplication.run(AppservicejavaapiApplication.class, args);
    }

}
