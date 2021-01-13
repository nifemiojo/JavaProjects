# Payroll System Modification
Framework for the payroll system was provided.

## Task
Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month. Create an array of Employee variables to store references to the various employee objects. In a loop, calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s payroll amount if the current month is the one in which the Employee’s birthday occurs.

## My code
Employee.java:
-Added private instance variable birthDate, included its initialisation in the existing constructor
-Public get method to access the value of the private birthDate field
-Implicit string conversion (toString method) also includes date of birth

Date.java:
-Added public get method to access value for private month field

SalariedEmployee, CommissionEmployee, BasePlusCommissionEmployee, Hourly Employee:
-Correctly added in birthDate parameter to constructor method and also as an argument to the superclass constructor

PayrollSystemTest.java:
-Correctly initialsed the employee objects with new constructors
-Created an array of months
-Loops through each month of the year, polymorphically determining if the employee's birthday is the current month (Lines 54-81)
-Adds 100 to earnings if it is employee's birth month
-No birthdays, prints out no birthday's this month