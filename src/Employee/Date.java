/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author cjt1496
 */
import java.util.Scanner;
public class Date {
    
    private int month;
    private int day;
    private int year;
    
    
    
    Scanner input = new Scanner(System.in);
    
    private static final int[] daysPerMonth = 
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date(int month, int day, int year) {
         // check if month in range
         if (month <= 0 || month > 12) {
            throw new IllegalArgumentException ("month (" + month + ") must be 1-12" );
         }

         // check if day in range for month
         if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
               ") out-of-range for the specified month and year");
         }
         

         // check for leap year if month is 2 and day is 29
         if (month == 2 && day == 29 && !(year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +  ") out-of-range for the specified month and year");
         }

         this.month = month;
         this.day = day;
         this.year = year;

         //System.out.printf("Date object constructor for date %s%n", this);
      }
    
        Date(){

        }
    
        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    
        
        public void checkTheDayOfTheYear(){
            System.out.println("Get Ready to calculate payroll with $100 bonus");
            
            System.out.println("Enter the current Month...");
            month = input.nextInt();
            
            System.out.println("Enter the current day...");
            day = input.nextInt();
            
            System.out.println("Enter the current year...");
            year = input.nextInt();
            
            // check if month in range
         if (month > 12 || month <= 0) {
            throw new IllegalArgumentException ("month (" + month + ") must be 1-12" );
         }

         // check if day in range for month
         if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
               ") out-of-range for the specified month and year");
         }

         // check for leap year if month is 2 and day is 29
         if (month == 2 && day == 29 && !(year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +  ") out-of-range for the specified month and year");
         }
         System.out.println("");
         System.out.println(this.toString());
        }
      
    
     

    @Override
         public String toString() {
            return String.format("%d/%d/%d", month, day, year);  
      }
         
    

 
    
    
}
