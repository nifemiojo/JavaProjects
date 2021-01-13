// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      // create subclass objects
      Date birthDate = 
         new Date(9, 4, 1989);
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111", birthDate, 800.00);

      birthDate = 
         new Date(12, 01, 1975);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222", birthDate, 16.75, 40);
      
      birthDate = 
         new Date(4, 18, 1991);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", birthDate, 10000, .06);

      birthDate = 
         new Date(10, 28, 1987);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", birthDate, 5000, .04, 300);

      // System.out.println("Employees processed individually:");
      
      // System.out.printf("%n%s%n%s: $%,.2f%n%n", 
      //    salariedEmployee, "earned", salariedEmployee.earnings());
      // System.out.printf("%s%n%s: $%,.2f%n%n",
      //    hourlyEmployee, "earned", hourlyEmployee.earnings());
      // System.out.printf("%s%n%s: $%,.2f%n%n",
      //    commissionEmployee, "earned", commissionEmployee.earnings());
      // System.out.printf("%s%n%s: $%,.2f%n%n", 
      //    basePlusCommissionEmployee, 
      //    "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

      for(int i = 1; i < 13; i++)
      {
         int birthdayCounter = 0;
         System.out.printf("Current Month: %s%n", months[i-1]);
         // generically process each element in array employees
         for (Employee currentEmployee : employees) 
         {
            // determine whether element is a BasePlusCommissionEmployee
            if (currentEmployee.getDateOfBirth().getMonth() == i) 
            {
               birthdayCounter++;
               System.out.println(currentEmployee); // invokes toString

               double totalEarnings = currentEmployee.earnings() + 100.00;
   
               System.out.printf(
                  "Normal earnings: $%.2f%nEarnings with $100 birthday bonus: $%.2f%n%n",
                  currentEmployee.earnings(), totalEarnings);
            }
         } 
         if(birthdayCounter == 0)
         {
            System.out.println("No employee birthdays.");
            System.out.println();
         }
      }
      

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, 
            employees[j].getClass().getName()); 
   } // end main
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
