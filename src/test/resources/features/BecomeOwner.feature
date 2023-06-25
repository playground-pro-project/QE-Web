@Test
Feature: Become Owner

  Scenario: User upload ktp picture with valid file
    Given Hoster already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed"
    Then user choose image from explorers
    And click 'Become Owner' buttons
    And ktp pictures successfully uploaded

  Scenario: User upload ktp picture with invalid file
    Given Hoster already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And select 'Became Owner' button
    And 'Became Owner' pages is showed"
    Then user choose image from explorers
    And click 'Become Owner' buttons
    And invalid pictures can not be uploaded

  Scenario: User don't to become owner
    Given Hoster already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user click on 'Cancel' buttons
    And user redirected to 'Home' pages