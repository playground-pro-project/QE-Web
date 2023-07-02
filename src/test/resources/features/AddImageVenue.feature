@Test
Feature: Add Image Venue

  Scenario: Hoster want to edit the information of the venue with complete data
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages
    And user click on lap bola Admin Jangan Dihapus venue
    When hoster click on 'Add Image' button
    And pop up 'Upload Your Image' is appear
    Then hoster select file from directory "lapanganBola1.jpg"
    And click submit
    And picture successfully uploaded

  Scenario: Hoster want to add image for the venue with invalid file
    Given user already on landing page
    When user already do logins with "vvdtynht@exelica.com" as email and "@Aadmin92" as password
    And hoster click 'Profil' buttons
    And click on 'My Venue' buttons
    Then user will redirected to 'My Venue' pages
    And user click on lap bola Admin Jangan Dihapus venue
    When hoster click on 'Add Image' button
    And pop up 'Upload Your Image' is appear
    Then hoster select file from directory "InvalidFile.csv"
    And click submit
    And picture can not uploaded