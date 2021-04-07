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
    public class SalariedEmployeeClass extends Employee {
       
    private double salary;
    private double weeklyPay;
    
    Scanner input = new Scanner(System.in);
    
    SalariedEmployeeClass(String firstName, String lastName, String socialSecurityNumber, double salary, double weeklyPay, Date birthDate, int month, int day, int year ){
        super(firstName, lastName, socialSecurityNumber, birthDate, month, day, year);
       
        if(salary < 0){
           
            throw new IllegalArgumentException("Salary must be a nonnegative number");
       
        } else if (weeklyPay < 0.0){
         
            throw new IllegalArgumentException("Weekly salary must be Greater than 0.0");
        }
            this.salary = salary;
            this.weeklyPay = weeklyPay;
        
    }
    
    public double getSalary() {
        if(salary < 0){
            throw new IllegalArgumentException("Must be a positive number");
        }
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            throw new IllegalArgumentException("Salary must be a nonnegative number");
        } else {
           this.salary = salary;
        }
    }

    public double getWeeklyPay() {return weeklyPay;}

    public void setWeeklyPay(double weeklyPay) {
        if(weeklyPay < 0.0){
            throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
        }
        this.weeklyPay = weeklyPay;
    }
    
    SalariedEmployeeClass(){
        
    }
    
  
       public void enterSalaryForEmployee(){  
           
        System.out.println("--------------");
        System.out.println("Now Entering Salaried employee Information");
        System.out.println("--------------");
        
        System.out.println("Enter first name of employee");
        firstName = input.next();
        
        System.out.println("Enter last name of employee");
        lastName = input.next();
        
        System.out.println("Enter social security Number");
        socialSecurityNumber = input.next();
           
        System.out.println("Enter the employee's salary");
        salary = input.nextDouble();
        weeklyPay = salary / 52;
        
        System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
         
         
         
    }
       
   
       
       @Override
       public double earnings(){ return getWeeklyPay();}
    
    
    @Override
    public String toString(){
        return String.format("%n%s%n%s%n%s%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %s","Salaried Employee Information","----------", 
                super.toString(),
                "Salaried Employee pay", salary,
                "Weekly Pay", getWeeklyPay(),
                "Salaried Employee Earnings", this.earnings(),
                "Salaried Employee Birthday", birthDate);
    }
   
}
