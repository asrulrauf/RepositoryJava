/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author User
 */
public class DBConnection {
    private Connection connection;
    public Connection getConnection(){
        
        try {
            OracleDataSource oracleDataSource = new OracleDataSource();
            oracleDataSource.setDriverType("thin");
            oracleDataSource.setServerName("localhost");
            oracleDataSource.setPortNumber(1521);
            oracleDataSource.setUser("hr");
            oracleDataSource.setServiceName("XE");
            oracleDataSource.setPassword("admin");
            this.connection = oracleDataSource.getConnection();
        } catch(Exception e){
            e.printStackTrace();
        
        }
        return connection;
    }
}
