@project
Feature: user can logout with new account
  Scenario: user can log out with new account

#    And user go to demo home page
    And click at Register link
    When user enter valid mandatory personal details
    And  user enter vaild Password
    And  user click in register button
    Then user register with valid account
    And user quit chrome at end

