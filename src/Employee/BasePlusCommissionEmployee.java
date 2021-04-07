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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary; // base salary per week
    
    Scanner input = new Scanner(System.in);

    // six-argument constructor
    BasePlusCommissionEmployee( String firstName, String lastName, String socialSecurityNumber, 
            double grossSales, double commissionRate, double baseSalary, Date birthDate, int month, int day, int year) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthDate, month, day, year);
       // implicit call to Object's default constructor occurs here

     
       // if baseSalary is invalid throw exception
       if (baseSalary < 0.0) {  
          throw new IllegalArgumentException("Base salary must be >= 0.0");  
       }

       this.baseSalary = baseSalary;
    } 
    BasePlusCommissionEmployee(){
        
    }

    // set base salary 
    public void setBaseSalary(double baseSalary) {
       if (baseSalary < 0.0) { 
          throw new IllegalArgumentException("Base salary must be >= 0.0"); 
       }

       this.baseSalary = baseSalary; 

        }
    
    public double getBaseSalary(){return baseSalary;}
    
    
    public void displayBPCEmployee(){  
        
        System.out.println("--------------");
        System.out.println("Now Entering Base Plus Commission Employee Information");
        System.out.println("--------------");
        
        System.out.println("Enter first name of employee");
        firstName = input.next();
        
        System.out.println("Enter last name of employee");
        lastName = input.next();
        
        System.out.println("Enter social security Number");
        socialSecurityNumber = input.next();
        
        System.out.println("Enter Gross sales");
        grossSales = input.nextFloat();
        
        System.out.println("Enter Commission Rate");
        commissionRate = input.nextDouble();
        
        System.out.println("Enter base salary for base plus commission emloyee ");
        baseSalary = input.nextDouble();
        
        System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
        //System.out.println(this.toString() + "\nBPCE Earnings:" + this.earnings());
   }
    
  

   @Override
   public double earnings(){return getBaseSalary() + super.earnings();}
    
   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format(
         "%n%s%n%s%n%s: %s %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %s" , "Base Plus Commission Employee Information", "----------",
              "Employee Name", firstName, lastName,
              "Social Security Number", socialSecurityNumber,
              "base salary", baseSalary,
              "BasePlusCommissionEmployee Earnings", this.earnings(),
              "Base Plus Commission Employee Birthday", birthDate);
              
   }

}
