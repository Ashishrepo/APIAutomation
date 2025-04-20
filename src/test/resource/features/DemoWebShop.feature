Feature: Login functionality for DemoWebShop

  Background:
    Given : User at DemoWebShop Login Page

  Scenario: Login with Valid credentials
    Given User entered valid credentials
    When User clicks on Login Button
    Then User logged in successfully



#    Scenario Outline: Login with Invalid credentils
#      Given User entered invalid "<username>" and "<password>"
#      When User clicks on Login Button
#      Then User verify the "<error_message>"
#      Examples:
#        | username  |password  |error_message|
#        | user1  |password  |error_message|
#        | user2  |password  |error_message|
#        | user3  |password  |error_message|
