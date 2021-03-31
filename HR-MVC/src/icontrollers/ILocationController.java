/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icontrollers;
import java.util.List;
import models.Location;
/**
 *
 * @author sofia
 */
public interface ILocationController {
    public List<Location> getAll();

    public List<Location> getById(String id);

    public List<Location> search(String key);

    public String insert(String id, String street, String postal, String city, String state, String countryId);

    public String update(String id, String street, String postal, String city, String state, String countryId);

    public String delete(String id);
}
