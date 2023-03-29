Feature: Add, Edit and Delete Groups
  Background: User is logged in
    Given User on Uptogether Login Page
    When User click on the uptogether login button
    Then User switches to the child window to enter the google account details and switches back to the parent window


  @CreateGroup @Group @Release
  Scenario: Create a new group
    Given User goes to Groups page after switching to the parent window
    When User opens the add group page
    And User creates the group by entering all the details
    Then User uploads a group logo and creates the group
    And User goes to group page by clicking visit group button
    And User asserts the group name

  @EditGroup @Group @Release
  Scenario: Edit a new group
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    And User goes to edit group details page
    Then User edits the group detail
    And User asserts the group name after editing


  @AddAsk @Group @Release @Comment
  Scenario: Add a new Ask, Add/Edit/Delete Comment and Delete the Ask
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Ask Page and enters all the details
    And User uploads an image
    Then User saves the Ask
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Ask


  @AddAsk_AskTab @Group @Release
  Scenario: Add/Edit/Delete a new Ask from the Ask Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Ask tab
    And User opens add ask tab from ask tab
    And User enters Ask Details
    And User uploads an image
    Then User saves the Ask
    And User edits an existing ask
    And User saves the Ask
    And User deletes the Ask

  @AddContribution @Group @Release @Contribution @Comment
  Scenario: Add a new Contribution, Add/Edit/Delete Comment and Delete the Contribution
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Contribution Page and enters all the details
    And User uploads an image
    Then User saves the Contribution
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Contribution


  @AddContribution_ContributionTab @Group @Release @Contribution
  Scenario: Add/Edit/Delete a new Contribution from Contribution Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Contribution tab
    And User opens add Contribution tab from Contribution tab
    And User enters Contribution Details
    And User uploads an image
    Then User saves the Contribution
    And User edits an existing Contribution
    And User saves the Contribution
    And User deletes the Contribution


  @CancelAddGroup @Group @Release @Contribution @Comment
  Scenario: Cancel Group Creation
    Given User goes to Groups page after switching to the parent window
    When User opens the add group page
    Then User cancels the group creation


  @CancelAddAsk @Group @Release @Contribution @Comment
  Scenario: Cancel Add Ask, Add Contribution, Add Goal Sharing and Add Connection
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens add ask tab from ask tab
    Then User clicks on the Cancel Button
    And User goes to Contribution tab
    And User opens add Contribution tab from Contribution tab
    And User clicks on the Cancel Button
    And User goes to Goal Sharing tab
    And User opens add Goal Sharing tab from Goal Sharing tab
    And User clicks on the Cancel Button
    And User goes to Connections tab
    And User opens add Connections tab from Connections tab
    And User clicks on the Cancel Button

  @AddGoalSharing @Group @Release @Goals @Comment
  Scenario: Add a new Goal, Add/Edit/Delete Comment and Delete the Goal
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Goal Sharing Page and enters all the details
    And User uploads an image
    Then User saves the Goal
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Goal

  @AddGoalSharing_GoalSharingTab @Group @Release @Goals
  Scenario: Add/Edit/Delete a new Goal from the Goal Sharing Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Goal Sharing tab
    And User opens add Goal Sharing tab from Goal Sharing tab
    And User enters Goal Sharing Details
    And User uploads an image
    Then User saves the Goal
    And User edits an existing Goal
    And User saves the Goal
    And User deletes the Goal



  @AddConnections @Group @Release @Connections @Comment
  Scenario: Add/Edit/Delete New Connection and Add/Edit/Delete Comment
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Connections tab
    And User opens add Connections tab from Connections tab
    And User enters Connection Details
    And User uploads an image
    Then User saves the Connection
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User edits an existing Connection
    And User saves the Connection
    And User deletes the Connection

  @InviteUsers @Group @Release @Fail
  Scenario: Invite users to the group via Text Message and Email Id
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to the Invite Page
    Then User sends an invite by text message
    And User asserts to make sure the invitation is sent
    And User goes to the Invite Page again
    And User sends an invite by email
    And User asserts to make sure the invitation is sent

  @ExitGroup @Group @Release
  Scenario: Exit the group
    Given User goes to Groups page after switching to the parent window
    When User opens an existing group
    Then User exits the group
    And User asserts the text shown in group page

  @GroupNotificationSetting @Group @Release @Fail
  Scenario: Group notifications setting
    Given User goes to Groups page after switching to the parent window
    When User opens an existing group
    And User goes to notification setting page
    Then User update the notification settings and saves it


  @CreateGroup_firefox @GroupFirefox @Firefox
  Scenario: Create a new group
    Given User goes to Groups page after switching to the parent window
    When User opens the add group page
    And User creates the group by entering all the details
    Then User creates the group in firefox
    And User goes to group page by clicking visit group button
    And User asserts the group name
    And User logs out of the application

  @EditGroup_firefox @GroupFirefox @Firefox
  Scenario: Edit a new group
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    And User goes to edit group details page
    Then User edits the group detail
    And User asserts the group name after editing
    And User logs out of the application


  @AddAsk_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add a new Ask, Add/Edit/Delete Comment and Delete the Ask
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Ask Page and enters all the details
    Then User saves the Ask
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Ask
    And User logs out of the application


  @AddAsk_AskTab_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add/Edit/Delete a new Ask from the Ask Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Ask tab
    And User opens add ask tab from ask tab
    And User enters Ask Details
    Then User saves the Ask
    And User edits an existing ask
    And User saves the Ask
    And User deletes the Ask
    And User logs out of the application

  @AddContribution_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add a new Contribution, Add/Edit/Delete Comment and Delete the Contribution
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Contribution Page and enters all the details
    Then User saves the Contribution
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Contribution
    And User logs out of the application


  @AddContribution_ContributionTab_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add/Edit/Delete a new Contribution from Contribution Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Contribution tab
    And User opens add Contribution tab from Contribution tab
    And User enters Contribution Details
    Then User saves the Contribution
    And User edits an existing Contribution
    And User saves the Contribution
    And User deletes the Contribution
    And User logs out of the application


  @CancelAddGroup_firefox @GroupFirefox @Firefox
  Scenario: Cancel Group Creation
    Given User goes to Groups page after switching to the parent window
    When User opens the add group page
    Then User cancels the group creation
    And User logs out of the application


  @CancelAddAsk_firefox @GroupFirefox @Firefox
  Scenario: Cancel Add Ask, Add Contribution, Add Goal Sharing and Add Connection
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens add ask tab from ask tab
    Then User clicks on the Cancel Button
    And User goes to Contribution tab
    And User opens add Contribution tab from Contribution tab
    And User clicks on the Cancel Button
    And User goes to Goal Sharing tab
    And User opens add Goal Sharing tab from Goal Sharing tab
    And User clicks on the Cancel Button
    And User goes to Connections tab
    And User opens add Connections tab from Connections tab
    And User clicks on the Cancel Button
    And User logs out of the application

  @AddGoalSharing_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add a new Goal, Add/Edit/Delete Comment and Delete the Goal
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User opens the Add Goal Sharing Page and enters all the details
    Then User saves the Goal
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User deletes the Goal
    And User logs out of the application

  @AddGoalSharing_GoalSharingTab_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add/Edit/Delete a new Goal from the Goal Sharing Tab
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Goal Sharing tab
    And User opens add Goal Sharing tab from Goal Sharing tab
    And User enters Goal Sharing Details
    Then User saves the Goal
    And User edits an existing Goal
    And User saves the Goal
    And User deletes the Goal
    And User logs out of the application



  @AddConnections_firefox @GroupFirefox @Firefox @ImgUpload
  Scenario: Add/Edit/Delete New Connection and Add/Edit/Delete Comment
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to Connections tab
    And User opens add Connections tab from Connections tab
    And User enters Connection Details
    Then User saves the Connection
    And User adds a comment
    And User edits an existing comment
    And User deletes the comment
    And User edits an existing Connection
    And User saves the Connection
    And User deletes the Connection
    And User logs out of the application

  @InviteUsers_firefox @GroupFirefox @Firefox
  Scenario: Invite users to the group via Text Message and Email Id
    Given User goes to Groups page after switching to the parent window
    And User opens an existing group
    When User goes to the Invite Page
    Then User sends an invite by text message
    And User asserts to make sure the invitation is sent
    And User goes to the Invite Page again
    And User sends an invite by email
    And User asserts to make sure the invitation is sent
    And User logs out of the application

  @ExitGroup_firefox @GroupFirefox @Firefox
  Scenario: Exit the group
    Given User goes to Groups page after switching to the parent window
    When User opens an existing group
    Then User exits the group
    And User asserts the text shown in group page
    And User logs out of the application

  @GroupNotificationSetting_firefox @GroupFirefox @Firefox
  Scenario: Group notifications setting
    Given User goes to Groups page after switching to the parent window
    When User opens an existing group
    And User goes to notification setting page
    Then User update the notification settings and saves it
    And User logs out of the application

