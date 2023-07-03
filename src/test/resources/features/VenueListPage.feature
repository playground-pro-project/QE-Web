@VenueListPage
  Feature: Venue List Page
    Scenario: Click on the first venue
      Given User already login
      Then User click first venue
      And Verify user already on venue detail page

    Scenario: Check availability button function
      Given User already login
      When User click first venue
      Then User click check availability button
      And Verify user already on venue availability page


