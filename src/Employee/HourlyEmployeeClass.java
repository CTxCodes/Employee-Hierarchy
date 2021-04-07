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
public class HourlyEmployeeClass extends Employee {
  //  HourlyEmployeeClass employee = new HourlyEmployeeClass();
    
    private double hours;
    private double wage;
    private double pay;
    
    Scanner input = new Scanner(System.in);

    HourlyEmployeeClass( String firstName, String lastName, String socialSecurityNumber, double wage, double hours, Date birthDate, int month, int day, int year){
        super(firstName, lastName, socialSecurityNumber, birthDate, month, day, year);
        
        if (hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours need to be "
                    + "between 0 and 168");
        }
        
        
        if(wage < 7.25){
            throw new IllegalArgumentException("Wage must be larger than the "
                    + "minimum wage $7.25 per hour");
        }
        
        this.wage = wage;
        this.hours = hours;
    }
    
      HourlyEmployeeClass(){
        
    }
    public double getHours() {return hours;}

    public void setHours(double hours) {
        if (hours >= 0 || hours <= 168){
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Hours must bust be between 0 and 168");
        }
        
    }

    public double getWage() {return wage;}

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("wage must be a nonnegative number");
        } else {
            this.wage = wage;
        }
        
    }
    
  
    public double getPay(){
        return pay;
    }
    
    public void setPay(double pay){
        this.pay = pay;
    }
    
    public void enterHourlyPay(){
        System.out.println("--------------");
        System.out.println("Now Entering Hourly Employee Information");
        System.out.println("--------------");
        
        System.out.println("Enter first name of employee");
        firstName = input.next();
        
        System.out.println("Enter last name of employee");
        lastName = input.next();
        
        System.out.println("Enter social security Number");
        socialSecurityNumber = input.next();
        
        System.out.println("Enter Hours worked for Hourly employee");
        hours = input.nextDouble();
        System.out.println("Enter wage for hourly employee");
        wage = input.nextDouble();
        calculateHourlyPay();
        
        System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
        
    }
    
    private void calculateHourlyPay(){
        if(hours > 40.0){
            pay = wage * 40 + (wage * 1.5) * (hours - 40);
            
        }
        
        pay = hours * wage;
    }
    
 
   
    @Override
     public double earnings() { 
        if (getHours() <= 40) { // no overtime
           return getWage() * getHours();
        } 
        else {
           return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
     } 
    
    @Override
    public String toString(){
        return String.format("%n%s%n%s%n%s%s: %s%n%s: %s%n%s: %s%n%s: %s", "Hourly Employee Information","----------", 
                super.toString(),
                "Hours worked", hours,
                "Hourly wage", wage,
                "Hourly employee earnings", pay,
                "Hourly Employee Birthday", birthDate
        );
    }
    
}
