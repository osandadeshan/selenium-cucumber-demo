# Selenium Cucumber Demo

Cucumber code example - A custom framework that runs automated tests written in behaviour driven development (BDD) style.

## Cucumber Introduction:

Cucumber is a tool based on Behavior Driven Development (BDD) framework which is used to write acceptance tests for web application. It allows automation of functional validation in easily readable and understandable format (like plain English) to Business Analysts, Developers, Testers, etc. Cucumber feature files can serve as a good document for all. There are many other tools like JBehave which also support BDD framework. Initially Cucumber was implemented in Ruby and then extended to Java framework. Both the tools support native JUnit.

Behavior Driven Development is extension of Test Driven Development, and it's used to test the system rather than testing the particular piece of code.

Cucumber can be used along with Selenium, Watir, and Capybara etc. Cucumber supports many other languages like Perl, PHP, Python, .Net etc. In this tutorial I will concentrate on Cucumber with Java as a language.

***1) Feature Files:***

Feature files are essential part of cucumber which are used to write test automation steps or acceptance tests. This can be used as live document. The steps are the application specification. All the feature files ends with .feature extension.

***2) Scenario:***

Basically a scenario represents a particular functionality which is under test. By seeing the scenario user should be able to understand the intent behind the scenario and what the test is all about. Each scenario should follow given, when and then format. This language is called as “Gherkin”. Gherkin is designed to be easy to learn by non-programmers, yet structured enough to allow concise description of examples to illustrate business rules in most real-world domains.
In Gherkin, each line that isn't blank has to start with a Gherkin keyword, followed by any text you like. The main keywords are:

**Feature:** This gives information about the high level business functionality and the purpose of Application under test.

**Given:** As mentioned above, given specifies the pre-conditions. It is basically a known state.

**When:** This is used when some action is to be performed. As in above example we have seen when the user tries to log in using username and password, it becomes an action.

**Then:** The expected outcome or result should be placed here. For Instance: verify the login is successful, successful page navigation.
Background: Whenever any step is required to perform in each scenario then those steps needs to be placed in Background. For Instance: If user needs to clear database before each scenario then those steps can be put in background.

**And:** And is used to combine two or more same type of action.

***3) Runner:***

To run the specific feature file cucumber uses standard Junit Runner and specify tags in @Cucumber. Options. Multiple tags can be used, separated by comma. 

## How to run tests

Execute ***`mvn clean test`*** on the terminal

After the execution is completed, you will be able to see the report at "***target/cucumber-reports/report.html***"
