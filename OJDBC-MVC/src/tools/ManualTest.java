/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.RegionDao;
import idaos.IRegionDao;
import models.Employee;
import models.Region;

/**
 *
 * @author User
 */
public class ManualTest {

    public static void main(String[] args) {
        
        //Instansiasi Database
        DBConnection connection = new DBConnection();
        System.out.println(connection);
        
        System.out.println("=====================================");
        System.out.println("===========TES IRegionDAO============");
        System.out.println("=====================================");
        
        //Instansiasi IRegionDao 
        IRegionDao iRegionDao = new RegionDao(connection.getConnection());

        
        //Tes Model Region dengan Constructor kosong
        Region region = new Region();
        region.setId(0);
        region.setName("Buton City");
        System.out.println(region.getId() + " " + region.getName());
        
        System.out.println("=====================================");

        //Tes Model Region dengan Constructor berparameter
        Region region1 = new Region(1, "Kota Baubau");
        System.out.println(region1.getId() + " " + region1.getName());
        
        System.out.println("=====================================");

        //Tes getAll()
        for (Region region2 : iRegionDao.getAll()) {
            System.out.println(region2.getId());
            System.out.println(region2.getName());
        }
        
        System.out.println("=====================================");
        
        //Tes getById
        for (Region region3 : iRegionDao.getById(5)) {
            System.out.println(region3.getId());
            System.out.println(region3.getName());
        }
        
        System.out.println("=====================================");
        
        //Search
        for (Region region4 : iRegionDao.search("Buton")) {
        System.out.println(region4.getName());
        }
        
        System.out.println("===============Method Insert================");

        //Insert
//        Region region5 = new Region(6, "Buton City");
//        System.out.println(iRegionDao.insert(region5));
        
        System.out.println("================Method Update===============");
        
        //Update
//        Region region6 = new Region(5, "Pulau Buton");
//        System.out.println(iRegionDao.update(region6));
        
        System.out.println("===============Method Delete================");
        
        //Delete
        System.out.println(iRegionDao.dalate(6));
        
        System.out.println("===============Method getData===============");
        
        //Coba Method getData (Jika true isGeById)
        for (Region region7 : iRegionDao.getData(3, true)) {
        System.out.println(region7.getName());
        }
        
        //Coba Method getData (jika false isGeById)
        for (Region region7 : iRegionDao.getData("Asia", false)) {
        System.out.println(region7.getId());
        }
        
        System.out.println("=================Method Save================");
        //Mecoba Method save
        Region region8 = new Region(6, "Java Island");
        System.out.println(iRegionDao.save(region8));
        
    }
}
