@Test
Feature: Change Password

  Scenario: User want change valid password
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    And click 'Edit Profil' button
    And selects 'Change Password'
    When 'Change Password' pop up will appears
    And user inputs "@Aadmin88" as Old Password, "@Aadmin88" as New Password, and "@Aadmin88" as Confirm Password
    Then user click submits
    And passwords successfully changed

  Scenario: User want change invalid password
    Given user already on landing page
    When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
    And user click 'Profil' buttons
    And selects 'Profil'
    And click 'Edit Profil' button
    And selects 'Change Password'
    When 'Change Password' pop up will appears
    And user inputs "shark" as Old Password, "@Aadmin88" as New Password, and "shark" as Confirm Password
    Then user click submits
    And passwords can't be changed


