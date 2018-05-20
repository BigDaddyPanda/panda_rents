/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dbconnexion.db_cnx;
import entities.Car;
import entities.Person;
import entities.Rental;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ky94
 */
public class Destruction {

    public static boolean delete_person(String p_id) {
        try {
            String req = "DELETE FROM `persons` WHERE `persons`.`id_person` = ?";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            //copy paste pawa
            prd.setString(1, p_id);
            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  addPerson");
            ex.printStackTrace();
        }
        return false;

    }

    public static boolean delete_car(String c_id) {
        try {
            String req = "DELETE FROM `vehicles` WHERE `vehicles`.`id_vehicle` = ?";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            prd.setString(1,c_id);

            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  delete_car");
            ex.printStackTrace();
        }
        return false;

    }

    public static boolean delete_rent(String renter,String car) {
        try {
            String req = "DELETE FROM `rent` WHERE `rent`.`id_person` = ? AND `rent`.`id_vehicle` = ?";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            //copy paste pawa
            prd.setString(1, renter);
            prd.setString(2, car);
            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  delete_rent");
            ex.printStackTrace();
        }
        return false;

    }

    
}
