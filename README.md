# Sainsburys-Fruit-Retriever
This project has been created for Sainsbury's Software Engineering Test.

# Project Overview

This project has been devleoped for Sainsbury's, with the intentions of satisfying their Software Engineering Test. It is Java console application which scrapes a portion of the Sainsbury’s Groceries website.

## Getting Started
These instructions will explain how to run the project.

## Installing the Project

First of all, you will need to clone the project to your machine.


-> Open a terminal of some sort;


-> Go to a directory you want to install the software;


-> Type " git clone https://github.com/Dunnsk22/Sainsburys-Fruit-Retriever.git"

## Running the Project

There are several ways you can run this project, as described below:


->Import it into an IDE (Eclipse, IntelliJ) and run the main method located in 'package com.sainsburys.test.runner.Application Runner'. This will print the results into the console.


->Open a terminal and and type mvn exec:java -Dexec.mainClass="com.sainsburys.test.runner.ApplicationRunner" in the parent directory. The results will be printed on the terminal window.


->Open a terminal and type 'mvn test'. This will run the tests and present them in the terminal

## Project Dependencies 

 * Java 1.8 for development
 * TestNG - frame work for testing
 * Jsoup - HTML parsing
 * GSON for json parsing
 * Maven for project creation and building/testing



## How it was developed

The application was developed with scalability and simplicity in mind. By creating the code to be extensible as possible, it would allow further modification to be completed with ease. The main Objects are FreshFruit, FreshFruits which store product data and help with the json build. FreshFruit extends SainsburysProduct as it inherits lots of its variables.

FreshFruit is used to store a title, description, price and calorie count of each fresh fruit item. It also retrieves items from the DOM and stores them in its constructor, again inheriting from its superclass.

FreshFruits then has the job of storing of all the individual products so that JSON can be built and total prices calculated.

Gson was used to serialize and produce the json output. Gson is powerful and makes json parsing and building fairly simple.

TestNG allows tests to be driven via XML. It also allows HTML reports to be built for the testing

JSoup was chosen over Selenium as no particular DOM modification was needed i.e Pressing buttons, writing to textfields etc. It gives you the possibility to select elements using jQuery-like CSS selectors and provides a slick API to traverse the HTML DOM tree

## Tests

Two tests are provided in the project which cover the core functionality; Enabling the json is correct and generated; Calculating the price of all items on the page

## Commit History

There isnt that many commits. Please do not let this put you off. Didnt want to over-exagerate the commit's.'

## Thanks for the opportunity


