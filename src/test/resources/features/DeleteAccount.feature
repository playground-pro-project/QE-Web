@Test
Feature: Delete Account

  Scenario: User want to delete account
    Given user already do logins with "email.com" as email and "password" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    When 'Profil' pages is showed
    And click on 'Delete Account' buttons
    Then user will redirected to 'Landing' pages