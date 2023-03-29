package com.eco.uitests.stepdef.Uptogether;

import com.eco.uitests.factory.DriverManager;
import com.eco.uitests.factory.DriverManagerFactory;
import com.eco.uitests.factory.DriverType;
import com.eco.uitests.pages.Uptogether.LoginPage;
import com.eco.uitests.wrapper.GenericWrapper;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.sourceforge.tess4j.TesseractException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;

import java.io.*;
import java.util.*;

public class Login extends GenericWrapper {
    public WebDriver driver;
    public LoginPage loginPage;
    DriverManager driverManager;
    Logger logger = Logger.getLogger(Login.class);
    FileReader reader=new FileReader("src/test/java/com/eco/uitests/resources/driver.properties");
    Properties p=new Properties();

    public Login() throws FileNotFoundException {
    }

    @Before
    public void setBrowser()
    {
        try
        {
            Properties props = new Properties();
            props.load(new FileInputStream("src/test/java/com/eco/uitests/resources/log4j.properties"));
            p.load(reader);
            PropertyConfigurator.configure(props);
            if (System.getProperty("browser")==null||System.getProperty("browser").equalsIgnoreCase("firefox"))
            {
                driverManager = DriverManagerFactory.getDriverManager(DriverType.FIREFOX);
            }
            else
            {
                logger.setLevel(Level.ALL);
                logger.log(Level.INFO,"Setting the driver");
                driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
            }
            //similarly for other browsers
            driver = driverManager.getWebDriver();
          //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
            driver.manage().window().maximize();
            loginPage = new LoginPage(driver);

        }
        catch (Exception e)
        {
           // logger.log(Level.WARN,"Enter the browser env argument");
            e.printStackTrace();
        }

    }
    public WebDriver getDriver() {
        return driver;
    }

    @Given("^User on Uptogether Login Page$")
    public void  userOnLoginPage() throws IOException, InterruptedException {
       driver.get(p.getProperty("baseURL"));
       System.out.println("Browser launched successfully");
       Thread.sleep(10000);
       loginPage.getLandingPageText(driver);
       Thread.sleep(5000);
       //loginPage.clickCloseIcon1(driver);
       //loginPage.clickCloseIcon2(driver);
       //loginPage.clickCloseIcon3(driver);
    }

    @When("User click on the Landing Page Randomly")
    public void clickLandingPage() throws InterruptedException {
        loginPage.getLandingPageText(driver);
    }

    @When("User enters the email id and click enter")
    public void enterEmailId() throws InterruptedException {
        loginPage.enterEmailId(driver);
        System.out.println(loginPage.getMagicLinkMessage(driver));
    }

    @When("User asserts that a login link has been sent to the specified email id")
    public void assertEmailSentMessage() throws InterruptedException {
        Assert.assertEquals("Magic Link Sent!\n" +
                "Please check your email.\n" +
                "It contains a link. Click it to log in!", loginPage.getMagicLinkMessage(driver));
        System.out.println("Test Passed");
    }

    @When("User enters an invalid email id and click enter")
    public void enterWrongEmailId() throws InterruptedException {
        loginPage.wrongEmailIdInput(driver);
    }

    @When("User enters an invalid number and click enter")
    public void enterWrongNumber() throws InterruptedException {
        loginPage.wrongNumberInput(driver);
    }
    @When("User asserts that a invalid email number validation message is displayed to the user")
    public void assertInvalidEmailOrNumberMessage() throws InterruptedException {
        Assert.assertEquals("Please enter a valid Email or Phone Number", loginPage.getemailPhoneErrorMessage(driver));
        System.out.println("Invalid Email or Number validation passed");
    }

    @When("User enters a valid but number and click enter")
    public void enterValidNumber() throws InterruptedException {
        loginPage.ValidNumberInput(driver);
    }

    @When("User asserts that Account does not exist is displayed in the ui")
    public void assertWrongNumberMessage() throws InterruptedException {
        System.out.println(loginPage.getAccountNotFoundMessage(driver));
    }

    @When("User click on the uptogether login button")
    public void uptogetherLogin() throws InterruptedException {
        loginPage.clickUptogetherLoginButton(driver);
    }

    @When("User click on the google login button")
    public void googleLogin() throws InterruptedException {
        loginPage.clickgoogleLoginButton(driver);
    }

