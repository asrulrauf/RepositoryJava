/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import daos.LocationDAO;
import icontrollers.ILocationController;
import idaos.ILocationDAO;
import java.sql.Connection;
import java.util.List;
import models.Location;
/**
 *
 * @author sofia
 */
public class LocationController implements ILocationController{
    private ILocationDAO ildao;
    
     public LocationController(Connection connection){
        ildao = new LocationDAO(connection);
    }
    
    @Override
    public List<Location> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ildao.getAll();
    }

    @Override
    public List<Location> getById(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return ildao.getById(Integer.parseInt(id));
    }

    @Override
    public List<Location> search(String key) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return ildao.search(key);
    }

    @Override
    public String insert(String id, String street, String postal, String city, String state, String countryId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "Maaf data gagal disimpan";
        Location location = new Location(Integer.parseInt(id), street, postal, city, state, countryId);
        if (ildao.insert(location)) {
            result = "Data berhasil disimpan";
        }
        return result;
    }

    @Override
    public String update(String id, String street, String postal, String city, String state, String countryId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "Maaf data gagal disimpan";
        Location location = new Location(Integer.parseInt(id), street, postal, city, state, countryId);
        if (ildao.update(location)) {
            result = "Data berhasil diupdate";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String result = "Maaf data gagal dihapus";
        if (ildao.delete(Integer.parseInt(id))) {
            result = "Data berhasil dihapus";
        } else {
            
        }
        return result;
    }
    
}
