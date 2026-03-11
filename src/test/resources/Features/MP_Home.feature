Feature:To Validate the Home Page Functions
#Background:

#Given Openening Chorme Browser 

#When  Navigate to Medplus Url




@smoke @regression
Scenario:To Validated Title of the page

Then  Validated the Title

#And Close the Browser
@sanity @regression
Scenario:To Validated Search The Feature
And Click Search Textbar

Then Enter "DOLO 650MG TAB" in Search

#And Close the Browser

@sanity
Scenario Outline:Enter To validate Mutliple DrugNames

And Click Search Textbar
When Enter "<DrugsNames>" in the SearchBox 
Examples:
    |DrugsNames|
    |VOLINI 100GM SPRAY|
    |PROTEININA MOM ELACHI 200GM POWDER|
    |NESTLE CERELAC FORTIFIED BABY CEREAL WITH MILK, MULTIGRAIN & FRUITS - STAGE 4 300 GM|
    |KZ PLUS MEDICATED|



