@Test
Feature: Become Owner

  Scenario: User upload ktp picture with valid file
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And hoster click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose valid image from explorers "KTP-1544523262.png"
    And click 'Become Owner' buttons
    And ktp pictures successfully uploaded

  Scenario: User upload ktp picture with invalid file
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose invalid image from explorers "InvalidFile.csv"
    And click 'Become Owner' buttons
    And invalid pictures can not be uploaded

  Scenario: User don't want to become owner
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And select 'Became Owner' buttons
    And 'Became Owner' pages is showed
    Then user choose valid image from explorers "KTP-1544523262.png"
    And hoster click on 'Cancel' buttons