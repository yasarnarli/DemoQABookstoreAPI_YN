Feature: Delete book
@wip
  Scenario: User should be able to delete a book from collection
    Given User should delete a book
    Then User should verify deleteStatusCode
