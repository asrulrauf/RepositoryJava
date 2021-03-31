/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Employee;
import Views.EmployeeView;

/**
 *
 * @author Ode
 */
public class EmployeeController {
    
    private Employee employee;
    private EmployeeView employeeView;
    
    public EmployeeController(Employee employee, EmployeeView employeeView){
        
        this.employee = employee;
        this.employeeView = employeeView;
    
    }
    
    public void createView(){
        
        employeeView.createData(employee.getName(), employee.getName(), employee.getAlamat());
    
    }
    
}
