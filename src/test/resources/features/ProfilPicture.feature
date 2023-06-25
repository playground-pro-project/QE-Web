@Test
Feature: Profile Picture

  Scenario: User upload profil picture with valid file
    Given user already do logins with "email.com" as email and "password" as password
    And already on 'Profil' pages
    When user click 'Upload a photo' buttons
    And choose image from explorers
    Then profil pictures successfully changed

  Scenario: User upload profil picture with invalid file
    Given user already do logins with "email.com" as email and "password" as password
    And already on 'Profil' pages
    When user click 'Upload a photo' buttons
    And choose image from explorers
    Then profil pictures can't be changed

  Scenario: User remove profil picture after upload it
    Given user already do logins with "email.com" as email and "password" as password
    And already on 'Profil' pages
    When user click 'Upload a photo' buttons
    And choose image from explorers
    Then profil pictures successfully changed
    When user click 'Remove a photo' buttons
    Then profil pictures was deleted