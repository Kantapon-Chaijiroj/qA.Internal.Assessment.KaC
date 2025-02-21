@UC_LOGIN_AND_REGISTER
Feature: Use case for login and register account

  Background:
    Given The user is on the login page

  @TM_UC_LOGIN_AND_REGISTER-01
  @UC_LOGIN_AND_REGISTER-Navigate_to_Registration_Page
  Scenario: Navigate to the registration page
    When Click on the Register Now button
    Then Verify that the user is on the registration page

  @TM_UC_LOGIN_AND_REGISTER-01
  @UC_LOGIN_AND_REGISTER-Create_new_user
  Scenario: Fill in user details and register a new account
    When Click on the Register Now button
    * Fill in the user details
      | User ID       | Password  | First name  | Last name |
      | k_chaijiroj   | asdfgh    | Kantapon    | Chaijiroj |
    * Click on Save Account Information button
    Then Verify that the user is created

  @TM_UC_LOGIN_AND_REGISTER-01
  @UC_LOGIN_AND_REGISTER-Login_new_user
  Scenario: Login with the newly created account
    When Enter the User ID "k_chaijiroj" and Password "asdfgh"
    * Click on Login button
    Then Verify that the new user is a logged in user

