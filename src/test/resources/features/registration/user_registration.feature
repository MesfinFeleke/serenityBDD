Feature: User Registration
  I want to verify user creation works as expected

  @dev
  Scenario: Create a new user
    Given I navigate to the login page
    Given I create a new user
    Then I log out