Feature: Register Test

  Scenario Outline: Create an Account

    Given go to website
    And handle the cookie
    Then click on Mein Konto button
    When click on Jetzt Konto erstellen button
    Then the user should be navigated to register page
    Then choose a titel
    And type a username "<username>"
    And type an Email address "<email>"
    And type a password "<password>"
    And type firstname "<firstname>" and lastname "<lastname>"
    And type a street "<street>" and house number "<house number>"
    And type a PLZ "<PLZ>" and place "<place>"
    Then click on register button
    Examples:
      | username   | email                | password    | firstname | lastname | street        | house number | PLZ   | place      |  |
      | hakandemir | hakandemir@gmail.com | hakanD12345 | Hakan     | Demir    | Tübinger Str. | 99           | 72760 | Reutlingen | |