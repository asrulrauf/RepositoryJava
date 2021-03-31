/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.Scanner;

/**
 *
 * @author Ode
 */
public class EmployeeView {
    
    public void createData(String nik, String employeeName, String alamat){
        
        Scanner inputData = new Scanner(System.in);
        
        System.out.println("=========Data Employee==========");       
        System.out.println("NIK : ");
        nik = inputData.nextLine();        
        System.out.println("Name : ");
        employeeName = inputData.nextLine();
        System.out.println("Alamat : ");
        alamat = inputData.nextLine();        
        System.out.println("=========Output==========");
        System.out.println("NIK : " +nik);
        System.out.println("Name : " +employeeName);
        System.out.println("Alamat : " +alamat);
        System.out.println("=========Thank's==========");
        
    }
}
