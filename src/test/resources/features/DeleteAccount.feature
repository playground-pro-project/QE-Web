@Test
Feature: Delete Account

  Scenario: User want to delete account
    Given user already on landing page
    When user already do logins with "fsfaoseprb@exelica.com" as email and "@Aadmin87" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    When 'Profil' pages is showed
    And click on 'Delete Account' buttons
    And account deleted successfully