/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dbconnexion.db_cnx;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Statement;

/**
 *
 * @author ky94
 */
public class Creation {

    /*
    
    INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`,
    `birth`, `username`, `password`, `image`, `isAdmin`) 
    VALUES ('XAD', 'SD', 'SD', 'QSD', '2018-05-15', 'qsd', 'qsd', 'qsd', 'qsd')
     */

 /*
    INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) 
    VALUES ('', '', '', '', '', '', '', '')
     */
    public static boolean addCar(Car e) {
        try {
            String req = "INSERT INTO `vehicles` (`id_vehicle`, `constructeur`, `modele`, `vitesse`, `color`, `seats`, `energy`, `image`) \n"
                    + "    VALUES ('?', '?', '?', '?', '?', '?', '?', '?')";
            Statement st = db_cnx.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from vehicles where id_vehicle='" + e.getId_vehicle() + "'");
            if (!rs.next()) {
                PreparedStatement prd = db_cnx.connect().prepareStatement(req);
                prd.setString(1, e.getId_vehicle());
                prd.setString(2, e.getConstructeur());
                prd.setString(3, e.getModele());
                prd.setInt(4, e.getVitesse());
                prd.setString(5, e.getColor());
                prd.setInt(6, e.getSeats());
                prd.setString(7, e.getEnergy());
                prd.setString(8, e.getImage());
                prd.execute();
                return true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Another one!");
        }
        return false;

    }

    public static boolean addPerson(Person e) {
        try {
            String req = "INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`,"
                    + "    `birth`, `username`, `password`, `image`, `isAdmin`)"
                    + "    VALUES ('?', '?', '?', '?', '?', '?', '?', '?', '?')";
            Statement st = db_cnx.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from vehicles where id_vehicle='" + e.getId_person() + "'");
            if (!rs.next()) {
                PreparedStatement prd = db_cnx.connect().prepareStatement(req);
                prd.setString(1, e.getId_person());
                prd.setString(2, e.getName());
                prd.setString(3, e.getFname());
                prd.setString(4, e.getPhone());
                prd.setDate(5, new Date(e.getBirth().getTime()));
                prd.setString(6, e.getUsername());
                prd.setString(7, e.getPassword());
                prd.setString(8, e.getImage());
                prd.setBoolean(9, e.isIsAdmin());
                prd.execute();
                return true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Another one!");
        }
        return false;

    }

    public static boolean addRental(Rental e) {
        try {
            String req = "INSERT INTO `rent` (`id_person`, `id_vehicle`, `start`, `end`, `price`, `fees`)"
                    + " VALUES ('?', '?', '?', '?', '?', '?')";
            Statement st = db_cnx.connect().createStatement();
            ResultSet rs = st.executeQuery("select * from rent where id_vehicle ='" + e.getId_vehicle() + "'"
                    + "AND id_vehicle='"+e.getId_vehicle()+"' ");
            if (!rs.next()) {
                PreparedStatement prd = db_cnx.connect().prepareStatement(req);
                prd.setString(1, e.getId_person());
                prd.setString(2, e.getId_vehicle());
                prd.setString(3, e.getStart());
                prd.setString(4, e.getEnd());
                prd.setFloat(5, e.getPrice());
                prd.setFloat(6, e.getFees());
                prd.execute();
                return true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Another one!");
        }
        return false;

    }
//    public static void main(String[] args) {
//        Rental e=new Rental("45177392", "620TN8078","2008-08-08","2008-08-08", 0, 0);
//        System.out.println(addRental(e));
//    }
}
