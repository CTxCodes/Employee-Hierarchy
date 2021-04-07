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
public class ProcessEmployeeDataClass {
    
    public void displayAllEmployeesDateClass(){
        SalariedEmployeeClass salariedEmployee = new SalariedEmployeeClass();
        BasePlusCommissionEmployee basePlusCommission = new BasePlusCommissionEmployee();
        HourlyEmployeeClass hourlyEmployee = new HourlyEmployeeClass();
        CommissionEmployee commissionEmployee = new CommissionEmployee();
        PieceWorker pieceWork = new PieceWorker();
        Date date = new Date();
        
        date.checkTheDayOfTheYear();
        salariedEmployee.enterSalaryForEmployee();
        basePlusCommission.displayBPCEmployee();
        hourlyEmployee.enterHourlyPay();
        commissionEmployee.enterCommissionEmployee();
        pieceWork.enterPieceWorkerWageAndPieces();
               
        Employee[] employees = new Employee[5];
        
        employees[0] = salariedEmployee;
        employees[1] = basePlusCommission;
        employees[2] = hourlyEmployee;
        employees[3] = commissionEmployee;
        employees[4] = pieceWork;
        
        
        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            
            if(currentEmployee.month == date.getMonth()){
                System.out.printf("%s %.2f%n", "Earnings with Bonus", currentEmployee.earnings() + 100.00);
            } 
        
        }

    }
    
}
