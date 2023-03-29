package com.eco.uitests.factory;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IOSDriverManager extends DriverManager{
    @Override
    void createWebDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("PlatformName","iOS");
        //this.driver = new IOSDriver<>(getRemoteUrl(),capabilities);
    }
}
