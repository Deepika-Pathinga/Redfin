$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Refin.feature");
formatter.feature({
  "line": 1,
  "name": "Redfin Application",
  "description": "",
  "id": "redfin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"\u003ctestName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using homePageTitle",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003ccityName\u003e\" in searchbox and press the enter button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"\u003cSelectionFromPopUp\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"\u003cestatePageHeader\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"\u003ccityName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"\u003cMinPriceIndex\u003e\" and max price as \"\u003cMaxPriceIndex\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"\u003csearchResult\u003e\", if no homes listed throw an errorMessage",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Usecase \"\u003ctestName\u003e\" completed",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "redfin-application;usecase1;",
  "rows": [
    {
      "cells": [
        "testName",
        "cityName",
        "SelectionFromPopUp",
        "estatePageHeader",
        "MinPriceIndex",
        "MaxPriceIndex",
        "searchResult"
      ],
      "line": 18,
      "id": "redfin-application;usecase1;;1"
    },
    {
      "cells": [
        "test1",
        "Sunnyvale",
        "https://www.redfin.com/city/19457/CA/Sunnyvale",
        "Sunnyvale Real Estate",
        "25",
        "3",
        "/CA/Sunnyvale/"
      ],
      "line": 19,
      "id": "redfin-application;usecase1;;2"
    },
    {
      "cells": [
        "test2",
        "Sunnyvale",
        "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
        "Sunnyvale Real Estate",
        "1",
        "6",
        "/TX/Dallas"
      ],
      "line": 20,
      "id": "redfin-application;usecase1;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 19360192800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"test1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using homePageTitle",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Sunnyvale\" in searchbox and press the enter button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"https://www.redfin.com/city/19457/CA/Sunnyvale\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"Sunnyvale Real Estate\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"Sunnyvale\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"25\" and max price as \"3\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"/CA/Sunnyvale/\", if no homes listed throw an errorMessage",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Usecase \"test1\" completed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 40
    }
  ],
  "location": "RedfinStepDefinitions.the_redfin_application_is_launched_for(String)"
});
formatter.result({
  "duration": 485650800,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinitions.verify_the_home_page_using_homePageTitle()"
});
formatter.result({
  "duration": 155032900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 11
    }
  ],
  "location": "RedfinStepDefinitions.enter_the_in_searchbox_and_press_the_enter_button(String)"
});
formatter.result({
  "duration": 458213800,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinitions.validate_pop_up_appears()"
});
formatter.result({
  "duration": 603160100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/city/19457/CA/Sunnyvale",
      "offset": 32
    }
  ],
  "location": "RedfinStepDefinitions.on_the_pop_up_select_the_entry(String)"
});
formatter.result({
  "duration": 8734286000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale Real Estate",
      "offset": 40
    }
  ],
  "location": "RedfinStepDefinitions.verify_the_city_Real_Estate_page_using(String)"
});
formatter.result({
  "duration": 3405691500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 48
    }
  ],
  "location": "RedfinStepDefinitions.assert_the_Search_box_on_the_top_left_side_has(String)"
});
formatter.result({
  "duration": 5741925100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 25
    },
    {
      "val": "3",
      "offset": 47
    }
  ],
  "location": "RedfinStepDefinitions.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 16582128700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/CA/Sunnyvale/",
      "offset": 38
    }
  ],
  "location": "RedfinStepDefinitions.verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String)"
});
formatter.result({
  "duration": 402968500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1",
      "offset": 9
    }
  ],
  "location": "RedfinStepDefinitions.usecase_completed(String)"
});
formatter.result({
  "duration": 279900,
  "status": "passed"
});
formatter.after({
  "duration": 2177885000,
  "status": "passed"
});
formatter.before({
  "duration": 18882192700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "UseCase1",
  "description": "",
  "id": "redfin-application;usecase1;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the redfin application is launched for \"test2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the home page using homePageTitle",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Sunnyvale\" in searchbox and press the enter button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "validate pop up appears",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the pop up select the entry \"https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify the city Real Estate page using \"Sunnyvale Real Estate\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "assert the Search box on the top left side has \"Sunnyvale\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Select the min price as \"1\" and max price as \"6\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify all the homes listed are from \"/TX/Dallas\", if no homes listed throw an errorMessage",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Usecase \"test2\" completed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test2",
      "offset": 40
    }
  ],
  "location": "RedfinStepDefinitions.the_redfin_application_is_launched_for(String)"
});
formatter.result({
  "duration": 427400,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinitions.verify_the_home_page_using_homePageTitle()"
});
formatter.result({
  "duration": 26367500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 11
    }
  ],
  "location": "RedfinStepDefinitions.enter_the_in_searchbox_and_press_the_enter_button(String)"
});
formatter.result({
  "duration": 684006200,
  "status": "passed"
});
formatter.match({
  "location": "RedfinStepDefinitions.validate_pop_up_appears()"
});
formatter.result({
  "duration": 205738200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
      "offset": 32
    }
  ],
  "location": "RedfinStepDefinitions.on_the_pop_up_select_the_entry(String)"
});
formatter.result({
  "duration": 7990509600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale Real Estate",
      "offset": 40
    }
  ],
  "location": "RedfinStepDefinitions.verify_the_city_Real_Estate_page_using(String)"
});
formatter.result({
  "duration": 1088304000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 48
    }
  ],
  "location": "RedfinStepDefinitions.assert_the_Search_box_on_the_top_left_side_has(String)"
});
formatter.result({
  "duration": 201771700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 25
    },
    {
      "val": "6",
      "offset": 46
    }
  ],
  "location": "RedfinStepDefinitions.select_the_min_price_as_and_max_price_as(String,String)"
});
formatter.result({
  "duration": 16502363500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/TX/Dallas",
      "offset": 38
    }
  ],
  "location": "RedfinStepDefinitions.verify_all_the_homes_listed_are_from_if_no_homes_listed_throw_an_errorMessage(String)"
});
formatter.result({
  "duration": 118047700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test2",
      "offset": 9
    }
  ],
  "location": "RedfinStepDefinitions.usecase_completed(String)"
});
formatter.result({
  "duration": 226500,
  "status": "passed"
});
formatter.after({
  "duration": 1030932900,
  "status": "passed"
});
});