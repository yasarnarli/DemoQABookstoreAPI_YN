Feature: New user register

  Scenario: User should be able to register
    Given User should register with valid credentials
    Then User should verify the status code


