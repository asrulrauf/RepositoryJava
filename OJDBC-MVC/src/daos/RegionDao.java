/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import idaos.IRegionDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author User
 */
public class RegionDao implements IRegionDao{
    private Connection connection;

    public RegionDao(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public List<Region> getAll(){
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                r.setId(resultSet.getInt(1));
                r.setName(resultSet.getString(2));
                listRegion.add(r);
            }
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return listRegion;
    }
    
    @Override
    public List<Region> getById(int id){
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id=(?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                r.setId(resultSet.getInt(1));
                r.setName(resultSet.getString(2));
                listRegion.add(r);
            }
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return listRegion;
    }

    @Override
    public List<Region> search(String key) {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM REGIONS WHERE region_id LIKE (?) OR region_name LIKE (?) ORDER BY 1";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%"+key+"%");
            preparedStatement.setString(2, "%"+key+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                listRegion.add(r);
            }
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return listRegion;
    }

    @Override
    public boolean insert(Region region) {
        boolean result = false;
        String query = "INSERT INTO REGIONS (region_id, region_name) VALUES ((?),(?))"; 
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, region.getId());
            preparedStatement.setString(2, region.getName());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(Region region) {
        boolean result = false;
        String query = "UPDATE REGIONS SET region_name = (?) WHERE region_id = (?)"; 
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getName());
            preparedStatement.setInt(2, region.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean dalate(int id) {
        boolean result = false;
        String query = "DELETE FROM REGIONS WHERE region_id = (?)"; 
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }
    
    //Penggabungan Method DAO getData
    @Override
    public List<Region> getData(Object object, boolean isGetById){
        List<Region> listRegion = new ArrayList<Region>();
        String query =
                //Menggunakan Fungsi IF-ELSE cara cepat
                (isGetById)
                ?"SELECT * FROM REGIONS WHERE region_id=(?)":
                "SELECT * FROM REGIONS WHERE region_id LIKE (?) OR region_name LIKE (?) ORDER BY 1";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            if(isGetById) {
                preparedStatement.setInt(1, (int)object);
            } else {
                preparedStatement.setString(1, "%"+object+"%");
                preparedStatement.setString(2, "%"+object+"%");
            }
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {                
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                listRegion.add(r);
            }
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }
        return listRegion;
    }       

    @Override
    public boolean save(Region region) {
        boolean result = false;
        String query = (getData(region.getId(), true).isEmpty())
                ?"INSERT INTO REGIONS (region_name, region_id) VALUES ((?),(?))" 
                :"UPDATE REGIONS SET region_name = (?) WHERE region_id = (?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getName());
            preparedStatement.setInt(2, region.getId());
            preparedStatement.executeQuery();
            result = true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }
    
}