package com.SGIC.LMS.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appversion;


    public String addinfo(){
        return  "App Name :" +appName +  "\n"+ "App Version : "+appversion;
    }
}
