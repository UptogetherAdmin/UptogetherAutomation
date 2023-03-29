package com.eco.uitests.stepdef.Uptogether;

import com.eco.uitests.factory.DriverManager;
import com.eco.uitests.pages.Uptogether.FinancialPage;
import com.eco.uitests.pages.Uptogether.SettingsPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;

public class Financial {

    public Login login;
    public WebDriver driver;
    DriverManager driverManager;
    public FinancialPage financialPage;


    public Financial(Login login){this.login = login;}

    @And("User goes to Financial Page after switching to the parent window")
    public void loginUsingGoogleAccount() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickFinancialIcon(driver);

    }

    @And("User goes to the Change Payout method page")
    public void navigateToPayoutMethodPage() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickchangePayoutMethodButton(driver);
    }

    @And("User changes the primary payout method")
    public void changePrimaryPayputMethod() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickPayoutMethodThreeDot_First(driver);
        financialPage.clickMakePrimaryMethodOption_First(driver);
        financialPage.clickConfirmPayoutMethod_First(driver);
    }

    @And("User changes the primary payout method to the default payout method")
    public void changePrimaryPayputMethod_Default() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickPayoutMethodThreeDot_Default(driver);
        financialPage.clickMakePrimaryMethodOption_Default(driver);
        financialPage.clickConfirmPayoutMethod_Default(driver);
    }

    @And("User opens the payout details page for the first option")
    public void openPayoutDetails_First() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickPayoutMethodThreeDot_First(driver);
        financialPage.clickViewDetails_First(driver);
    }

    @And("User opens the payout details page for the second option")
    public void openPayoutDetails_Second() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickPayoutMethodThreeDot_Default(driver);
        financialPage.clickViewDetails_Second(driver);
    }

    @And("User asserts the payout details")
    public void assertPayoutDetails_First() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        System.out.println("expected value of Type: Direct Deposit " + "Actual value of type: "+ financialPage.getType(driver));
        Assert.assertEquals("Direct Deposit", financialPage.getType(driver));
        System.out.println("expected value of Date Added: 02/06/2023 " + "Actual value of date added: "+ financialPage.getDateAdded(driver));
        Assert.assertEquals("02/06/2023", financialPage.getDateAdded(driver));
        System.out.println("expected value of institution name: STRIPE TEST BANK " + "Actual value of institution name: "+ financialPage.getinstitutionName(driver));
        Assert.assertEquals("STRIPE TEST BANK", financialPage.getinstitutionName(driver));
        System.out.println("expected value of account holder: Roopa m " + "Actual value of account holder: "+ financialPage.getAccountHolder(driver));
        Assert.assertEquals("Roopa m", financialPage.getAccountHolder(driver));
        System.out.println("expected value of account number: Direct Deposit " + "Actual value of account number: "+ financialPage.getAccountNumber(driver));
        Assert.assertEquals("*****6789", financialPage.getAccountNumber(driver));
        System.out.println("expected value of account Type: -- " + "Actual value of account type: "+ financialPage.getaccountType(driver));
        Assert.assertEquals("--", financialPage.getaccountType(driver));
    }

    @And("User asserts the payout details for the second option")
    public void assertPayoutDetails_Second() throws InterruptedException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        System.out.println("expected value of method: Primary " + "Actual value of method: "+ financialPage.getMethod_Second(driver));
        Assert.assertEquals("Primary", financialPage.getMethod_Second(driver));
        System.out.println("expected value of Type: Debit Card " + "Actual value of type: "+ financialPage.getType_Second(driver));
        Assert.assertEquals("Debit Card", financialPage.getType_Second(driver));
        System.out.println("expected value of Date Added: 12/26/2022 " + "Actual value of date added: "+ financialPage.getDateAdded_Second(driver));
        Assert.assertEquals("12/26/2022", financialPage.getDateAdded_Second(driver));
        System.out.println("expected value of Address: 11380 techology circle " + "Actual value of Address: "+ financialPage.getAddress_Second(driver));
        Assert.assertEquals("11380 techology circle", financialPage.getAddress_Second(driver));
        System.out.println("expected value of City: Duluth " + "Actual value of City: "+ financialPage.getCity_Second(driver));
        Assert.assertEquals("Duluth", financialPage.getCity_Second(driver));
        System.out.println("expected value of State: GA " + "Actual value of State: "+ financialPage.getState_Second(driver));
        Assert.assertEquals("GA", financialPage.getState_Second(driver));
        System.out.println("expected value of Zip: 30097 " + "Actual value of Zip: "+ financialPage.getZip_Second(driver));
        Assert.assertEquals("30097", financialPage.getZip_Second(driver));
        Thread.sleep(4000);
    }

    @And("User edits the payout details for second option")
    public void editPayoutDetails_Second() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickEditPayoutMethod_Second(driver);
        financialPage.editAddress1Textfield(driver);
        financialPage.editCityTextfield(driver);
        financialPage.changeState_Value(driver);
        financialPage.editZipTextfield(driver);
        financialPage.clickPayoutSaveButton(driver);
    }

    @And("User opens the payout in edit mode and then cancels it")
    public void cancelPayoutDetails_Second() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage=new FinancialPage(driver);
        financialPage.clickEditPayoutMethod_Second(driver);
        financialPage.editAddress1Textfield(driver);
        financialPage.editCityTextfield(driver);
        //financialPage.changeState_Value(driver);
        financialPage.editZipTextfield(driver);
        financialPage.clickPayoutCancelButton(driver);
    }

    @And("User goes to payout transactions page")
    public void navigateToPayoutTransactionPage() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickPayoutTransactionButton(driver);
    }

    @And("User asserts the transaction")
    public void assertPayoutHistory() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Transaction history: You currently have no payouts " + "Actual value of method: " + financialPage.getTransactionHistory(driver));
        Assert.assertEquals("You currently have no payouts", financialPage.getTransactionHistory(driver));
    }


    @And("User goes to future payouts tab")
    public void navigateToFuturePayouts() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickFuturePayoutTab(driver);
    }

    @And("User asserts the future transaction")
    public void assertFuturePayout() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description 1: Test Mid-Month Payment " + "Actual value of Description 1: " + financialPage.getFuturePayoutDesc1(driver));
        Assert.assertEquals("Test Mid-Month Payment", financialPage.getFuturePayoutDesc1(driver));
        System.out.println("expected value of Future Date 1: Mar 15, 2023 " + "Actual value of Future Date 1: " + financialPage.getFuturePayoutDate1(driver));
        Assert.assertEquals("Mar 15, 2023", financialPage.getFuturePayoutDate1(driver));
        System.out.println("expected value of Amount 1: $1 " + "Actual value of Amount 1: " + financialPage.getFuturePayoutAmount1(driver));
        Assert.assertEquals("$1", financialPage.getFuturePayoutAmount1(driver));
        System.out.println("expected value of Description 2: Test Mid-Month Payment " + "Actual value of Description 2: " + financialPage.getFuturePayoutDesc2(driver));
        Assert.assertEquals("Test Mid-Month Payment", financialPage.getFuturePayoutDesc2(driver));
        System.out.println("expected value of Future Date 2: Jul 1, 2023 " + "Actual value of Future Date 2: " + financialPage.getFuturePayoutDate2(driver));
        Assert.assertEquals("Jul 1, 2023", financialPage.getFuturePayoutDate2(driver));
        System.out.println("expected value of Amount 2: $1 " + "Actual value of Amount 2: " + financialPage.getFuturePayoutAmount2(driver));
        Assert.assertEquals("$1", financialPage.getFuturePayoutAmount2(driver));

    }

    @And("User asserts the commitment")
    public void assertCommitment() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description 1: Test Mid-Month Payment FII - Bay Area " + "Actual value of Description 1: " + financialPage.getcommitmentDesc1(driver));
        Assert.assertEquals("Test Mid-month Payment\n" +
                "FII - Bay Area", financialPage.getcommitmentDesc1(driver));
        System.out.println("expected value of Future Date 1: Wed, Mar 1, 2023 " + "Actual value of Future Date 1: " + financialPage.getCommitmentDate1(driver));
        Assert.assertEquals("Wed, Mar 1, 2023", financialPage.getCommitmentDate1(driver));
    }


    @And("User asserts the commitment in the details page")
    public void assertCommitment_Details() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description 1: Test Mid-Month Payment FII - Bay Area " + "Actual value of Description 1: " + financialPage.getcommitmentDesc2(driver));
        Assert.assertEquals("Test Mid-month Payment\n" +
                "FII - Bay Area", financialPage.getcommitmentDesc2(driver));
        System.out.println("expected value of Future Date 2:Your next payment is Wed, Mar 1, 2023 " + "Actual value of Future Date 2: " + financialPage.getCommitmentDate2(driver));
        Assert.assertEquals("Your next payment is Wed, Mar 1, 2023", financialPage.getCommitmentDate2(driver));
    }

    @And("User goes to terminated contract tab")
    public void navigateToTerminatedContract() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickTerminatedContractTab(driver);
    }

    @And("User asserts the terminated contract")
    public void assertTerminatedContract() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description 1: Test Bi-weekly Payment FII - Bay Area " + "Actual value of Description 1: " + financialPage.getTerminatedContractDesc1(driver));
        Assert.assertEquals("Test Bi-weekly Payment\n" +
                "by the FII - Bay Area", financialPage.getTerminatedContractDesc1(driver));
        System.out.println("expected value of Future Date 1: Feb 6, 2023 " + "Actual value of Future Date 1: " + financialPage.getTerminatedContractDate1(driver));
        Assert.assertEquals("Feb 6, 2023", financialPage.getTerminatedContractDate1(driver));
    }



    @And("User asserts the available offers")
    public void assertOffers() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description : Test Mid-Month Payment " + "Actual value of Description : " + financialPage.getOfferDesc(driver));
        Assert.assertEquals("No offers are available at this moment - please check back soon!", financialPage.getOfferDesc(driver));
    }


    @And("User goes to declined offers tab")
    public void navigateToDeclinedOffers() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickDeclinedOffersTab(driver);
    }

    @And("User asserts the declined offers detail")
    public void assertDeclinedOffers() throws InterruptedException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        System.out.println("expected value of Description : API Advancement Fund\n" +
                "Fii - Bay Area " + "Actual value of Description 1: " + financialPage.getDeclinedOfferDesc(driver));
        Assert.assertEquals("API Advancement Fund\n" +
                "Fii - Bay Area", financialPage.getDeclinedOfferDesc(driver));
        System.out.println("expected value of Declined date: Dec 26, 2022 " + "Actual value of Future Date 1: " + financialPage.getDeclinedOfferDate(driver));
        Assert.assertEquals("Dec 26, 2022", financialPage.getDeclinedOfferDate(driver));
        System.out.println("expected value of declined Amount : $350 " + "Actual value of Amount 1: " + financialPage.getDeclinedOfferAmount(driver));
        Assert.assertEquals("$350", financialPage.getDeclinedOfferAmount(driver));
        System.out.println("expected value of frequency: Mothly " + "Actual value of Description 2: " + financialPage.getDeclinedOfferFrequency(driver));
        Assert.assertEquals("Monthly", financialPage.getDeclinedOfferFrequency(driver));
        System.out.println("expected value of Total no. of payment: 12 " + "Actual value of Future Date 2: " + financialPage.getDeclinedOfferTotalPayment(driver));
        Assert.assertEquals("12", financialPage.getDeclinedOfferTotalPayment(driver));
        System.out.println("expected value of Total Amount : $4,200 " + "Actual value of Amount 2: " + financialPage.getDeclinedOfferTotalAmount(driver));
        Assert.assertEquals("$4,200", financialPage.getDeclinedOfferTotalAmount(driver));

    }

    @And("User goes to commitments detail page")
    public void navigateToDetailPage_Commitment() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickCommitmentDetails(driver);
    }

    @And("User goes to Terminated Contract detail page")
    public void navigateToDetailPage_TerminatedContract() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickTerminatedContractDetail(driver);
    }

    @And("User goes to Declined Offers detail page")
    public void navigateToDetailPage_DeclinedOffer() throws InterruptedException, AWTException {
        driver = login.getDriver();
        financialPage = new FinancialPage(driver);
        financialPage.clickDeclinedOfferDetails(driver);
    }



}
