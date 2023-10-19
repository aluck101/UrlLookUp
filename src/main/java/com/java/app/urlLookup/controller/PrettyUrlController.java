package com.java.app.urlLookup.controller;

import com.java.app.urlLookup.service.UrlService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api")
public class PrettyUrlController {

    @PostMapping(value="/params", consumes = "application/json" )
    @ResponseStatus(HttpStatus.CREATED)

    public Object postBodyParams(@RequestBody List<String> url_params) {
    UrlService service = new UrlService();
    return service.getPrettyUrl(url_params, false);
    }

    @PostMapping(value="/pretty", consumes = "application/json" )
    @ResponseStatus(HttpStatus.CREATED)
    public Object postBodyPretty(@RequestBody List<String> url_pretty) {
        UrlService service = new UrlService();
        return service.getPrettyUrl(url_pretty, true);
    }
}
