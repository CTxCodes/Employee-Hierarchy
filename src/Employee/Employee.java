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
public abstract class Employee {
    
    protected String firstName ;
    protected String lastName ;
    protected String socialSecurityNumber ;
    protected Date birthDate;
    protected int month;
    protected int day;
    protected int year;
    

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    Scanner rinput = new Scanner(System.in);
    
     public Employee(String firstName, String lastName, 
             String socialSecurityNumber, Date birthDate, int month, int day, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = new Date(month, day, year);
        
        
    }  
     
     public Employee(){
        
    }
    
    
    public String getSocialSecurityNumber() {return socialSecurityNumber;}


    public String getFirstName() {return firstName;}
  
  
    public String getLastName() {return lastName;}


     public void runEmployeeHierarchy(){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter Employee First Name");
         firstName = input.next();
         System.out.println("Enter Employee Last name");
         lastName = input.next();
         System.out.println("Enter social Security Number");
         socialSecurityNumber = input.next();
         
         System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
         
         
    }
    
      
    
    @Override
    public String toString(){
         return String.format("%s: %s %s%n%s: %s%n", 	
           "Employee Name", firstName, lastName,
           "social security number", socialSecurityNumber
           );
     
    }
    

    
    public abstract double earnings();

}
