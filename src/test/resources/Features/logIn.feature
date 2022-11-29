#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login
  I want to use this template for my feature file

  Background: 
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the ""

  #LogIN button
  Scenario: Validates the login url
    Given Admin/User/Staff is on Browser
    When Admin/User/Staff opens the ""
    Then Admin/user/Staff should be navigated to login page as title ""

  #Login-Valid Credentials
  Scenario: Login with valid credentials
    Given User is on Login Page as title ""
    When User clicks login button after entering Username and Password
      | Username                 | Password  |
      | automationt502@gmail.com | test@auto |
    Then User see header text as "Manage Program"

  Scenario Outline: Admin/Staff login with valid credentials
    Given Admin/Staff is on Login Page as title ""
    When Admin/Staff clicks login button after entering <Username>,<Password>and<code>
    Then Admin/Staff see header text as "Manage Program"

    Examples: 
      | Username   | Password | code  |
      | 4692368193 | test123  | 54564 |

  #Login -Invalid Credentials
  Scenario: User login with valid username and invalid password
    Given User is on Login Page as title ""
    When User clicks login button after entering valid Username and invalid Password
      | Username    | Password |
      | dummy@gmail | test001  |
    Then User should see an error message "Entered invalid password"

  Scenario: User login with invalid username and valid password
    Given User is on Login Page as title ""
    When User clicks login button after entering invalid username and valid Password
      | Username        | Password  |
      | dummy@gmail.com | test@auto |
    Then User should see an error message "Entered invalid username"

  Scenario: User login with invalid username and invalid password
    Given User is on Login Page as title ""
    When User clicks login button after entering invalid username and invalid Password
      | Username        | Password |
      | dummy@gmail.com | test003  |
    Then User should see an error message "The username and password  are incorrect"

  Scenario: User login with valid username and leaves password empty
    Given User is on Login Page as title ""
    When User clicks login button after entering valid username and leaves Password field empty
      | Username        | Password |
      | dummy@gmail.com |          |
    Then It should display an error message "enter valid password"

  Scenario Outline: Admin/Staff with valid username,invalid password,code
    Given Admin/Staff is on Login Page as title ""
    When Admin/Staff  clicks login button after entering  valid <Username> ,invalid <Password> and <code>
    Then Admin/Staff should see an error message "Entered invalid password"

    Examples: 
      | Username | Password | code |
      | dummy    | test     |  123 |

  Scenario Outline: Admin/Staff with invalid username,valid password,code
    Given Admin/Staff is on Login Page as title ""
    When Admin/Staff clicks login button after entering invalid <Username> ,valid <Password> and <code>
    Then Admin/Staff should see an error message "Entered invalid username"

    Examples: 
      | Username | Password | code |
      | dummy    | test     |  123 |

  Scenario Outline: Admin/Staff with valid username,valid password without code
    Given Admin/Staff is on Login Page as title ""
    When Admin/Staff clicks login button after entering valid <Username> valid <Password> and without <code>
    Then Admin/Staff should see an error message "The code is required"

    Examples: 
      | Username | Password | code |
      | Gummy    | test     |      |

  #Forgot Password
  Scenario: Validate forgot password link
    Given Admin/User/Staff is on Login Page as title ""
    When Admin/User/Staff clicks Forgot password link
    Then It should redirected to forgot Password page as title ""

  Scenario: Validate forgot password with email id
    Given Admin/User/Staff is on Forgot Password Page as title ""
    When Admin/User/Staff clicks continue after entering valid emailaddress
      | dummy@gmail.com |
    Then Admin/User/Staff should be redirected to enter verification code page and verification code will be sent to email

  Scenario: Validate verifiction code
    Given Admin/User/Staff is on Enter verification code Page as title ""
    When Admin/User/Staff clicks continue after entering verification code
      | 12345 |
    Then Admin/User/Staff should be redirected reset password page as title ""

  Scenario: Validate click here link in verification code page
    Given Admin/User/Staff is on Enter verification code Page as title ""
    When Admin/User/Staff clicks Click here link to resend
    Then The verification code should be resend to email

  #Reset Password
  Scenario: Validate Reset password
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | Dummy@22 | Dummy@22 |
    Then Admin/User/Staff should be redirected to login page as title ""

  Scenario: Validate Reset password on mismatch
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | Dummy@22 | Dummy@32 |
    Then It should display an error message "password and retype password are mismatched"

  #Negative scenario
  Scenario: Validate Reset password with lessthan 8 characters
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | Dumy@2 | Dumy@2 |
    Then It should display an error message "The password must contain 8 characters"

  Scenario: Validate Reset password without capital letter
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | dummy@23 | dummy@23 |
    Then It should display an error message "The password must contain one Capital letter"

  Scenario: Validate Reset password without number
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | dummy@com | dummy@com |
    Then It should display an error message "The password must contain one Number"

  Scenario: Validate Reset password without special character
    Given Admin/User/Staff is on Reset Password Page as title ""
    When Admin/User/Staff clicks submit button after entering new password and retype password
      | dummy923 | dummy923 |
    Then It should display an error message "The password must contain one Special character"

  Scenario: Validate Reset password with cancel button
    Given Admin/User/Staff is on Reset Password Page as title "  "
    When Admin/User/Staff clicks cancel button after entering new password and retype password
      | dummy923 | dummy923 |
    Then Admin/User/Staff should see a refreshed reset password page with empty field
