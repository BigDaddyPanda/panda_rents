/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dbconnexion.Auth;
import dbconnexion.db_cnx;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author ky94
 */
public class Person {

    String id_person, name, fname, phone, username, password, image;
    Date birth;
    boolean isAdmin;

    public static boolean authentificate(String login, String password) {
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM persons WHERE username = '" + login + "' AND password= '" + password + "'");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Auth.USERNAME = rs.getString("name") + " " + rs.getString("fname");
                Auth.USERIMAGE = rs.getString("id_person");
                Auth.ISADMIN = rs.getBoolean("isadmin");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return false;
    }

}
