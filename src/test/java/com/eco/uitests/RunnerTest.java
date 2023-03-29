package com.eco.uitests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
@CucumberOptions(features = "src/test/java/com/eco/uitests/features/",
        plugin = {"html:target/selenium-reports","json:target/cucumber-reports/report.json","rerun:target/rerun.txt"},tags = {"@Release"})
public class RunnerTest extends AbstractTestNGCucumberTests {

    @BeforeTest
    public void SetUp() throws IOException {
        if (System.getProperty("os.name").contains("Linux"))
        {
            File file = new File("src/test/java/com/eco/uitests/resources/chromedriverlinux");
            file.setExecutable(true);
            System.setProperty("webdriver.chrome.logfile","src/test/java/com/eco/uitests/resources/chromelog.txt");
            System.setProperty("webdriver.chrome.driver","src/test/java/com/eco/uitests/resources/chromedriverlinux");

            File file1 = new File("src/test/java/com/eco/uitests/resources/geckodriver 32");
            file1.setExecutable(true);
            System.setProperty("webdriver.gecko.driver","src/test/java/com/eco/uitests/resources/geckodriver 32");

        }
        else
        {
            System.setProperty("webdriver.chrome.driver","src/test/java/com/eco/uitests/resources/chromedriver111.exe");
            System.setProperty("webdriver.chrome.logfile","src/test/java/com/eco/uitests/resources/chromelog.txt");

            System.setProperty("webdriver.gecko.driver","src/test/java/com/eco/uitests/resources/geckodriver64.exe");

        }

    }

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

