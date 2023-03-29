package com.eco.uitests.stepdef.Uptogether;

import com.eco.uitests.factory.DriverManager;
import com.eco.uitests.pages.Uptogether.SettingsPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.awt.*;

public class Settings {
    public Login login;
    public WebDriver driver;
    DriverManager driverManager;
    public SettingsPage settingsPage;


    public Settings(Login login){this.login = login;}

    @And("User goes to the Profile Settings page")
    public void navigate_ProfileSetting() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickSettingsIcon(driver);
        settingsPage.clickProfileSettingButton(driver);
    }

    @And("User opens the basic information setting page")
    public void openBasicInfoSetting() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickBasicInfoSettingButton(driver);
    }

    @And("User opens the Household Info setting page")
    public void openHouseholdInfoSetting() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickHouseholdInfoSettingButton(driver);
    }

    @And("User opens the Contact Info setting page")
    public void openContactInfoSetting() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickContactInfoSettingButton(driver);
    }

    @And("User opens the Address setting page")
    public void openAddressSetting() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressSettingButton(driver);
    }

    @And("User uploads a profile pic")
    public void uploadAskImage() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.uploadProfilePic(driver);
    }


    @And("User updates the basic information and saves it")
    public void updateBasicInfo() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.enterFirstName(driver);
        settingsPage.enterLastName(driver);
        settingsPage.selectGender(driver);
        settingsPage.enterDOB(driver);
        settingsPage.enterEthnicity(driver);
        settingsPage.selectRace(driver);
        settingsPage.clickBasicInfoSaveButton(driver);
    }

    @And("User adds a household member")
    public void addHouseholdMember() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddMemberButton(driver);
        settingsPage.enterFirstName_Household(driver);
        settingsPage.enterLastName_Household(driver);
        settingsPage.selectRelationship1(driver);
        settingsPage.enterDOB_household(driver);
        settingsPage.clickhouseholdSaveButton(driver);
    }

    @And("User opens the existing household member in edit mode")
    public void openExitingHouseholdMember() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickExistingMember(driver);
    }


    @And("User edits the existing household member and saves it")
    public void editExitingHouseholdMember() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.editFirstName_Household(driver);
        settingsPage.editLastName_Household(driver);
        settingsPage.selectRelationship2(driver);
        settingsPage.editDOB_household(driver);
        settingsPage.clickhouseholdSaveButton_Edit(driver);
    }



    @And("User deletes the existing household member")
    public void deleteExitingHouseholdMember() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickexistingMemberDeleteButton(driver);
        settingsPage.clickexistingMemberDeleteButton_Confirm(driver);
    }

    @And("User opens the add household member page and cancels it")
    public void addHouseholdMember_Cancel() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddMemberButton2(driver);
        settingsPage.enterFirstName_Household(driver);
        settingsPage.enterLastName_Household(driver);
        settingsPage.selectRelationship1(driver);
        settingsPage.enterDOB_household(driver);
        settingsPage.clickhouseholdCancelButton(driver);
    }


    @And("User adds a new email id to check the error message")
    public void addNewEmailId_ContactFailure() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddNewEmailButton(driver);
        settingsPage.enteremailTextField_Contact(driver);
        settingsPage.clickSendButton(driver);
        settingsPage.entercodeTextfield(driver);
        settingsPage.clickverifyCodeButton(driver);
    }

    @And("User asserts the error message")
    public void assertError_ContactFailure() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        if(driver.findElements(By.xpath("//li[normalize-space()='The Code field is required']")).size()>0){
        System.out.println("expected message: The Code field is required " + "Actual message: "+ settingsPage.getErrorMessage(driver));
        Assert.assertEquals("The Code field is required", settingsPage.getErrorMessage(driver));
        }else {
            System.out.println("expected message: Incorrect Code: Your Email must be verified with the code we sent to your email. " + "Actual message: "+ settingsPage.getErrorMessage2(driver));
            Assert.assertEquals("Incorrect Code: Your Email must be verified with the code we sent to your email.", settingsPage.getErrorMessage2(driver));
        }
    }

    @And("User adds a new Number to check the error message")
    public void addNewNumberId_ContactFailure() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddNewMobileButton(driver);
        settingsPage.enterMobileTextField_Contact(driver);
        settingsPage.clickSendButton_Mobile(driver);
        settingsPage.entercodeTextfield_Mobile(driver);
        settingsPage.clickverifyCodeButton_Mobile(driver);
    }

    @And("User asserts the error message for mobile number")
    public void assertError_NumberFailure() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        if(driver.findElements(By.xpath("//li[normalize-space()='The Code field is required']")).size()>0){
            System.out.println("expected message: The Code field is required " + "Actual message: "+ settingsPage.getErrorMessage_Mobile(driver));
            Assert.assertEquals("The Code field is required", settingsPage.getErrorMessage_Mobile(driver));
        }else {
            System.out.println("expected message: Incorrect Code: Your Phone must be verified with the code we sent to your phone. " + "Actual message: "+ settingsPage.getErrorMessage2_Mobile(driver));
            Assert.assertEquals("Incorrect Code: Your Phone must be verified with the code we sent to your phone.", settingsPage.getErrorMessage2_Mobile(driver));
        }
    }

    @And("User opens the add address page and add an address")
    public void addAddress() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddAddressButton(driver);
        settingsPage.enteraddress1(driver);
        settingsPage.enteraddress2(driver);
        settingsPage.enterCity(driver);
        settingsPage.selectState1(driver);
        settingsPage.enterpincode(driver);
        settingsPage.clickAddressSaveButton(driver);
    }

    @And("User opens the address in edit mode and cancels it")
    public void cancelEditAddress() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressThreeDots(driver);
        settingsPage.clickEditOption(driver);
        settingsPage.editAddress1(driver);
        settingsPage.editaddress2(driver);
        settingsPage.editCity(driver);
        settingsPage.selectState2(driver);
        settingsPage.editpincode(driver);
        settingsPage.clickAddressCancelButton(driver);
    }


    @And("User opens the address in edit mode and edit the address")
    public void editAddress() throws InterruptedException, AWTException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressThreeDots(driver);
        settingsPage.clickEditOption(driver);
        settingsPage.editAddress1(driver);
        settingsPage.editaddress2(driver);
        settingsPage.editCity(driver);
        settingsPage.selectState2(driver);
        settingsPage.editpincode(driver);
        settingsPage.clickAddressSaveButton(driver);
        settingsPage.consentConfirmation(driver);
    }

    @And("User deletes the address")
    public void deleteAddress() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressThreeDots(driver);
        settingsPage.clickDeleteOption(driver);
        settingsPage.clickDeleteYesButton(driver);
    }

    @And("User makes the newly created address as primary address")
    public void primaryAddress1() throws InterruptedException {
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressThreeDots(driver);
        settingsPage.clickPrimaryOption(driver);
    }

    @And("User changes the primary address")
    public void primaryAddress2() throws InterruptedException{
        driver = login.getDriver();
        settingsPage=new SettingsPage(driver);
        settingsPage.clickAddressThreeDots2(driver);
        settingsPage.clickPrimaryOption2(driver);
    }




}
