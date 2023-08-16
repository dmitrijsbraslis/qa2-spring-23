Feature: Weather forecast

  Scenario: Full weather info checks
    Given city ID is 12345

    When we are requesting weather forecast

    Then latitude is 39.31
    And longitude is -74.5
    And timezone is "America/New_York"
    And timezone offset is -18000

#    And current dt is 1646318698
#    And current sunrise is 1646306882
#    And current sunset is 1646347929

    And current weather data is:
      | dt         | 1646318698 |
      | sunrise    | 1646306882 |
      | sunset     | 1646347929 |
      | temp       | 282.21     |
      | feels_like | 278.41     |
      | pressure   | 1014       |

    And current weather details are:
      | id   | 802    |
      | main | Clouds |
