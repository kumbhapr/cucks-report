Feature: Dashboard API Test
  
  Scenario: Test success response from API
    Given I have base URL for user API
    And I use user list API
    And I add following headers
      | namme        | value            |
      | Accept       | application/json |
      | x-vf-msisdn  | 491521001        | 
      | x-vf-opco    | DE               |
    When I make HTTP request
    Then I get OK response
    And I validate following headers from response
      | Vary                        | Accept-Encoding |
      | Cache-Control               | max-age=14400   |
      | Access-Control-Allow-Origin | *               |
    

  Scenario: Test failure response from API
    Given I have base URL for user API
    And I use wrong API path
    When I make HTTP request
    Then I get 404 response
    