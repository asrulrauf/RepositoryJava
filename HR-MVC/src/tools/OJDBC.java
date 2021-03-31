/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import daos.EmployeeDAO;
import daos.RegionDAO;
import icontrollers.IRegionController;
import idaos.IEmployeeDAO;
import idaos.IRegionDAO;
import java.util.Date;
import models.Employee;
import models.Region;
import views.JIRegionView;
import views.MainFrame;

/**
 *
 * @author Okala
 */
public class OJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
//        java.util.Date date = new java.util.Date();
//        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
//        new MainFrame().setVisible(true);
        DBConnection connection = new DBConnection();
//        System.out.println(connection.getConnection());
////        IEmployeeDAO iedao = new EmployeeDAO(connection.getConnection());
        IRegionDAO irdao = new RegionDAO(connection.getConnection());
        
//        for (Region region : irdao.getAll()) {
//            System.out.println(region.getName());
//        }
//        System.out.println("=========");
//        for (Region region : irdao.getData("fal", false)) {
//            System.out.println(region.getName());
//        }
////        IRegionController icr = new RegionController(connection.getConnection());
//
//        //Check Connection
////        System.out.println(connection.getConnection());
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
////        DAO
//        //Insert
//        Region r = new Region(12345, "fala");
//        System.out.println(irdao.save(r));

        //View
//        for (Employee employee : iedao.search("211")) {
//            System.out.println(employee.getId());
//            System.out.println(employee.getFirst_name());
//            System.out.println(employee.getLast_name());
//            System.out.println(employee.getEmail());
//            System.out.println(employee.getPhone_number());
//            System.out.println(employee.getHire_date());
//            System.out.println(employee.getJob());
//            System.out.println(employee.getCommission_pct());
//            System.out.println(employee.getManager());
//            System.out.println(employee.getDepartment());
//        }
//        
//        for (Region region : irdao.getById(1)) {
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
        //Update
//        Region region = new Region(111, "Oka Lanang Akbar");
//        System.out.println(irdao.update(region));
        //Delete
//        System.out.println(irdao.delete(111));
        //Search
//        System.out.println(irdao.search("eu"));
    }
}
