@Test @LandingPage
  Feature: Landing page

    Scenario: User click login button on landing page
      Given user open the landing page
      When User click on login button in landing page
      Then Verify user already on login page


    Scenario: User click venue detail without login
      Given user open the landing page
      When User click first venue
      Then Verify user already on login page

    Scenario: Check pagination button function
      Given user open the landing page
      When User get first page venue id
        And User click next page button
        Then Verify user already on next page
