package com.eco.uitests.pages.Uptogether;

import com.eco.uitests.wrapper.GenericWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FinancialPage extends GenericWrapper {


    @FindBy(xpath = "//a[contains(@href,'/financials')]//article//div//div//span[contains(@aria-label,'Arrow Right icon')]//*[name()='svg']")
    WebElement financialIcon;
    public void clickFinancialIcon(WebDriver driver) throws InterruptedException {
        WebElement menu2 = driver.findElement(By.xpath("//a[@href='/financials']//article//div//div//span[@aria-label='Arrow Right icon']//*[name()='svg']"));
        Hover(driver,menu2);
        Thread.sleep(2000);
        financialIcon.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Change Payout Method']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//span[normalize-space()='Change Payout Method']")
    WebElement changePayoutMethodButton;
    public void clickchangePayoutMethodButton(WebDriver driver) throws InterruptedException {
        changePayoutMethodButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Payout Methods']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement payoutMethodThreeDot_First;
    public void clickPayoutMethodThreeDot_First(WebDriver driver) throws InterruptedException {
        payoutMethodThreeDot_First.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//div[@data-testid='STRIPE_DIRECT_DEPOSIT']//div//div//div//div//div//a//div//div//h3[contains(text(),'Make Primary Method')]")
    WebElement makePrimaryMethodOption_First;
    public void clickMakePrimaryMethodOption_First(WebDriver driver) throws InterruptedException {
        makePrimaryMethodOption_First.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Confirm Payment Method']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//div[@data-testid='STRIPE_DIRECT_DEPOSIT']//div//div//div//div//div//a//div//div//h3[contains(text(),'View Details')]")
    WebElement viewDetails_First;
    public void clickViewDetails_First(WebDriver driver) throws InterruptedException {
        viewDetails_First.click();
        fnWaitVisibility(driver,"//p[contains(text(),'Type')]");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//p[contains(text(),'Direct Deposit')]")
    WebElement typeDetail;
    public String getType(WebDriver driver) throws InterruptedException {
        return typeDetail.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'02/06/2023')]")
    WebElement dateAdded;
    public String getDateAdded(WebDriver driver) throws InterruptedException {
        return dateAdded.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'STRIPE TEST BANK')]")
    WebElement institutionName;
    public String getinstitutionName(WebDriver driver) throws InterruptedException {
        return institutionName.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'--')]")
    WebElement accountType;
    public String getaccountType(WebDriver driver) throws InterruptedException {
        return accountType.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'Roopa m')]")
    WebElement accountHolder;
    public String getAccountHolder(WebDriver driver) throws InterruptedException {
        return accountHolder.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'*****6789')]")
    WebElement accountNumber;
    public String getAccountNumber(WebDriver driver) throws InterruptedException {
        return accountNumber.getText();
    }


    @FindBy(xpath = "//p[contains(text(),'Primary')]")
    WebElement method_Second;
    public String getMethod_Second(WebDriver driver) throws InterruptedException {
        return method_Second.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'Debit Card')]")
    WebElement typeDetail_Second;
    public String getType_Second(WebDriver driver) throws InterruptedException {
        return typeDetail_Second.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'12/26/2022')]")
    WebElement dateAdded_Second;
    public String getDateAdded_Second(WebDriver driver) throws InterruptedException {
        return dateAdded_Second.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'11380 techology circle')]")
    WebElement address_Second;
    public String getAddress_Second(WebDriver driver) throws InterruptedException {
        return address_Second.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'Duluth')]")
    WebElement city_Second;
    public String getCity_Second(WebDriver driver) throws InterruptedException {
        return city_Second.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'GA')]")
    WebElement state_Second;
    public String getState_Second(WebDriver driver) throws InterruptedException {
        return state_Second.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'30097')]")
    WebElement zip_Second;
    public String getZip_Second(WebDriver driver) throws InterruptedException {
        return zip_Second.getText();
    }


    @FindBy(xpath = "//button[normalize-space()='Confirm payment method']")
    WebElement confirmPayoutMethod_First;
    public void clickConfirmPayoutMethod_First(WebDriver driver) throws InterruptedException {
        confirmPayoutMethod_First.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Payout Methods']");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement payoutMethodThreeDot_Default;
    public void clickPayoutMethodThreeDot_Default(WebDriver driver) throws InterruptedException {
        payoutMethodThreeDot_Default.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//div[@data-testid='STRIPE_CARD_ISSUING_PHYSICAL']//div//div//div//div//div//div//a//div//div//h3[contains(text(),'Make Primary Method')]")
    WebElement makePrimaryMethodOption_Default;
    public void clickMakePrimaryMethodOption_Default(WebDriver driver) throws InterruptedException {
        makePrimaryMethodOption_Default.click();
        fnWaitVisibility(driver,"//p[normalize-space()='Confirm Payment Method']");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/h3[1]")
    WebElement viewDetails_Second;
    public void clickViewDetails_Second(WebDriver driver) throws InterruptedException {
        viewDetails_Second.click();
        Thread.sleep(4000);
    }


    @FindBy(xpath = "//button[normalize-space()='Confirm payment method']")
    WebElement confirmPayoutMethod_Default;
    public void clickConfirmPayoutMethod_Default(WebDriver driver) throws InterruptedException {
        confirmPayoutMethod_Default.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Payout Methods']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//span[normalize-space()='Edit']")
    WebElement editPayoutMethod_Second;
    public void clickEditPayoutMethod_Second(WebDriver driver) throws InterruptedException {
        editPayoutMethod_Second.click();
        fnWaitVisibility(driver,"//label[contains(text(),'Address 1')]");
        Thread.sleep(4000);
    }

    @FindBy(xpath = "//input[@id='address1']")
    WebElement Address1Textfield;
    public void editAddress1Textfield(WebDriver driver) throws InterruptedException, AWTException {
        Address1Textfield.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        Address1Textfield.sendKeys("11380 techology circle");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityTextfield;
    public void editCityTextfield(WebDriver driver) throws InterruptedException, AWTException {
        cityTextfield.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        cityTextfield.sendKeys("Duluth");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//select[@id='state']")
    WebElement StateDropdown;
    @FindBy(xpath = "//option[contains(text(),'Georgia')]")
    WebElement StateValue;
    public void changeState_Value(WebDriver driver) throws InterruptedException {
        StateDropdown.click();
        Thread.sleep(2000);
        StateValue.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='zip']")
    WebElement zipTextfield;
    public void editZipTextfield(WebDriver driver) throws InterruptedException, AWTException {
        zipTextfield.click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(3000);
        zipTextfield.sendKeys("30097");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement payoutSaveButton;
    public void clickPayoutSaveButton(WebDriver driver) throws InterruptedException {
        payoutSaveButton.click();
        fnWaitVisibility(driver,"//p[contains(text(),'Method')]");
        Thread.sleep(4000);
    }

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement payoutCancelButton;
    public void clickPayoutCancelButton(WebDriver driver) throws InterruptedException {
        payoutCancelButton.click();
        fnWaitVisibility(driver,"//p[contains(text(),'Method')]");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//span[normalize-space()='View Payout Transactions']")
    WebElement payoutTransactionButton;
    public void clickPayoutTransactionButton(WebDriver driver) throws InterruptedException {
        payoutTransactionButton.click();
        fnWaitVisibility(driver,"//span[normalize-space()='Payout Type']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//h1[normalize-space()='You currently have no payouts']")
    WebElement transactionHistory;
    public String getTransactionHistory(WebDriver driver) throws InterruptedException {
        return transactionHistory.getText();
    }

    private void Hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    @FindBy(xpath = "//span[contains(text(),'Future Payouts')]")
    WebElement futurePayoutTab;
    public void clickFuturePayoutTab(WebDriver driver) throws InterruptedException {
        futurePayoutTab.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    WebElement futurePayoutDesc1;
    public String getFuturePayoutDesc1(WebDriver driver) throws InterruptedException {
        return futurePayoutDesc1.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Mar 15, 2023']")
    WebElement futurePayoutDate1;
    public String getFuturePayoutDate1(WebDriver driver) throws InterruptedException {
        return futurePayoutDate1.getText();
    }

    @FindBy(xpath = "(//span[contains(text(),'$1')])[3]")
    WebElement futurePayoutAmount1;
    public String getFuturePayoutAmount1(WebDriver driver) throws InterruptedException {
        return futurePayoutAmount1.getText();
    }


    @FindBy(xpath = "//tbody/tr[10]/td[1]")
    WebElement futurePayoutDesc2;
    public String getFuturePayoutDesc2(WebDriver driver) throws InterruptedException {
        return futurePayoutDesc2.getText();
    }
    @FindBy(xpath = "//span[normalize-space()='Jul 1, 2023']")
    WebElement futurePayoutDate2;
    public String getFuturePayoutDate2(WebDriver driver) throws InterruptedException {
        return futurePayoutDate2.getText();
    }

    @FindBy(xpath = "(//span[contains(text(),'$1')])[10]")
    WebElement futurePayoutAmount2;
    public String getFuturePayoutAmount2(WebDriver driver) throws InterruptedException {
        return futurePayoutAmount2.getText();
    }


    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement commitmentDesc1;
    public String getcommitmentDesc1(WebDriver driver) throws InterruptedException {
        return commitmentDesc1.getText();
    }


    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/section[1]/div[2]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement commitmentDesc2;
    public String getcommitmentDesc2(WebDriver driver) throws InterruptedException {
        return commitmentDesc2.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Wed, Mar 1, 2023']")
    WebElement commitmentDate1;
    public String getCommitmentDate1(WebDriver driver) throws InterruptedException {
        return commitmentDate1.getText();
    }

    @FindBy(xpath = "//p[contains(text(),'Wed, Mar 1, 2023')]")
    WebElement commitmentDate2;
    public String getCommitmentDate2(WebDriver driver) throws InterruptedException {
        return commitmentDate2.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Terminated Commitments']")
    WebElement terminatedContractTab;
    public void clickTerminatedContractTab(WebDriver driver) throws InterruptedException {
        terminatedContractTab.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/section[1]/div[2]/section[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement terminatedContractDesc1;
    public String getTerminatedContractDesc1(WebDriver driver) throws InterruptedException {
        return terminatedContractDesc1.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Feb 6, 2023']")
    WebElement terminatedContractDate1;
    public String getTerminatedContractDate1(WebDriver driver) throws InterruptedException {
        return terminatedContractDate1.getText();
    }

    @FindBy(xpath = "//h1[contains(text(),'No offers are available at this moment - please ch')]")
    WebElement offerDesc;
    public String getOfferDesc(WebDriver driver) throws InterruptedException {
        return offerDesc.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Declined Offers']")
    WebElement declinedOffersTab;
    public void clickDeclinedOffersTab(WebDriver driver) throws InterruptedException {
        declinedOffersTab.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/section[1]/div[2]/section[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement declinedOfferDesc;
    public String getDeclinedOfferDesc(WebDriver driver) throws InterruptedException {
        return declinedOfferDesc.getText();
    }

    @FindBy(xpath = "//span[normalize-space()='Dec 26, 2022']")
    WebElement declinedOfferDate;
    public String getDeclinedOfferDate(WebDriver driver) throws InterruptedException {
        return declinedOfferDate.getText();
    }

    @FindBy(xpath = "//div[contains(text(),'$350')]")
    WebElement declinedOfferAmount;
    public String getDeclinedOfferAmount(WebDriver driver) throws InterruptedException {
        return declinedOfferAmount.getText();
    }

    @FindBy(xpath = "//div[contains(text(),'Monthly')]")
    WebElement declinedOfferFrequency;
    public String getDeclinedOfferFrequency(WebDriver driver) throws InterruptedException {
        return declinedOfferFrequency.getText();
    }

    @FindBy(xpath = "//div[contains(text(),'12')]")
    WebElement declinedOfferTotalPayment;
    public String getDeclinedOfferTotalPayment(WebDriver driver) throws InterruptedException {
        return declinedOfferTotalPayment.getText();
    }

    @FindBy(xpath = "//div[contains(text(),'$4,200')]")
    WebElement declinedOfferTotalAmount;
    public String getDeclinedOfferTotalAmount(WebDriver driver) throws InterruptedException {
        return declinedOfferTotalAmount.getText();
    }

    @FindBy(xpath = "//span[contains(text(),'Active')]")
    WebElement commitmentDetails;
    public void clickCommitmentDetails(WebDriver driver) throws InterruptedException {
        commitmentDate1.click();
        fnWaitVisibility(driver,"//h2[normalize-space()='Commitment Details']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//span[contains(text(),'Terminated On')]")
    WebElement terminatedContractDetail;
    public void clickTerminatedContractDetail(WebDriver driver) throws InterruptedException {
        terminatedContractDetail.click();
        fnWaitVisibility(driver,"//h2[normalize-space()='Commitment Details']");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//div[normalize-space()='Frequency']")
    WebElement declinedOfferDetails;
    public void clickDeclinedOfferDetails(WebDriver driver) throws InterruptedException {
        declinedOfferDetails.click();
        fnWaitVisibility(driver,"//h2[normalize-space()='Offer Details']");
        Thread.sleep(2000);
    }

    public FinancialPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

}
