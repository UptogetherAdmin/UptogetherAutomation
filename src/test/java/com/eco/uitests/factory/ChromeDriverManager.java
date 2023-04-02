package com.eco.uitests.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class ChromeDriverManager extends DriverManager {
    @Override
    void createWebDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        String downloadFilepath = System.getProperty("user.dir");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromeOptions.addArguments("--window-size=1366,768");

        // Setting new download directory path
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Use File.separator as it will work on any OS
        prefs.put("download.default_directory",
                System.getProperty ("user.dir"));
        chromeOptions.setExperimentalOption("prefs", prefs);

        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable( LogType.PERFORMANCE, Level.ALL );
        chromeOptions.setCapability( "goog:loggingPrefs", logPrefs );
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("disable-dev-shm-usage");
        //chromeOptions.addArguments("--headless");

        /*
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
    options.addArguments("--disable-extensions");
    options.addArguments("--proxy-server='direct://'");
    options.addArguments("--proxy-bypass-list=*");
    options.addArguments("--start-maximized");
    options.addArguments("--headless");
    options.addArguments("--disable-gpu");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--no-sandbox");
    options.addArguments("--ignore-certificate-errors");

         */
        this.driver = new ChromeDriver(chromeOptions);
    }
}
