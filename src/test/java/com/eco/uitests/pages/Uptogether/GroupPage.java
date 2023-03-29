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
import java.util.List;


public class GroupPage extends GenericWrapper {

    @FindBy(xpath = "//h2[normalize-space()='groups']")
    WebElement pageHeader;
    @FindBy(xpath = "//a[contains(@class,'tw-absolute')]")
    WebElement createGroupButton;
    @FindBy(xpath = "//div[contains(@class,'tw-flex tw-flex-1 tw-flex-col tw-min-w-full tw-invisible tw-order-first !tw-visible')]//button[contains(@class,'tw-inline-block')][normalize-space()='Start your Group']")
    WebElement startGroupButton;
    public void openAddGroupPage(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(pageHeader.getText());
        createGroupButton.click();
        Thread.sleep(2000);
        startGroupButton.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='id_group_name']")
    WebElement groupName;
    @FindBy(xpath = "//textarea[@id='id_group_purpose']")
    WebElement groupPurpose;
    @FindBy(xpath = "//button[normalize-space()='Next']")
    WebElement groupNextButton;
    public void enterGroupDetails(WebDriver driver) throws InterruptedException {
        groupName.sendKeys("Test Automation Group 1");
        Thread.sleep(1000);
        groupPurpose.sendKeys("Purpose of this group is to automate the test.");
        Thread.sleep(1000);
        groupNextButton.click();
    }



    @FindBy(xpath = "//select[@id='id_group_checkin_schedule']")
    WebElement scheduleDropdown;
    @FindBy(xpath = "//option[@value='monthly']")
    WebElement scheduleOption;
    @FindBy(xpath = "//textarea[@id='id_group_agreements']")
    WebElement agreementTextField;
    public void enterCheckinSchedule(WebDriver driver) throws InterruptedException {
        scheduleDropdown.click();
        Thread.sleep(1000);
        scheduleOption.click();
        Thread.sleep(1000);
        agreementTextField.sendKeys("Written agreements are important in detailing a specific transaction made between two or more parties. Despite not always being legally enforceable in a court of law, they can often prevent disputes.");
        Thread.sleep(1000);
        groupNextButton.click();
    }

    @FindBy(xpath = "//button[contains(@class,'tw-bg-[#402146]')]")
    WebElement addFileButton;
    @FindBy(xpath = "//button[normalize-space()='Choose a local file']")
    WebElement chooseLocalFileButton;
    @FindBy(xpath = "//button[@class='uploadcare--button uploadcare--button_primary uploadcare--footer__button uploadcare--preview__done']")
    WebElement doneButton;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement createButton;
    public void uploadGroupLogo(WebDriver driver) throws InterruptedException, AWTException {
        addFileButton.click();
        Thread.sleep(1000);
        chooseLocalFileButton.click();
        Thread.sleep(1000);
        String path = System.getProperty("user.dir")+"\\Screenshots\\GroupLogo.png";
       // String path = "E:\\Automation\\Uptogether\\Screenshots\\GroupLogo.png";
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
        Thread.sleep(8000);
        doneButton.click();
        Thread.sleep(8000);
    }

    public void clickCreateGroupButton(WebDriver driver) throws InterruptedException {
        createButton.click();
        Thread.sleep(8000);
        fnWaitVisibility(driver, "//h2[normalize-space()='Congratulations!']");
    }


    @FindBy(xpath = "//button[normalize-space()='Visit Group']")
    WebElement visitGroupButton;
    @FindBy(xpath = "//h1[normalize-space()='Test Automation Group 1']")
    WebElement groupNameText;
    public void clickVisitGroupButton(WebDriver driver){
        visitGroupButton.click();
        fnWaitVisibility(driver, "//li[normalize-space()='All']");
    }

