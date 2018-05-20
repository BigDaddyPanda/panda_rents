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
public class Update {

    public static boolean update_person(Person p) {
        try {
            String req = "UPDATE `persons` SET `id_person`=?, `name`=?, `fname`=?, `phone`=?,"
                    + "    `birth`=?, `username`=?, `password`=?, `image`=?, `isAdmin`=?"
                    + " WHERE `persons`.`id_person` = '" + p.getId_person() + "'";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            //copy paste pawa
            prd.setString(1, p.getId_person());
            prd.setString(2, p.getName());
            prd.setString(3, p.getFname());
            prd.setString(4, p.getPhone());
            prd.setString(5, p.getBirth());
            prd.setString(6, p.getUsername());
            prd.setString(7, p.getPassword());
            prd.setString(8, p.getImage());
            prd.setBoolean(9, p.isIsAdmin());
            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  addPerson");
            ex.printStackTrace();
        }
        return false;

    }

    public static boolean update_car(Car c) {
        try {
            String req = "UPDATE `vehicles` "
                    + "SET `id_vehicle` = ?, `constructeur` = ?, `modele` = ?, "
                    + "`vitesse` = ?, `color` = ?, `seats` = ?, `energy` = ?, `image` = ? "
                    + "WHERE `vehicles`.`id_vehicle` = ?";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            prd.setString(1, c.getId_vehicle());
            prd.setString(2, c.getConstructeur());
            prd.setString(3, c.getModele());
            prd.setInt(4, c.getVitesse());
            prd.setString(5, c.getColor());
            prd.setInt(6, c.getSeats());
            prd.setString(7, c.getEnergy());
            prd.setString(8, c.getImage());
            prd.setString(9, c.getId_vehicle());

            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  update_car");
            ex.printStackTrace();
        }
        return false;

    }

    public static boolean update_rent(Rental r) {
        try {
            String req = "UPDATE `rent` "
                    + "SET `id_person` = ?, `id_vehicle` = ?, "
                    + "`start` = ?, `end` = ?, `price` = ?, `fees` = ? "
                    + "WHERE `rent`.`id_person` = ? AND `rent`.`id_vehicle` = ?";
            PreparedStatement prd = db_cnx.connect().prepareStatement(req);
            //copy paste pawa
            prd.setString(1, r.getId_person());
            prd.setString(2, r.getId_vehicle());
            prd.setString(3, r.getStart());
            prd.setString(4, r.getEnd());
            prd.setFloat(5, r.getPrice());
            prd.setFloat(6, r.getFees());
            prd.setString(7, r.getId_person());
            prd.setString(8, r.getId_vehicle());
            prd.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println("Another one! at  update_rent");
            ex.printStackTrace();
        }
        return false;

    }

    public static void main(String[] args) {
        Person p = new Person("a", "s", "z", "x", "", "", "", "2018-05-01", true);
        System.out.println(p);
        System.out.println(update_person(p));
    }
}
