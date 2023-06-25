@Test
Feature: User and Hoster Dropdown

  Scenario: User want to go to 'Profil' page
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And selects 'Profil'
    Then 'Profil' pages is showed

  Scenario: User want to go to 'My Transaction' page
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And selects 'My Transaction'
    Then 'History' pages is showed

  Scenario: User want to go to 'Become Owner' page
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And click on 'Become Owner' buttons
    Then user will redirected to 'Became Owner' pages

  Scenario: User want to logout
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And click on 'Logout' buttons
    Then user will redirected to 'Landing' pages

  Scenario: Hoster want to go to 'Profil' page
    Given Hoster already do logins with "email.com" as email and "password" as password
    When Hoster click 'Profil' buttons
    And selects 'Profil'
    Then 'Profil' pages is showed

  Scenario: Hoster want to go to 'My Transaction' page
    Given Hoster already do logins with "email.com" as email and "password" as password
    When Hoster click 'Profil' buttons
    And selects 'My Transaction'
    Then 'History' pages is showed

  Scenario: Hoster want to go to 'My Venue' page
    Given Hoster already do logins with "email.com" as email and "password" as password
    When Hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages

  Scenario: Hoster want to logout
    Given Hoster already do logins with "email.com" as email and "password" as password
    When Hoster click 'Profil' buttons
    And click on 'Logout' buttons
    Then user will redirected to 'Landing' pages
