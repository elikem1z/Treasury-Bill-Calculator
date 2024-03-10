# Treasury-Bill Compounded Investment Calculator

## Overview

The Financial Planner program is a simple yet powerful tool designed to calculate the compounded investment value of a treasury over time. It is tailored for investors who wish to understand the growth of their investments considering annual interest rates, compounding intervals, regular contributions, and the total investment duration.
N.B. This is tailored towards the Ghanaian tresury bill system.

## Features

- **Compounded Interest Calculation:** Calculates the final value of an investment considering the compound interest effect.
- **Regular Contributions:** Allows for additional contributions to be made after the initial investment, starting from the second period.
- **Flexible Compounding:** Supports various compounding intervals per year, accommodating different investment plans.
- **Detailed Summary:** Provides the final investment value, total contributions made, and the interest earned over the investment duration.

## Technology

This project is implemented in Java, making it portable across platforms where Java is supported.

## Prerequisites

- Java Development Kit (JDK) 8 or higher

## Installation and Running the Program

1. **Install Java:** Ensure you have Java installed on your system. If not, download and install the JDK from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Download the Program:** Download the `FinancialPlanner.java` file to your local system.

3. **Compile the Program:**
   Open a terminal or command prompt in the directory where you downloaded the file and compile the program using the Java compiler:
   ```shell
   javac FinancialPlanner.java

4. **Run the Program**:
  After compilation, run the program with:
  ```java
  java FinancialPlanner
  ```


### Example Usage
```
Initial investment amount (¢): 10000
Annual interest rate (%): 5
Compounding intervals per year: 12
Contribution per period after the first (¢): 100
Investment duration in periods: 60
Final investment value (¢): 12345.67
Interest earned (¢): 678.90
```
