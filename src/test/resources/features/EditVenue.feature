@Test
Feature: Edit Venue

  Scenario: Hoster want to edit the information of the venue with complete data
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And Hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages
    And user click on one of the venue
    And click on 'Edit' button
    And 'Edit Venue' pop up appear
    When hoster input "Basket201" as Venues Name, "201 Main Street" as Location, "Basket201" as Description
    And click 'Save' button
    Then Venue's information is updated

  Scenario: Hoster want to edit the information of the venue with incomplete data
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And Hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages
    And user click on one of the venue
    And click on 'Edit' button
    And 'Edit Venue' pop up appear
    When hoster input "Basket201" as Venue Name
    And click 'Save' button
    Then Venue's information is updated