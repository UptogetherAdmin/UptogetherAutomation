package com.eco.uitests.pages.Uptogether;

import com.eco.uitests.wrapper.GenericWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class SettingsPage extends GenericWrapper {

    /*
    @FindBy(xpath = "//a[contains(@href,'/groups')]//article//div//div//span[contains(@aria-label,'Arrow Right icon')]//*[name()='svg']")
    WebElement groupIcon3;
    public void clickGroupIcon3(WebDriver driver) throws InterruptedException {
        WebElement menu2 = driver.findElement(By.xpath("//a[@href='/groups']//article//div//div//span[@aria-label='Arrow Right icon']//*[name()='svg']"));
        Hover(driver,menu2);
        Thread.sleep(2000);
        groupIcon3.click();
        Thread.sleep(5000);
        /*
        if(groupText.isDisplayed()){
        System.out.println(groupText.getText());
        }else {
            System.out.println("Group is already created.");
        }
    }
    private void Hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    */

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/div/nav/div/div/a[5]")
    WebElement settingsIcon;
    public void clickSettingsIcon(WebDriver driver) throws InterruptedException {
        //WebElement menu = driver.findElement(By.xpath("//span[@aria-label='Cog icon']//*[name()='svg']"));
        //Hover(driver,menu);
        //Thread.sleep(3000);
        settingsIcon.click();
        Thread.sleep(3000);
    }
/*

    private void Hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

 */

    @FindBy(xpath = "//span[normalize-space()='Profile']")
    WebElement profileSettingButton;
    public void clickProfileSettingButton(WebDriver driver) throws InterruptedException {
        profileSettingButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Profile']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//span[normalize-space()='Basic Information']")
    WebElement basicInfoSettingButton;
    public void clickBasicInfoSettingButton(WebDriver driver) throws InterruptedException {
        basicInfoSettingButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//span[normalize-space()='Household Information']")
    WebElement householdInfoSettingButton;
    public void clickHouseholdInfoSettingButton(WebDriver driver) throws InterruptedException {
        householdInfoSettingButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//img[@alt='user image']")
    WebElement profilePicIcon;
    @FindBy(xpath = "//button[contains(@class,'tw-bg-[#402146]')]")
    WebElement addFileButton;
    @FindBy(xpath = "//button[normalize-space()='Choose a local file']")
    WebElement chooseLocalFileButton;
    @FindBy(xpath = "//button[@class='uploadcare--button uploadcare--button_primary uploadcare--footer__button uploadcare--preview__done']")
    WebElement doneButton;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement createButton;
    public void uploadProfilePic(WebDriver driver) throws InterruptedException, AWTException {
        profilePicIcon.click();
        Thread.sleep(2000);
        chooseLocalFileButton.click();
        Thread.sleep(2000);
        String path = System.getProperty("user.dir")+"\\Screenshots\\Asianfamilyselfie.PNG";
        // String path = "E:\\Automation\\Uptogether\\Screenshots\\Asianfamilyselfie.PNG";
        StringSelection selection = new StringSelection(path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        doneButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//input[@id='first_name:249621451977fc2a9ca6b31ae037b625']")
    WebElement firstName;
    public void enterFirstName(WebDriver driver) throws InterruptedException, AWTException {
        //firstName.click();
        //Thread.sleep(1000);
        //Actions a=new Actions(driver);
        //a.moveToElement(firstName).doubleClick();
        //a.moveToElement(firstName).keyDown(keys.Control);
        firstName.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        firstName.sendKeys("AUTOMATION");
        Thread.sleep(1000);
    }


    @FindBy(xpath = "//input[@id='last_name:82590667caa2eb615fc166e280f9806c']")
    WebElement lastName;
    public void enterLastName(WebDriver driver) throws InterruptedException, AWTException {
        //lastName.click();
        //Thread.sleep(1000);
        lastName.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        lastName.sendKeys("UPTOGETHER");
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//select[@id='gender:9fd8d5b8c611f028e20b5a0e21454a25']")
    WebElement genderDropdown;
    @FindBy(xpath = "//option[@value='man']")
    WebElement genderValue;
    public void selectGender(WebDriver driver) throws InterruptedException {
        genderDropdown.click();
        Thread.sleep(2000);
        genderValue.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='dob:8a8c635f0f9e4b1d88ca0cbef6444cd5']")
    WebElement dateOfBirth;
    public void enterDOB(WebDriver driver) throws InterruptedException {
        //lastName.click();
        //Thread.sleep(1000);
        dateOfBirth.clear();
        Thread.sleep(2000);
        dateOfBirth.sendKeys("12/12/1990");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='ethnicity:07fd3e64359e758dca234582a966ec80']")
    WebElement ethnicity;
    public void enterEthnicity(WebDriver driver) throws InterruptedException, AWTException {
        //lastName.click();
        //Thread.sleep(1000);
        ethnicity.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        ethnicity.sendKeys("INDIAN");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//span[normalize-space()='Asian']")
    WebElement raceOption1;
    @FindBy(xpath = "//span[normalize-space()='Prefer not to answer']")
    WebElement raceOption2;
    @FindBy(xpath = "//input[@placeholder='Please state other']")
    WebElement otherRaceTextfield;
    public void selectRace(WebDriver driver) throws InterruptedException {
        //lastName.click();
        //Thread.sleep(1000);
        raceOption1.click();
        Thread.sleep(1000);
        raceOption2.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='save']")
    WebElement basicInfoSaveButton;
    @FindBy(xpath = "//button[normalize-space()='Ok']")
    WebElement settingOkButton;
    public void clickBasicInfoSaveButton(WebDriver driver) throws InterruptedException {
        basicInfoSaveButton.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Profile Updated']");
        Thread.sleep(3000);
        settingOkButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(3000);

    }


    @FindBy(xpath = "//a[normalize-space()='+ Add a Member']")
    WebElement addMemberButton;
    public void clickAddMemberButton(WebDriver driver) throws InterruptedException {
        addMemberButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Add Household Member']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//a[normalize-space()='+ Add a Member']")
    WebElement addMemberButton2;
    public void clickAddMemberButton2(WebDriver driver) throws InterruptedException {
        addMemberButton2.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Add Household Member']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//input[@id='id_firstName']")
    WebElement firstName_Household;
    public void enterFirstName_Household(WebDriver driver) throws InterruptedException, AWTException {
        //firstName.click();
        //Thread.sleep(1000);
        //Actions a=new Actions(driver);
        //a.moveToElement(firstName).doubleClick();
        //a.moveToElement(firstName).keyDown(keys.Control);
        //firstName.click();
        /*
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);

         */
        firstName_Household.sendKeys("John");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//input[@id='id_lastName']")
    WebElement lastName_Household;
    public void enterLastName_Household(WebDriver driver) throws InterruptedException, AWTException {
        //lastName.click();
        //Thread.sleep(1000);
        /*
        lastName.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);

         */
        lastName_Household.sendKeys("Terry");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//select[@id='id_relationshipType']")
    WebElement relationshipDropdown;
    @FindBy(xpath = "//option[@value='has_child']")
    WebElement relationValue1;
    @FindBy(xpath = "//option[@value='child_of']")
    WebElement relationValue2;
    public void selectRelationship1(WebDriver driver) throws InterruptedException {
        relationshipDropdown.click();
        Thread.sleep(2000);
        relationValue1.click();
        Thread.sleep(2000);
    }
    public void selectRelationship2(WebDriver driver) throws InterruptedException {
        relationshipDropdown.click();
        Thread.sleep(2000);
        relationValue2.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='id_dob']")
    WebElement dateOfBirth_household;
    public void enterDOB_household(WebDriver driver) throws InterruptedException {
        //lastName.click();
        //Thread.sleep(1000);
        //dateOfBirth.clear();
        //Thread.sleep(2000);
        dateOfBirth_household.sendKeys("01/01/2010");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//button[normalize-space()='save']")
    WebElement householdSaveButton;
    public void clickhouseholdSaveButton(WebDriver driver) throws InterruptedException {
        householdSaveButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//button[normalize-space()='cancel']")
    WebElement householdCancelButton;
    public void clickhouseholdCancelButton(WebDriver driver) throws InterruptedException {
        householdCancelButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//span[@aria-label='Chevron Right icon']//*[name()='svg']")
    WebElement existingMember;
    public void clickExistingMember(WebDriver driver) throws InterruptedException {
        existingMember.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Edit Household Member']");
        Thread.sleep(5000);
    }

    public void editFirstName_Household(WebDriver driver) throws InterruptedException, AWTException {
        //firstName.click();
        //Thread.sleep(1000);
        //Actions a=new Actions(driver);
        //a.moveToElement(firstName).doubleClick();
        //a.moveToElement(firstName).keyDown(keys.Control);
        //firstName.click();
        /*
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);

         */
        firstName_Household.sendKeys(" Edit");
        Thread.sleep(2000);
    }

    public void editLastName_Household(WebDriver driver) throws InterruptedException, AWTException {
        //lastName.click();
        //Thread.sleep(1000);
        /*
        lastName.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);

         */
        lastName_Household.sendKeys(" Edit");
        Thread.sleep(2000);
    }

    public void editDOB_household(WebDriver driver) throws InterruptedException {
        //lastName.click();
        //Thread.sleep(1000);
        //dateOfBirth.clear();
        //Thread.sleep(2000);
        dateOfBirth_household.clear();
        Thread.sleep(2000);
        dateOfBirth_household.sendKeys("01/01/1970");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//button[normalize-space()='delete']")
    WebElement existingMemberDeleteButton;
    public void clickexistingMemberDeleteButton(WebDriver driver) throws InterruptedException {
        existingMemberDeleteButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete Member']")
    WebElement existingMemberDeleteButton_Confirm;
    public void clickexistingMemberDeleteButton_Confirm(WebDriver driver) throws InterruptedException {
        existingMemberDeleteButton_Confirm.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Success']");
        Thread.sleep(3000);
        closeConfirmationPageIcon.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//button[normalize-space()='Close']")
    WebElement closeConfirmationPageIcon;
    public void clickhouseholdSaveButton_Edit(WebDriver driver) throws InterruptedException {
        householdSaveButton.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Success']");
        Thread.sleep(3000);
        closeConfirmationPageIcon.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Basic Information']");
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//span[normalize-space()='Contact Information']")
    WebElement ContactInfoSettingButton;
    public void clickContactInfoSettingButton(WebDriver driver) throws InterruptedException {
        ContactInfoSettingButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//button[normalize-space()='+ Add New Email']")
    WebElement addNewEmailButton;
    public void clickAddNewEmailButton(WebDriver driver) throws InterruptedException {
        addNewEmailButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//input[@id='id_Email Address']")
    WebElement emailTextField_Contact;
    public void enteremailTextField_Contact(WebDriver driver) throws InterruptedException {
        emailTextField_Contact.sendKeys("Automation.uptogether3@gmail.com");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//p[normalize-space()='Send']")
    WebElement sendButton;
    public void clickSendButton(WebDriver driver) throws InterruptedException {
        sendButton.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Enter your code']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//input[@id='id_Code']")
    WebElement codeTextfield;
    public void entercodeTextfield(WebDriver driver) throws InterruptedException {
        codeTextfield.sendKeys("123456");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//p[normalize-space()='Verify Code']")
    WebElement verifyCodeButton;
    public void clickverifyCodeButton(WebDriver driver) throws InterruptedException {
        verifyCodeButton.click();
        //fnWaitVisibility(driver,"//li[normalize-space()='The Code field is required']");
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//li[normalize-space()='The Code field is required']")
    WebElement errorMessaage;
    public String getErrorMessage(WebDriver driver) throws InterruptedException {
        return errorMessaage.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'Incorrect Code: Your Email must be verified with t')]")
    WebElement errorMessaage2;
    public String getErrorMessage2(WebDriver driver) throws InterruptedException {
        return errorMessaage2.getText();
    }



    @FindBy(xpath = "//button[normalize-space()='+ Add New Mobile Phone']")
    WebElement addNewMobileButton;
    public void clickAddNewMobileButton(WebDriver driver) throws InterruptedException {
        addNewMobileButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//input[@id='id_Phone Number']")
    WebElement MobileTextField_Contact;
    public void enterMobileTextField_Contact(WebDriver driver) throws InterruptedException {
        MobileTextField_Contact.sendKeys("9108646932");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//p[normalize-space()='Send']")
    WebElement sendButton_Mobile;
    public void clickSendButton_Mobile(WebDriver driver) throws InterruptedException {
        sendButton_Mobile.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Enter your code']");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//input[@id='id_Code']")
    WebElement codeTextfield_Mobile;
    public void entercodeTextfield_Mobile(WebDriver driver) throws InterruptedException {
        codeTextfield_Mobile.sendKeys("123456");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//p[normalize-space()='Verify Code']")
    WebElement verifyCodeButton_Mobile;
    public void clickverifyCodeButton_Mobile(WebDriver driver) throws InterruptedException {
        verifyCodeButton_Mobile.click();
        //fnWaitVisibility(driver,"//li[normalize-space()='The Code field is required']");
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//li[normalize-space()='The Code field is required']")
    WebElement errorMessaage_Mobile;
    public String getErrorMessage_Mobile(WebDriver driver) throws InterruptedException {
        return errorMessaage_Mobile.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'Incorrect Code: Your Phone must be verified with t')]")
    WebElement errorMessaage2_Mobile;
    public String getErrorMessage2_Mobile(WebDriver driver) throws InterruptedException {
        return errorMessaage2_Mobile.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Address']")
    WebElement AddressSettingButton;
    public void clickAddressSettingButton(WebDriver driver) throws InterruptedException {
        AddressSettingButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[normalize-space()='+ Address']")
    WebElement addAddressButton;
    public void clickAddAddressButton(WebDriver driver) throws InterruptedException {
        addAddressButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Add address']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='address_address1']")
    WebElement address1;
    public void enteraddress1(WebDriver driver) throws InterruptedException {
        address1.sendKeys("11380");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='address_address2']")
    WebElement address2;
    public void enteraddress2(WebDriver driver) throws InterruptedException {
        address2.sendKeys("gates terrace");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='address_city']")
    WebElement city;
    public void enterCity(WebDriver driver) throws InterruptedException {
        city.sendKeys("Duluth");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//select[@id='address_state']")
    WebElement stateDropdown;
    @FindBy(xpath = "//option[@value='GA']")
    WebElement stateValue1;
    @FindBy(xpath = "//option[@value='CT']")
    WebElement stateValue2;
    public void selectState1(WebDriver driver) throws InterruptedException {
        stateDropdown.click();
        Thread.sleep(2000);
        stateValue1.click();
        Thread.sleep(2000);
    }

    public void selectState2(WebDriver driver) throws InterruptedException {
        stateDropdown.click();
        Thread.sleep(2000);
        stateValue2.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='address_zip']")
    WebElement pincode;
    public void enterpincode(WebDriver driver) throws InterruptedException {
        pincode.sendKeys("30097");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='save']")
    WebElement addressSaveButton;
    public void clickAddressSaveButton(WebDriver driver) throws InterruptedException {
        addressSaveButton.click();
        Thread.sleep(8000);
    }


    @FindBy(xpath = "//span[@aria-label='Chevron Left icon']//*[name()='svg']")
    WebElement addressCancelButton;
    public void clickAddressCancelButton(WebDriver driver) throws InterruptedException {
        addressCancelButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/main/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")
    WebElement addressThreeDots;
    public void clickAddressThreeDots(WebDriver driver) throws InterruptedException {
        addressThreeDots.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//main//div//div//div//div//div//a[2]")
    WebElement editOption;
    public void clickEditOption(WebDriver driver) throws InterruptedException {
        editOption.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Edit Address']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//main//div//div//div//div//div//a[3]")
    WebElement deleteOption;
    public void clickDeleteOption(WebDriver driver) throws InterruptedException {
        deleteOption.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, delete this address']")
    WebElement deleteYesButton;
    public void clickDeleteYesButton(WebDriver driver) throws InterruptedException {
        deleteYesButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement primaryOption;
    public void clickPrimaryOption(WebDriver driver) throws InterruptedException {
        primaryOption.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(5000);
    }

    public void editAddress1(WebDriver driver) throws InterruptedException {
        address1.sendKeys(" Address 1 Edit");
        Thread.sleep(2000);
    }

    public void editaddress2(WebDriver driver) throws InterruptedException {
        address2.sendKeys(" Address 2 Edit");
        Thread.sleep(2000);
    }

    public void editCity(WebDriver driver) throws InterruptedException {
        city.sendKeys(" City Edit");
        Thread.sleep(2000);
    }

    public void editpincode(WebDriver driver) throws InterruptedException, AWTException {
        pincode.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        pincode.sendKeys("30087");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//button[normalize-space()='I Understand']")
    WebElement consent1;
    @FindBy(xpath = "//button[contains(text(),'I understand')]")
    WebElement consent2;
    @FindBy(xpath = "//button[normalize-space()='Yes, change my address']")
    WebElement consent3;
    public void consentConfirmation(WebDriver driver) throws InterruptedException {
        consent1.click();
        //fnWaitVisibility(driver,"//p[normalize-space()='YOU COULD LOSE MONEY']");
        Thread.sleep(5000);
        consent2.click();
       // fnWaitVisibility(driver,"//p[normalize-space()='ARE YOU SURE?']");
        Thread.sleep(5000);
        consent3.click();
        Thread.sleep(10000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/main/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]//*[name()='svg']")
    WebElement addressThreeDots2;
    public void clickAddressThreeDots2(WebDriver driver) throws InterruptedException {
        addressThreeDots2.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
    WebElement primaryOption2;
    public void clickPrimaryOption2(WebDriver driver) throws InterruptedException {
        primaryOption2.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Contact Information']");
        Thread.sleep(5000);
    }


    public SettingsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
