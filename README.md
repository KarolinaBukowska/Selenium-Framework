# Selenium Framework

## Purpose 🎯
The Selenium Framework is designed to automate the testing of an ecommerce demo website: [LINK](https://ecommerce.tealiumdemo.com/)

### Test Cases Covered
**Login**
* User Login
* Login - Email Validation
* Login - Password Validation

**E2E**
* Guest Checkout (ongoing) 

### Limitations
While the Selenium Framework provides comprehensive test coverage, there are some limitations to consider:
* The demo website may not always load reliably, leading to intermittent test failures
* Changes to the HTML structure of the website may cause tests to fail unexpectedly

### Skills Demonstrated in This Repository 🛠️ 
The following skills are demonstrated through the implementation of the Selenium Framework:
* Utilizing loops to handle dynamic content on product pages
* Integrating the Jackson library for parsing JSON data
* Implementationg centralized Pages class, which serves as a repository for declaring and instantiating page classes through constructors
This approach enhances code readability and enables an easy access to methods and objects related to a specific page
* Locating web elements via css selectors and xpath expressions 
* Utilizing well-defined methods that enable concise and efficient execution of multiple actions within a single line of code in the test class
* Incorporating the use of constants to represent relative paths and URL, ensuring clarity and maintainability in the codebase by centralizing key values
* Setting up test environments using a centralized BaseTest class for a streamlined test setup
This class includes methods for initializing WebDriver instances, managing user data, verifying page URLs, and capturing screenshots upon test failure

## Files Overview 📁

### "data" package
The data package contains classes that are necessary for retrieving data from the JSON file

### "pages" package
The pages package contains classes representing different pages of the ecommerce website. Each page class encapsulates the functionality and elements of its respective page

### "tests" package
The tests package contains test classes that validate various functionalities of the ecommerce website using Selenium

### "testData" package
The testData package contains JSON file used for parsing data

## How to Run Tests

1. Clone the repository to your local machine
2. Ensure that the required dependencies, such as Selenium, testNG, Jackson and Lombok, are installed. For reference, take a look at the pom.xml file.
The dependencies will be automatically downloaded when you build the project with Maven

### Setting Up Demo User Credentials
To run the automated tests, you'll need to set up your own demo user credentials on the [demo site](https://ecommerce.tealiumdemo.com/). 
Follow these steps:

**1. Register a New User:**
* Navigate to the demo site
* Click on the "Create an Account" button
* Fill in the mandatory fields and click on the "Register" button

**2. Replace Placeholders in the JSON file:**
  * Go to the resource and then testData package
  * Select the UserData.json file
  * Replace these placeholders with your user's registered email address and password
 
Now you're ready to run the automated tests using your own demo user credentials

### Note on Chromedriver

In order to successfully run the tests, it is necessary to download the chromedriver.exe file [here](https://googlechromelabs.github.io/chrome-for-testing/).
Once the file is downloaded, you can place it inside of the resources directory in the project.
Ensure that you select the version of chromedriver.exe that corresponds to your Chrome browser version. 
