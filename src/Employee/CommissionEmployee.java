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
public class CommissionEmployee extends Employee {

    protected double grossSales;
    protected double commissionRate;
    
    Scanner input = new Scanner(System.in);
    
   
  CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, Date birthDate, int month, int day, int year){
        super(firstName, lastName, socialSecurityNumber, birthDate, month, day, year);
        
        if (grossSales < 0.0) {
           throw new IllegalArgumentException("Gross sales must be >= 0.0");
        } 
        
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
           throw new IllegalArgumentException(
              "Commission rate must be > 0.0 and < 1.0");
        } 
        
         this.grossSales = grossSales;
         this.commissionRate = commissionRate;
        
    }  
  
    CommissionEmployee(){
        
    }
      public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be greater than"
                    + "than or equal to 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {return commissionRate;}
    

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("CommissionRate must be > 0 or < 1.0");
        }
        this.commissionRate = commissionRate;
    }
    
    
    
    //START OF METHODS
    public void enterCommissionEmployee(){
        System.out.println("--------------");
        System.out.println("Now Entering Commission Employee Information");
        System.out.println("--------------");
        
        System.out.println("Enter first name of employee");
        firstName = input.next();
        
        System.out.println("Enter last name of employee");
        lastName = input.next();
        
        System.out.println("Enter social security Number");
        socialSecurityNumber = input.next();
            
        System.out.println("Enter the gross Sales for the employee");
        grossSales = input.nextDouble();
        
        System.out.println("Enter the commission rate for the employee");
        commissionRate = input.nextDouble();
        
        System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
            
    }
    
    
    
    @Override
    public double earnings(){return  getCommissionRate() * getGrossSales();}

       
     @Override // indicates that this method overrides a superclass method
    public String toString() {
 
        return String.format("%n%s%n%s%n%s%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %s", "Commission Employee Information","----------",
                super.toString(),
           "gross sales", grossSales, 
           "commission rate", commissionRate,
           "Commission Employee Earnings", this.earnings(),
           "Commission Employee Birthday", birthDate);
    }

}
