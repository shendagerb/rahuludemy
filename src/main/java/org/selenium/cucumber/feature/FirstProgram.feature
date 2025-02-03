Feature: Login feature of banking
  Scenario:user login feature
    Given User should on login page
    When  User inter valid user name and password
    And  click on submit button
    Then Dispply the succefully login message

    Scenario: login to facebook
      Given User on Facebook website
      When User Should enter facebook user name <"user"> and password <password>
      Then User navigate to home page