Feature: nominal scenarios for echo api

    Background:
        * url baseUrl

    Scenario: echo
        Given path '/echo'
        And request { message: "Hello world" }
        When method post
        Then status 200
        And match response == { message: "Hello world" }


