@Test
Feature: Edit Profile

 Scenario Outline: User edit profile with complete data
   Given user already on landing page
   When user already do logins with "gncbpz@exelica.com" as email and "@Aadmin88" as password
   And user click 'Profil' buttons
   And selects 'Profil'
   And click 'Edit Profil' button
   And user already on 'Edit Profil' pages
   And user inputs "<name>" as Name, "<email>" as Email, "<phone>" as Phone
   Then user click on save buttons
   And user's new profils will be saved
   Examples:
     | name                | email              | phone     |
     | admindelapandelapan | gncbpz@exelica.com | 081111488 |

 Scenario Outline: User edit profile with few data
   Given user already on landing page
   When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
   And user click 'Profil' buttons
   And selects 'Profil'
   And user already on 'Edit Profil' pages
   And click 'Edit Profil' button
   And user inputs "<name>" as Name and "<phone>" as Phone
   Then user click on save buttons
   And user's new profils will be saved
   Examples:
     | name                | phone     |
     | admindelapandelapan | 081111488 |

