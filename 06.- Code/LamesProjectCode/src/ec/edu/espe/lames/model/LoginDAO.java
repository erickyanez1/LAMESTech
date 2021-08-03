/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class LoginDAO {
    //HOLA
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String username, String password){
        login l = new login();
        String sql = "SELECT * FROM users WHERE correo = ? AND pass = ?";
        try {
            //con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setUsername(rs.getString("username"));
                l.setPassword(rs.getString("password"));
                
            }
        } catch (SQLException e) {
            java.lang.System.out.println(e.toString());
        }
        return l;
    }
    
    public boolean Register(login reg){
        String sql = "INSERT INTO users (username, password) VALUES (?,?,?,?)";
        try {
            //con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getUsername());
            ps.setString(3, reg.getPassword());
            ps.execute();
            return true;
        } catch (SQLException e) {
            java.lang.System.out.println(e.toString());
            return false;
        }
    }
    
    public List UserList(){
       List<login> Lista = new ArrayList();
       String sql = "SELECT * FROM users";
       try {
           //con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               login lg = new login();
               lg.setUsername(rs.getString("username"));
               lg.setPassword(rs.getString("password"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           java.lang.System.out.println(e.toString());
       }
       return Lista;
   }
}
