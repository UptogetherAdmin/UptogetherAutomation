package com.eco.uitests.stepdef.Uptogether;

import com.eco.uitests.factory.DriverManager;
import com.eco.uitests.pages.Uptogether.GroupPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.awt.*;

public class Group {
    public Login login;
    public WebDriver driver;
    public GroupPage groupPage;
    DriverManager driverManager;

    public Group(Login login){this.login = login;}

    @And("User opens the add group page")
    public void openAddGroup() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.openAddGroupPage(driver);
    }

    @And("User creates the group by entering all the details")
    public void createGroup() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterGroupDetails(driver);
        groupPage.enterCheckinSchedule(driver);
    }

    @And("User uploads a group logo and creates the group")
    public void GroupLogo() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.uploadGroupLogo(driver);
        groupPage.clickCreateGroupButton(driver);
    }

    @And("User creates the group in firefox")
    public void createGroup_Firefox() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickCreateGroupButton(driver);
    }

    @And("User opens the Add Ask Page and enters all the details")
    public void enterAskDetails() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddAskButton1(driver);
        groupPage.enterAskInfo(driver);
    }

    @And("User goes to Ask tab")
    public void navigateToAskTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAskTab(driver);
    }

    @And("User opens add ask tab from ask tab")
    public void openAddAsk_AskTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddAskButton2(driver);
    }

    @And("User goes to Contribution tab")
    public void navigateToContributionTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickContributionTab(driver);
    }

    @And("User goes to Goal Sharing tab")
    public void navigateToGoalsTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickGoalSharingTab(driver);
    }

    @And("User goes to Connections tab")
    public void navigateToConnectionsTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickConnectionsTab(driver);
    }

    @And("User opens add Contribution tab from Contribution tab")
    public void openAddContribution_ContributionTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddContributionButton2(driver);
    }

    @And("User opens add Goal Sharing tab from Goal Sharing tab")
    public void openAddGoals_GoalsTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddGoalSharingButton2(driver);
    }

    @And("User opens add Connections tab from Connections tab")
    public void openAddConnections_ConnectionsTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddConnectionsButton2(driver);
    }

    @And("User enters Connection Details")
    public void enterConnectionDetail_ConnectionTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterConnectionInfo(driver);
    }

    @And("User enters Ask Details")
    public void enterAskDetail_AskTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterAskInfo(driver);
    }

    @And("User enters Contribution Details")
    public void enterContributionDetail_ContributionTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterContributionInfo(driver);
    }

    @And("User enters Goal Sharing Details")
    public void enterGoalSharingDetail_GoalSharingTab() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterGoalSharingInfo(driver);
    }

    @And("User opens the Add Contribution Page and enters all the details")
    public void enterContributionDetails() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddContributionButton1(driver);
        groupPage.enterContributionInfo(driver);
    }

    @And("User opens the Add Goal Sharing Page and enters all the details")
    public void enterGoalSharingDetails() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddGoalSharingButton1(driver);
        groupPage.enterGoalSharingInfo(driver);
    }

    @And("User uploads an image")
    public void uploadAskImage() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.uploadAskImage(driver);
    }

    @And("User saves the Ask")
    public void saveAsk() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickaskPostButton(driver);
    }

    @And("User saves the Contribution")
    public void saveContribution() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickContributionPostButton(driver);
    }

    @And("User saves the Goal")
    public void saveGoal() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickGoalSharingPostButton(driver);
    }


    @And("User saves the Connection")
    public void saveConnection() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickConnectionPostButton(driver);
    }

    @And("User deletes the Ask")
    public void deleteAsk() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Ask(driver);
        groupPage.clickDeleteOption_Ask(driver);
        groupPage.clickDeleteYesButton_Ask(driver);
    }

    @And("User deletes the Contribution")
    public void deleteContribution() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Contribution(driver);
        groupPage.clickDeleteOption_Contribution(driver);
        groupPage.clickDeleteYesButton_Contribution(driver);
    }

    @And("User deletes the Goal")
    public void deleteGoal() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_GoalSharing(driver);
        groupPage.clickDeleteOption_GoalSharing(driver);
        groupPage.clickDeleteYesButton_GoalSharing(driver);
    }

    @And("User deletes the Connection")
    public void deleteConnection() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Connections(driver);
        groupPage.clickDeleteOption_Connections(driver);
        groupPage.clickDeleteYesButton_Connections(driver);
    }

    @And("User edits an existing ask")
    public void editAsk() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Ask(driver);
        groupPage.clickEditOption_Ask(driver);
        groupPage.editAsk(driver);
    }

    @And("User adds a comment")
    public void AddComment() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterComment(driver);
    }

    @And("User edits an existing comment")
    public void editComment() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Comment(driver);
        groupPage.clickEditOption_Comment(driver);
        groupPage.editComment(driver);
    }



    @And("User deletes the comment")
    public void deleteComment() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Comment(driver);
        groupPage.clickDeleteOption_Comment(driver);
        groupPage.clickDeleteYesButton_Comment(driver);
    }

    @And("User edits an existing Contribution")
    public void editContribution() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Contribution(driver);
        groupPage.clickEditOption_Contribution(driver);
        groupPage.editContribution(driver);
    }

    @And("User edits an existing Goal")
    public void editGoal() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_GoalSharing(driver);
        groupPage.clickEditOption_GoalSharing(driver);
        groupPage.editGoalSharing(driver);
    }

    @And("User edits an existing Connection")
    public void editConnection() throws InterruptedException, AWTException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickThreeDots_Connections(driver);
        groupPage.clickEditOption_Connection(driver);
        groupPage.editConnection(driver);
    }