    @And("User switches to the child window to enter the google account details and switches back to the parent window")
    public void switchToChildWindow() throws InterruptedException {

        // 01_Clicking on Link1 on Window A. New Window B is opened.
        //driver.findElement(By.id("Link_1")).click();
        loginPage.clickgoogleLoginButton(driver);

        // Storing parent window reference into a String Variable
        String parent = driver.getWindowHandle();

        // Set S1 will store number of windows opened by Webdriver
        Set<String> s1 = driver.getWindowHandles();

        // Now we will iterate using Iterator
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            // Create reference for Window B
            String child_window = I1.next();

            // Here we will compare if parent window is not equal to child window then we
            // will close

            if (!parent.equals(child_window)) {
                // Move Focus from Window A to Window B. Window B is active now
                driver.switchTo().window(child_window);

                // Complete the set of actions on Window B .
                System.out.println(driver.switchTo().window(child_window).getTitle());
                //driver.manage().window().maximize();
                //System.out.println("Maximazed the window");
                Thread.sleep(5000);
                /*
                try{
                    boolean temp = loginPage.UserName.isDisplayed();
                }catch (NoSuchElementException e)
                {
                    System.out.println("The element is not found");
                    e.printStackTrace();
                }
                loginPage.enterUserName(p.getProperty("username1"));
                loginPage.clickNextButton(driver);
                loginPage.enterPassword(p.getProperty("password1"));
                loginPage.clickNextButton(driver);
                Thread.sleep(20000);

                 */

                loginPage.enterGoogleLoginDetail(driver);
                Thread.sleep(10000);
            }
        }
        // Move Focus to Window A. Window A is active now
        driver.switchTo().window(parent);
        System.out.println(driver.switchTo().window(parent).getTitle());
        //fnWaitVisibility(driver,"//h2[normalize-space()='Home']");
        Thread.sleep(40000);
        System.out.println("LOGIN SUCCESSFUL");
    }

    @And("User logs out of the application")
    public void logOut() throws InterruptedException {
        loginPage.clicklogOut(driver);
    }

    @And("User goes to Groups page after switching to the parent window")
    public void loginUsingGoogleAccount() throws InterruptedException {
        System.out.println(driver.getTitle());
        //loginPage.clickCloseIcon3(driver);
        //loginPage.clickGroupIcon(driver);
        loginPage.clickGroupIcon2(driver);

    }

    @When("User goes to the Create Account Page")
    public void navigateToCreateAccountPage() throws InterruptedException {
        loginPage.clickUserRegistrationButton(driver);
    }

    @When("User Enters all the details, enters captcha and click save")
    public void enterAccountDetails() throws InterruptedException, TesseractException, IOException {
        loginPage.enterUserDetails(driver);
        loginPage.enterCaptcha(driver);
    }


    @When("User enters the email id in the register account second page")
    public void enterEmailId_AccountRegistration() throws InterruptedException {
        loginPage.enterEmailId_AccountRegistration(driver);
        System.out.println(loginPage.getMagicLinkMessage(driver));
    }

    @When("User asserts that a Account Registration magic link has been sent to the specified email id")
    public void assertAccountRegistrationMessage() throws InterruptedException {
        Assert.assertEquals("Magic Link Sent!\n" +
                "Please check your email.\n" +
                "It contains a link. Click it to log in!", loginPage.getMagicLinkMessage_AccountRegistration(driver));
        System.out.println("Test Passed");
    }


    @When("^User enters the username and password$")
    public void enterTheDetails() throws InterruptedException {
        try{
            boolean temp = loginPage.UserName.isDisplayed();
        }catch (NoSuchElementException e)
        {
            System.out.println("The element is not found");
            e.printStackTrace();
        }
        loginPage.enterUserName(p.getProperty("username"));
        loginPage.clickNextButton(driver);
        loginPage.enterPassword(p.getProperty("password"));
        loginPage.clickNextButton(driver);
        Thread.sleep(20000);
    }
/*

    @Then("^User verifies the message and redirection$")
    public void verifyTheLogin() throws InterruptedException, IOException {
      //fnWaitPresenceOfElementWeb(driver,"xpath==//div[4]//img[1]",20);
    }
*/
    @After
    public void tearDown(Scenario scenario) throws IOException, InterruptedException {
        List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        FileWriter myWriter = new FileWriter("src/test/java/com/eco/uitests/resources/chromelog.txt");
        for (LogEntry entry : entries) {
            myWriter.write(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
        myWriter.close();
       logger.log(Level.INFO,"Killing the driver and session");
        if (driver != null) {
            if (scenario.isFailed()) {
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            }
           driverManager.quitWebDriver();
        }
    }
}
