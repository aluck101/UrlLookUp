package com.java.app.urlLookup;

import com.java.app.urlLookup.service.UrlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UrlLookupApplication {

    public static void main(String[] args) {
        UrlService service = new UrlService();
        service.addUrl();
        SpringApplication.run(UrlLookupApplication.class, args);
    }




}
