/*
 * Ylia Moridzadeh
 * This child class expands upon the parent Employee class by
 * adding hire date and shift.
 */

public class ProductionWorker extends Employee
{
   private int shift;       //Stores what shift (1-day, 2-night) employee works
   private double payRate;  //Stores hourly pay rate of employee

   //Initializing no-args constructor
   public ProductionWorker()
   {
      super();
   }

   /**
    * Constructor that retrieves values from parent class Employee as well as
    * from main class for private fields
    * @param name - Employee class employee name
    * @param num - Employee class employee identification number
    * @param date - Employee class employee hire date
    * @param time - Main class shift employee works
    * @param rate - Main class hourly rate of pay
    */
   public ProductionWorker(String name, String num, String date, int time, double rate)
   {
      super(name, num, date);
      shift = time;
      payRate = rate;
   }

   //Assigns day or night shift from Main class
   public void setShift(int schedule)
   {
      shift = schedule;
   }

   //Returns 1 for day shift, 2 for night shift
   public int getShift()
   {
      return shift;
   }

   //Assigns hourly pay rate of employee from Main class
   public void setRate(double pay)
   {
      payRate = pay;
   }

   //Returns hourly pay as a string.
   public double getRate()
   {
      return payRate;
   }
}
