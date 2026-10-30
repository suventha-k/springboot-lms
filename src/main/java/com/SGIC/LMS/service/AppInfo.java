package com.SGIC.LMS.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AppInfo {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

}
