@Test
Feature: Become Owner

  Scenario: User upload ktp picture with valid file
    Given user already do logins with "email.com" as email and "password" as password
    When hoster click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose valid image from explorers
    And click 'Become Owner' buttons
    And ktp pictures successfully uploaded

  Scenario: User upload ktp picture with invalid file
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose invalid image from explorers
    And click 'Become Owner' buttons
    And invalid pictures can not be uploaded

  Scenario: User don't want to become owner
    Given user already do logins with "email.com" as email and "password" as password
    When user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose valid image from explorers
    And hoster click on 'Cancel' buttons
    And no picture uploaded