/*
    @And("User creates the group by clicking the create button")
    public void createGroup(WebDriver driver){
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickCreateGroupButton(driver);
    }

 */

    @And("User goes to group page by clicking visit group button")
    public void visitGroupPage(){
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickVisitGroupButton(driver);
    }

    @And("User asserts the group name")
    public void assertGroupName(){
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        Assert.assertEquals("Test Automation Group 1", groupPage.getGroupNameText(driver));
        System.out.println("expected value of group name is Test Automation Group 1 " + "Actual value of group name is "+ groupPage.getGroupNameText(driver));
    }

    @And("User opens an existing group")
    public void openExistingGroup() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickexistingGroup1(driver);
    }

    @And("User goes to edit group details page")
    public void openEditGroup() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.navigateToEditGroupPage(driver);
    }

    @And("User edits the group detail")
    public void editGroup() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.editGroupDetails(driver);
    }

    @And("User asserts the group name after editing")
    public void assertGroupNameAfterEdit(){
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        Assert.assertEquals("Test Automation Group 1 EDIT", groupPage.getGroupNameTextAfterEdit(driver));
        System.out.println("expected value of group name is Test Automation Group 1 EDIT " + "Actual value of group name is "+ groupPage.getGroupNameTextAfterEdit(driver));
    }

    @And("User cancels the group creation")
    public void cancelGroupCreation() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddGroupBackButton(driver);
        groupPage.clickAddGroupCancelButton(driver);
    }

    @And("User clicks on the Cancel Button")
    public void cancelAskCreation() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickAddAskCancelButton(driver);
    }

    @And("User goes to the Invite Page")
    public void navigateToInvitePage() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickviewMemberLink(driver);
        groupPage.clickinviteButton(driver);
        groupPage.clickInviteByTextButton(driver);
        System.out.println(groupPage.getInviteMessage(driver));
    }

    @And("User sends an invite by text message")
    public void sendInvite_Text() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterPhoneNumberTextfield(driver);
        groupPage.clickSendInviteButton(driver);
    }

    @And("User goes to the Invite Page again")
    public void navigateToInvitePage2() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clikcSendMoreButton(driver);
        groupPage.clickInviteByEmailButton(driver);
    }

    @And("User sends an invite by email")
    public void sendInvite_Email() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.enterEmailTextfield(driver);
        groupPage.clickSendInviteButton(driver);
    }

    @And("User asserts to make sure the invitation is sent")
    public void assertInviteSuccess() {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        System.out.println(groupPage.getInviteSuccessMessage(driver));
        System.out.println("expected value of group name is Invitation Sent " + "Actual value of group name is "+ groupPage.getInviteSuccessMessage(driver));
        Assert.assertEquals("Invitation Sent", groupPage.getInviteSuccessMessage(driver));
    }

    @And("User exits the group")
    public void exitGroup() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickGroupSettingIcon(driver);
        groupPage.clickleaveGroupButton(driver);
        groupPage.clickleaveGroupConfirmation(driver);
    }

    @And("User asserts the text shown in group page")
    public void assertEmptyGroupMessage() {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        System.out.println("expected value of message is Groups are the heart of UpTogether. Use this space to connect with your community and share resources. Click “Create a Group” below to get the conversation started. " + "Actual value of message is "+ groupPage.getEmptyGroupMessage(driver));
    }

    @And("User goes to notification setting page")
    public void navigateToNotificationSetting() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickGroupSettingIcon(driver);
        groupPage.clickGroupNotificationButton(driver);
    }

    @And("User update the notification settings and saves it")
    public void updateNotificationSettings() throws InterruptedException {
        driver = login.getDriver();
        groupPage=new GroupPage(driver);
        groupPage.clickGroupReminderButton(driver);
        groupPage.clickSurveyNoticeButton(driver);
        groupPage.clickFinancialUpdatesButton(driver);
        groupPage.clickNotificationSaveButton(driver);
    }
}