    public String getGroupNameText(WebDriver driver){
        return groupNameText.getText();
  }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div/main/div/div/div/div/a/article/div/div[2]")
    WebElement existingGroup1;
    public void clickexistingGroup1(WebDriver driver) throws InterruptedException {
        existingGroup1.click();
        fnWaitVisibility(driver, "//li[normalize-space()='All']");
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//div//span[@aria-label='Cog icon']//*[name()='svg']")
    WebElement groupSettingIcon;
    @FindBy(xpath = "//span[contains(@class,'tw-text-sm tw-font-medium xl:tw-text-2xl')]")
    WebElement editGroupButton;
    public void navigateToEditGroupPage(WebDriver driver) throws InterruptedException {
        groupSettingIcon.click();
        Thread.sleep(3000);
        editGroupButton.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='id_group_name']")
    WebElement editGroupNameTextfield;
    @FindBy(xpath = "//p[normalize-space()='save']")
    WebElement editGroupSaveButton;
    @FindBy(xpath = "//select[@id='id_checkin_schedule']")
    WebElement editScheduleDropdown;
    @FindBy(xpath = "//option[@value='weekly']")
    WebElement editScheduleOption;
    @FindBy(xpath = "//textarea[@id='id_group_purpose']")
    WebElement editPurposeTextField;
    @FindBy(xpath = "//textarea[@id='id_group_agreements']")
    WebElement editAgreementTextField;
    public void editGroupDetails(WebDriver driver) throws InterruptedException {
        editGroupNameTextfield.sendKeys(" EDIT");
        Thread.sleep(1000);
        editScheduleDropdown.click();
        Thread.sleep(1000);
        editScheduleOption.click();
        Thread.sleep(1000);
        editPurposeTextField.clear();
        editPurposeTextField.sendKeys("Edited the Purpose using automation");
        Thread.sleep(1000);
        editAgreementTextField.clear();
        editAgreementTextField.sendKeys("Edited the agreement using automation");
        Thread.sleep(1000);
        editGroupSaveButton.click();
        fnWaitVisibility(driver,"//li[normalize-space()='All']");
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]")
    WebElement groupNameTextAfterEdit;
    public String getGroupNameTextAfterEdit(WebDriver driver){
        return groupNameTextAfterEdit.getText();
    }
/*
    public void editCheckinSchedule(WebDriver driver) throws InterruptedException {
        scheduleDropdown.click();
        Thread.sleep(1000);
        scheduleOption.click();
        Thread.sleep(1000);
        agreementTextField.clear();
        agreementTextField.sendKeys("Edited the agreement using automation");
        Thread.sleep(1000);
        groupNextButton.click();
    }
 */


    @FindBy(xpath = "//a[contains(text(),'+ Ask')]")
    WebElement addAskButton1;
    @FindBy(xpath = "//li[normalize-space()='Ask']")
    WebElement askTab;
    @FindBy(xpath = "//a[normalize-space()='+ Ask']")
    WebElement addAskButton2;
    @FindBy(xpath = "//button[normalize-space()='+ Label']")
    WebElement addLabelButton;
    @FindBy(xpath = "//span[normalize-space()='Housing']")
    WebElement labelOption1;
    @FindBy(xpath = "//span[contains(text(),'Health / Wellness')]")
    WebElement labelOption3;
    @FindBy(xpath = "//span[normalize-space()='Caregiving']")
    WebElement labelOption2;
    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement askTitle;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement labelOkButton;
    @FindBy(xpath = "//div[@data-gramm='false']")
    WebElement askDescription;
    @FindBy(xpath = "//button[@test-id='add-image-button']")
    WebElement askCameraIcon;
    @FindBy(xpath = "//p[contains(text(),'Post')]")
    WebElement askPostButton;

    public void clickAddAskButton1(WebDriver driver) throws InterruptedException {
        System.out.println("ASK CREATION STARTS");
        Thread.sleep(2000);
        //askTab.click();
        //Thread.sleep(2000);
        addAskButton1.click();
        Thread.sleep(2000);
    }

    public void clickAskTab(WebDriver driver) throws InterruptedException {
        askTab.click();
        Thread.sleep(2000);
    }
    public void clickAddAskButton2(WebDriver driver) throws InterruptedException {
        addAskButton2.click();
        Thread.sleep(2000);
    }

    public void clickContributionTab(WebDriver driver) throws InterruptedException {
        contributionTab.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//li[normalize-space()='Goal Sharing']")
    WebElement GoalSharingTab;
    public void clickGoalSharingTab(WebDriver driver) throws InterruptedException {
        GoalSharingTab.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//li[normalize-space()='Connections']")
    WebElement ConnectionsTab;
    public void clickConnectionsTab(WebDriver driver) throws InterruptedException {
        ConnectionsTab.click();
        Thread.sleep(2000);
    }
    public void clickAddContributionButton2(WebDriver driver) throws InterruptedException {
        addContributionButton2.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[normalize-space()='+ Goal']")
    WebElement addGoalSharingButton1;
    @FindBy(xpath = "//a[normalize-space()='+ Goal']")
    WebElement addGoalSharingButton2;
    public void clickAddGoalSharingButton2(WebDriver driver) throws InterruptedException {
        addGoalSharingButton2.click();
        Thread.sleep(5000);
    }

    public void clickAddGoalSharingButton1(WebDriver driver) throws InterruptedException {
        addGoalSharingButton1.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[normalize-space()='+ Connection']")
    WebElement addConnectionsButton1;
    @FindBy(xpath = "//a[normalize-space()='+ Connection']")
    WebElement addConnectionsButton2;
    public void clickAddConnectionsButton2(WebDriver driver) throws InterruptedException {
        addConnectionsButton2.click();
        Thread.sleep(5000);
    }

    public void clickAddConnectionsButton1(WebDriver driver) throws InterruptedException {
        addConnectionsButton1.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//a[normalize-space()='+ Contribution']")
    WebElement addContributionButton1;
    @FindBy(xpath = "//li[normalize-space()='Contribution']")
    WebElement contributionTab;
    @FindBy(xpath = "//a[normalize-space()='+ Contribution']")
    WebElement addContributionButton2;
    public void clickAddContributionButton1(WebDriver driver) throws InterruptedException {
        System.out.println("ASK CREATION STARTS");
        Thread.sleep(2000);
        //contributionTab.click();
        //Thread.sleep(2000);
        addContributionButton1.click();
        Thread.sleep(5000);
    }

    public void enterAskInfo(WebDriver driver) throws InterruptedException {
        addLabelButton.click();
        Thread.sleep(2000);
        labelOption1.click();
        labelOption2.click();
        labelOkButton.click();
        Thread.sleep(2000);
        askTitle.sendKeys("New Ask Created with multiple label using automation");
        Thread.sleep(2000);
        askDescription.sendKeys("This ASK is being created to test the functionality using automation");
        Thread.sleep(2000);
    }

    public void enterContributionInfo(WebDriver driver) throws InterruptedException {
        addLabelButton.click();
        Thread.sleep(2000);
        labelOption1.click();
        labelOption2.click();
        labelOkButton.click();
        Thread.sleep(1000);
        askTitle.sendKeys("New Contribution Created with multiple label using automation");
        Thread.sleep(2000);
        askDescription.sendKeys("This Contribution is being created to test the functionality using automation");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement goalSharingTitle;
    @FindBy(xpath = "//div[@data-gramm='false']")
    WebElement goalSharingDescription;
    @FindBy(xpath = "//textarea[@placeholder='How can your group help you reach your goal?']")
    WebElement goalSharingDescription2;
    @FindBy(xpath = "//p[contains(text(),'Post')]")
    WebElement goalSharingPostButton;
    public void enterGoalSharingInfo(WebDriver driver) throws InterruptedException {
        addLabelButton.click();
        Thread.sleep(2000);
        labelOption1.click();
        labelOption2.click();
        labelOkButton.click();
        Thread.sleep(2000);
        goalSharingTitle.sendKeys("New Goal Sharing Created with multiple label using automation");
        Thread.sleep(2000);
        goalSharingDescription.sendKeys("This Goal Sharing is being created to test the functionality using automation");
        Thread.sleep(2000);
        goalSharingDescription2.sendKeys("The group can help me reach my goal by helping me learn new technology.");
        Thread.sleep(2000);
    }



    public void clickaskPostButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        askPostButton.click();
        fnWaitVisibility(driver,"//textarea[@placeholder='Add a comment']");
        Thread.sleep(8000);
    }

    @FindBy(xpath = "//p[contains(text(),'Post')]")
    WebElement contributionPostButton;
    public void clickContributionPostButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        askPostButton.click();
        fnWaitVisibility(driver,"//textarea[@placeholder='Add a comment']");
        Thread.sleep(8000);
    }

    public void clickGoalSharingPostButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        goalSharingPostButton.click();
        fnWaitVisibility(driver,"//textarea[@placeholder='Add a comment']");
        Thread.sleep(8000);
    }


    public void uploadAskImage(WebDriver driver) throws InterruptedException, AWTException {
        askCameraIcon.click();
        Thread.sleep(2000);
        chooseLocalFileButton.click();
        Thread.sleep(2000);
        String path = System.getProperty("user.dir")+"\\Screenshots\\GroupLogo.png";
        // String path = "E:\\Automation\\Uptogether\\Screenshots\\GroupLogo.png";
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
        fnWaitVisibility(driver,"//p[contains(text(),'Post')]");
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//main//div//div//article//div//div//div//div//div[@role='button']//*[name()='svg']")
    WebElement ThreeDots_Ask;
    public void clickThreeDots_Ask(WebDriver driver) throws InterruptedException {
        ThreeDots_Ask.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//a[2]")
    WebElement deleteOption_Ask;
    public void clickDeleteOption_Ask(WebDriver driver) throws InterruptedException {
        deleteOption_Ask.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//a[1]//span[1]//*[name()='svg']")
    WebElement editOption_Ask;
    public void clickEditOption_Ask(WebDriver driver) throws InterruptedException {
        editOption_Ask.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//main//div//div//article//div//div//div//div//div[@role='button']//*[name()='svg']")
    WebElement ThreeDots_Contribution;
    public void clickThreeDots_Contribution(WebDriver driver) throws InterruptedException {
        ThreeDots_Contribution.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//a[2]")
    WebElement deleteOption_Contribution;
    public void clickDeleteOption_Contribution(WebDriver driver) throws InterruptedException {
        deleteOption_Contribution.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//a[1]//span[1]//*[name()='svg']")
    WebElement editOption_Contribution;
    public void clickEditOption_Contribution(WebDriver driver) throws InterruptedException {
        editOption_Contribution.click();
        Thread.sleep(5000);
    }

    public void editAsk(WebDriver driver) throws InterruptedException {
            addLabelButton.click();
            Thread.sleep(1000);
            labelOption3.click();
            labelOkButton.click();
            Thread.sleep(1000);
            askTitle.clear();
            Thread.sleep(1000);
            askTitle.sendKeys(" Edited the Ask Title using Automation");
            askDescription.clear();
            Thread.sleep(1000);
            askDescription.sendKeys(" Edited the Ask Description using Automation");
    }

    public void editContribution(WebDriver driver) throws InterruptedException {
        addLabelButton.click();
        Thread.sleep(1000);
        labelOption3.click();
        labelOkButton.click();
        Thread.sleep(2000);
        askTitle.clear();
        Thread.sleep(2000);
        askTitle.sendKeys(" Edited the Contribution Title using Automation");
        askDescription.clear();
        Thread.sleep(2000);
        askDescription.sendKeys(" Edited the Contribution Description using Automation");
    }


    @FindBy(xpath = "//button[normalize-space()='Yes, Delete This Post']")
    WebElement deleteYesButton_Ask;
    public void clickDeleteYesButton_Ask(WebDriver driver) throws InterruptedException {
        deleteYesButton_Ask.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete This Post']")
    WebElement deleteYesButton_Contribution;
    public void clickDeleteYesButton_Contribution(WebDriver driver) throws InterruptedException {
        deleteYesButton_Contribution.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//textarea[@placeholder='Add a comment']")
    WebElement commentTextField;
    @FindBy(xpath = "//span[@aria-label='Send icon']//*[name()='svg']")
    WebElement enterCommentButton;
    public void enterComment(WebDriver driver) throws InterruptedException {
        commentTextField.sendKeys("Entered Comment Using Automation");
        Thread.sleep(2000);
        enterCommentButton.click();
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//div[@role='button']//span")
    WebElement ThreeDots_Comment;
    public void clickThreeDots_Comment(WebDriver driver) throws InterruptedException {
        System.out.println("Editing Starts");
        WebElement menu = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div/main/div/div/div/div/main/div/div/div/div/div/div/div/div/div/div[1]"));
        Hover(driver,menu);
        Thread.sleep(5000);
        System.out.println("Editing Ends");
        ThreeDots_Comment.click();
        Thread.sleep(2000);
    }

    private void Hover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//a[2]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M19,4H15.5')]")
    WebElement deleteOption_Comment;
    public void clickDeleteOption_Comment(WebDriver driver) throws InterruptedException {
        deleteOption_Comment.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//div//div//div//div//div//div//a[1]//span[1]//*[name()='svg']")
    WebElement editOption_Comment;
    public void clickEditOption_Comment(WebDriver driver) throws InterruptedException {
        editOption_Comment.click();
        Thread.sleep(5000);
    }
    public void editComment(WebDriver driver) throws InterruptedException {
        commentTextField.clear();
        Thread.sleep(2000);
        commentTextField.sendKeys("Edited Comment using automation");
        Thread.sleep(2000);
        enterCommentButton.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, delete this comment']")
    WebElement deleteYesButton_Comment;
    public void clickDeleteYesButton_Comment(WebDriver driver) throws InterruptedException {
        deleteYesButton_Comment.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[contains(text(),'back')]")
    WebElement addGroupBackButton;
    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div[1]//div[2]//div[2]//a[1]")
    WebElement addGroupCancelButton;
    public void clickAddGroupBackButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        addGroupBackButton.click();
        Thread.sleep(3000);
    }

    public void clickAddGroupCancelButton(WebDriver driver) throws InterruptedException {
        addGroupCancelButton.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//button[normalize-space()='cancel']")
    WebElement addAskCancelButton;
    public void clickAddAskCancelButton(WebDriver driver) throws InterruptedException {
        addAskCancelButton.click();
        Thread.sleep(3000);
    }


    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//main//div//div//article//div//div//div//div//div[@role='button']//*[name()='svg']")
    WebElement ThreeDots_GoalSharing;
    public void clickThreeDots_GoalSharing(WebDriver driver) throws InterruptedException {
        ThreeDots_GoalSharing.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//a[2]")
    WebElement deleteOption_GoalSharing;
    public void clickDeleteOption_GoalSharing(WebDriver driver) throws InterruptedException {
        deleteOption_GoalSharing.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete This Post']")
    WebElement deleteYesButton_GoalSharing;
    public void clickDeleteYesButton_GoalSharing(WebDriver driver) throws InterruptedException {
        deleteYesButton_GoalSharing.click();
        Thread.sleep(2000);
    }



    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//a[1]//span[1]//*[name()='svg']")
    WebElement editOption_GoalSharing;
    public void clickEditOption_GoalSharing(WebDriver driver) throws InterruptedException {
        editOption_GoalSharing.click();
        Thread.sleep(5000);
    }


    public void editGoalSharing(WebDriver driver) throws InterruptedException {
        addLabelButton.click();
        Thread.sleep(1000);
        labelOption3.click();
        labelOkButton.click();
        Thread.sleep(5000);
        goalSharingTitle.click();
        Thread.sleep(5000);
        goalSharingTitle.clear();
        Thread.sleep(5000);
        goalSharingTitle.sendKeys(" Edited the Goal Sharing Title using Automation");
        goalSharingDescription.clear();
        Thread.sleep(2000);
        goalSharingDescription.sendKeys(" Edited the goal Sharing Description using Automation");
        Thread.sleep(2000);
        goalSharingDescription2.clear();
        Thread.sleep(2000);
        goalSharingDescription2.sendKeys(" Edited the goal Sharing Description 2 using Automation");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//div[@data-gramm='false']")
    WebElement connectionDescription;
    public void enterConnectionInfo(WebDriver driver) throws InterruptedException {
        connectionDescription.sendKeys("This Connection is being created to test the functionality using automation");
        Thread.sleep(2000);
    }


    @FindBy(xpath = "//p[contains(text(),'Post')]")
    WebElement connectionPostButton;
    public void clickConnectionPostButton(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        connectionPostButton.click();
        fnWaitVisibility(driver, "//textarea[@placeholder='Add a comment']");
        Thread.sleep(8000);
    }

    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//main//div//div//div//div//div//div[@role='button']//*[name()='svg']")
    WebElement ThreeDots_Connections;
    public void clickThreeDots_Connections(WebDriver driver) throws InterruptedException {
        ThreeDots_Connections.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//a[2]")
    WebElement deleteOption_Connections;
    public void clickDeleteOption_Connections(WebDriver driver) throws InterruptedException {
        deleteOption_Connections.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, Delete This Post']")
    WebElement deleteYesButton_Connections;
    public void clickDeleteYesButton_Connections(WebDriver driver) throws InterruptedException {
        deleteYesButton_Connections.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//body//div[@id='__nuxt']//div[@id='__layout']//div//div//div//div//div//div//div//div//a[1]//span[1]//*[name()='svg']")
    WebElement editOption_Connection;
    public void clickEditOption_Connection(WebDriver driver) throws InterruptedException {
        editOption_Connection.click();
        Thread.sleep(5000);
    }


    public void editConnection(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        connectionDescription.clear();
        Thread.sleep(2000);
        connectionDescription.sendKeys(" Edited the Connection Description using Automation");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//a[normalize-space()='View All Members']")
    WebElement viewMemberLink;
    public void clickviewMemberLink(WebDriver driver) throws InterruptedException {
        viewMemberLink.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@id='__layout']//div//main//div//div//div//div//a[contains(text(),'Invite')]")
    WebElement inviteButton;
    public void clickinviteButton(WebDriver driver) throws InterruptedException {
        inviteButton.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement inviteByTextButton;
    public void clickInviteByTextButton(WebDriver driver) throws InterruptedException {
        inviteByTextButton.click();
        Thread.sleep(4000);
    }

    @FindBy(xpath = "//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement inviteByEmailButton;
    public void clickInviteByEmailButton(WebDriver driver) throws InterruptedException {
        inviteByEmailButton.click();
        Thread.sleep(4000);
    }

    @FindBy(xpath = "//input[@data-testid='input-sms']")
    WebElement phoneNumberTextfield;
    public void enterPhoneNumberTextfield(WebDriver driver) throws InterruptedException {
        phoneNumberTextfield.sendKeys("432-546-3467");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//p[contains(text(),'AUTOMATION has invited you to join their group in ')]")
    WebElement messageTextfield;
    public String getInviteMessage(WebDriver driver) throws InterruptedException {
        return messageTextfield.getText();
    }

    @FindBy(xpath = "//button[normalize-space()='Send']")
    WebElement sendButton;
    public void clickSendInviteButton(WebDriver driver) throws InterruptedException {
        sendButton.click();
        fnWaitVisibility(driver,"//button[contains(text(),'Send more')]");
        Thread.sleep(5000);
    }


    @FindBy(xpath = "//input[@data-testid='input-email']")
    WebElement emailTextfield;
    public void enterEmailTextfield(WebDriver driver) throws InterruptedException {
        emailTextfield.sendKeys("Automation.uptogether2@gmail.com");
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//p[contains(text(),'Invitation Sent')]")
    WebElement invitationSuccessMessage;
    public String getInviteSuccessMessage(WebDriver driver) {
        return invitationSuccessMessage.getText();
    }


    @FindBy(xpath = "//button[contains(text(),'Send more')]")
    WebElement sendMoreButton;
    public void clikcSendMoreButton(WebDriver driver) throws InterruptedException {
        sendMoreButton.click();
        //fnWaitVisibility(driver,"//button[contains(text(),'Send more')]");
        Thread.sleep(5000);
    }

    public void clickGroupSettingIcon(WebDriver driver) throws InterruptedException {
        groupSettingIcon.click();
        Thread.sleep(4000);
    }


    @FindBy(xpath = "//span[contains(text(),'Leave Group')]")
    WebElement leaveGroupButton;
    public void clickleaveGroupButton(WebDriver driver) throws InterruptedException {
        leaveGroupButton.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//button[contains(text(),'Yes, leave this group')]")
    WebElement leaveGroupConfirmation;
    public void clickleaveGroupConfirmation(WebDriver driver) throws InterruptedException {
        leaveGroupConfirmation.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//p[contains(text(),'Groups are the heart of UpTogether. Use this space')]")
    WebElement emptyGroupMessage;
    public String getEmptyGroupMessage(WebDriver driver) {
        return emptyGroupMessage.getText();
    }


    @FindBy(xpath = "//div[normalize-space()='View Uptogether notification settings']")
    WebElement groupNotificationButton;
    public void clickGroupNotificationButton(WebDriver driver) throws InterruptedException {
        groupNotificationButton.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[3]/label[1]/span[1]")
    WebElement groupReminderButton;
    public void clickGroupReminderButton(WebDriver driver) throws InterruptedException {
        groupReminderButton.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[3]/div[2]/div[3]/label[1]/span[1]")
    WebElement surveyNoticeButton;
    public void clickSurveyNoticeButton(WebDriver driver) throws InterruptedException {
        surveyNoticeButton.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[3]/div[3]/div[3]/label[1]/span[1]")
    WebElement financialUpdatesButton;
    @FindBy(xpath = "//button[normalize-space()='Turn Off']")
    WebElement turnOffButton;
    public void clickFinancialUpdatesButton(WebDriver driver) throws InterruptedException {
        financialUpdatesButton.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement notificationSaveButton;
    public void clickNotificationSaveButton(WebDriver driver) throws InterruptedException {
        notificationSaveButton.click();
        Thread.sleep(5000);
        if((driver.findElements(By.xpath("//button[normalize-space()='Turn Off']")).size()>0)){
            turnOffButton.click();
            Thread.sleep(2000);
        }else {
            System.out.println("TEST PASSED");
        }
    }


    public GroupPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
