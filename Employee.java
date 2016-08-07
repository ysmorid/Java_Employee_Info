/*
 * Ylia Moridzadeh
 * This parent class holds the Employee name, employee number
 * and employee hire date, which is sent from the main class.
 */

public class Employee
{
   private String name;      //Stores the employee's name.
   private String number;    //Stores the employee's identification number.
   private String hireDate;  //Stores the employee's hire date.

   //Initializing no-args constructor
   public Employee()
   {
      name = "";
      number = "";
      hireDate = "";
   }

   /**
    * Constructor that retrieves & assigns values from Main class
    * @param empName - employee name
    * @param empNum - employee identification number
    * @param empHired - date employee was hired
    */
   public Employee(String empName, String empNum, String empHired)
   {
      name = empName;
      number = empNum;
      hireDate = empHired;
   }

   //Assigns a value sent from Main class to variable name
   public void setName(String first, String last)
   {
      String firstName = first;
      String lastName = last;
      name = first + " " + last;
   }

   //Returns name value
   public String getName()
   {
      return name;
   }

   //Assigns a value sent from Main class to variable number
   public void setNumber(String employeeNumber)
   {
      number = employeeNumber;
   }

   //Returns number value
   public String getNumber()
   {
      return number;
   }

   //Assigns a value sent from Main class to variable hireDate
   public void setHireDate(String employeeHireDate)
   {
      hireDate = employeeHireDate;
   }

   //returns hireDate value
   public String getHireDate()
   {
      return hireDate;
   }
}
