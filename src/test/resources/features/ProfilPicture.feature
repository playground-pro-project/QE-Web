@Test
Feature: Profile Picture

  Scenario: User upload profil picture with valid file
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    Then already on 'Profil' pages
    And click 'Edit Profil' button
    And choose image from explorers "Kimmy.jpg"
    Then profil pictures successfully changed

  Scenario: User upload profil picture with invalid file
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    Then already on 'Profil' pages
    And click 'Edit Profil' button
    And choose image from explorers "InvalidFile.csv"
    Then profil pictures can't be changed

  Scenario: User remove profil picture
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    Then already on 'Profil' pages
    When user click 'Remove a photo' buttons
    Then profil pictures was deleted

