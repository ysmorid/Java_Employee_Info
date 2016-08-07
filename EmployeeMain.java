/*
 * Ylia Moridzadeh
 * The main class creates a ProductionWorker object per employee,
 * asks the user to input data for each employee, then displays the information.
 */

import java.io.*;                //To create FileWriter Object
import java.text.DecimalFormat;  //To format rate of pay
import java.util.*;              //To create scanner object

public class EmployeeMain
{

   public static void main(String[] args) throws IOException
   {
      final int maxEmployees = 3;      //maximum number of employees
      String userInput;  //stores data scanned in from user
      //array of objects per employee
      ProductionWorker[] employees = new ProductionWorker[maxEmployees];

      Scanner keyboard = new Scanner(System.in); //object to scan in user input
      DecimalFormat money = new DecimalFormat("#0.00"); //object to format hourly rate

      //loop to store data for each employee in array
      for(int i = 0; i < employees.length; i++)
      {
         //initializes array by creating new ProductionWorker object
         employees[i] = new ProductionWorker();
         StatementOutput("Please enter employee #" + (i+1) + "'s first name: ");
         userInput = keyboard.nextLine();
         StatementOutput(userInput);
         String first = userInput;
         StatementOutput("Please enter their last name: ");
         userInput = keyboard.nextLine();
         StatementOutput(userInput);
         String last = userInput;
         employees[i].setName(first, last);

         StatementOutput("Please provide their identification number in the form of"
            + "###-L, where # is a number from 0-9 and L is a letter from a-m.");
         userInput = keyboard.nextLine();
         StatementOutput(userInput);
         employees[i].setNumber(userInput);

         StatementOutput("Please enter thier hire date in the form of MMM-DD-YYYY.");
         userInput = keyboard.nextLine();
         StatementOutput(userInput);
         employees[i].setHireDate(userInput);

         StatementOutput("Please enter 1 if they work day shift and 2 if they work"
            + " night shift.");
         userInput = keyboard.nextLine();
         int inputToInt = Integer.parseInt(userInput); //converts userInput as integer
         StatementOutput(userInput);
         employees[i].setShift(inputToInt);

         StatementOutput("Please enter their hourly rate of pay: ");
         userInput = keyboard.nextLine();
         StatementOutput(userInput);
         //converts userInput to double
         double inputToDouble = Double.parseDouble(userInput);
         employees[i].setRate(inputToDouble);
         StatementOutput("");
      }

      //loop to display information for each employee in array
      for(int j = 0; j < employees.length; j++)
      {
         StatementOutput("Employee #" + (j+1) + "'s name is "
            + employees[j].getName() + ".");
         StatementOutput("Their employeee number is "
            + employees[j].getNumber() + ".");
         StatementOutput("Their hire date was "
            + employees[j].getHireDate() + ".");
         //displays whether they work the day or night shift based on the integer returned
         if(employees[j].getShift() == 1)
         {
            StatementOutput("They work the day shift.");
         }
         else if(employees[j].getShift() == 2)
         {
            StatementOutput("They work the night shift.");
         }
         StatementOutput("Their hourly rate of pay is $"
            + money.format(employees[j].getRate()) + ".");
         StatementOutput("");
      }
   }

   //Displays all statements, user input and duplicates data into an output file
   public static void StatementOutput(String sentence) throws IOException
   {
      //Create an output file to store user data and results
      FileWriter Assignment11Output = new FileWriter("C:\\Users\\Devi\\Google " +
         "Drive\\School\\Computer Science\\Homework\\Assignment11\\" +
         "Assignment11 Output.txt", true);
      PrintWriter outputFile = new PrintWriter(Assignment11Output);

      //Displays system message as well as sending to output file
      System.out.println(sentence);
      outputFile.println(sentence);

      outputFile.close();
   }
}