package com.eco.uitests.pages.Uptogether;

import com.eco.uitests.factory.DriverManager;
import com.eco.uitests.stepdef.Uptogether.Login;
import com.eco.uitests.wrapper.GenericWrapper;
import io.cucumber.java8.Th;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;
import org.apache.bcel.generic.Select;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends GenericWrapper {

    FileReader reader=new FileReader("src/test/java/com/eco/uitests/resources/driver.properties");
    Properties p=new Properties();

    @FindBy(xpath = "//input[@id='identifierId']")
    public WebElement UserName;
    public void enterUserName(String userName)
    {
        UserName.sendKeys(userName);
    }

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;
    public void enterPassword(String password)
    {
        Password.sendKeys(password);
    }

    public void clickNextButton(WebDriver driver) throws InterruptedException {
        googleNextButton.click();
        Thread.sleep(10000);
    }



    @FindBy(xpath = "//span[class='intercom-block-paragraph e16pl8n50 intercom-1l8ns5d']")
    WebElement popUpText;
    public void getPopUpText(WebDriver driver) throws InterruptedException {
        driver.switchTo().frame("intercom-modal-frame");
        System.out.println(popUpText.getText());
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//span[@aria-label='Close']")
    WebElement closeIcon1;
    public void clickCloseIcon1(WebDriver driver) throws InterruptedException {
        driver.switchTo().frame("intercom-modal-frame");
        closeIcon1.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//span[@aria-label='Close']")
    WebElement closeIcon4;
    public void clickCloseIcon4(WebDriver driver) throws InterruptedException {
        driver.switchTo().frame("intercom-banner-frame");
        closeIcon4.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@aria-label='Close']")
    WebElement closeIcon2;
    public void clickCloseIcon2(WebDriver driver) throws InterruptedException {
        driver.switchTo().frame("intercom-banner-frame");
        closeIcon2.click();
        Thread.sleep(5000);
    }



    @FindBy(xpath = "//*[name()='polygon' and contains(@points,'350.656537')]")
    WebElement closeIcon3;
    public void clickCloseIcon3(WebDriver driver) throws InterruptedException {
        driver.switchTo().frame("intercom-banner-frame");
        closeIcon3.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@id='landingAndLoginInfoText']")
    WebElement LandingPageText;
    public void getLandingPageText(WebDriver driver) throws InterruptedException {
        System.out.println(LandingPageText.getText());
        Thread.sleep(1000);
    }

    public void clickLandingPageText(WebDriver driver) throws InterruptedException {
        LandingPageText.click();
        Thread.sleep(10000);
    }


    @FindBy(xpath = "//div[@id='landing-login']")
    WebElement uptogetherLoginButton;
    @FindBy(xpath = "//div[@id='googleLoginButton']")
    WebElement googleLoginButton;
    public void clickgoogleLoginButton(WebDriver driver) throws InterruptedException {
        googleLoginButton.click();
        Thread.sleep(5000);
    }

    public void clickUptogetherLoginButton(WebDriver driver) throws InterruptedException {
        uptogetherLoginButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//input[@id='input-magic-value']")
    WebElement emailInputfield;
    @FindBy(xpath = "//img[@id='submit-arrow']")
    WebElement submitArrowButton;
    public void enterEmailId(WebDriver driver) throws InterruptedException {
        uptogetherLoginButton.click();
        Thread.sleep(10000);
        emailInputfield.sendKeys("automation.uptogether@gmail.com");
        Thread.sleep(2000);
        submitArrowButton.click();
        Thread.sleep(5000);
    }

    public void wrongEmailIdInput(WebDriver driver) throws InterruptedException {
        uptogetherLoginButton.click();
        Thread.sleep(5000);
        emailInputfield.sendKeys("automation.uptogether@gmail");
        Thread.sleep(2000);
        submitArrowButton.click();
        Thread.sleep(2000);
    }


    public void wrongNumberInput(WebDriver driver) throws InterruptedException {
        emailInputfield.clear();
        Thread.sleep(2000);
        emailInputfield.sendKeys("987654321");
        Thread.sleep(2000);
        submitArrowButton.click();
        Thread.sleep(2000);
    }


    public void ValidNumberInput(WebDriver driver) throws InterruptedException {
        emailInputfield.clear();
        Thread.sleep(2000);
        emailInputfield.sendKeys("9876543210");
        Thread.sleep(2000);
        submitArrowButton.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//div[@id='emailOrPhoneError']")
    WebElement emailPhoneErrorMessage;
    public String getemailPhoneErrorMessage(WebDriver driver){
        return emailPhoneErrorMessage.getText();
    }

    @FindBy(xpath = "//div[@id='entityNotFoundError']")
    WebElement accountNotFoundMessage;
    public String getAccountNotFoundMessage(WebDriver driver){
        return accountNotFoundMessage.getText();
    }

    @FindBy(xpath = "//div[@id='magic-link-success']")
    WebElement magicLinkMessage;
    public String  getMagicLinkMessage(WebDriver driver){
        return magicLinkMessage.getText();
    }

    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement googleEmailEnterField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement googlePwdEnterField;
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement googleNextButton;
    public void enterGoogleLoginDetail(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        googleEmailEnterField.sendKeys("automation.uptogether@gmail.com");
        Thread.sleep(2000);
        googleNextButton.click();
        Thread.sleep(5000);
        googlePwdEnterField.sendKeys("Admin@123");
        googleNextButton.click();
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//a[contains(@href,'/groups')]//article//div//div//span[contains(@aria-label,'Arrow Right icon')]//*[name()='svg']")
    WebElement groupIcon;
    @FindBy(xpath = "//p[contains(text(),'Groups are the heart of UpTogether. Use this space')]")
    WebElement groupText;
    public void clickGroupIcon(WebDriver driver) throws InterruptedException {
        //fnWaitVisibility(driver, "//span[normalize-space()='Groups']");
        groupIcon.click();
        Thread.sleep(5000);
        /*
        if(groupText.isDisplayed()){
        System.out.println(groupText.getText());
        }else {
            System.out.println("Group is already created.");
        }
         */
    }



    public void clickGroupIcon2(WebDriver driver) throws InterruptedException {
        //WebElement menu2 = driver.findElement(By.xpath("//a[@href='/groups']//article//div//div//span[@aria-label='Arrow Right icon']//*[name()='svg']"));
        //Hover(driver,menu2);
        Thread.sleep(2000);
        groupIcon.click();
        Thread.sleep(5000);
        /*
        if(groupText.isDisplayed()){
        System.out.println(groupText.getText());
        }else {
            System.out.println("Group is already created.");
        }
         */
    }


    private void Hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    @FindBy(xpath = "//div[contains(@data-testid,'navigation-dropdown')]")
    WebElement profileDropdown;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement logOutOption;
    @FindBy(xpath = "//button[contains(@class,'tw-mb-3.5 tw-py-3 tw-text-black tw-bg-white tw-border tw-border-black')]")
    WebElement logOutConfirmation;
    @FindBy(xpath = "//div[@id='upTogetherLandingHeader']")
    WebElement landingPageHeader;
    public void clicklogOut(WebDriver driver) throws InterruptedException {
        profileDropdown.click();
        Thread.sleep(2000);
        logOutOption.click();
        Thread.sleep(2000);
        logOutConfirmation.click();
        Thread.sleep(10000);
        //fnWaitVisibility(driver, "//div[@id='upTogetherLandingHeader']");
        //System.out.println(landingPageHeader.getText());
    }

    @FindBy(xpath = "//span[@id='createAccount']")
    WebElement userRegistrationButton;
    public void clickUserRegistrationButton(WebDriver driver) throws InterruptedException {
        userRegistrationButton.click();
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @FindBy(xpath = "//select[@id='month']")
    WebElement birthMonth;
    @FindBy(xpath = "//option[@value='January']")
    WebElement selectMonth;
    @FindBy(xpath = "//select[@id='day']")
    WebElement birthDate;
    @FindBy(xpath = "//option[@value='30']")
    WebElement selectDay;
    @FindBy(xpath = "//select[@id='year']")
    WebElement birthYear;
    @FindBy(xpath = "//option[@value='1990']")
    WebElement selectYear;
    @FindBy(xpath = "//input[@id='terms']")
    WebElement tncCheckbox;
    public void enterUserDetails(WebDriver driver) throws InterruptedException {
        firstName.sendKeys("John");
        Thread.sleep(1000);
        lastName.sendKeys("Doe");
        birthMonth.click();
        Thread.sleep(1000);
        selectMonth.click();
        birthDate.click();
        Thread.sleep(1000);
        selectDay.click();
        birthYear.click();
        Thread.sleep(1000);
        selectYear.click();
        tncCheckbox.click();
    }

    @FindBy(xpath = "//canvas[@id='captcha']")
    WebElement registrationCaptcha;
    public void enterCaptcha(WebDriver driver) throws IOException, TesseractException, InterruptedException {
        File src=registrationCaptcha.getScreenshotAs(OutputType.FILE);
        //String path="E:\\Automation\\Uptogether\\Screenshots\\captcha.PNG";
        String path = System.getProperty("user.dir")+"\\Screenshots\\captcha.PNG";
        //FileHandler.copy(src, new File("E:\\Automation\\Uptogether\\Screenshots"));
        FileHandler.copy(src, new File(path));
        Thread.sleep(10000);
        ITesseract image = new Tesseract();
        Thread.sleep(5000);
        image.doOCR(new File(path));
        //System.out.println(imageText);
    }

    @FindBy(xpath = "//span[@id='createAccount']")
    WebElement accountRegistrationSubmitButton;
    public void enterEmailId_AccountRegistration(WebDriver driver) throws InterruptedException {
        emailInputfield.sendKeys("automation.uptogether3@gmail.com");
        Thread.sleep(2000);
        accountRegistrationSubmitButton.click();
        Thread.sleep(5000);
    }



    @FindBy(xpath = "//div[@id='magic-link-success']")
    WebElement magicLinkMessage_AccountRegistration;
    public String  getMagicLinkMessage_AccountRegistration(WebDriver driver){
        return magicLinkMessage_AccountRegistration.getText();
    }

    public LoginPage(WebDriver driver) throws FileNotFoundException {
        PageFactory.initElements(driver,this);
    }
}
