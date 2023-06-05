package com.example.maintainancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintainanceMonitorController {
    public String defaultMessage="Message: Everything operates as expected";
    public String message =defaultMessage;

    @RequestMapping("/")
    public String defaultwebseite (){

        return message;
    }


}
