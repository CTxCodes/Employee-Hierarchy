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


public class PieceWorker extends Employee {
    private double wage;
    private int pieces;
    
    
    Scanner input = new Scanner(System.in);
    
    PieceWorker(){
        
    }
    
    PieceWorker(String firstName, String lastName, String socialSecurityNumber, 
            double wage, int pieces,Date birthDate, int month, int day, int year){
        super(firstName, lastName, socialSecurityNumber, birthDate, month, day, year);
        
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage must be greater than 0.0");
        }
        
        if(pieces < 0){
            throw new IllegalArgumentException("You must have more than 0 pieces");
        }
        
        this.wage = wage;
        this.pieces = pieces;
  
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }    
    
    public void enterPieceWorkerWageAndPieces(){

        System.out.println("--------------");
        System.out.println("Now Entering Piece Worker Information");
        System.out.println("--------------");
        
        System.out.println("Enter first name of employee");
        firstName = input.next();
        
        System.out.println("Enter last name of employee");
        lastName = input.next();
        
        System.out.println("Enter social security Number");
        socialSecurityNumber = input.next();
 
        System.out.println("Enter pieceWorker wage");
        wage = input.nextDouble();
        System.out.println("Enter pieces for PieceWorker");
        pieces = input.nextInt();
        
         System.out.println("Enter birth month");
         month = input.nextInt();
         
         System.out.println("Enter birth day");
         day = input.nextInt();
         
         System.out.println("Enter birth year");
         year = input.nextInt();
         
         birthDate = new Date(month, day, year);
        
        
         
    }
    


    @Override
    public double earnings(){
        return getWage() * getPieces();
    }

    @Override
    public String toString(){
        return String.format("%n%s%n%s%n%s:%s%s: %.2f%n%s: %s%n%s %.2f%n%s: %s", "Piece Worker Employee Information", "----------",
                "Piece Worker", super.toString(), 
                "PieceWorker Wage", wage,
                "PieceWorker", pieces,
                "PieceWorker Earnings", this.earnings(),
                "Piece Worker Employee Birthday", birthDate);
    }
    
}
