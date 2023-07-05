@Test @RegisterPage
  Feature: Register page
    Scenario: Register user with valid data
      Given User already on register page
      When User input "qa web" as fullName and input "08988888777" as phone and input "qefighting@test.cm" as email and input "Password123@" as password and input "Password123@" as confirmPassword
      Then User click register button
      And Verify register success

    Scenario: User register with registered email
      Given User already on register page
      When User input "qa web" as fullName and input "081876387558" as phone and input "user2@default.com" as email and input "Password123@" as password and input "Password123@" as confirmPassword
      Then User click register button
      And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User input password without uppercase
      Given User already on register page
      When User input "qa web" as fullName and input "081876387001" as phone and input "ejfnednsnfdmn@test.com" as email and input "password123@" as password and input "password123@" as confirmPassword
      Then User click register button
      And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User input password without numeric
        Given User already on register page
        When User input "qa web" as fullName and input "081876387002" as phone and input "ndfmdfnsjkdfnkjn@test.com" as email and input "Password@" as password and input "Password@" as confirmPassword
        Then User click register button
        And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User input password without special character
        Given User already on register page
        When User input "qa web" as fullName and input "081876387003" as phone and input "kmfrkmfrlmf@test.com" as email and input "Password123" as password and input "Password123" as confirmPassword
        Then User click register button
        And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User input password less than 8 character
        Given User already on register page
        When User input "qa web" as fullName and input "081876387004" as phone and input "kmfrkmfrlmf@test.com" as email and input "Pas123@" as password and input "Pas123@" as confirmPassword
        Then User click register button
        And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User input password and confirm password not match
        Given User already on register page
        When User input "qa web" as fullName and input "081876387005" as phone and input "kmfrkmfrlmf@test.com" as email and input "Password123@" as password and input "Password123" as confirmPassword
        Then User click register button
        And Verify appear caution message "Please make sure your username and password are correct!" on register page

    Scenario: User register with not all data field
        Given User already on register page
        When User input "qa web" as fullName and input "081876387006" as phone and input "" as email and input "Password123@" as password and input "Password123@" as confirmPassword
        Then User click register button
        And Verify appear caution message "Please make sure your username and password are correct!" on register page