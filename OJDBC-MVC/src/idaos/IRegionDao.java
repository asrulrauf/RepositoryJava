/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author User
 */
public interface IRegionDao {
    public List<Region> getAll();
    public List<Region> getById(int id);
    public List<Region> search(String key);
    public boolean insert(Region region);
    public boolean update(Region region);
    public boolean dalate(int id);
    
    //Penggabungan Method
    public List<Region> getData(Object object, boolean isGetById);
    public boolean save(Region region);
}