@LoginPage
  Feature: Login Page

    Scenario: Sign up button on login page work
      Given user on the login page
      When user click signup button on login page
      Then Verify user already on register page

      Scenario: Login with valid email and password
        Given user on the login page
        When user input "user2@default.com" as email and input "@Derinm01#" as password
        Then Verify user already on landing page

      Scenario: Login with unregistered email
        Given user on the login page
        When user input "dfjhswhhjk@test.com" as email and input "dsavgdgszg" as password
        Then Verify appear caution message "Please make sure your username and password are correct!" on login page

        Scenario: User login with incomplete data
            Given user on the login page
            When user input "user2@default.com" as email and input "" as password
            Then Verify appear caution message "Please check your username or password again!" on login page



