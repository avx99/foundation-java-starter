Feature: nominal scenarios for echo api

    Background:
        * url baseUrl

    Scenario: calling echo with missing body should fail
        Given path '/echo'
        When method post
        Then status 400

    Scenario: calling echo with valid payload should succeed
        Given path '/echo'
        And request { message: "Hello world" }
        When method post
        Then status 200
        And match response == { content: "Hello world" }


