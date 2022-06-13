@smoke
  Feature: user can click on sliders on home page

    Scenario: user clicks on nokia slider
      Given user clicks on first square to choose nokia slider
      When user clicks on slider
      Then user is navigated to nokia mobile web page


    Scenario: user clicks on iphone slider
      Given user clicks on second square to choose iphone slider
      When user clicks on slider
      Then user is navigated to iphone web page