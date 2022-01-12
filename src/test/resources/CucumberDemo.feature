Feature: Google Searching

  @QA
  Scenario: Google search result page elements
    Given the user navigates to the Google home page
    When the user entered "panda" at the search bar
    Then the results page shows links related to "panda"
    And image links for "panda"
    And video links for "panda