/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dbconnexion.db_cnx;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ky94
 */
public class Display {

    public static ArrayList<Person> load_Persons() {
        ArrayList<Person> P = new ArrayList<>();
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM persons");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                P.add(new Person(rs.getString("id_person"),
                        rs.getString("name"),
                        rs.getString("fname"),
                        rs.getString("phone"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("image"),
                        rs.getDate("birth"),
                        rs.getBoolean("isAdmin")));
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return P;
    }

    public static ArrayList<Person> load_Renters() {
        ArrayList<Person> P = new ArrayList<>();
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM persons WHERE id_person in (SELECT id_person from rent where rent.id_person=vehicles.id_person )");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                P.add(new Person(rs.getString("id_person"),
                        rs.getString("name"),
                        rs.getString("fname"),
                        rs.getString("phone"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("image"),
                        rs.getDate("birth"),
                        rs.getBoolean("isAdmin")));
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return P;
    }

    public static ArrayList<Person> load_Available_Persons() {
        ArrayList<Person> P = load_Persons();
        ArrayList<Person> RP = load_Renters();
        P.removeAll(RP);
        return P;
    }

    public static ArrayList<Car> loadAllCars() {
        ArrayList<Car> A = new ArrayList<>();
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM vehicles");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                A.add(new Car(
                        rs.getString("id_vehicle"),
                        rs.getString("constructeur"),
                        rs.getString("modele"),
                        rs.getInt("vitesse"),
                        rs.getString("color"),
                        rs.getInt("seats"),
                        rs.getString("energy"),
                        rs.getString("image")));
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return A;
    }

    public static ArrayList<Car> loadRentedCars() {
        ArrayList<Car> A = new ArrayList<>();
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM `vehicles` WHERE id_vehicle in (SELECT id_vehicle from rent where rent.id_vehicle=vehicles.id_vehicle )");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                A.add(new Car(
                        rs.getString("id_vehicle"),
                        rs.getString("constructeur"),
                        rs.getString("modele"),
                        rs.getInt("vitesse"),
                        rs.getString("color"),
                        rs.getInt("seats"),
                        rs.getString("energy"),
                        rs.getString("image"))
                );
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return A;
    }

    public static ArrayList<Car> load_Available_Cars() {
        ArrayList<Car> P = loadAllCars();
        ArrayList<Car> RP = loadRentedCars();
        P.removeAll(RP);
        return P;
    }
}
