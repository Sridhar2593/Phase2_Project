Feature: Login Feature
  
  Description: This feature will be used to login to SwagLabs Application

  @PositiveLogin
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the SwagLabs application
    And User enters correct username "<UserName>"
    And User enters correct Password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home page
    And User should be able to see the Welcome message

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  @NegativeLogin
  Scenario Outline: Verify that when user enters incorrect user name and password
    Given User has opened the SwagLabs application
    And User enters correct username "<UserName>"
    And User enters incorrect Password "<Password>"
    And User clicks on Login button
    Then User should be getting Error Message"<Error>"

    Examples: 
      | UserName      | Password      |Error|
      | standard_user | secret_secret |Epic sadface: Username and password do not match any user in this service|
