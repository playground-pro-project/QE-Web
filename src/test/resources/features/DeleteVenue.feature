@Test
Feature: Delete Venue

  Scenario: Hoster want to delete venue
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages
    And hoster click venue that want to delete
    Then hoster click on 'Delete' button
    And venue successfully deleted