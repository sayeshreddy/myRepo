# hash is for comments

Feature: feature for testing login func

  Scenario: Check whether user is able to login with valid credentials
    Given user in login page
    When entered username and password
    And clicks on login button
    Then user is moved to homepage
