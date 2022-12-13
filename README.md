# Amazon_PW

# Amazon.in Playwright project

## Required Tools
- Java version 11
- IntelliJ
- Maven
- Good connection to Internet
- Google Chrome

## Problem Statement
1. Application should be executed on Google Chrome
2. Application should be platform independant
3. It should open [Amazon.in](https://www.amazon.in/ "Amazon.in")
4. Click on the Hamburger Menu
5. Scroll own and then Click on the TV, Appliances and Electronics link under Shop by Department section.
6. Then click on Televisions under Tv, Audio & Cameras sub section.
7. Scroll down and filter the results by Brand 'Samsung'.
8. Sort the Samsung results with price High to Low.
9. Click on the second highest priced item
10. Switch tab
11. Assert that "About this item" section is present and log this section text to console/report.

## Framwork Design
### Playwright Factory
In order to get the instances of playwrights
### Constants
Constants, URLs & other items for the verification
### Listeners
Extent Report Listeners
### Pages
Pages interaction
### Runner
TestNG XML
### Utility
Sorting & utilities
### Base Test
Navigation to base URL & closing playwright
### Tests
All the test cases classes are here

## Framework Execution
- Navigate to the project directory
- Open the Runner folders
- Execute the testng.xml file via IntelliJ
- Report will be available under *TestReport/TestExecutionReport.html*
