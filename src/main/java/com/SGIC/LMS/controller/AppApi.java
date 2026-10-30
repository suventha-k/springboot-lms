package com.SGIC.LMS.controller;

import com.SGIC.LMS.service.AppInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class AppApi {
    private final AppInfo appInfo;

    public AppApi(AppInfo appInfo ) {
        this.appInfo = appInfo;
    }

    @GetMapping("/applname")
    public String getA(){
        return appInfo.getAppName();

    }
    @GetMapping("/applverson")
    public String getB(){
        return appInfo.getAppVersion();
    }

}

