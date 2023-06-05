package com.example.maintainancemonitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintainanceMonitorController {
    public String defaultMessage="Message: Everything operates as expected";
    public String message =defaultMessage;

    @RequestMapping("/")
    public String defaultwebseite (){

        return message;
    }

    @RequestMapping("/change")
    public String change (@RequestParam String newMessage){
        message ="Message:"+ newMessage;
        return message;
    }

    @RequestMapping("/reset")
    public String reset (){
        message =defaultMessage;
        return message;
    }



}
