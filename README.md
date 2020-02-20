# Cucumber project, featuring Java and JUnit

This is sample project for cucumber demo. This includes following features
1. Cucumber Reporting using "net.masterthought cucumber-reporting" library
2. Cucumber Reporting using Trivago Library  
2. Cucumber Data Table Usage 

## Usage

To make simple run of Cucumber tests 

Open a command window and run:

    mvn clean test

This runs Cucumber features using Cucumber's JUnit runner. 

## To run tests and generate reports using Trivago Plugin

   mvn clean test  cluecumber-report:reporting
   
   Reports are generated under ${project.build.dir}/target/generated-report

## To generate reports using net.masterthought library

Run the tests

    mvn clean test

Run the class ReportGenerator.java as main class.

   Reports are generated ${project.build.dir}/target/pretty-report/cucumber-html-reports/ 



