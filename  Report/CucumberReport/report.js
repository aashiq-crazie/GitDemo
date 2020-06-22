$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing hotel booking and cancellation functionalites in adactin application",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the \"\u003cUsername\u003e\" valid username",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the \"\u003cPassword\u003e\" valid password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 17,
      "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;1"
    },
    {
      "cells": [
        "Crazie",
        "a1s1a1"
      ],
      "line": 18,
      "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;2"
    },
    {
      "cells": [
        "Craziequeen",
        "b1v2b1"
      ],
      "line": 19,
      "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;3"
    },
    {
      "cells": [
        "PavithraN",
        "Pavi@2426"
      ],
      "line": 20,
      "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 453900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 156792600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 101900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the \"Crazie\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the \"a1s1a1\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 2488740200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Crazie",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 189917200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a1s1a1",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 140027500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_login_button()"
});
formatter.result({
  "duration": 537141101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 190501,
  "status": "passed"
});
formatter.after({
  "duration": 413501,
  "status": "passed"
});
formatter.before({
  "duration": 193600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 120900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 206300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the \"Craziequeen\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the \"b1v2b1\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 283950301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Craziequeen",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 183332600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "b1v2b1",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 130146500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_login_button()"
});
formatter.result({
  "duration": 406573100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 76100,
  "status": "passed"
});
formatter.after({
  "duration": 103800,
  "status": "passed"
});
formatter.before({
  "duration": 171300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 153000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 87100,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Checking the valid username and password for login function",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;checking-the-valid-username-and-password-for-login-function;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the \"PavithraN\" valid username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the \"Pavi@2426\" valid password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the login button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "It lands to the homepage successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 306635699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PavithraN",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 162067199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pavi@2426",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 118296001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_login_button()"
});
formatter.result({
  "duration": 3504545099,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_homepage_successfully()"
});
formatter.result({
  "duration": 206700,
  "status": "passed"
});
formatter.after({
  "duration": 238600,
  "status": "passed"
});
formatter.before({
  "duration": 225299,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 203401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 180900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User searching the required hotel for lovable stay",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-searching-the-required-hotel-for-lovable-stay",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User select the required location",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User select the number of rooms",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User mentioning checkin date",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User mentioning checkout date",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User selecting adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User enter the search button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "It lands to the nextpage succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_the_required_location()"
});
formatter.result({
  "duration": 163799999,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_number_of_rooms()"
});
formatter.result({
  "duration": 171992900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_checkin_date()"
});
formatter.result({
  "duration": 82279299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_checkout_date()"
});
formatter.result({
  "duration": 67452000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selecting_adults_per_room()"
});
formatter.result({
  "duration": 166521800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_search_button()"
});
formatter.result({
  "duration": 1222404600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_nextpage_succesfully()"
});
formatter.result({
  "duration": 122500,
  "status": "passed"
});
formatter.after({
  "duration": 65499,
  "status": "passed"
});
formatter.before({
  "duration": 136800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 112700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 47300,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User selecting hotel in that specific location",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-selecting-hotel-in-that-specific-location",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User select his favourite hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User enter the continue button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "It lands to the nextpage succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_select_his_favourite_hotel()"
});
formatter.result({
  "duration": 159984001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_continue_button()"
});
formatter.result({
  "duration": 831955401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_the_nextpage_succesfully()"
});
formatter.result({
  "duration": 93399,
  "status": "passed"
});
formatter.after({
  "duration": 43500,
  "status": "passed"
});
formatter.before({
  "duration": 97899,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 64300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 266100,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "User mentioning details to book the hotel",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-mentioning-details-to-book-the-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User mentioning \"Aashiq\" firstname",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User mentioning \"crazie\" lastname",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "User mentioning billing address",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User mentioning creditcard number",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User selecting creditcard type",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User mentioning month of expiry",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user mentioning year of expiry",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User mentioning the cvv number",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User enter the booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "It lands to nextpage succesfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Aashiq",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_mentioning_firstname(String)"
});
formatter.result({
  "duration": 132311000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "crazie",
      "offset": 17
    }
  ],
  "location": "StepDefinition.user_mentioning_lastname(String)"
});
formatter.result({
  "duration": 91168800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_billing_address()"
});
formatter.result({
  "duration": 224776801,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_creditcard_number()"
});
formatter.result({
  "duration": 165574501,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selecting_creditcard_type()"
});
formatter.result({
  "duration": 148562101,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_month_of_expiry()"
});
formatter.result({
  "duration": 129279900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_year_of_expiry()"
});
formatter.result({
  "duration": 100147399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_mentioning_the_cvv_number()"
});
formatter.result({
  "duration": 102705600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_the_booknow_button()"
});
formatter.result({
  "duration": 114536001,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_nextpage_succesfully()"
});
formatter.result({
  "duration": 61200,
  "status": "passed"
});
formatter.after({
  "duration": 34799,
  "status": "passed"
});
formatter.before({
  "duration": 48000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 35399,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 27001,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "User validating booking confirmation page",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-validating-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@BookingConfirmartion"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User enter the myitenary button",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "It lands to nextpage succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_myitenary_button()"
});
formatter.result({
  "duration": 8861524900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_lands_to_nextpage_succesfully()"
});
formatter.result({
  "duration": 50801,
  "status": "passed"
});
formatter.after({
  "duration": 45500,
  "status": "passed"
});
formatter.before({
  "duration": 76300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 44900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 39100,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "User selecting hotel for cancellation",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-selecting-hotel-for-cancellation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@CancelHotel"
    }
  ]
});
formatter.step({
  "line": 58,
  "name": "User selecting reqiured hotel to cancel",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_selecting_reqiured_hotel_to_cancel()"
});
formatter.result({
  "duration": 339667400,
  "status": "passed"
});
formatter.after({
  "duration": 141600,
  "status": "passed"
});
formatter.before({
  "duration": 187500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 123900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 145400,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "User entering cancelbutton and confirming the cancellation",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-entering-cancelbutton-and-confirming-the-cancellation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@CancelConfirmation"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User enter the cancel button",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "user confirming the cancellation",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "It loads to nextpage succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_cancel_button()"
});
formatter.result({
  "duration": 51499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirming_the_cancellation()"
});
formatter.result({
  "duration": 59342100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_loads_to_nextpage_succesfully()"
});
formatter.result({
  "duration": 105500,
  "status": "passed"
});
formatter.after({
  "duration": 117499,
  "status": "passed"
});
formatter.before({
  "duration": 128399,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "goes to landing page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_is_logged_in()"
});
formatter.result({
  "duration": 102400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.goes_to_landing_page()"
});
formatter.result({
  "duration": 73300,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "User logout the page",
  "description": "",
  "id": "testing-hotel-booking-and-cancellation-functionalites-in-adactin-application;user-logout-the-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "User enter the logoutbutton",
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "It loads to final page succefully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enter_the_logoutbutton()"
});
formatter.result({
  "duration": 2585348600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_loads_to_final_page_succefully()"
});
formatter.result({
  "duration": 34501,
  "status": "passed"
});
formatter.after({
  "duration": 99900,
  "status": "passed"
});
});